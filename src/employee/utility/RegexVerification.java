package employee.utility;

public class RegexVerification {
	
	/**	Check telephone number pattern with regular expression.
	 * 
	 */
	public static boolean telPattern(String tel) {
		String regex = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		try {
			if (tel.matches(regex)) {
				return true;
			} 
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	/**	Check e-mail pattern with regular expression.
	 * 
	 */
	public static boolean emailPattern(String email) {
		String regex = "^[0-9a-zA-Z_-]+@[0-9a-zA-Z]+[.][a-zA-Z]{2,4}$";
		try {
			if (email.matches(regex)) {
				return true;
			} 
		} catch (Exception e) {
			return false;
		}
		return false;
	}


}
