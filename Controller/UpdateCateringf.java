package Controller;

import java.util.Scanner;

import DAO.TypesOfEventDAO;

public class UpdateCateringf {
	Scanner sc= new Scanner(System.in);
	TypesOfEventDAO courseDao= new TypesOfEventDAO();
 public void updateSubjctControl() throws ClassNotFoundException {
	 System.out.println("Enter customer Id to update existing Customer Id");
		String foodCode = sc.nextLine();
		int option=1;
			System.out.println("Enter the new customer name who has an id as "+foodCode);
			String org_id = sc.nextLine();
			System.out.println("updated Successfully");
			
			
 }
}