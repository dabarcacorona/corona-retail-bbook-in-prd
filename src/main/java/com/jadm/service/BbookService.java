package com.jadm.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.jadm.model.BbookEnvioPrd;
import com.jadm.model.BbookPo;
import com.jadm.model.JsonCab;
import com.jadm.model.JsonData;
import com.jadm.model.JsonDet;
import com.jadm.model.JsonDim;
import com.jadm.repository.BbookEnvioPrdRepository;
import com.jadm.utilities.HttpUtilities;

@Service
@Transactional
public class BbookService {

	@Value("${api_url}")
	private String apiurl;

	@Value("${token_uri}")
	private String token;
	
	@Autowired
	BbookEnvioPrdRepository bbookenvioprdrepository;
	
	private static final Logger LOG = LoggerFactory.getLogger(BbookService.class);

	public void EnvioPrd() {
		 String boolPaso = "T";
		 Gson g = new Gson();
		 List<JsonDet> jsondet=new ArrayList();
		 JsonCab jsoncab=null;
		 JsonData jsondata=null;
		 String responses=null;
		 //List<JsonDim> json=new ArrayList();
		 HttpEntity<String> entity=null;
		 List<BbookEnvioPrd> bbookenvocResult= null;
		 List<String> bbookMasterCode =  bbookenvioprdrepository.selCasePack();

	 try {
		 long varmastercode = 0;
		 String varparentsku = null;
		 long varstatus = 0;
		 String varerror = null;
		 String vardimension_id = null;
		 String varstyle_prepack_code = null;
		 String varcase_pack_curve = "";
		 List<JsonDim> json = new ArrayList();
		 //for (String row : bbookpoResult) {

		 for (int x = 0; x < bbookMasterCode.size(); x++) {  // por cada Master
			 LOG.error(bbookMasterCode.get(x).toString());
			 String varcasepack = bbookMasterCode.get(x).toString();
			 //bbookenvocResult = bbookenvioprdrepository.ByCasePackId(varcasepack.trim());
			 json = new ArrayList();
			 jsondet = new ArrayList();
			 bbookenvocResult = bbookenvioprdrepository.ByCasePackId(Long.valueOf(varcasepack));

			 varmastercode = 0;
			 varparentsku = null;
			 vardimension_id = null;
			 varstyle_prepack_code = null;
			 varcase_pack_curve = "";
			 long sw = 0;
			 long cont = 0;

			 for (BbookEnvioPrd line : bbookenvocResult) {
				 //String.valueOf

				 if (varcase_pack_curve.length() > 0 && !varcase_pack_curve.equals(line.getCasePackId())) {
					 sw = 1;
					 cont = bbookenvocResult.size();
				 }

				 if (sw == 1 || cont == bbookenvocResult.size()) {
					 jsondet.add(new JsonDet(vardimension_id, varstyle_prepack_code, varcase_pack_curve, json));
					 json = new ArrayList();
					 sw = 0;

				 }

				 cont++;
				 json.add(new JsonDim(line.getIdtalla(), line.getVariacion(), line.getCasePackId(), line.getNameVariacion(), String.valueOf(line.getPrdUpc())));

				 varmastercode = line.getMaster();
				 varparentsku = line.getEstilo();
				 vardimension_id = line.getIdcolor();
				 varstyle_prepack_code = line.getSppNum();
				 varcase_pack_curve = line.getCasePackId();

			 }


		 jsondet.add(new JsonDet(vardimension_id, varstyle_prepack_code, varcase_pack_curve, json));
		 jsoncab = new JsonCab(varmastercode, varparentsku, jsondet, varstatus, varerror);
		 jsondata = new JsonData(jsoncab);

		 // create full entity.
		 HttpHeaders headers = new HttpHeaders();
		 headers.set("user-agent", "Application");
		 //headers.set("cache-control", "no-cache");

		 headers.setContentType(MediaType.APPLICATION_JSON);
		 //headers.set("Authorization", "Bearer " + token);
		 headers.set("X-Bbook-Token", token);
		 //headers.set("Authorization", token);

		 // create entity, headers + body
		 entity = new HttpEntity<String>(g.toJson(jsondata), headers);
		 // entity = new HttpEntity<String>(g.toJson("\"data\": [{\"id\":\"80\",\"name\":\"Recoleta\",\"inactive\":\"true\",\"is_warehouse\":\"false\"},{\"id\":\"71\",\"name\":\"Eccommerce\",\"inactive\":\"true\",\"is_warehouse\":\"false\"}]"), headers);

		 try {
				 boolPaso = "T";
				 responses = HttpUtilities.BulkUpdateApiPoster(entity, apiurl);
		 } catch (Exception e) {
			 boolPaso = "F";
			 LOG.error("Error al enviar datos", e);

			 responses = "No se pudo informar producto";
		 }

		 if (boolPaso.equals("T")) {

			 bbookenvioprdrepository.updMaster(varmastercode);

		 }

	 }

     }catch (Exception e) {
     	LOG.error("Error al cargar json", e);
     }
        
      //  for (BbookEnvioOc line : bbookenvocResult) {
   		 
     //   	bbookenvioocrepository.updSdipmghde(line.getId(), responses.substring(1,500));
 	   //  } 
   }
}
