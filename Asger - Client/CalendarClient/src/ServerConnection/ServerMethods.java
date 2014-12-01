package ServerConnection;

import ClientSocket.TCPClient;
import JsonClasses.AuthUserJson;
import JsonClasses.userToCalendar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServerMethods {
	TCPClient TC = new TCPClient();
	public String userLogin (String username, String password)
	{
		String userExists ="";
		Gson gson = new GsonBuilder().create();
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
		Gson gson = new GsonBuilder().create();
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
}