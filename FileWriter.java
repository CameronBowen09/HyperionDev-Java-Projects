package level_two_capstone1;

import java.io.*;
import java.util.Formatter;

public class FileWriter {
	
	private ProjectList project1;
	/*
	 * This method is the constructor
	 */
	public FileWriter() {
		project1 = ProjectList.setProjectList();
	}
	/*
	 * This method writes new information on projects to the file
	 */
	public void writeToFile() {
		try {
			Formatter fw = new Formatter("Projects.txt");
			String data = "";
			
			for(project p: project1.getProjectList()) {
				data += p.ToFile() + p.getArchitect().toFile() + p.getContractor().toFile() + p.getCustomer().toFile();
			}
			fw.format("%s", data);
			fw.close();
			
		}catch(Exception e) {
			System.out.println("File not found!");
		}
	}
	/*
	 * This method writes information for an invoice to the file
	 */
	public void writeInvoice(String inv) {
		try {
			Formatter fw2 = new Formatter("Invoice.txt");
			
			fw2.format("%s", inv);
			fw2.close();
			
		}catch(Exception e) {
			System.out.println("File not found!");
		}
	}


}
