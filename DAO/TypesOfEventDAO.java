package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.AdminModel;
import model.EventOrganizerModel;
import model.CustomerModel;
import model.CateringModel;
import utility.ConnectionManager;

public class TypesOfEventDAO extends GetConnection{

	Connection dbConn = null;
	@Override
	public Connection getDbConnection() throws ClassNotFoundException {
		Connection dbCon = ConnectionManager.getConnection();
		return dbCon;
	}

	//to insert the coursedetails to couse table
	public void storeTypesOfEventRecordInDb(ArrayList<AdminModel> eventList) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "insert into TypeOfEvents(event_id, event_name, total_type_of_catering, total_no_of_people) values (?,?,?,?)";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			for(AdminModel ev: eventList) {
				ps.setString(1, ev.getEventCode());
				ps.setString(2, ev.getEventName());
				ps.setInt(3, ev.getNoOfCateringType());
				ps.setInt(4, ev.getTotalNoOfPeople());
				//ps.setDouble(5, em.getEmployeeSalary());
				int result = ps.executeUpdate();
				/*if(result == 1) {
					System.out.println("Course details added successfully.....");
				}
				System.out.println();*/
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
		
		//to delete the course
		public void deleteTypesOfEventRecordInDb(String event_Id)  throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = "delete from TypeOfEvents where event_id=?";
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				//for(AdminModel em: empList) {
				 AdminModel ev= new AdminModel();
					ps.setString(1, event_Id);
				int result = ps.executeUpdate();
				if(result==1) {
				System.out.println("event Details deleted Successfully.....");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
	}
	
		

	//view Course details in Admin access
	public void viewEventRecord() throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "Select * from TypeOfEvents";
		try {
			Statement stmt = dbConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("==========================================================================");
			System.out.format("%-10s %-25s %-12s %-13s\n","Event Id","Event Name", "total no of catering","Total no of people");
			System.out.println("==========================================================================");
			while(rs.next()) {
				
				System.out.format("%-10s %-25s %-15s %-11s\n",rs.getString(1), rs.getString(2), rs.getInt(3),rs.getInt(4));
				
			}
			System.out.println("==========================================================================");
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		
	
	public void viewcateringRecord() throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "Select * from catering";
		try {
			Statement stmt = dbConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("===========================================================================================");
			System.out.format("%-15s %-20s %-15s %-15s %-15s\n","Food Code","Food Name","NoOf People","Event Id","Organiser Id" );
			System.out.println("===========================================================================================");
			while(rs.next()) {
				System.out.format("%-15s %-20s %-15s %-15s %-15s\n",rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
				
			}
			System.out.println("===========================================================================================");
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void storeCateringRecordInDb(ArrayList<CateringModel> cateringList) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "insert into catering(food_code, food_type, no_of_people, event_id, org_id) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			for(CateringModel ev: cateringList) {
				ps.setString(1, ev.getFoodCode());
				ps.setString(2, ev.getFoodName());
				ps.setInt(3, ev.getNoOfPeople());
				ps.setString(4, ev.getEventId());
				ps.setString(5, ev.getOrgId());
				
				//ps.setDouble(5, em.getEmployeeSalary());
				int result = ps.executeUpdate();
				if(result == 1) {
					System.out.println("Catering details are added successfully.....");
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
		
		//to delete the subject
		public void deleteCateringRecordInDb(String food_Code)  throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = "delete from catering where food_Code=?";
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				//for(AdminModel em: empList) {
				CateringModel ev= new CateringModel();
					ps.setString(1,food_Code);
				int result = ps.executeUpdate();	
				System.out.println("Deleted Successful.....");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

		
	public void viewCustomerRecord() throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "Select * from customer";
		try {
			Statement stmt = dbConn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("====================================================================================================================");
			System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s\n","cust_id","cust_name","cust_phone","cust_address","event_id","no_of_people");
			System.out.println("====================================================================================================================");
			while(rs.next()) {
				System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s\n",rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6));				
			}
			System.out.println("====================================================================================================================");
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void storeCustomerRecordInDb(ArrayList<CustomerModel> customerList) throws ClassNotFoundException {
		dbConn = getDbConnection();
		String sql = "insert into customer(cust_id, cust_name, cust_phone, cust_address, event_id , no_of_people) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps = dbConn.prepareStatement(sql);
			for(CustomerModel ev: customerList) {
				ps.setString(1, ev.getCustId());
				ps.setString(2, ev.getCustName());
				ps.setInt(3, ev.getCustPhoneNo());
				ps.setString(4, ev.getCustAddress());
				ps.setString(5, ev.getEventId());
				ps.setInt(6, ev.getTotalNoOfPeople());
				//ps.setDouble(5, em.getEmployeeSalary());
				int result = ps.executeUpdate();
				if(result == 1) {
					System.out.println("Customer details added successfully.....");
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
		
		//to delete the course
		public void deleteCustomerRecordInDb(String cust_id)  throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = "delete from customer where cust_id=?";
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				//for(AdminModel em: empList) {
				CustomerModel ev= new CustomerModel();
					ps.setString(1, cust_id);
				int result = ps.executeUpdate();	
				System.out.println("Customer Records Deleted Successfully.....");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

		public void updatecustomerRecord(int option, String cust_id, String newCustomerDetail) throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = null;
			if(option == 1) {
				sql = "update customer set cust_name = ? where cust_id = ?";	
			}
			else if(option == 3) {
				sql = "update customer set cust_address = ? where cust_id = ?";	
			}
			
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				ps.setString(1, newCustomerDetail);
				ps.setString(2, cust_id);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void updateCustomerRecord(int option, String cust_id, String newCustomerDetails) throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql=null;
			if(option == 2) {
				sql = "update customer set cust_phone = ? where cust_id = ?";	
			}
			else if(option == 4) {
				sql = "update customer set no_of_people = ? where cust_id = ?";	
			}
			
			
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				ps.setString(1, newCustomerDetails);
				ps.setString(2, cust_id);
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		

		//for Faculty in course controller
		public void viewEventOrganizerRecord() throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = "Select * from event_organizer";
			try {
				Statement stmt = dbConn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("====================================================================================================================================================");
				System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","org_id","org_name","org_phone","org_ddress","org_mail","org_qualification","org_experience");
				System.out.println("====================================================================================================================================================");
				while(rs.next()) {
					System.out.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",rs.getString(1),rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));				
				}
				System.out.println("====================================================================================================================================================");
				System.out.println();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//to view faculty subjects 
		public void viewEventOrganizerRecord(String org_id) throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = "Select org_id, food_Code,food_type from catering where org_id=?";
			try {
				PreparedStatement ps= dbConn.prepareStatement(sql);
				ps.setString(1, org_id);
				ResultSet rs = ps.executeQuery();
				System.out.println("=====================================================================");
				System.out.format("%-20s %-20s %-20s\n","Org_Id", "food_Code","food_type");
				System.out.println("=====================================================================");
				while(rs.next()) {
					System.out.format("%-20s %-20s %-20s\n",rs.getString(1),rs.getString(2),rs.getString(3));				
				}
				System.out.println("=====================================================================");
				System.out.println();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void storeEventOrganizerRecordInDb(ArrayList<EventOrganizerModel> eventOrganizerList) throws ClassNotFoundException {
			dbConn = getDbConnection();
			String sql = "insert into event_organizer(org_id, org_name, org_phone, org_address, org_mail, org_qualification, org_experiance) values (?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps = dbConn.prepareStatement(sql);
				for(EventOrganizerModel ev: eventOrganizerList) {
					ps.setString(1, ev.getOrgId());
					ps.setString(2, ev.getOrgName());
					ps.setInt(3, ev.getOrgPhoneNo());
					ps.setString(4, ev.getOrgAddress());
					ps.setString(5, ev.getOrgMail());
					ps.setString(6, ev.getOrgQualification());
					ps.setInt(7, ev.getOrgExperience());
					//ps.setDouble(5, em.getEmployeeSalary());
					int result = ps.executeUpdate();
					if(result == 1) {
						System.out.println("Customer details added successfully.....");
					}
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
			
			//to delete the course
			public void deleteEventOrganizerRecordInDb(String org_id)  throws ClassNotFoundException {
				dbConn = getDbConnection();
				String sql = "delete from event_organizer where org_id=?";
				try {
					PreparedStatement ps = dbConn.prepareStatement(sql);
					//for(AdminModel em: empList) {
					CustomerModel ev= new CustomerModel();
						ps.setString(1, org_id);
					int result = ps.executeUpdate();	
					System.out.println("Deleted Successful.....");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

			public void updateEventOrganizerRecord(int option, String cust_id, String newEmpDetail) throws ClassNotFoundException {
				dbConn = getDbConnection();
				String sql = null;
				if(option == 1) {
					sql = "update customer set cust_name = ? where cust_id = ?";	
				}
				else if(option == 3) {
					sql = "update customer set cust_address = ? where cust_id = ?";	
				}
				
				try {
					PreparedStatement ps = dbConn.prepareStatement(sql);
					ps.setString(1, newEmpDetail);
					ps.setString(2, cust_id);
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			public void updateCustomerRecord(int option, String cust_id, int newcustomerDetails) throws ClassNotFoundException {
				dbConn = getDbConnection();
				String sql=null;
				if(option == 2) {
					sql = "update customer set cust_phone = ? where cust_id = ?";	
				}
				else if(option == 4) {
					sql = "update customer set no of people = ? where cust_id = ?";	
				}
				
				
				try {
					PreparedStatement ps = dbConn.prepareStatement(sql);
					ps.setInt(1, newcustomerDetails);
					ps.setString(2, cust_id);
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

			//for marks
			public void storeReviewsTable(String org_id, int birthday, int marriage, int engagement ) throws ClassNotFoundException {
				dbConn = getDbConnection();
				String sql = "insert into reveiws(org_id,Marriage,Birthday,Engagement) values (?,?,?,?)";
				try {
					PreparedStatement ps = dbConn.prepareStatement(sql);
					
					ps.setString(1, org_id);
					ps.setInt(2, birthday);
					ps.setInt(3, marriage);
					ps.setInt(4, engagement);
						
						//ps.setDouble(5, em.getEmployeeSalary());
						int result = ps.executeUpdate();
						if(result == 1) {
							System.out.println("Review details added successfully.....");
						}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			public void viewReviewRecord() throws ClassNotFoundException {
				dbConn = getDbConnection();
				String sql = "Select * from reveiws";
				try {
					Statement stmt = dbConn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					System.out.println("======================================================================================");
					System.out.format("%-20s %-20s %-20s %-20s\n","org_id","Marriage","Birthday","Engagement");
					System.out.println("======================================================================================");
					while(rs.next()) {
						System.out.format("%-20s %-20s %-20s %-20s\n",rs.getString(1),rs.getInt(2), rs.getInt(3),rs.getInt(4));				
					}
					System.out.println("======================================================================================");
					System.out.println();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

}