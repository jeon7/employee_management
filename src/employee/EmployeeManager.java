package employee;

import java.util.Scanner;

public class EmployeeManager {
	
	final static int numberOfEmployees = 1000;
	static Employee[] employee = new Employee[numberOfEmployees];
	
	
	public static void main(String[] args) {
		
		boolean programm_running = true;
		
		while(programm_running) {
			
			System.out.println("\n0. Exit the programm"
					+ "\n1. Insert Employee Information"
					+ "\n2. List Employees"
					+ "\n3. List Employees Details"
					+ "\n4. Modify Employee Information"
					+ "\n5. Delete Employee");
			
			Scanner sc = new Scanner(System.in);
			
			int select;
			
			try {
				select = sc.nextInt();
			}catch(Exception e){
				System.out.println("\nEnter a number between 0 and 5.");
				e.printStackTrace();
				continue;
			}
			
			if(select == 0){
				break;
			}else if(select == 1){
				EmployeeAdd.insertInfo();
			}else if(select == 2){
				EmployeeList.printShort();
			}else if(select == 3){
				EmployeeList.printDetail();
			}else if(select == 4){
				EmployeeEdit.modifyInfo();
			}else if(select == 5){
				EmployeeDelete.deleteInfo();
			}else {
				System.out.println("\nEnter a number between 0 and 5. ");
				continue;
			}
		
		}

	}
	
	/**	Verify if the employeeNumber exists.
	 * 
	 */
	public static boolean employeeNumberOccupied(int employeeNumber) {
	
		if(employee[employeeNumber]==null) {
			return false;
		}
		
		return true;
	}
	
	
}
