package level_two_capstone1;

import java.util.*;
import java.text.*;
import java.time.*;

/*
 * This code stores projects for an engineering company
 * Allows new projects to be added
 * Allows changes to be made to projects
 * Once project is finalized, program writes customer invoice to a file
 * @author Cameron Bowen
 * @version 3.0
 */

public class Poised_Engineering {
	
	/*
	 * This method gathers all the information on the project
	 */
	public static project getData() {
		
		return getProjectData();
	}

	private static project getProjectData() {
		// Allows the user to input
		Scanner n = new Scanner(System.in);
		
		System.out.print("Enter Project Number: ");
		
		// Check if the project number entered is a number
		boolean isNumber1 = n.hasNextInt();
		while (!isNumber1) {
			System.out.println("Entry is not valid! Please try again: ");
			n = new Scanner(System.in);
			isNumber1 = n.hasNextInt();
		}
		int projNum = n.nextInt();
		
		System.out.print("Enter Project Name: ");
		n = new Scanner(System.in);
		String projName = n.nextLine();
		
		System.out.print("Enter Type of Building: ");
		n = new Scanner(System.in);
		String buildType = n.nextLine();
		
		System.out.print("Enter Project Address: ");
		n = new Scanner(System.in);
		String projAddress = n.nextLine();
		
		System.out.print("Enter ERF Number: ");
		
		// Check if the ERF number entered is a number
		boolean isNumber2 = n.hasNextInt();
		while (!isNumber2) {
			System.out.println("Entry is not valid! Please try again: ");
			n = new Scanner(System.in);
			isNumber2 = n.hasNextInt();
		}
		int erfNumber = n.nextInt();
		
		System.out.print("Enter Project Fee: ");
		
		// Check if the project fee is a number
		boolean isNumber3 = n.hasNextInt();
		while (!isNumber3) {
			System.out.println("Entry is not valid! Please try again: ");
			n = new Scanner(System.in);
			isNumber3 = n.hasNextInt();
		}
		int projFee = n.nextInt();
		
		System.out.print("Enter Amout Paid: ");
		
		//Check if the amount paid is a number
		boolean isNumber4 = n.hasNextInt();
		while (!isNumber4) {
			System.out.println("Entry is not valid! Please try again: ");
			n = new Scanner(System.in);
			isNumber4 = n.hasNextInt();
		}
		int amountPaid = n.nextInt();
		
		System.out.print("Enter Deadline of Project(MM/dd/yyyy): ");
		n = new Scanner(System.in);
		String projDeadline = n.nextLine();
		while (!checkValidDate(projDeadline)) {
			System.out.println("Date formate is not valid. Please try again: ");
			n = new Scanner(System.in);
			projDeadline = n.nextLine();
		}
		
		// Check if the objects are working 
		project p = null;
		try {
		architect arch = getDataArch();
		contractor con = getDataCon();
		customer cust = getDataCust();
		
		p = new project(projNum, projName, buildType, projAddress, erfNumber, projFee, amountPaid, projDeadline, arch, con, cust);
		
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		}
		return p;
	}
	
	/*
	 * This method gathers all the information on the architect an returns the object of the architect
	 */
	public static architect getDataArch() {
		
		return getArchitectData();
	}

	private static architect getArchitectData() {
		System.out.print("Enter Architect Name: ");
		Scanner n = new Scanner(System.in);
		String archName = n.nextLine();
		
		System.out.print("Enter Architect tell Number: ");
		n = new Scanner(System.in);
		String archNum = n.nextLine();
		while (!checkTellNumber(archNum)) {
			System.out.println("Number not valid. Please try again: ");
			n = new Scanner(System.in);
			archNum = n.nextLine();
		}
		
		System.out.print("Enter Architect email address: ");
		n = new Scanner(System.in);
		String archEmail = n.nextLine();
		
		System.out.print("Enter Architect address: ");
		n = new Scanner(System.in);
		String archAddress = n.nextLine();
		
		return new architect(archName, archNum, archEmail, archAddress);
	}
	
	/*
	 *  This method gathers information on the constructor and returns the object of the constructor
	 */
	public static contractor getDataCon() {
		
		return getContractorData();
	}
	
	private static contractor getContractorData() {
		System.out.print("Enter Contractor Name: ");
		Scanner n = new Scanner(System.in);
		String conName = n.nextLine();
		
		System.out.print("Enter Contractor tell Number: ");
		n = new Scanner(System.in);
		String conNum = n.nextLine();
		while (!checkTellNumber(conNum)) {
			System.out.println("Number not valid. Please try again: ");
			n = new Scanner(System.in);
			conNum = n.nextLine();
		}
		
		System.out.print("Enter Contractor email address: ");
		n = new Scanner(System.in);
		String conEmail = n.nextLine();
		
		System.out.print("Enter Contractor address: ");
		n = new Scanner(System.in);
		String conAddress = n.nextLine();
		
		return new contractor(conName, conNum, conEmail, conAddress);
	}
	
