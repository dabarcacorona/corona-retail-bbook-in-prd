package com.jadm.model;

public class JsonDim {

	private String size;
	private String sku;
	private String case_pack_sku;
	private String desc;
	private String ean_upc;
	
	public JsonDim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JsonDim(String size, String sku, String case_pack_sku, String desc, String ean_upc) {
		super();
		this.size = size;
		this.sku = sku;
		this.case_pack_sku = case_pack_sku;
		this.desc = desc;
		this.ean_upc = ean_upc;
	}

	@Override
	public String toString() {
		return "JsonDim [size=" + size + ", sku=" + sku + ", case_pack_sku=" + case_pack_sku + ", desc=" + desc
				+ ", ean_upc=" + ean_upc + "]";
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getCase_pack_sku() {
		return case_pack_sku;
	}

	public void setCase_pack_sku(String case_pack_sku) {
		this.case_pack_sku = case_pack_sku;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEan_upc() {
		return ean_upc;
	}

	public void setEan_upc(String ean_upc) {
		this.ean_upc = ean_upc;
	}

	
	
}
