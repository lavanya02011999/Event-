package Controller;

import java.util.Scanner;

import DAO.TypesOfEventDAO;

public class UpdateControl {
	Scanner sc= new Scanner(System.in);
	TypesOfEventDAO TypesOfEventDao= new TypesOfEventDAO();
 public void updateCustomerControl() throws ClassNotFoundException {
	 	System.out.println("Enter customer id  to update existing customer id");
		String custId = sc.nextLine();
		System.out.println("Select any one of the detail to get updated.\n1) customer Name\n2) customer Phone number\n3) customer Address\n4) no of people\n5) Back ");
		int updateOption = Integer.parseInt(sc.nextLine());
		switch(updateOption) {
		case 1:{
			System.out.println("Enter the new customer name who has an id as "+custId);
			String newCustomerName = sc.nextLine();
			TypesOfEventDao.updatecustomerRecord(updateOption,custId,newCustomerName);
			System.out.println("updated Successfully");
			
			break;
		}
		case 2:{
			System.out.println("Enter the customer new Phone number who has an id as "+custId);
			int newPhoneNo = Integer.parseInt(sc.nextLine());
			TypesOfEventDao.updateCustomerRecord(updateOption,custId,newPhoneNo);
			System.out.println("updated Successfully");
			
			break;
		}
		case 3:{
			System.out.println("Enter the customer new address who has an id as "+custId);
			String newStudentName = sc.nextLine();
			TypesOfEventDao.updatecustomerRecord(updateOption,custId,newStudentName);
			System.out.println("updated Successfully");
			
			break;
		}
		
		case 4:{
			System.out.println("Enter the no of people "+custId);
			int newSem = Integer.parseInt(sc.nextLine());
			TypesOfEventDao.updateCustomerRecord(updateOption,custId,newSem);
			System.out.println("updated Successfully");
			
			break;
		}
		case 5:{
			break;
		}
		default:System.out.println("Invalid choice");
		}
 }
}
