package GUILogic;

import guiLogic.String;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import GUI.CalendarView;
import GUI.ContainerPanel;
import ServerConnection.ServerMethods;

public class Logic {
	ServerMethods SM = new ServerMethods();
	private ContainerPanel CP;
	private String allKnowingUsername;
	private String allKnowingUserID;
	private int allKnowingAdmin;
	
	public Logic() throws Exception
	{
		CP = new ContainerPanel();
		initializeListeners();
	}
	public void startApp()
	{
		CP.show(ContainerPanel.loginScreen);
		CP.setVisible(true);
	}
	
	private class logOut implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.loginScreen);
		}
	}
	
	private class backToMainMenu implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			
			CP.show(ContainerPanel.mainMenu);
		}
	}
	
	private class toCalendarView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.calendarView);
			getCalendars();
			
		}
	}
	
	private class toEventView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.eventView);
		}
	}
	private class toNoteView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.noteView);
			
		}
	}
	private void setWeekView()
	{
		String[][] weekDate = SM.getEventsFromUSerWeek(allKnowingUsername);
		int arrayCounter = weekDate[0].length;
		int arrayChecker = 0;
		int arrayCheckerPlus = 0;
		for (int reset = 1; reset < 99; reset++) {
			System.out.println("Vi er inde i for-loop " + reset + ". gang");
			// Sets every field in a Jtable equals nothing
			CP.getMM().getWeekTable().setValueAt(null, reset, 0);
			CP.getMM().getWeekTable().setValueAt(null, reset, 1);
			CP.getMM().getWeekTable().setValueAt(null, reset, 2);
			CP.getMM().getWeekTable().setValueAt(null, reset, 3);
			CP.getMM().getWeekTable().setValueAt(null, reset, 4);
		}

		while (arrayChecker < arrayCounter) {
			try
			{
				if(!weekDate[0][arrayChecker].isEmpty())
				{
				System.out.println("Vi er inde i while-loop " + arrayChecker+ ". gang");
				CP.getMM().getWeekTable().setValueAt(weekDate[0][arrayChecker], arrayCheckerPlus, 0);
				CP.getMM().getWeekTable().setValueAt(weekDate[1][arrayChecker], arrayCheckerPlus, 1);
				CP.getMM().getWeekTable().setValueAt(weekDate[2][arrayChecker], arrayCheckerPlus, 2);
				CP.getMM().getWeekTable().setValueAt(weekDate[3][arrayChecker], arrayCheckerPlus, 3);
				CP.getMM().getWeekTable().setValueAt(weekDate[4][arrayChecker], arrayCheckerPlus, 4);
				arrayChecker++;
				arrayCheckerPlus++;
				}
			}
			catch(Exception e)
			{
				System.out.println("Well... We Try again");
				arrayChecker++;
			}
		}
	}
	private void setQuote()
	{
		String quoteText = SM.getQuote();
		int quoteLength = quoteText.length();
		//150
		if(quoteLength>169)
		{
			CharSequence firstHalf = quoteText.subSequence(0, 169)+"-";
			CharSequence secondHalf = quoteText.subSequence(169, quoteLength);
			String firstHalfString = firstHalf.toString();
			String secondHalfString = secondHalf.toString();
			
			CP.getMM().getQuoteText().setText(firstHalfString);
			CP.getMM().getQuoteText2().setText(secondHalfString);
		}
		else
		{
			CP.getMM().getQuoteText().setText(quoteText);
		}
	}
	private void setWeather()
	{
		String weatherText = SM.getWeather();
		CP.getMM().getWeatherText().setText(weatherText);
	}
	
	private void getCalendars()
	{
		String[][] calendarData = SM.getCalendarsFromAll();
		System.out.println(calendarData[1][1]);
		int arrayCounter = calendarData[0].length;
		int arrayChecker = 0;
		int arrayCheckerPlus = 0;
		for (int reset = 1; reset < 99; reset++) {
			System.out.println("Vi er inde i for-loop " + reset + ". gang");
			// Sets every field in a Jtable equals nothing
			CP.getCV().getCalendarTable().setValueAt(null, reset, 0);
			CP.getCV().getCalendarTable().setValueAt(null, reset, 1);
			CP.getCV().getCalendarTable().setValueAt(null, reset, 2);
			CP.getCV().getCalendarTable().setValueAt(null, reset, 3);
			CP.getCV().getCalendarTable().setValueAt(null, reset, 4);
		}

		while (arrayChecker < arrayCounter) {
			try
			{
				if(!calendarData[0][arrayChecker].isEmpty())
				{
				System.out.println("Vi er inde i while-loop " + arrayChecker+ ". gang");
				CP.getCV().getCalendarTable().setValueAt(calendarData[0][arrayChecker], arrayCheckerPlus, 0);
				CP.getCV().getCalendarTable().setValueAt(calendarData[1][arrayChecker], arrayCheckerPlus, 1);
				CP.getCV().getCalendarTable().setValueAt(calendarData[2][arrayChecker], arrayCheckerPlus, 2);
				CP.getCV().getCalendarTable().setValueAt(calendarData[3][arrayChecker], arrayCheckerPlus, 3);
				CP.getCV().getCalendarTable().setValueAt(calendarData[4][arrayChecker], arrayCheckerPlus, 4);
				arrayChecker++;
				arrayCheckerPlus++;
				}
			}
			catch(Exception e)
			{
				System.out.println("Well... We Try again");
				arrayChecker++;
			}
		}
		
	}
	private void setDayView()
	{
		String[][] dayDate = SM.getEventsFromUSerDay(allKnowingUsername);
		int arrayCounter = dayDate[0].length;
		int arrayChecker = 0;
		int arrayCheckerPlus = 0;
		for (int reset = 1; reset < 99; reset++) {
			System.out.println("Vi er inde i for-loop " + reset + ". gang");
			// Sets every field in a Jtable equals nothing
			CP.getMM().getDayTable().setValueAt(null, reset, 0);
			CP.getMM().getDayTable().setValueAt(null, reset, 1);
			CP.getMM().getDayTable().setValueAt(null, reset, 2);
			CP.getMM().getDayTable().setValueAt(null, reset, 3);
			CP.getMM().getDayTable().setValueAt(null, reset, 4);
		}

		while (arrayChecker < arrayCounter) {
			try
			{
				if(!dayDate[0][arrayChecker].isEmpty())
				{
				System.out.println("Vi er inde i while-loop " + arrayChecker+ ". gang");
				CP.getMM().getDayTable().setValueAt(dayDate[0][arrayChecker], arrayCheckerPlus, 0);
				CP.getMM().getDayTable().setValueAt(dayDate[1][arrayChecker], arrayCheckerPlus, 1);
				CP.getMM().getDayTable().setValueAt(dayDate[2][arrayChecker], arrayCheckerPlus, 2);
				CP.getMM().getDayTable().setValueAt(dayDate[3][arrayChecker], arrayCheckerPlus, 3);
				CP.getMM().getDayTable().setValueAt(dayDate[4][arrayChecker], arrayCheckerPlus, 4);
				arrayChecker++;
				arrayCheckerPlus++;
				}
			}
			catch(Exception e)
			{
				System.out.println("Well... We Try again");
				arrayChecker++;
			}
		}
	}
	
	private void viewAllNotes()
	{
		String[][] noteData = SM.getEventsFromUSerDay(allKnowingUsername);
		int arrayCounter = noteData[0].length;
		int arrayChecker = 0;
		int arrayCheckerPlus = 0;
		for (int reset = 1; reset < 99; reset++) {
			System.out.println("Vi er inde i for-loop " + reset + ". gang");
			// Sets every field in a Jtable equals nothing
			CP.getMM().getDayTable().setValueAt(null, reset, 0);
			CP.getMM().getDayTable().setValueAt(null, reset, 1);
			CP.getMM().getDayTable().setValueAt(null, reset, 2);
			CP.getMM().getDayTable().setValueAt(null, reset, 3);
			CP.getMM().getDayTable().setValueAt(null, reset, 4);
		}

		while (arrayChecker < arrayCounter) {
			try
			{
				if(!noteData[0][arrayChecker].isEmpty())
				{
				System.out.println("Vi er inde i while-loop " + arrayChecker+ ". gang");
				CP.getMM().getDayTable().setValueAt(noteData[0][arrayChecker], arrayCheckerPlus, 0);
				CP.getMM().getDayTable().setValueAt(noteData[1][arrayChecker], arrayCheckerPlus, 1);
				CP.getMM().getDayTable().setValueAt(noteData[2][arrayChecker], arrayCheckerPlus, 2);
				CP.getMM().getDayTable().setValueAt(noteData[3][arrayChecker], arrayCheckerPlus, 3);
				CP.getMM().getDayTable().setValueAt(noteData[4][arrayChecker], arrayCheckerPlus, 4);
				arrayChecker++;
				arrayCheckerPlus++;
				}
			}
			catch(Exception e)
			{
				System.out.println("Well... We Try again");
				arrayChecker++;
			}
		}
	}
	
	private class deleteEvent implements ActionListener{
		public void actionPerformed (ActionEvent e)
		{
			String deleteID = CP.getEV().getDeleteField().getText();
			if(!deleteID.equals(""))
			{
				JOptionPane.showMessageDialog(null, SM.deleteEvent(deleteID, allKnowingUsername), "Information", JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You have to enter an eventID", "Information", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}
	
	private class viewNote implements ActionListener{
		public void actionPerformed (ActionEvent e)
		{
			String eventID = JOptionPane.showInputDialog("Enter EventID of note to see");
			String note = SM.getNote(eventID);
			JOptionPane.showMessageDialog(null, note, "Note View", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	private class getNoteText implements ActionListener{
		public void actionPerformed (ActionEvent e)
		{
			String eventID = CP.getNV().getEventIDField().getText();
			if(!eventID.equals(""))
			{
				String note = SM.getNoteText(eventID);
				CP.getNV().getNoteTextArea().setText(note);
				CP.getNV().getUpdateNoteBtn().setEnabled(true);
			}
			else
			{
				CP.getNV().getEventIDField().setText("");
				JOptionPane.showMessageDialog (null, "You have to enter an Event ID", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private class updateNotes implements ActionListener{
		public void actionPerformed (ActionEvent e)
		{
			String eventID = CP.getNV().getEventIDField().getText();
			String noteText = CP.getNV().getNoteTextArea().getText();
			String stringToBeReturned = SM.updateNote(eventID, noteText, allKnowingUsername);
			
			CP.getNV().getUpdateNoteBtn().setEnabled(false);	
		}
	}
	
	private class subscribeOtherUser implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String userName = CP.getCV().getCalendarField().getText();
			String calendarName = CP.getCV().getUsernameField().getText();
			
			if(!userName.equals("") || !calendarName.equals(""))
			{
				SM.subsribeOtherUser(allKnowingUsername, userName, calendarName);
				getCalendars();
				CP.getCV().getCalendarField().setText("");
				CP.getCV().getUsernameField().setText("");
			}
			else
			{
				System.out.println("You have to enter both an user and calendar!");
			}
		}
	}
	
	private class logIn implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String username = CP.getLS().getEmailField().getText();
			String password = CP.getLS().getPasswordField().getText();
			if(SM.userLogin(username, password).equals("1"))
			{
				setAllKnowingUsername(username);
				CP.show(ContainerPanel.mainMenu);
				CP.getLS().getEmailField().setText("");
				CP.getLS().getPasswordField().setText("");
				setDayView();
				setWeekView();
				setQuote();
				setWeather();
			}
			else
			{
				JOptionPane.showMessageDialog (null, "Wrong username or password", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	private class subscribeToCalendar implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String calendarName = CP.getCV().getSubscribeField().getText();
			SM.useToCalendar(allKnowingUsername, calendarName);
			getCalendars();
		}
	}
	
	
	private class createCalendar implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String calendarName = CP.getCV().getCreateField().getText();
			String comboText = CP.getCV().getCreateCombo().getSelectedItem().toString();
			int PP = 0;
			System.out.println(comboText);
			if(comboText.equals("Private"))
			{
				PP = 2;
			}
			else
			{
				PP = 1;
			}
			System.out.println(PP);
			SM.createCalendar(calendarName, PP, allKnowingUsername);
			getCalendars();
		}
	}
	private class deleteCalendar implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String calendarName = CP.getCV().getDeleteField().getText();
			if(!calendarName.equals(""))
			{
				SM.deleteCalendar(calendarName, allKnowingUsername);
				getCalendars();
			}
			else
			{
				CP.getCV().getDeleteField().setText("");
				JOptionPane.showMessageDialog (null, "You have to enter the name of a calendar to delete", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private class createEvent implements ActionListener {
		public void actionPerformed (ActionEvent e)
		{
			String eventName = CP.getEV().getEventNameField().getText();
			String locationName = CP.getEV().getLocationField().getText();
			String eventInfo = CP.getEV().getInfoText().getText();
			String type = CP.getEV().getTypeCombo().getSelectedItem().toString();
			String startYear = CP.getEV().getStartYear().getSelectedItem().toString();
			String startMonth = CP.getEV().getStartMonth().getSelectedItem().toString();
			String startDay = CP.getEV().getStartDay().getSelectedItem().toString();
			String startHour = CP.getEV().getStartHour().getSelectedItem().toString();
			String startMinute = CP.getEV().getStartMinute().getSelectedItem().toString();
			String endYear = CP.getEV().getEndYear().getSelectedItem().toString();
			String endMonth = CP.getEV().getEndMonth().getSelectedItem().toString();
			String endDay = CP.getEV().getEndDay().getSelectedItem().toString();
			String endHour = CP.getEV().getEndHour().getSelectedItem().toString();
			String endMinute = CP.getEV().getEndMinute().getSelectedItem().toString();
			String calendarName = CP.getEV().getCalendarNameField().getText();
			
		}
	}
	
	private void initializeListeners()
	{
		CP.getMM().logOutListener(new logOut());
		CP.getLS().loginListener(new logIn());
		CP.getMM().calendarListener(new toCalendarView());
		CP.getCV().subscribeListener(new subscribeToCalendar());
		CP.getCV().deleteCalendarListener(new deleteCalendar());
		CP.getCV().createCalendarListener(new createCalendar());
		CP.getCV().goToMainMenu(new backToMainMenu());
		CP.getMM().eventListener(new toEventView());
		CP.getEV().mainMenuListener(new backToMainMenu());
		CP.getNV().mainMenuListener(new backToMainMenu());
		CP.getMM().noteViewListener(new toNoteView());
		CP.getCV().otherUserSubscribe(new subscribeOtherUser());
		CP.getMM().viewNoteListener(new viewNote());
		CP.getNV().getNoteListener(new getNoteText());
		CP.getNV().addNoteListener(new updateNotes());
		CP.getEV().deleteEventListener(new deleteEvent());
	}
	public String getAllKnowingUsername() {
		return allKnowingUsername;
	}
	public void setAllKnowingUsername(String allKnowingUsername) {
		this.allKnowingUsername = allKnowingUsername;
	}
	public String getAllKnowingUserID() {
		return allKnowingUserID;
	}
	public void setAllKnowingUserID(String allKnowingUserID) {
		this.allKnowingUserID = allKnowingUserID;
	}
	public int getAllKnowingAdmin() {
		return allKnowingAdmin;
	}
	public void setAllKnowingAdmin(int allKnowingAdmin) {
		this.allKnowingAdmin = allKnowingAdmin;
	}
}