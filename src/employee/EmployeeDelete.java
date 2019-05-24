package employee;

import java.util.Scanner;

public class EmployeeDelete {
	
	/**	Delete existing Employee Information
	 * 
	 */	
	public static void deleteInfo() {
		int employeeNumber = 0;
		boolean iteration = true;
		
		// Check and confirm employee number for employee information deletion loop.
		while (iteration) {
			
			System.out.println("\nEnter employee number for deletion: ");
			Scanner sc = new Scanner(System.in);
			
			try {
				employeeNumber = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("\nEnter a employee number between 0 and 999 for modification. \n");
				continue;
			}
			
			if (employeeNumber < 0 || 999 < employeeNumber) {
				System.out.println("\nEnter a employee number between 0 and 999 for modification. \n");
				continue;
			}
			
			if(!EmployeeManager.employeeNumberOccupied(employeeNumber)) {
				System.out.println("\nThere is no employee with this number. Please check first. \n");
				System.out.println("\n1. Go to main menu. \n2. try again.\n");
				
				try {
					int select = new Scanner(System.in).nextInt();
					if(select==1) {
						return;
					}else if(select==2) {
						continue;
					}
				} catch (Exception e) {
					return;
				}
				
			}
			
			String format_fields = "| %-15s | %-10s | %-15s | %-10s |%-15s |%n";
			String format_records = "| %-15d | %-10s | %-15s | %-10s |%-15s |%n";
			
			System.out.println("\n * chosen employee for deletion * \n");
			System.out.format(format_fields, "Employee Number", "Name", "Telephone", "Position", "E-Mail" );
			
			
			System.out.format(format_records, 
					EmployeeManager.employee[employeeNumber].getEmployeeNumber(),
					EmployeeManager.employee[employeeNumber].getName(),
					EmployeeManager.employee[employeeNumber].getTel(),
					EmployeeManager.employee[employeeNumber].getPosition(),
					EmployeeManager.employee[employeeNumber].getEmail());
			
			
			System.out.println("\nAre you sure that you want to delete this employee information? (y/n) \n");
			
			try {
				String select = new Scanner(System.in).nextLine();
				if(select.equals("y")) {
					EmployeeManager.employee[employeeNumber] = null;
					System.out.println("\n * deletion completed * \n");
					break;
				}else if(select.equals("n")) {
					continue;
				}else {
					return;
				}
			} catch (Exception e) {
				System.out.println("\n * deletion not completed * \n");
//				e.printStackTrace();
				return;
			}
			
		}
		
		
		
		
		
	}

}
