package com.jadm.model;

import java.util.List;

public class JsonCab {
	
	private long master_code;
	private String parent_sku;
	private List<JsonDet> dim_values;
	private long status;
	private String error;
	
	public JsonCab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JsonCab(long master_code, String parent_sku, List<JsonDet> dim_values, long status, String error) {
		super();
		this.master_code = master_code;
		this.parent_sku = parent_sku;
		this.dim_values = dim_values;
		this.status = status;
		this.error = error;
	}

	@Override
	public String toString() {
		return "JsonCab [master_code=" + master_code + ", parent_sku=" + parent_sku + ", dim_values=" + dim_values
				+ ", status=" + status + ", error=" + error + "]";
	}

	public long getMaster_code() {
		return master_code;
	}

	public void setMaster_code(long master_code) {
		this.master_code = master_code;
	}

	public String getParent_sku() {
		return parent_sku;
	}

	public void setParent_sku(String parent_sku) {
		this.parent_sku = parent_sku;
	}

	public List<JsonDet> getDim_values() {
		return dim_values;
	}

	public void setDim_values(List<JsonDet> dim_values) {
		this.dim_values = dim_values;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
		
	}
