package model;

public class AdminModel {
	private String eventCode;
	private String eventName;
	private int  noOfCateringType;
	private int totalNoOfPeople;
	
	
	public AdminModel(String eventCode, String eventName, int noOfCateringType, int totalNoOfPeople) {
		super();
		this.eventCode = eventCode;
		this.eventName = eventName;
		this.noOfCateringType = noOfCateringType;
		this.totalNoOfPeople = totalNoOfPeople;
	}
	
	public AdminModel() {
		super();
	}
	public String getEventCode() {
		return eventCode;
	}
	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}
	public String getEventName() {
		return eventName;
	}
	public void seteventName(String eventName) {
		this.eventName = eventName;
	}
	public int getNoOfCateringType() {
		return noOfCateringType;
	}
	public void setNoOfCateringType(int noOfCateringType) {
		this.noOfCateringType = noOfCateringType;
	}
	public int getTotalNoOfPeople() {
		return totalNoOfPeople;
	}
	public void setTotalNoOfPeople(int totalNoOfPeople) {
		this.totalNoOfPeople = totalNoOfPeople;
	}
	
}
