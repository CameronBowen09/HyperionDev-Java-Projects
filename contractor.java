package level_two_capstone1;

public class contractor {
	
	private ContractorData data = new ContractorData();

	/*
	 *  Constructor method for the project class
	 */
	public contractor(String name, String tellNumber, String email, String address) {
		this.data.name = name;
		this.data.tellNumber = tellNumber;
		this.data.email = email;
		this.data.address = address;
	}
	
	public String getName() {
		return data.name;
	}
	
	public void setConName(String n) {
		data.name = n;
	}
	
	public String getTellNumber() {
		return data.tellNumber;
	}
	
	public void setTellNumber(String number) {
		data.tellNumber = number;
	}
	
	public String getEmail() {
		return data.email;
	}
	
	public void setEmail(String emailAddress) {
		data.email = emailAddress;
	}
	
	public String getAddress() {
		return data.address;
	}
	
	public void setConAddress(String roadAddress) {
		data.address = roadAddress;
	}
	
	/*
	 *  This method formats all the information into an easily readable format
	 */
	public String toString() {
		String output = "Name: " + data.name;
		output += "\nCellphone Number: " + data.tellNumber;
		output += "\nEmail Address: " + data.email;
		output += "\nPhysical Address: " + data.address;
		return output;
	}
	/*
	 *  This method formats all the information into a format for a file
	 */
	public String toFile() {
		String output = ", " + data.name;
		output += ", " + data.tellNumber;
		output += ", " + data.email;
		output += ", " + data.address;
		return output;
	}
}
