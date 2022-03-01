package service;

import java.util.ArrayList;

import DAO.TypesOfEventDAO;
import model.AdminModel;
import model.EventOrganizerModel;
import model.CustomerModel;
import model.CateringModel;

//import dao.EmployeeDAO;
//import model.EmployeeModel;

public  class TypesOfEventDetails implements AbcDetails{
	TypesOfEventDAO typesOfEventDao = new TypesOfEventDAO();
	ArrayList<AdminModel> adminList = new ArrayList<AdminModel>();
	ArrayList<CustomerModel> customerList = new ArrayList<CustomerModel>();
	ArrayList<EventOrganizerModel> eventOrganizerList = new ArrayList<EventOrganizerModel>();
	ArrayList<CateringModel> cateringList = new ArrayList<CateringModel>();
	public void addEventsToList(AdminModel ev) throws ClassNotFoundException {
		adminList.add(ev);
		typesOfEventDao.storeTypesOfEventRecordInDb(adminList);
	}
	public void addCustomerToList(CustomerModel ev) throws ClassNotFoundException {
		customerList .add(ev);
		typesOfEventDao.storeCustomerRecordInDb(customerList);
	}
	public void addEventOrganizerToList(EventOrganizerModel ev) throws ClassNotFoundException {
		eventOrganizerList.add(ev);
		typesOfEventDao.storeEventOrganizerRecordInDb(eventOrganizerList);
	}
	public void addCateringToList(CateringModel ev) throws ClassNotFoundException {
		cateringList.add(ev);
		typesOfEventDao.storeCateringRecordInDb(cateringList);
	}

}