
public class Student {

	private String name;
	private String email;
	private int number;
	private String faculty;
	private Grade[] Studentgrade;
	
	public Student(){
		
	}

	public Student(String name, String email, int number, String faculty, Grade[] studentgrade) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.faculty = faculty;
		Studentgrade = studentgrade;
	}
	

	public Student(String name, String email, int number, String faculty) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Grade[] getStudentgrade() {
		return Studentgrade;
	}

	public void setStudentgrade(Grade[] studentgrade) {
		Studentgrade = studentgrade;
	}
	
	
	
}
