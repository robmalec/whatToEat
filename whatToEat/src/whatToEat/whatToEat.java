package whatToEat;

import java.util.Scanner;

public class whatToEat {
	
	@SuppressWarnings({ "unused"})
	public static void main(String[] args)
	{
		char eventType = ' ';
		int partySize = 0;
		String result = "";
		Scanner scn = new Scanner(System.in);
		try {
			eventType = scn.next().toCharArray()[0];
			partySize = scn.nextInt();
			
			result += "Since you're hosting a ";
			switch (eventType)
			{
			case 'c':
				result += "casual "+ printNumParticipants(partySize) + "sandwiches ";
				break;
			case 's':
				result += "semi-formal "+ printNumParticipants(partySize) + "fried chicken ";
				break;
			case 'f':
				result += "formal "+ printNumParticipants(partySize) + "chicken parmesan ";
				break;
			default:
				System.out.println("Invalid event type entered");
				break;
			}
			
			result += "prepared ";
			
			if (partySize <= 1)
			{
				result += "in the microwave";
			}
			else if (partySize <= 12 && partySize >= 2)
			{
				result += "in your kitchen";
			}
			else if (partySize >= 13)
			{
				result += "by a caterer";
			}
			
			result += ".";
			
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		scn.close();
	}
	public static String printNumParticipants(int partySize)
	{
		return "event for " + partySize + " participants, you should serve ";
	}
}
