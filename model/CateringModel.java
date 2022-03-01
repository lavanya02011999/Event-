package model;

public class CateringModel {
	private String foodCode;
	private String foodName;
	private int noOfPeople;
	private String eventId;
	private String orgId;
	public CateringModel(String foodCode, String foodName, int noOfPeople, String eventId, String orgId) {
		super();
		this.foodCode = foodCode;
		this.foodName = foodName;
		this.noOfPeople = noOfPeople;
		this.eventId = eventId;
		this.orgId = orgId;
	}
	public CateringModel() {
		super();
	}
	public String getFoodCode() {
		return foodCode;
	}
	public void setFoodCode(String foodCode) {
		this.foodCode = foodCode;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	
	

}
