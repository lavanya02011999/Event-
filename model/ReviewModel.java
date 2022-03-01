package model;

public class ReviewModel {
	private String orgId;
	private int marriage;
	private int birthday;
	private int engagement;
	
	public ReviewModel() {
		super();
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId =orgId;
	}
	public int getMarriage() {
		return marriage;
	}
	public void setMarriage(int marriage) {
		marriage = marriage;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		birthday = birthday;
	}
	public int getEngagement() {
		return engagement;
	}
	public void setEngagement(int engagement) {
		engagement = engagement;
	}

}
