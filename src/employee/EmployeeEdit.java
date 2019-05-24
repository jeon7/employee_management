package employee;

import java.util.Scanner;

import employee.utility.RegexVerification;

public class EmployeeEdit {
	

	/**	Modify existing employee information
	 * 
	 */	
	public static void modifyInfo() {
		
		int employeeNumber = 0;
		boolean iteration = true;
		
		// Check and confirm employee number for information modification loop.
		while (iteration) {
			
			System.out.println("\nEnter employee number for modification: ");
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
			
			System.out.println("\n * chosen employee for modification * \n");
			System.out.format(format_fields, "Employee Number", "Name", "Telephone", "Position", "E-Mail" );
			
			
			System.out.format(format_records, 
					EmployeeManager.employee[employeeNumber].getEmployeeNumber(),
					EmployeeManager.employee[employeeNumber].getName(),
					EmployeeManager.employee[employeeNumber].getTel(),
					EmployeeManager.employee[employeeNumber].getPosition(),
					EmployeeManager.employee[employeeNumber].getEmail());
			
			
			System.out.println("\nIs it correct? (y/n) \n");
			
			try {
				String select = new Scanner(System.in).nextLine();
				if(select.equals("y")) {
					modifyDetails(employeeNumber);
					break;
				}else if(select.equals("n")) {
					continue;
				}else {
					return;
				}
			} catch (Exception e) {
//				e.printStackTrace();
				return;
			}
			
		}
		
		
	}
	
		
	private static void modifyDetails(int employeeNumber) {

		boolean iteration = true;
		// iteration for name modification
		while (iteration) {
			
			System.out.println("\nModify name? (y/n) \n");
			try {
				String select = new Scanner(System.in).nextLine();
				if (select.equals("y")) {
					System.out.println("\nPlease enter new employee name. \n");
					String employeeName = new Scanner(System.in).nextLine();
					EmployeeManager.employee[employeeNumber].setName(employeeName);
					break;
				} else if (select.equals("n")) {
					break;
				} else {
					System.out.println("\nPlease enter 'y' or 'n'. \n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("\nPlease enter 'y' or 'n'. \n");
				continue;
			} 
		}
		
		// iteration for telephone number modification
		while (iteration) {
			System.out.println("\nModify telephone number? (y/n) \n");
			try {
				String select = new Scanner(System.in).nextLine();
				if (select.equals("y")) {
					System.out.println("\nPlease enter new telephone number. \n");
					String tel = new Scanner(System.in).nextLine();
					
					if (!RegexVerification.telPattern(tel)) {
						System.out.println("\nUse hyphen. e.g. 000-0000-0000 \n");
						continue;
					} 
					EmployeeManager.employee[employeeNumber].setTel(tel);
					break;
				} else if (select.equals("n")) {
					break;
				} else {
					System.out.println("\nPlease enter 'y' or 'n'. \n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("\nPlease enter 'y' or 'n'. \n");
				continue;
			} 
		}
		
		// iteration for position modification
		while (iteration) {
			System.out.println("\nModify position? (y/n) \n");
			try {
				String select = new Scanner(System.in).nextLine();
				if (select.equals("y")) {
					System.out.println("\nPlease enter new position. \n");
					String position = new Scanner(System.in).nextLine();
					EmployeeManager.employee[employeeNumber].setPosition(position);
					break;
				} else if (select.equals("n")) {
					break;
				} else {
					System.out.println("\nPlease enter 'y' or 'n'. \n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("\nPlease enter 'y' or 'n'. \n");
				continue;
			} 
		}
		
		// iteration for e-mail modification
		while (iteration) {
			System.out.println("\nModify e-mail? (y/n) \n");
			try {
				String select = new Scanner(System.in).nextLine();
				if (select.equals("y")) {
					System.out.println("\nPlease enter new e-mail adress. \n");
					String email = new Scanner(System.in).nextLine();
					
					if (!RegexVerification.emailPattern(email)) {
						System.out.println("\nUse right format. e.g. johnDoe7@google.com ");
						continue;
					} 
					EmployeeManager.employee[employeeNumber].setEmail(email);
					break;
				} else if (select.equals("n")) {
					break;
				} else {
					System.out.println("\nPlease enter 'y' or 'n'. \n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("\nPlease enter 'y' or 'n'. \n");
				continue;
			} 
		}

		String format_fields = "| %-15s | %-10s | %-15s | %-10s |%-15s |%n";
		String format_records = "| %-15d | %-10s | %-15s | %-10s |%-15s |%n";
		
		System.out.println("\n * modification completed * \n");
		System.out.format(format_fields, "Employee Number", "Name", "Telephone", "Position", "E-Mail" );
		
		
		System.out.format(format_records, 
				EmployeeManager.employee[employeeNumber].getEmployeeNumber(),
				EmployeeManager.employee[employeeNumber].getName(),
				EmployeeManager.employee[employeeNumber].getTel(),
				EmployeeManager.employee[employeeNumber].getPosition(),
				EmployeeManager.employee[employeeNumber].getEmail());
		
	}
	

}
