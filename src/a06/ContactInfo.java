/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A06
*******************************************************/
package a06;

public class ContactInfo
{
	//feilds
	private String homePhone;
	private String cellPhone;
	private String email;
	
	//ctors
	public ContactInfo(String h, String c, String e) 
	{
		homePhone = h;
		cellPhone = c;
		email = e;
	}
	
	//methods
	public String getHomePhone()
	{
		return homePhone;
	}
	
	public void setHomePhone(String h)
	{
		homePhone = h; 
	}
	
	public String getCellPhone()
	{
		return cellPhone;
	}
	
	public void setCellPhone(String c)
	{
		cellPhone = c;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String e)
	{
		email = e;
	}
	
	@Override
	public String toString()
	{
		String hm = "";
		String cp = "";
		String em = "";
		
		if(homePhone != null)
		{
			hm = "home phone:" + getHomePhone() + " ";
		}
		if(cellPhone != null)
		{
			cp = "cell phone:" + getCellPhone() + " ";
		}
		if(email != null)
		{
			em = "email: " + getEmail() + " ";
		}
		return "Contact:  " + hm + cp + em;
	}
}
