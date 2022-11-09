package com.jadm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BBOOK_ENVIO_PRD")
public class BbookEnvioPrd {
	
	@Id
    @Column(name="idd" ,columnDefinition = "varchar2(100)")
    private String id;

    @Column(name="master" ,columnDefinition = "number(12)")
    private long master;

    @Column(name="case_pack_id" ,columnDefinition = "varchar2(25)")
    private String casePackId;

    @Column(name="estilo" ,columnDefinition = "varchar2(15)")
    private String estilo;
    
    @Column(name="chlestilo" ,columnDefinition = "number(12)")
    private long chlEstilo;

    @Column(name="namestilo" ,columnDefinition = "varchar2(50)")
    private String namEstilo;

    @Column(name="sppnum" ,columnDefinition = "varchar2(15)")
    private String sppNum;

    @Column(name="variacion" ,columnDefinition = "varchar2(15)")
    private String variacion;

    @Column(name="namevariacion" ,columnDefinition = "varchar2(50)")
    private String nameVariacion;
    
    @Column(name="idcolor" ,columnDefinition = "varchar2(12)")
    private String idcolor;
    
    @Column(name="idtalla" ,columnDefinition = "varchar2(12)")
    private String idtalla;

    @Column(name="prd_upc" ,columnDefinition = "number(18)")
    private long prdUpc;

	public BbookEnvioPrd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbookEnvioPrd(String id, long master, String casePackId, String estilo, long chlEstilo, String namEstilo,
			String sppNum, String variacion, String nameVariacion, String idcolor, String idtalla, long prdUpc) {
		super();
		this.id = id;
		this.master = master;
		this.casePackId = casePackId;
		this.estilo = estilo;
		this.chlEstilo = chlEstilo;
		this.namEstilo = namEstilo;
		this.sppNum = sppNum;
		this.variacion = variacion;
		this.nameVariacion = nameVariacion;
		this.idcolor = idcolor;
		this.idtalla = idtalla;
		this.prdUpc = prdUpc;
	}

	@Override
	public String toString() {
		return "BbookEnvioPrd [id=" + id + ", master=" + master + ", casePackId=" + casePackId + ", estilo=" + estilo
				+ ", chlEstilo=" + chlEstilo + ", namEstilo=" + namEstilo + ", sppNum=" + sppNum + ", variacion="
				+ variacion + ", nameVariacion=" + nameVariacion + ", idcolor=" + idcolor + ", idtalla=" + idtalla
				+ ", prdUpc=" + prdUpc + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getMaster() {
		return master;
	}

	public void setMaster(long master) {
		this.master = master;
	}

	public String getCasePackId() {
		return casePackId;
	}

	public void setCasePackId(String casePackId) {
		this.casePackId = casePackId;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public long getChlEstilo() {
		return chlEstilo;
	}

	public void setChlEstilo(long chlEstilo) {
		this.chlEstilo = chlEstilo;
	}

	public String getNamEstilo() {
		return namEstilo;
	}

	public void setNamEstilo(String namEstilo) {
		this.namEstilo = namEstilo;
	}

	public String getSppNum() {
		return sppNum;
	}

	public void setSppNum(String sppNum) {
		this.sppNum = sppNum;
	}

	public String getVariacion() {
		return variacion;
	}

	public void setVariacion(String variacion) {
		this.variacion = variacion;
	}

	public String getNameVariacion() {
		return nameVariacion;
	}

	public void setNameVariacion(String nameVariacion) {
		this.nameVariacion = nameVariacion;
	}

	public String getIdcolor() {
		return idcolor;
	}

	public void setIdcolor(String idcolor) {
		this.idcolor = idcolor;
	}

	public String getIdtalla() {
		return idtalla;
	}

	public void setIdtalla(String idtalla) {
		this.idtalla = idtalla;
	}

	public long getPrdUpc() {
		return prdUpc;
	}

	public void setPrdUpc(long prdUpc) {
		this.prdUpc = prdUpc;
	}


    
}
