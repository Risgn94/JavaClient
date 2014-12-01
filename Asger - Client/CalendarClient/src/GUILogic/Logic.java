package GUILogic;

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
		}
	}
	
	private class toEventView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.eventView);
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
		}
	}
	private class deleteCalendar implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			String calendarName = CP.getCV().getDeleteField().getText();
			if(!calendarName.equals(""))
			{
				SM.deleteCalendar(calendarName, allKnowingUsername);
			}
			else
			{
				CP.getCV().getDeleteField().setText("");
				JOptionPane.showMessageDialog (null, "You have to enter the name of a calendar to delete", "Information", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private void initializeListeners()
	{
		CP.getMM().logOutListener(new logOut());
		CP.getLS().loginListener(new logIn());
		CP.getWV().menuListener(new backToMainMenu());
		CP.getDV().menuListener(new backToMainMenu());
		CP.getMM().calendarListener(new toCalendarView());
		CP.getCV().subscribeListener(new subscribeToCalendar());
		CP.getCV().deleteCalendarListener(new deleteCalendar());
		CP.getCV().createCalendarListener(new createCalendar());
		CP.getCV().goToMainMenu(new backToMainMenu());
		CP.getMM().eventListener(new toEventView());
		
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
