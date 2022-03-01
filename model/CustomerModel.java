package model;

public class CustomerModel {
	private String custId;
	private String custName;
	private int custPhoneNo;
	private String custAddress;
	private int totalNoOfPeople;
	private String eventId;
	public CustomerModel(String custId, String custName, int custPhoneNo, String custAddress,String eventId, int totalNoOfPeople) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPhoneNo = custPhoneNo;
		this.custAddress = custAddress;
		this.eventId = eventId;
		this.totalNoOfPeople = totalNoOfPeople;
	}
	public CustomerModel() {
		super();
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustPhoneNo() {
		return custPhoneNo;
	}
	public void setCustPhoneNo(int custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress= custAddress;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public int getTotalNoOfPeople() {
		return totalNoOfPeople;
	}
	public void setTotalNoOfPeople(int totalNoOfPeople) {
		this.totalNoOfPeople = totalNoOfPeople;
	}
}