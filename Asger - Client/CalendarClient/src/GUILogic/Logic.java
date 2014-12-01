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
	
	private class toDayView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.dayView);
		}
	}
	
	private class toWeekView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.weekView);
		}
	}
	
	private class toCalendarView implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			CP.show(ContainerPanel.calendarView);
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
	private void initializeListeners()
	{
		CP.getMM().logOutListener(new logOut());
		CP.getLS().loginListener(new logIn());
		CP.getWV().menuListener(new backToMainMenu());
		CP.getDV().menuListener(new backToMainMenu());
		CP.getDV().weekListener(new toWeekView());
		CP.getWV().dayListener(new toDayView());
		CP.getMM().calendarListener(new toCalendarView());
		CP.getCV().subscribeListener(new subscribeToCalendar());
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