	/*
	 *  This method gathers information on the customer and returns the object of the customer
	 */
	public static customer getDataCust() {
		
		return getCustomerData();
	}

	private static customer getCustomerData() {
		System.out.print("Enter Customer Name: ");
		Scanner n = new Scanner(System.in);
		String custName = n.nextLine();
		
		System.out.print("Enter Customer tell Number: ");
		n = new Scanner(System.in);
		String custNum = n.nextLine();
		while (!checkTellNumber(custNum)) {
			System.out.println("Number not valid. Please try again: ");
			n = new Scanner(System.in);
			custNum = n.nextLine();
		}
		
		System.out.print("Enter Customer email address: ");
		n = new Scanner(System.in);
		String custEmail = n.nextLine();
		
		System.out.print("Enter Customer address: ");
		n = new Scanner(System.in);
		String custAddress = n.nextLine();
		
		return new customer(custName, custNum, custEmail, custAddress);
	}
	
	/*
	 *  Method to check if the tell number is valid
	 */
	public static boolean checkTellNumber(String tellNumber) {
		
		return checkValidNumber(tellNumber);
	}

	private static boolean checkValidNumber(String tellNumber) {
		Scanner n = new Scanner(System.in);
		
		boolean validTellNumber = true;
		
		try {
			if (tellNumber.substring(0, 1).equalsIgnoreCase("0")) {
				if (tellNumber.length() == 10) {
					long num = Long.parseLong(tellNumber);
				}
				else {
					validTellNumber = false;
				}
			}
			else if (tellNumber.substring(0, 3).equalsIgnoreCase("+27")) {
				if (tellNumber.length() == 12) {
					long num = Long.parseLong(tellNumber.substring(1));
				}
				else {
					validTellNumber = false;
				}
			}
			else {
				validTellNumber = false;
			}
		} 
		catch(Exception e) {
			validTellNumber = false;
		}
		return validTellNumber;
	}
	/*
	 *  Method to check if the date format is valid
	 */
	public static boolean checkValidDate(String strDate) {
		
		if (strDate.trim().equals("")) {
			return true;
		}
		else {
			SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
			sdfrmt.setLenient(false);
			
			try {
				Date date = sdfrmt.parse(strDate);
			} catch (ParseException e) {
				return false;
			}
			return true;
		}
	}
    
