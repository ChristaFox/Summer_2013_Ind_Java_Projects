package a01;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> studentArrayList = new ArrayList<Student>();
		studentArrayList.add(new Student("John", "Smith", "CS", 3.6));
		studentArrayList.add(new Student("Lauren", "Edwards", "CS", 3.8));
		studentArrayList.add(new Student("Alex", "Taylor", "EE", 3.2));
		
		int selection;
		do
			{
				menuPrompt();
				selection = new Scanner (System.in).nextInt();
				
				switch (selection)
					{
						case 1:
							Student myStudent = new Student();
							
							System.out.printf("%nFirst Name: %n");
							myStudent.setFirstName(new Scanner (System.in).next());
							
							System.out.printf("Last Name: %n");
							myStudent.setLastName(new Scanner (System.in).next());
							
							System.out.printf("Major: %n");
							myStudent.setMajor(new Scanner (System.in).next());
							
							System.out.printf("GPA: %n");
							myStudent.setGpa(new Scanner (System.in).nextFloat());
							
							studentArrayList.add(new Student(myStudent.getFirstName(), myStudent.getLastName(), myStudent.getMajor(), 
							myStudent.getGpa()));
							
							System.out.println();
							break;
						case 2:
							System.out.printf("Find a student with sNumber S");
							
							boolean sFound = false;
							int searchID = new Scanner (System.in).nextInt();
							
							for(Student el : studentArrayList)
							{
								if(el.getSNumber() == searchID)
								{
									System.out.println(el.toString());
									sFound = true;
								}
							}
							
							if(sFound == false)
							{
								System.out.printf("Student could not be found%n%n");
							}
							
							break;
						case 3:
							System.out.printf("%nDelete student with sNumber S");

							boolean dFound = false;
							int deleteID = new Scanner (System.in).nextInt();
							
							searchLoop:
							for(Student el : studentArrayList)
							{
								if(el.getSNumber() == deleteID)
								{
									studentArrayList.remove(el);
									System.out.printf("S%d %s %s has been deleted%n%n", el.getSNumber(), el.getFirstName(), 
									el.getLastName());
									dFound = true;
									break searchLoop;
								}
							}
							
							if(dFound == false)
							{
								System.out.printf("Student could not be found%n%n");
							}
							
							break;
						case 4:
							System.out.println();
							for (Student el : studentArrayList) 
							{
								System.out.println(el.toString());
							}
							System.out.println();
							break;
						case 5:
							System.out.printf("%nNumber of Students: %d%n%n", studentArrayList.size());
							break;						
						case 6:
							System.out.println("good bye");
							break;
						default:
							System.out.println("invalid input");
							break;								
					}
					
				} while (selection != 6);

	}
	
	public static void menuPrompt()
	{
		System.out.println("1.  Add a Student");
		System.out.println("2.  Find a Student");
		System.out.println("3.  Delete a student");
		System.out.println("4.  Display all students");
		System.out.println("5.  Display number of students in list");
		System.out.println("6.  Exit");
		System.out.printf("Enter your selection: ");
	}

}