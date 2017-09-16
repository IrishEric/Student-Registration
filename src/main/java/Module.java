import java.util.ArrayList;

public class Module {
	private String moduleID;
	private String moduleName;
	private ArrayList<Student> students;
	
	public Module(String moduleID, String moduleName, ArrayList<Student> students) {
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		this.students = students;
	}
	public String getModuleID() {
		return moduleID;
	}
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public String toString() {
		System.out.println("Module ID : "+moduleID+ " Module Name : "+moduleName+" ");
		System.out.println("Students enrolled : ");
		for(Student s : students) {
			s.toString();
		}
		return null;
		
	}
}
