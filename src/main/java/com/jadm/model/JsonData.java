package com.jadm.model;

import java.util.List;

public class JsonData {

	private JsonCab data;

	public JsonData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JsonData(JsonCab data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonData [data=" + data + "]";
	}

	public JsonCab getData() {
		return data;
	}

	public void setData(JsonCab data) {
		this.data = data;
	}

	
}
