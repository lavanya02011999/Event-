package Controller;

import java.util.Scanner;

import DAO.TypesOfEventDAO;
import model.AdminModel;
import model.EventOrganizerModel;
import model.CustomerModel;
import model.CateringModel;
import service.TypesOfEventDetails;

public class TypesOfEventController {
	TypesOfEventDAO TypesOfEventDao = new TypesOfEventDAO();
	TypesOfEventDetails cd= new TypesOfEventDetails();
	Scanner sc= new Scanner(System.in);

 public void TypesOfEventControl() throws ClassNotFoundException {
	 System.out.println("1) View Event Details\n2) Add Events\n3) Remove Course\n4) Back\n");
	 Scanner sc= new Scanner(System.in);
		int TypesOfEventChoice = Integer.parseInt(sc.nextLine());
		switch(TypesOfEventChoice) {
			case 1: {
				TypesOfEventDao.viewEventRecord();
				TypesOfEventControl();
				break;
				
			}
			case 2:{
				System.out.println("Enter the detailes");
				String eventId;
				String eventName;
				int totalNoOfCatering;
				int totalNoOfPeople;
				int result=0;
				eventId = sc.nextLine();
					eventName = sc.nextLine();
					totalNoOfCatering =Integer.parseInt(sc.nextLine());
					totalNoOfPeople = Integer.parseInt(sc.nextLine());
					AdminModel ev = new AdminModel(eventId,eventName,totalNoOfCatering,totalNoOfPeople);
					cd.addEventsToList(ev);
				System.out.println("Event details added successfully.....");
				TypesOfEventControl();
				break;
			}
			case 3:{
				System.out.println("Enter the event to delete");
				String eventId = sc.nextLine();
				AdminModel ev = new AdminModel();
				TypesOfEventDao.deleteTypesOfEventRecordInDb(eventId);
				TypesOfEventControl();
				break;
			}
			case 4:{
				break;
				
			}
			default:System.out.println("Invalid choice.....");
			TypesOfEventControl();
			
			break;

		}
 	}
 //for subject
 public void CateringControl() throws ClassNotFoundException {
	 System.out.println("1) View Catering\n2) Add Catering\n3) Remove Catering\n4) Back\n");
	 Scanner sc= new Scanner(System.in);
		int TypesOfEventChoice = Integer.parseInt(sc.nextLine());
		switch(TypesOfEventChoice) {
			case 1: {
				TypesOfEventDao.viewCateringRecord();
				CateringControl();
				break;
				
			}
			case 2:{
				
				String foodCode;
				String foodName;
				int noOfPeople;
				String eventId;
				String orgId;
				
				int result=0;
				
				System.out.println("Enter food code ");
				foodCode = sc.nextLine();
					System.out.println("Enter food Name ");
					foodName = sc.nextLine();
					System.out.println("Enter the no of people ");
					noOfPeople =Integer.parseInt(sc.nextLine());
					System.out.println("Enter event id ");
					eventId = sc.nextLine();
					System.out.println("Enter orgId id ");
					orgId = sc.nextLine();
					
					
					CateringModel ev1 = new CateringModel(foodCode,foodName,noOfPeople,eventId,orgId);
					cd.addCateringToList(ev1);
				
				CateringControl();
				break;
			}
			case 3:{
				System.out.println("enter the food code to delete");
				String foodCode = sc.nextLine();
				CateringModel ev = new CateringModel();
				TypesOfEventDao.deleteCateringRecordInDb(foodCode);
				CateringControl();
				break;
			}
			
			case 4:{
				break;
				
			}
			default:System.out.println("Invalid choice.....");
			CateringControl();

		}
	 	
 }
 
 //for student in main controller
 public void customerControl() throws ClassNotFoundException {
	 System.out.println("1) View customer Details\n2) Add customer\n3) Remove customer\n4) Edit customer\n5) Back\n");
	 Scanner sc= new Scanner(System.in);
		int courseChoice = Integer.parseInt(sc.nextLine());
		switch(courseChoice) {
			case 1: {
				TypesOfEventDao.viewCustomerRecord();
				customerControl();
				break;
				
			}
			case 2:{
				//System.out.println("How many students you want to add");
				//int courseCount = Integer.parseInt(sc.nextLine());
				String rollno;
				String sname;
				int sphoneNo;
				String address;
				String cid;
				int sem;
				int result=0;
				//for(int i=0; i<courseCount; i++) {
				System.out.println("Enter Customer Id");
					rollno = sc.nextLine();
					System.out.println("Enter Customer Name");
					sname = sc.nextLine();
					System.out.println("Enter Customer phone number");
					sphoneNo =Integer.parseInt(sc.nextLine());
					System.out.println("Enter Customer Address");
					address = sc.nextLine();
					System.out.println("Enter event Id");
					cid = sc.nextLine();
					System.out.println("Enter total nuber of people");
					sem = Integer.parseInt(sc.nextLine());
					
					CustomerModel ev1 = new CustomerModel(rollno, sname, sphoneNo, address,cid, sem);
					cd.addCustomerToList(ev1);
				//}
				customerControl();
				break;
			}
			case 3:{
				System.out.println("enter the customer to delete");
				String rollno = sc.nextLine();
				CustomerModel em = new CustomerModel();
				TypesOfEventDao.deleteCustomerRecordInDb(rollno);
				customerControl();
				break;
			}
			case 4:{
				UpdateControl uc=new UpdateControl();
				uc.updateCustomerControl();
				customerControl();
				break;
				}
			case 5:{
				break;
				
			}
			default:System.out.println("Invalid choice.....");
			customerControl();

		}
 }
 public void eventOrganizerControl() throws ClassNotFoundException {
	 System.out.println("1) View event Organizer Details\n2) Add event organizer \n3) Remove Event organizer\n4) Back\n");
	 Scanner sc= new Scanner(System.in);
		int eventChoice = Integer.parseInt(sc.nextLine());
		switch(eventChoice) {
			case 1: {
				TypesOfEventDao.viewEventOrganizerRecord();
				eventOrganizerControl();
				break;
				
			}
			case 2:{
				
				String orgId;
				String orgName;
				int orgPhone;
				String orgAddress;
				String orgMail;
				String orgQualification;
				int orgExperience;
				int result=0;
				
				System.out.println("Enter event organizer id");
				orgId = sc.nextLine();
					System.out.println("Enter event organizer Name");
					orgName = sc.nextLine();
					System.out.println("Enter organizer phone number");
					orgPhone =Integer.parseInt(sc.nextLine());
					System.out.println("Enter organizer Address");
					orgAddress = sc.nextLine();
					System.out.println("Enter organizer Email");
					orgMail = sc.nextLine();
					System.out.println("Enterorganizer Qualification");
					orgQualification = sc.nextLine();
					System.out.println("Enter organizer Experience");
					orgExperience = Integer.parseInt(sc.nextLine());
					
					EventOrganizerModel em1 = new EventOrganizerModel(orgId, orgName, orgPhone, orgAddress,orgMail,orgQualification,orgExperience);
					cd.addEventOrganizerToList(em1);
				//}
				eventOrganizerControl();
				break;
				
				
				
			}
			case 3:{
				System.out.println("enter the Faculty id to delete");
				String orgId = sc.nextLine();
				EventOrganizerModel ev = new EventOrganizerModel();
				TypesOfEventDao.deleteEventOrganizerRecordInDb(orgId);
				eventOrganizerControl();
				break;
			}
			
			case 4:{
				break;
				
			}
			default:System.out.println("Invalid choice.....");
			eventOrganizerControl();

		}
 }

}
		

		
 
 
