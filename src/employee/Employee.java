package employee;

public class Employee {
	private int employeeNumber;
	private String name;
	private String tel;
	private String position;
	private String email;
	
	
	Employee(int employeeNumber, String name, String tel, String position, String email){
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.tel = tel;
		this.position =position;
		this.email =email;
	}
	
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void println() {
		System.out.println("\nEmployee Number: " + employeeNumber + 
				"\nName: " + name + 
				"\nTelephone: " + tel + 
				"\nPosition: " + position + 
				"\nE-Mail: " + email);
		
	}

}
