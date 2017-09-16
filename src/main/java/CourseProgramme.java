import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme {

	private String courseName;
	private ArrayList<Module> modules;
	private DateTime startDate; //joda-time
	private DateTime finishDate; //joda-time
	
	public CourseProgramme(String courseName, ArrayList<Module> modules, DateTime startDate, DateTime finishDate) {
		this.courseName = courseName;
		this.modules = modules;
		this.startDate = startDate;
		this.finishDate = finishDate;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(DateTime finishDate) {
		this.finishDate = finishDate;
	}
	@Override
	public String toString() {
		System.out.println("Course Name "+ courseName+" ");
		System.out.println("Modules : ");
		for(Module m : modules) {
			m.toString();
		}
		return null;
	}
	
}
