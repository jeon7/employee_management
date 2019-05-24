package employee;

import java.util.Scanner;

import employee.utility.RegexVerification;

public class EmployeeAdd {
	
	/**	Create new employee information
	 * 
	 */
	public static void insertInfo() {
		
		int employeeNumber = 0;
		boolean iteration = true;
		
		while (iteration) {
			
			System.out.println("\nEmployee number: ");
			Scanner sc = new Scanner(System.in);
			
			try {
				employeeNumber = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("\nEnter a number between 0 and 999. \n");
//				e.printStackTrace();
				continue;
			}
			
			if (employeeNumber < 0 || 999 < employeeNumber) {
				System.out.println("\nEnter a number between 0 and 999. \n");
				continue;
			}
			
			if(EmployeeManager.employeeNumberOccupied(employeeNumber)) {
				System.out.println("\nThis number is already occupied. Enter another employee number.  \n");
				continue;
			}
			break;
		}
		
		System.out.println("\nName: ");
		String name = new Scanner(System.in).nextLine();
		
		String tel = null;
		while (iteration) {
			System.out.println("\nTelephone: ");
			tel = new Scanner(System.in).nextLine();
			if (!RegexVerification.telPattern(tel)) {
				System.out.println("\nUse hyphen. e.g. 000-0000-0000 \n");
				continue;
			} 
			break;
		}
		
		System.out.println("\nPosition: ");
		String position = new Scanner(System.in).nextLine();
		
		String email = null;
		while (iteration) {
			System.out.println("\nE-Mail: ");
			email = new Scanner(System.in).nextLine();
			if (!RegexVerification.emailPattern(email)) {
				System.out.println("\nUse right format. e.g. johnDoe7@google.com \n");
				continue;
			} 
			break;
		}
		
		EmployeeManager.employee[employeeNumber] = new Employee(employeeNumber, name, tel, position, email);
		EmployeeManager.employee[employeeNumber].println();
		System.out.println("\nSaved as above\n");
		
	}

}
