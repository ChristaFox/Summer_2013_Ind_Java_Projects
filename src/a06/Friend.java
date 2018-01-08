package a06;

import java.util.Arrays;

public class Friend implements Comparable
{
	//feilds
	private String lastName;
	private String firstName;
	private String nickName;
	private ContactInfo fInfo;
	
	//ctors
	public Friend(String f, String l, String n, ContactInfo c) 
	{
		firstName = f;
		lastName = l;
		nickName = n;
		fInfo = c;	
	}
	
	//methods
	public void setNickName(String n)
	{
		nickName = n;
	}
	
	public String getNickName()
	{
		return nickName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}

	public ContactInfo getContact()
	{
		return fInfo;
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend other = (Friend) obj;
		if (getFirstName() == other.getFirstName() && getLastName().equals(other.getLastName()))
		{
				return true;
		} 
		else if (!getFirstName().equals(other.getFirstName()) && getLastName().equals(other.getLastName()))
			return false;
		return true;
	}

	public String toString()
	{
		return getFirstName() + " " + getLastName() + "(" + getNickName() + ")";
	}


	public int compareTo(Friend other) 
	{
	    final int BEFORE = -1;
	    final int EQUAL = 0;
	    final int AFTER = 1;
	    int firstNameDiff = 0;
	    int lastNameDiff = 0;
	    if (this == other) return EQUAL;
	    firstNameDiff = this.getFirstName().compareTo(other.getFirstName());
	    if (firstNameDiff != EQUAL) return firstNameDiff;
	    lastNameDiff = this.getLastName().compareTo(other.getLastName());
	    if ( lastNameDiff != EQUAL ) return lastNameDiff;
	    else return 0;
	}


}
