package ServerConnection;

import ClientSocket.TCPClient;
import JsonClasses.AddNoteJson;
import JsonClasses.AuthUserJson;
import JsonClasses.CreateCalendarJson;
import JsonClasses.DeleteCalendarJson;
import JsonClasses.EventsDayJson;
import JsonClasses.EventsWeekJson;
import JsonClasses.GetAllCalendar;
import JsonClasses.NoteJson;
import JsonClasses.QuoteJson;
import JsonClasses.WeatherJson;
import JsonClasses.deleteEventJson;
import JsonClasses.subscribeUserJson;
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
	public String getWeather()
	{
		String stringToBeReturned = "";
		String currentWeather = "";
		Gson gson = new GsonBuilder().create();
		WeatherJson WJ = new WeatherJson();
		String gsonString = gson.toJson(WJ);
		try
		{
			currentWeather = TC.sendMessage(gsonString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		WeatherJson WJ1 = gson.fromJson(currentWeather, WeatherJson.class);
		
		stringToBeReturned = "The temperature today is "+WJ1.getDegrees()+" degrees, and "+WJ1.getDesc()+".";
		return stringToBeReturned;
		
	}
	
	public String getQuote()
	{
		String currentQuote = "";
		String stringToBeReturned ="";
		Gson gson = new GsonBuilder().create();
		QuoteJson QJ = new QuoteJson();
		String gsonString = gson.toJson(QJ);
		try
		{
			currentQuote = TC.sendMessage(gsonString);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		QuoteJson QJ1 = gson.fromJson(currentQuote, QuoteJson.class);
		stringToBeReturned = "\""+QJ1.getQuote()+"\""+" - "+QJ1.getAuthor()+".";
		return stringToBeReturned;
		
	}

	public String[][] getEventsFromUSerDay(String allKnowingUsername) {
		String[][] stringArrayToBeReturned = null;
		EventsDayJson EDJ = new EventsDayJson();
		EDJ.setCreatedby(allKnowingUsername);
		String gsonString = gson.toJson(EDJ);
		try
		{ 
			stringArrayToBeReturned = gson.fromJson(TC.sendMessage(gsonString), String[][].class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringArrayToBeReturned;
	}
	public String[][] getEventsFromUSerWeek(String allKnowingUsername) {
		String[][] stringArrayToBeReturned = null;
		EventsWeekJson EWJ = new EventsWeekJson();
		EWJ.setCreatedby(allKnowingUsername);
		String gsonString = gson.toJson(EWJ);
		try
		{ 
			stringArrayToBeReturned = gson.fromJson(TC.sendMessage(gsonString), String[][].class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringArrayToBeReturned;
	}

	public String[][] getCalendarsFromAll() {
		String[][] stringArrayToBeReturned = null;
		GetAllCalendar GAC = new GetAllCalendar();
		String gsonString = gson.toJson(GAC);
		try
		{
			stringArrayToBeReturned = gson.fromJson(TC.sendMessage(gsonString), String[][].class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return stringArrayToBeReturned;
	}

	public String subsribeOtherUser(String subscriber, String userName, String calendarName) {
		String stringToBeReturned = "";
		subscribeUserJson SUJ = new subscribeUserJson();
		SUJ.setCalendarName(calendarName);
		SUJ.setUsername(userName);
		SUJ.setSubscriber(subscriber);
		String gsonString = gson.toJson(SUJ);
		try
		{
			stringToBeReturned = TC.sendMessage(gsonString);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		return stringToBeReturned;
		
	}

	public String getNote(String eventID) {
		String stringToBeReturned = "";
		String stringFromServer = "";
		NoteJson NJ = new NoteJson();
		NJ.setEventID(eventID);
		String gsonString = gson.toJson(NJ);
		try
		{
			stringFromServer = TC.sendMessage(gsonString);
			try
			{
				NoteJson NJR = gson.fromJson(stringFromServer, NoteJson.class);
				stringToBeReturned = "Note for event "+NJR.getEventID()+"\n"+NJR.getNote()+"\n"+"Created by: "+NJR.getCreatedBy()+" "+NJR.getDateTime();
			}
			catch(Exception e)
			{
				stringToBeReturned = stringFromServer;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return stringToBeReturned;
	}
	public String getNoteText(String eventID) {
		String stringToBeReturned = "";
		String stringFromServer = "";
		NoteJson NJ = new NoteJson();
		NJ.setEventID(eventID);
		String gsonString = gson.toJson(NJ);
		try
		{
			stringFromServer = TC.sendMessage(gsonString);
			try
			{
				NoteJson NJR = gson.fromJson(stringFromServer, NoteJson.class);
				stringToBeReturned = NJR.getNote();
			}
			catch(Exception e)
			{
				stringToBeReturned = stringFromServer;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return stringToBeReturned;
	}

	public String updateNote(String eventID, String noteText, String allKnowingUsername) {
		String stringToBeReturned = "";
		AddNoteJson ANJ = new AddNoteJson();
		ANJ.setCreatedBy(allKnowingUsername);
		ANJ.setEventID(eventID);
		ANJ.setNote(noteText);
		String gsonString = gson.toJson(ANJ);
		try
		{
			stringToBeReturned = TC.sendMessage(gsonString);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringToBeReturned;
	}

	public Object deleteEvent(String deleteID, String allKnowingUsername) {
		String stringToBeReturned = "";
		deleteEventJson DEJ = new deleteEventJson();
		DEJ.setCalendarID(deleteID);
		DEJ.setUserName(allKnowingUsername);
		String gsonString = gson.toJson(DEJ);
		try
		{
			stringToBeReturned = TC.sendMessage(gsonString);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return stringToBeReturned;
	}
}