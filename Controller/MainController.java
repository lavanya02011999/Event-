package Controller;

import java.util.Scanner;

import DAO.TypesOfEventDAO;
import model.ReviewModel;
import model.CustomerModel;

//import dao.EmployeeDAO;
//import model.EmployeeModel;
//import service.EmployeeDetails;

public class MainController {

	public static void main(String[] args) throws ClassNotFoundException {
		//EmployeeDetails ed = new EmployeeDetails();
		TypesOfEventDAO TypesOfEventDao = new TypesOfEventDAO();
		System.out.println("=============================================");
		System.out.println("                   WELCOME                   ");
		System.out.println("=============================================");
		boolean temp = true;
		while(temp) {
			System.out.println("1) Admin \n2) Event Organizer\n3) Customer\n4) Exit");
			Scanner sc = new Scanner(System.in);
			int option = Integer.parseInt(sc.nextLine());
			switch(option) {
				case 1: {
					System.out.println("Enter your username");
					String adminName = sc.nextLine();
					System.out.println("Enter your password");
					String adminPwd = sc.nextLine();
					if(adminName.equals("admin") && adminPwd.equals("admin")) {
						boolean temp1 = true;
						while(temp1) {
							System.out.println("Choose any one of an operation that you wish to do");
							System.out.println("1) Types of events\n2) Catering\n3) Customer\n4) Event Organizer\n5) Logout");
							boolean flag1 = true;
							int adminOption = 0;
							while(flag1) {
								try {
									adminOption = Integer.parseInt(sc.nextLine());
									flag1 = false;
								}catch(Exception e) {
									System.out.println("Input given type is wrong. Give the right option in number type");
									flag1 =true;
								}
							}
							
		
							
							switch(adminOption) {
								case 1:{	
									TypesOfEventController cc=new TypesOfEventController();
									cc.TypesOfEventControl();
									break;
									}
								
								case 2:{
									TypesOfEventController cc1=new TypesOfEventController();
									cc1.CateringControl();
									break;
								}
								case 3:{
									TypesOfEventController cc2=new TypesOfEventController();
									cc2.customerControl();
									break;
									}
								case 4:{
									TypesOfEventController cc3=new TypesOfEventController();
									cc3.eventOrganizerControl();
									break;
									}
							
								case 5:{
									temp1 = false;
									break;
								}
								default:System.out.println("Invalid choice");
							}
						}
						
					}
					else {
						System.out.println("Incorrect username/password");
					}
					break;
				}
				case 2:{
					System.out.println("Enter your username");
					String adminName = sc.nextLine();
					System.out.println("Enter your password");
					String adminPwd = sc.nextLine();
					if(adminName.equals("organizer") && adminPwd.equals("organizer")) {
						boolean temp1 = true;
						
						while(temp1) {
							System.out.println("Choose any one of an operation that you wish to do");
							System.out.println("1) View Customer\n2) View catering\n3) reviews\n4) Back");
							boolean flag1 = true;
							int adminOption = 0;
							while(flag1) {
								try {
									adminOption = Integer.parseInt(sc.nextLine());
									flag1 = false;
								}catch(Exception e) {
									System.out.println("Input given type is wrong. Give the right option in number type");
									flag1 =true;
								}
							}
							
							switch(adminOption) {
								case 1:{	
									TypesOfEventController cc=new TypesOfEventController();
									//sem wise search
									TypesOfEventDao.viewCustomerRecord();
									temp=false;
									break;
									}
								
								case 2:{
									TypesOfEventController cc1=new TypesOfEventController();
									System.out.println("enter orgId to view catering");
									String orgId=sc.nextLine();
									TypesOfEventDao.viewEventOrganizerRecord(orgId);
									temp=false;
									//cc1.facultyControl();
									break;
								}
								case 3:{
									TypesOfEventController cc2=new TypesOfEventController();
									System.out.println("do you want to Add  review (yes/no)?");
									String op=sc.nextLine();
									if(op.equalsIgnoreCase("yes")) {
									System.out.println("Enter custId to give review");
									String custId=sc.nextLine();
									System.out.println("Enter review");
									int marriage=Integer.parseInt(sc.nextLine());
									int birthday=Integer.parseInt(sc.nextLine());
									int engagement=Integer.parseInt(sc.nextLine());
									TypesOfEventDao.storeReviewsTable(custId, marriage,birthday,engagement);
									}
									System.out.println("do you want to view all the reviews (yes/no)?");
									op=sc.nextLine();
									if(op.equalsIgnoreCase("yes")) {
									TypesOfEventDao.viewReviewRecord();
									}
									temp=false;
									break;
									}
								
							
								case 4:{
									temp1 = false;
									break;
								}
								default:System.out.println("Invalid choice..............");
								break;
								
							}
						}
						
					}
					else {
						System.out.println("Incorrect username/password");
					}
					break;
				}
				case 3:{
					System.out.println("Enter your username");
					String adminName = sc.nextLine();
					System.out.println("Enter your password");
					String adminPwd = sc.nextLine();
					if(adminName.equals("customer") && adminPwd.equals("customer")) {
						boolean temp1 = true;
						
						while(temp1) {
							System.out.println("Choose any one of an operation that you wish to do");
							System.out.println("1) View customer\n2) View event Organizer\n3) view reviews\n4) Back");
							boolean flag1 = true;
							int adminOption = 0;
							while(flag1) {
								try {
									adminOption = Integer.parseInt(sc.nextLine());
									flag1 = false;
								}catch(Exception e) {
									System.out.println("Input given type is wrong. Give the right option in number type");
									flag1 =true;
								}
							}
							
							switch(adminOption) {
								case 1:{	
									TypesOfEventController cc=new TypesOfEventController();
									
									TypesOfEventDao.viewCustomerRecord();
								
									temp=false;
									break;
									}
								
								case 2:{
									TypesOfEventDao.viewEventOrganizerRecord();
									temp=false;
									
									break;
								}
								case 3:{
									TypesOfEventDao.viewReviewRecord();
									temp=false;
									break;
									}
								case 4:{
									
									break;
								}
								default:System.out.println("invalid choice");
								temp=false;
								break;
							}
						}
						
					}
					else {
						System.out.println("Incorrect username/password");
					}
					break;
				}
					
				
				case 4:{
					temp = false;
				}
		}
	}
		}
	
}