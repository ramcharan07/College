package com.cg.StudentJoining.entity;

public class College {
	private int cId;
	private String cname;
	private String clocation;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	@Override
	public String toString() {
		return "College [cId=" + cId + ", cname=" + cname + ", clocation=" + clocation + "]";
	}
	

}
