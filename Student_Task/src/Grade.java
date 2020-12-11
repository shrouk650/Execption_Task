
public class Grade {

	private String name;
	private double mark;
	
	public Grade(){
		
	}
	
	public Grade(String name, double mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}
	
	
	
}
