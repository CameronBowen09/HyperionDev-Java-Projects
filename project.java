package level_two_capstone1;

public class project {
	
	private ProjectData data = new ProjectData();
	boolean completion;

	/*
	 *  Constructor method for the project class
	 */
	public project(int projNum, String projName, String buildType, String projAddress, int erfNumber, int projFee, int amountPaid, String projDeadline,architect arch, contractor con, customer cust) {
		this.data.projNum = projNum;
		this.data.projName = projName;
		this.data.buildType = buildType;
		this.data.projAddress = projAddress;
		this.data.erfNumber = erfNumber;
		this.data.projFee = projFee;
		this.data.amountPaid = amountPaid;
		this.data.projDeadline = projDeadline;
		data.architect = arch;
		data.contractor = con;
		data.customer = cust;
		completion = false;
	}
	
	public void setCompletion(boolean completion) {
		this.completion = completion;
	}
	
	public boolean getCompletion() {
		return completion;
	}
	
	public architect getArchitect() {
		return data.architect;
	}
	
	public void setArchitect(architect arch) {
		data.architect = arch;
	}
	
	public contractor getContractor(){
		return data.contractor;
	}
	
	public void setContractor(contractor con) {
		data.contractor = con;
	}
	
	public customer getCustomer() {
		return data.customer;
	}
	
	public void setCustomer(customer cust) {
		data.customer = cust;
	}
	
	public int getProjNum() {
		return data.projNum;
	}
	
	public void setNumber(int number) {
		data.projNum = number;
	}
	
	public String getProjName() {
		return data.projName;
	}
	
	public void setProjName(String name) {
		data.projName = name;
	}
	
	public String getBuildType() {
		return data.buildType;
	}
	
	public void setBuildType(String build) {
		data.buildType = build;
	}
	
	public String getProjAddress() {
		return data.projAddress;
	}
	
	public void setAddress(String address) {
		data.projAddress = address;
	}
	
	public int getErfNumber() {
		return data.erfNumber;
	}
	
	public void setEFRNumber(int erfnum) {
		data.erfNumber = erfnum;
	}
	
	public int getProjFee() {
		return data.projFee;
	}
	
	public void setFee(int fee) {
		data.projFee = fee;
	}
	
	public int getAmountPaid() {
		return data.amountPaid;
	}
	
	public void setAmount(int amount) {
		data.amountPaid = amount;
	}
	
	public String getProjDeadline() {
		return data.projDeadline;
	}
	
	public void setDeadline(String deadline) {
		data.projDeadline = deadline;
	}
	
	/*
	 *  This method formats all the information into an easily readable format
	 */
	public String toStringProject() {
		String output = "Project Number: " + data.projNum;
		output += "\nProject Name: " + data.projName;
		output += "\nBuilding Type: " + data.buildType;
		output += "\nProject Address: " + data.projAddress;
		output += "\nERF Number: " + data.erfNumber;
		output += "\nProject Fee: " + data.projFee;
		output += "\nAmount paid: " + data.amountPaid;
		output += "\nProject Deadline: " + data.projDeadline;
		return output;
	}
	/*
	 * This method formats all the information into a format for a file
	 */
	public String ToFile() {
		String output = Integer.toString(data.projNum);
		output += ", " + data.projName;
		output += ", " + data.buildType;
		output += ", " + data.projAddress;
		output += ", " + data.erfNumber;
		output += ", " + data.projFee;
		output += ", " + data.amountPaid;
		output += ", " + data.projDeadline;
		return output;
	}
}
