package com.jadm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jadm.model.BbookEnvioPrd;


@Repository
public interface BbookEnvioPrdRepository extends CrudRepository<BbookEnvioPrd, String> {

	//List <BbookEnvioPrd> findByCasePackId(String casePackId);	
	//List <BbookEnvioOc> findByDistinctPmgPoNumber();
	
	@Modifying(clearAutomatically = true)
	//@Query(value = "select distinct rowid idd, pmg_po_number, '1' id_document, '1' prd_upc,'1' prd_lvl_number,'1' prd_name_full,'1' prd_desc,'1' prd_lvl_parent_num,'1' prd_pdd_code_1,'1' prd_pdd_code_2,'1' prd_pdd_code_3,'1' prc_price1,'1' prc_price2 ,'1' value ,'1' proforma_invoice,'1' status ,'1' error from app_sam.sdi_sdipmghde where tran_type = 'A' and   pmg_stat_code = 4 and   download_date is null and   pmg_ext_po_num is null and pmg_po_number = 468", nativeQuery = true)
	//@Query(value = "select * from BBOOK_ENVIO_PRD w where trim(w.case_pack_id) = :casePackId", nativeQuery = true)
	@Query(value = "select * from BBOOK_ENVIO_PRD w where master = :master order by 8 asc", nativeQuery = true)
	List <BbookEnvioPrd> ByCasePackId(@Param("master") long master);	


	@Modifying(clearAutomatically = true)
	//@Query(value = "select distinct rowid idd, pmg_po_number, '1' id_document, '1' prd_upc,'1' prd_lvl_number,'1' prd_name_full,'1' prd_desc,'1' prd_lvl_parent_num,'1' prd_pdd_code_1,'1' prd_pdd_code_2,'1' prd_pdd_code_3,'1' prc_price1,'1' prc_price2 ,'1' value ,'1' proforma_invoice,'1' status ,'1' error from app_sam.sdi_sdipmghde where tran_type = 'A' and   pmg_stat_code = 4 and   download_date is null and   pmg_ext_po_num is null and pmg_po_number = 468", nativeQuery = true)
	@Query(value = "select distinct master from bbook_envio_prd w", nativeQuery = true)
	List <String> selCasePack();	
	
	@Modifying(clearAutomatically = true)
	//@Query(value = "select distinct rowid idd, pmg_po_number, '1' id_document, '1' prd_upc,'1' prd_lvl_number,'1' prd_name_full,'1' prd_desc,'1' prd_lvl_parent_num,'1' prd_pdd_code_1,'1' prd_pdd_code_2,'1' prd_pdd_code_3,'1' prc_price1,'1' prc_price2 ,'1' value ,'1' proforma_invoice,'1' status ,'1' error from app_sam.sdi_sdipmghde where tran_type = 'A' and   pmg_stat_code = 4 and   download_date is null and   pmg_ext_po_num is null and pmg_po_number = 468", nativeQuery = true)
	@Query(value = "update bbook_json_prd set download_date = sysdate where trim(master) = trim(to_char(:master)) ", nativeQuery = true)
	void updMaster(@Param("master") long master);
	
}
