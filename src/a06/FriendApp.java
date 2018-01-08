/*******************************************************
* Name: Christa Fox
* Course: CSIS 1410
* Assignment: A06
*******************************************************/
package a06;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FriendApp 
{
	public static void main(String[] args)
	{
		Friend friend1 = new Friend("Patrick", "Levitte", "Pat", new ContactInfo("8011231234", null, "levitte@gmail.com"));
		Friend friend2 = new Friend("Patrick", "Levitte", "Rick", new ContactInfo("8011231234", "8019879876", "pl@gmail.com"));
		Friend friend3 = new Friend("Patrick", "Levitte", "Pat", new ContactInfo(null, null, "pl@gmail.com"));
		Friend friend4 = new Friend("Leon", "Meirer", "Leo", new ContactInfo("8019879876", "2061234567", null));
		Friend friend5 = new Friend("Leon", "Hubert", "Lenny", new ContactInfo(null, "4059879753", "lenny@gmail.com"));

		Friend[] friends = new Friend[5];
		friends[0] = friend1;
		friends[1] = friend2;
		friends[2] = friend3;
		friends[3] = friend4;
		friends[4] = friend5;

		System.out.println("Friends Info:");
		for(Friend el : friends)
		{
			System.out.println("Friend: " + el);
			System.out.println("Hash Code: " + el.hashCode());
			System.out.println(((ContactInfo)el.getContact()).toString());
			System.out.println();
		}
		
		
		friends[2].setNickName("PL");
		((ContactInfo)friends[2].getContact()).setHomePhone("8011231234");
		((ContactInfo)friends[2].getContact()).setCellPhone("8019879876");
		((ContactInfo)friends[3].getContact()).setEmail("leo@gmail.com");
		
		System.out.println("Updated Friends Info:");
		for(Friend el : friends)
		{
			System.out.println("Friend: " + el);
			System.out.println("Hash Code: " + el.hashCode());
			System.out.println(((ContactInfo)el.getContact()).toString());
			System.out.println();
		}

		for(Friend el : friends)
		{
			System.out.println(el.equals(friends));
			System.out.println();
		}
		
		System.out.println("Friends Array: \n" + Arrays.toString(friends));
		System.out.println();
		for(Friend el : friends)
		{
			Arrays.sort(friends);
		}
		System.out.println();
		System.out.println("Sorted Array: \n" + Arrays.toString(friends));
		System.out.println();
	}

}