	/*
	 *  Main method where everything is executed
	 */
	public static void main(String[] args) {
		
		FileReader fr = new FileReader();
		FileWriter fw = new FileWriter();
		fr.readFile();
		fr.readProjects();
		ProjectList p1 = ProjectList.setProjectList();
		project p = null;
		
		System.out.println("Main Menu:\n" + "--------------------\n" + 
		"To add a project enter - a: \n" + 
		"To display all projects enter - da: \n" + 
		"To display overdue projects enter - od: \n" +
		"To display all incomplete projects enter - ic: \n" +
		"To edit a project enter - e: ");
		Scanner menu = new Scanner(System.in);
		String mainmenu = menu.nextLine();
		
		// If the user selects u, allow the user to update a project
		if (mainmenu.equalsIgnoreCase("a")) {
			project pr = getData();
	    	p1.addProject(pr);
		}
		// If the user selects da, display all the projects
		if (mainmenu.equalsIgnoreCase("da")) {
			p1.displayAllProjects();
		}
		// If the user selects od, display overdue projects
		if (mainmenu.equalsIgnoreCase("od")) {
			try {
			
			String currentDate;
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			currentDate = dateFormat.format(date);
			Date cd = dateFormat.parse(currentDate);
			
			for(project proj: p1.getProjectList()) {
				
				String projDeadline = proj.getProjDeadline();
				Date dateline = dateFormat.parse(projDeadline);
				
				if (cd.compareTo(dateline) > 0) {
					System.out.println("Out of date project:\n-----------------");
					System.out.println(proj.toStringProject());
					}
				}
			} catch (Exception e) {
				System.out.println("Something has gone wrong!");
			}
		}
		// If the user selects ic, display all incomplete projects
		if (mainmenu.equalsIgnoreCase("ic")) {
			
			for (project proj: p1.getProjectList()) {
				
				if (!proj.getCompletion()) {
					System.out.println("Incomplete Project:\n-------------------");
					System.out.println(proj.getProjNum());
				}
			}
		}
		// If the user selects e, allow the user to edit a curtain project
	    if (mainmenu.equalsIgnoreCase("e")) {
	    	int counter = 0;
	    	for (project i: p1.getProjectList()) {
	    		System.out.println(counter + " - " + i.getProjName());
	    		counter += 1;
	    	}
	    	
	    	System.out.println("Which project would you like to edit: ");
	    	Scanner n1 = new Scanner(System.in);
	    	int projEdit = n1.nextInt();
	    	
	    	
	    	p = p1.getProjectList().get(projEdit);
	    	
	    	p1.getProjectList().remove(projEdit);
	    	
		// Print a menu for the user to make choices on what to do
		System.out.println("\nSub Menu:\n" + "--------------------\n" + 
		"To change project due date enter - d: \n" + 
		"To change the amount paid enter - p: \n" + 
		"To change the constructors information enter - c: \n" + 
		"To change the architects information enter - ar: \n" +
		"To change the customers information enter - cu: " +
		"To add a project enter - a: \n" +
		"To update project information enter - u: \n" +
		"To mark project as complete enter - cc: \n" +
		"To finalize the project enter - f: ");
		Scanner n = new Scanner(System.in);
		String menuSelect = n.nextLine();
		
		// If user selects d, allow user to change the due date
		if (menuSelect.equalsIgnoreCase("d")) {
			System.out.println("Enter a new due date: ");
			n = new Scanner(System.in);
			String newDate = n.nextLine();
			p.setDeadline(newDate);
			System.out.println("Due date successfully changed!");
		}
		// If user selects p, allow the user to change the new paid amount
		if (menuSelect.equalsIgnoreCase("p")) {
			System.out.println("Enter the new paid amount: ");
			n = new Scanner(System.in);
			int newAmount = n.nextInt();
			p.setAmount(newAmount);
			System.out.println("Amount paid successfully changed!");
		}
		// If the user selects c, allow the user to change tell number and email address
		if (menuSelect.equalsIgnoreCase("c")) {
			System.out.println("Enter the contractors new telephone number: ");
			n = new Scanner(System.in);
			String newNum1 = n.nextLine();
			p.getContractor().setTellNumber(newNum1);
			while (!checkTellNumber(newNum1)) {
				System.out.println("Number not valid. Please try again: ");
				n = new Scanner(System.in);
				newNum1 = n.nextLine();
			}
			System.out.println("Telephone number successfully changed!");
			
			System.out.println("Enter the contractors new email: ");
			n = new Scanner(System.in);
			String newEmail1 = n.nextLine();
			p.getContractor().setEmail(newEmail1);
			System.out.println("Email successfully changed!");
		}
		// If the user selects ar, allow the user to change the tell number and email address
		if (menuSelect.equalsIgnoreCase("ar")) {
			System.out.println("Enter the architects new telephone number: ");
			n = new Scanner(System.in);
			String newNum2 = n.nextLine();
			p.getArchitect().setTellNumber(newNum2);
			while (!checkTellNumber(newNum2)) {
				System.out.println("Number not valid. Please try again: ");
				n = new Scanner(System.in);
				newNum2 = n.nextLine();
			}
			System.out.println("Telephone number successfully changed!");
			
			System.out.println("Enter the architects new email: ");
			n = new Scanner(System.in);
			String newEmail2 = n.nextLine();
			p.getArchitect().setEmail(newEmail2);
			System.out.println("Email successfully changed!");
		}
		// If the user selects ar, allow the user to change the tell number and email address
		if (menuSelect.equalsIgnoreCase("cu")) {
			System.out.println("Enter the customers new telephone number: ");
			n = new Scanner(System.in);
			String newNum3 = n.nextLine();
			p.getCustomer().setTellNumber(newNum3);
			while (!checkTellNumber(newNum3)) {
				System.out.println("Number not valid. Please try again: ");
				n = new Scanner(System.in);
				newNum3 = n.nextLine();
			}
			System.out.println("Telephone number successfully changed!");
			
			System.out.println("Enter the customers new email: ");
			n = new Scanner(System.in);
			String newEmail3 = n.nextLine();
			p.getCustomer().setEmail(newEmail3);
			System.out.println("Email successfully changed!");
		}
	    // If the user selects u, allow the user to update a project
		if (mainmenu.equalsIgnoreCase("a")) {
			project pr = getData();
	    	p1.addProject(pr);
		}
		// If user selects cc, allow the user to update a project to complete
		if (mainmenu.equalsIgnoreCase("cc")) {
			p.setCompletion(true);
		}
		// If user selects f, finalize the project and print an invoice
		if (menuSelect.equalsIgnoreCase("f")) {
			
			String invoice;
			int amountOwed = p.getProjFee() - p.getAmountPaid();
			
			invoice = "Customer Invoice: \n" + "------------------------\n"+
			"Name: " + p.getCustomer().getName() + "\n" + 
			"Tell Number: " + p.getCustomer().getTellNumber() + "\n" + 
			"Email: " + p.getCustomer().getEmail() + "\n" + 
			"Address: " + p.getCustomer().getAddress() + 
			"\nAmount still owed: " + Integer.toString(amountOwed);
			
			fw.writeInvoice(invoice);
		}
		p1.getProjectList().add(projEdit, p);
	   
	}
		fw.writeToFile();
	}

}
