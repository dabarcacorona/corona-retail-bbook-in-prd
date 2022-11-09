package com.jadm.model;


public class BbookPo {

	private long pmgPoNumber;

	public BbookPo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BbookPo(long pmgPoNumber) {
		super();
		this.pmgPoNumber = pmgPoNumber;
	}

	@Override
	public String toString() {
		return "BbookPo [pmgPoNumber=" + pmgPoNumber + "]";
	}

	public long getPmgPoNumber() {
		return pmgPoNumber;
	}

	public void setPmgPoNumber(long pmgPoNumber) {
		this.pmgPoNumber = pmgPoNumber;
	}
	
	
}
