package com.cg.oiqgs.model;

public class BusinessSegment {
	
	private String BusSegId;
	private int BusSegSeq;
	private String BusSegName;
	
	
	public BusinessSegment() {
		// TODO Auto-generated constructor stub
	}


	public BusinessSegment(String busSegId, int busSegSeq, String busSegName) {
		super();
		BusSegId = busSegId;
		BusSegSeq = busSegSeq;
		BusSegName = busSegName;
	}


	public String getBusSegId() {
		return BusSegId;
	}


	public void setBusSegId(String busSegId) {
		BusSegId = busSegId;
	}


	public int getBusSegSeq() {
		return BusSegSeq;
	}


	public void setBusSegSeq(int busSegSeq) {
		BusSegSeq = busSegSeq;
	}


	public String getBusSegName() {
		return BusSegName;
	}


	public void setBusSegName(String busSegName) {
		BusSegName = busSegName;
	}
	
	
	
	  

}
