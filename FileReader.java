package level_two_capstone1;

import java.io.*;
import java.util.*;

public class FileReader  {
	
	private ProjectList project1;
	/*
	 * This is the constructor method
	 */
	public void readFile() {
		project1 = ProjectList.setProjectList();
	}
	/*
	 * This method reads the projects in the project file
	 */
	public void readProjects() {
		
		try {
			
			File projectFile = new File("Projects.txt");
			
			Scanner readProjects = new Scanner(projectFile);
			
			int projNum;
			String projName;
			String buildType;
			String projAddress;
			int efrNumber;
			int projFee;
			int amountPaid;
			String projDeadline;
			String name;
			String tellNumber;
			String email;
		    String address;
		    
		    while(readProjects.hasNext()) {
		    	
		    	String line = readProjects.nextLine();
		    	String newline [] = line.split(", ");
		    	
		    	name = newline[8];
		    	tellNumber = newline[9];
		    	email = newline[10];
		    	address = newline[11];
		    	architect arch1 = new architect(name, tellNumber, email, address);
		    	
		    	name = newline[12];
		    	tellNumber = newline[13];
		    	email = newline[14];
		    	address = newline[15];
		    	contractor con1 = new contractor(name, tellNumber, email, address);
		    	
		    	name = newline[16];
		    	tellNumber = newline[17];
		    	email = newline[18];
		    	address = newline [19];
		    	customer cust1 = new customer(name, tellNumber, email, address);
		    	
		    	projNum = Integer.parseInt(newline[0]);
		    	projName = newline[1];
		    	buildType = newline[2];
		    	projAddress = newline[3];
		    	efrNumber = Integer.parseInt(newline[4]);
		    	projFee = Integer.parseInt(newline[5]);
		    	amountPaid = Integer.parseInt(newline[6]);
		    	projDeadline = newline[7];
		    	
		    	project p1 = new project(projNum, projName, buildType, projAddress, efrNumber, projFee, amountPaid, projDeadline, arch1, con1, cust1);
		    	
		    	project1.addProject(p1);
		    	
		    }
			
		}catch(Exception e) {
			System.out.println("File not found");
		}
	}
}
