package level_two_capstone1;

import java.util.*;;

public class ProjectList {
	
	private static ProjectList onlyinstance = null;
	private ArrayList<project> projectlist;
	/*
	 * This is the constructor method
	 */
	private ProjectList() {
		projectlist = new ArrayList<project>();
	}
	/*
	 * This method creates a single instance of the project list
	 */
	public static ProjectList setProjectList() {
		if (onlyinstance == null) {
			onlyinstance = new ProjectList();
		}
		return onlyinstance;
	}
	
	public ArrayList<project> getProjectList(){
		return projectlist;
	}
	/*
	 * This method adds a project to the project list
	 */
	public void addProject(project p1) {
		projectlist.add(p1);
	}
	/*
	 * This method displays all the projects
	 */
	public void displayAllProjects() {
		for (project p: projectlist) {
			
			System.out.println("Project Details:\n---------------------");
			System.out.println(p.toStringProject());
			
			System.out.println("\nArchitect Details:\n---------------------");
			System.out.println(p.getArchitect());
			
			System.out.println("\nContractor Details:\n---------------------");
			System.out.println(p.getContractor());
			
			System.out.println("\nCustomer Details:\n---------------------");
			System.out.println(p.getCustomer() + "\n");
		}
	}
	
	public void clearProjectList() {
		projectlist.clear();
	}
}
