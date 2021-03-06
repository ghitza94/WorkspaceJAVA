/**
 * 
 */
package StudentProjectAllocation;

import java.util.ArrayList;

/**
 * @author Virgil Barcan
 *
 */
public class Student {
	private Integer studentID;
	private ArrayList<Project> studentProjectPreferences;
	private Project studentAssignedProject;
	
	private static int lastStudentID = 1;
	
	//Constructors
	public Student(){
		Initialize();
		
		studentID = Student.lastStudentID;
		++Student.lastStudentID;
	}
	
	public Student(Integer studentID, ArrayList<Project> studentProjectPreferences){
		Initialize();
		
		this.studentProjectPreferences = studentProjectPreferences;
		this.studentID = Student.lastStudentID;
		
		if (Student.lastStudentID < studentID){
			Student.lastStudentID = studentID;
		}
		else{
			++Student.lastStudentID;
		}
	}
	
	private void Initialize(){
		studentID = 0;
		studentProjectPreferences = new ArrayList<Project>();
		studentAssignedProject = null;
	}
	
	public int getStudentID(){
		return this.studentID;
	}
	
	public int getNoOfPreferences(){
		return studentProjectPreferences.size();
	}
	
	public ArrayList<Project> getStudentProjectPreferences(){
		return studentProjectPreferences;
	}
	
	public void setStudentProjectPreferences(ArrayList<Project> preferences){
		this.studentProjectPreferences = preferences;
	}
	
	public void addStudentProjectPreferences(Project preference){
		this.studentProjectPreferences.add(preference);
	}
	
	public Project getAssignedProject(){
		return studentAssignedProject;
	}
	
	public Project getFirstProjectOfStudent(){
		return studentProjectPreferences.get(0);
	}
	
	public boolean isAssigned(){
		if (studentAssignedProject != null)
			return true;
		return false;
	}
	
	public void assignToProject(Project project){
		studentAssignedProject = project;
		System.out.println("Student " + this.getStudentID() +" assigned to project " + project.getProjectID());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentAssignedProject=" + studentAssignedProject
				+ ", studentProjectPreferences=" + studentProjectPreferences + "]";
	}

	public void deAssignFromProject(){
		studentAssignedProject = null;
	}
	
	public void deleteProjectFromStudentPreferences(Project project){
		studentProjectPreferences.remove(project);
	}
}
