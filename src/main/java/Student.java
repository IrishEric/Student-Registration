
public class Student {
	private static int studentID = 0; //class variable for tracking all student's id's
	private int sID;
	private String name;
	private int age;
	private String dob; // dd/mm/yy
	
	public Student(String n, int a, String d){ //constructor
		this.sID = studentID++; // each new student incrementally assinged id
		this.name = n;
		this.age = a;
		this.dob = d;
	}
	
	public String getUsername() {
		String username = this.name + this.age;
		System.out.println("username :  "+username);
		return username;
	}

	@Override
	public String toString() {
		System.out.println("Student ID : "+this.getsID()+" Student name : "+this.getName()+" Student Date of Birth : "+this.getDob());
		return null;
	}

	public static int getStudentID() {
		return studentID;
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
