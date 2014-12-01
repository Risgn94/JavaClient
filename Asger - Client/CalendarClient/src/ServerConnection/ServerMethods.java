package ServerConnection;

import ClientSocket.TCPClient;
import JsonClasses.AuthUserJson;
import JsonClasses.CreateCalendarJson;
import JsonClasses.DeleteCalendarJson;
import JsonClasses.userToCalendar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServerMethods {
	TCPClient TC = new TCPClient();
	Gson gson = new GsonBuilder().create();
	public String userLogin (String username, String password)
	{
		String userExists ="";
		AuthUserJson AU = new AuthUserJson();
		AU.setAuthUserEmail(username);
		AU.setAuthUserPassword(password);
		String gsonString = gson.toJson(AU);
		try {
			userExists = TC.sendMessage(gsonString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userExists;
	}
	
	public String useToCalendar(String username, String Calendarname)
	{
		String stringToBeReturned = "";
		userToCalendar UTC = new userToCalendar();
		UTC.setCalendarName(Calendarname);
		UTC.setEmail(username);
		String gsonString = gson.toJson(UTC);
		try
		{
			stringToBeReturned = TC.sendMessage(gsonString);
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringToBeReturned;
	}

	public void deleteCalendar(String calendarName, String allKnowingUsername) {
		String stringToBeReturned = "";
		DeleteCalendarJson DCJ = new DeleteCalendarJson();
		DCJ.setCalenderName(calendarName);
		DCJ.setUserName(allKnowingUsername);
		String gsonString = gson.toJson(DCJ);
		try
		{
			stringToBeReturned = TC.sendMessage(gsonString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void createCalendar(String calendarName, int pP, String allKnowingUsername) {
		String stringToBeReturned ="";
		CreateCalendarJson CCJ = new CreateCalendarJson();
		CCJ.setCalenderName(calendarName);
		CCJ.setPublicOrPrivate(pP);
		CCJ.setUserName(allKnowingUsername);
		String gsonString = gson.toJson(CCJ);
		try
		{
			stringToBeReturned = TC.sendMessage(gsonString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}