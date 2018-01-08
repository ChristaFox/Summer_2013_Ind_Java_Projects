package a01;

public class Student 
{
	//Fields
	private String firstName;
	private String lastName;
	private int sNumber;
	private String major;
	private double gpa;
	private static int count;
	
	//constructors
	public Student() 
	{
		
	}	
	public Student(String fN, String lN, String maj, double gPA)
	{
		firstName = fN;
		lastName = lN;
		major = maj;
		gpa = gPA;
		count++;
		sNumber = 1234566 + count;
		
	}
	
	//methods
	public String getFirstName()
	{
		return firstName;		
	}
	public void setFirstName(String fN)
	{
		firstName = fN;
	}
	public String getLastName()
	{
		return lastName;		
	}
	public void setLastName(String lN)
	{
		lastName = lN;
	}
	public int getSNumber()
	{
		return sNumber;
	}
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String maj)
	{
		major = maj;
	}
	public double getGpa()
	{
		return (double)Math.round(gpa * 10.0) / 10.0;
	}
	public void setGpa(double gPA)
	{
		gpa = gPA;
	}
	
	@Override
	public String toString()
	{
		return "S" + getSNumber() + " " + getFirstName() + " " + getLastName() + " " + "(" + getMajor() + ")" + " gpa:" + getGpa();
	}
	
	public static int count()
	{
		return count;
	}
}
