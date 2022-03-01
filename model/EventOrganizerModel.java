package model;

public class EventOrganizerModel {
	private String orgId;
	private String orgName;
	private int orgPhoneNo;
	private String orgAddress;
	private String orgMail;
	private String orgQualification;
	private int orgExperience;
	public EventOrganizerModel(String orgId, String orgName, int orgPhoneNo, String orgAddress, String orgMail, String orgQualification,int orgExperience) {
		super();
		this.orgId = orgId;
		this.orgName= orgName;
		this.orgPhoneNo = orgPhoneNo;
		this.orgAddress = orgAddress;
		this.orgMail = orgMail;
		this.orgQualification = orgQualification;
		this.orgExperience = orgExperience;
	}
	public EventOrganizerModel() {
		super();
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public int getOrgPhoneNo() {
		return orgPhoneNo;
	}
	public void setOrgPhoneNo(int orgPhoneNo) {
		this.orgPhoneNo = orgPhoneNo;
	}
	public String getOrgAddress() {
		return orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	public String getOrgMail() {
		return orgMail;
	}
	public void setOrgMail(String orgMail) {
		this.orgMail = orgMail;
	}
	public String getOrgQualification() {
		return orgQualification;
	}
	public void setOrgQualification(String orgQualification) {
		this.orgQualification = orgQualification;
	}
	public int getOrgExperience() {
		return orgExperience;
	}
	public void setOrgExperience(int orgExperience) {
		this.orgExperience =orgExperience;
	}
	
	
}
