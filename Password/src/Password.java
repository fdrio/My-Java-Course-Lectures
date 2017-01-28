
public class Password {
	private String password;
	public final static int INVALID = 4;
	public final static int WEAK = 3;
	public final static int MEDIUM = 2;
	public final static int STRONG = 1;
	public Password(String password){
		this.password = password;
	}
	public boolean longEnough(int n){
		return (this.password.length() >= n );
	}

	public boolean containsOneOf(String n){
		for (int i = 0; i < this.password.length(); i++){
			for(int j = 0; j<n.length();j++){
				if(this.password.charAt(i) == n.charAt(j)){
					return true;
				}
			}
		}
		return false; 
	}
	public boolean containsNoneOf(String n){
	
		return !containsOneOf(n);
	}


	public boolean containsUpperCase(){
		for(int index = 0; index< this.password.length(); index++){
			if(Character.isUpperCase(password.charAt(index))){
				return true;
			}
		}
		return false;
	}
	public boolean containsLowerCase(){
		for(int index = 0; index< this.password.length(); index++){
			if(Character.isLowerCase(password.charAt(index))){
				return true;
			}
		}
		return false;
	}
	public int safetyLevel(){
		//Password.INVALID (int 4) if password has less than 8 chars OR at least of of the chars '.' or '/'
		if (!this.longEnough(8) || this.containsOneOf("./")){
			return 4;
		}
		//Password.STRONG (int 1) if password has at least 10 chars, at least one upper and one lower case letter, at least one digit and at least one of "!@#$%^&*()"
		else if(this.longEnough(10) &&this.containsUpperCase()&&this.containsLowerCase() && this.containsOneOf("0123456789") && this.containsOneOf("!@#$%^&*()")){
			return 1;
		}
		//      Password.MEDIUM (int 2) if password has at least 8 chars, at least one upper and one lower case letter, and at least one digit
		else if (this.longEnough(8)&& this.containsUpperCase()&& this.containsLowerCase()&& this.containsOneOf("0123456789")){
			return 2;
		}
		// Password.WEAK (int 3) if password has at least 8 chars, at least one upper and one lower case letter, and at least one digit
		else if (this.longEnough(8)&& this.containsLowerCase() && (this.containsUpperCase()||this.containsOneOf("0123456789"))){
			return 3;
		}
		
		
		else return 4;
	}
}
