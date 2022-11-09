package com.jadm.model;

import java.util.List;

public class JsonDet {
	
	private String dimension_id;
	private String style_prepack_code;
	private String case_pack_curve;
	private List<JsonDim> sizes;
	
	public JsonDet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JsonDet(String dimension_id, String style_prepack_code, String case_pack_curve, List<JsonDim> sizes) {
		super();
		this.dimension_id = dimension_id;
		this.style_prepack_code = style_prepack_code;
		this.case_pack_curve = case_pack_curve;
		this.sizes = sizes;
	}

	@Override
	public String toString() {
		return "JsonDet [dimension_id=" + dimension_id + ", style_prepack_code=" + style_prepack_code
				+ ", case_pack_curve=" + case_pack_curve + ", sizes=" + sizes + "]";
	}

	public String getDimension_id() {
		return dimension_id;
	}

	public void setDimension_id(String dimension_id) {
		this.dimension_id = dimension_id;
	}

	public String getStyle_prepack_code() {
		return style_prepack_code;
	}

	public void setStyle_prepack_code(String style_prepack_code) {
		this.style_prepack_code = style_prepack_code;
	}

	public String getCase_pack_curve() {
		return case_pack_curve;
	}

	public void setCase_pack_curve(String case_pack_curve) {
		this.case_pack_curve = case_pack_curve;
	}

	public List<JsonDim> getSizes() {
		return sizes;
	}

	public void setSizes(List<JsonDim> sizes) {
		this.sizes = sizes;
	}	
	
		
}
