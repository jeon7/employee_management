package employee;

public class EmployeeList {
	
	/**	List employee numbers and names of all employees
	 * 
	 */
	public static void printShort() {
		
		String format_fields = "| %-15s | %-10s |%n";
		String format_records = "| %-15d | %-10s |%n";
		
		System.out.println();
		System.out.format(format_fields, "Employee Number", "Name");
		
		for(int i=0; i<EmployeeManager.numberOfEmployees; i++) {
			if(EmployeeManager.employeeNumberOccupied(i)) {
				System.out.format(format_records, 
						EmployeeManager.employee[i].getEmployeeNumber(), 
						EmployeeManager.employee[i].getName());
			}
		}
	}

	/**	List employee numbers, names, telephones, positions and e-mails of all employees
	 * 
	 */
	public static void printDetail() {
		String format_fields = "| %-15s | %-10s | %-15s | %-10s |%-15s |%n";
		String format_records = "| %-15d | %-10s | %-15s | %-10s |%-15s |%n";
		
		System.out.println();
		System.out.format(format_fields, "Employee Number", "Name", "Telephone", "Position", "E-Mail" );
		
		for(int i=0; i<EmployeeManager.numberOfEmployees; i++) {
			if(EmployeeManager.employeeNumberOccupied(i)) {
				
				System.out.format(format_records, 
						EmployeeManager.employee[i].getEmployeeNumber(),
						EmployeeManager.employee[i].getName(),
						EmployeeManager.employee[i].getTel(),
						EmployeeManager.employee[i].getPosition(),
						EmployeeManager.employee[i].getEmail());
			}
		}
		
	}

}
