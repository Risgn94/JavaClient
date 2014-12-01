package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CalendarView extends JPanel {
	private JTable table;
	private JTextField subscribeField = new JTextField();
	private JButton btnSubscribe = new JButton("Subscribe");
	private JButton btnMainMenu = new JButton("Main Menu");
	private JButton btnCreateCalendar = new JButton("Create Calendar");
	private JButton btnDeleteCalendar = new JButton("Delete Calendar");
	private JTextField createField = new JTextField();
	private JTextField deleteField = new JTextField();
	private JComboBox createCombo = new JComboBox();

	/**
	 * Create the panel.
	 */
	public CalendarView() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		/*
		 * Buttons
		 */
		btnMainMenu.setBounds(1129, 9, 225, 70);
		add(btnMainMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 493, 742);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblSubscribeToCalendar = new JLabel("Subscribe to calendar");
		lblSubscribeToCalendar.setBounds(527, 13, 124, 16);
		add(lblSubscribeToCalendar);
		
		JLabel lblCalendarName = new JLabel("Calendar Name: ");
		lblCalendarName.setBounds(527, 36, 97, 16);
		add(lblCalendarName);
		
		subscribeField.setBounds(636, 33, 116, 22);
		add(subscribeField);
		subscribeField.setColumns(10);
		
		btnSubscribe.setBounds(527, 65, 97, 25);
		add(btnSubscribe);
		
		JLabel lblCreateNewCalender = new JLabel("Create New Calender");
		lblCreateNewCalender.setBounds(527, 167, 122, 16);
		add(lblCreateNewCalender);
		
		JLabel lblNewLabel = new JLabel("Calendar Name:");
		lblNewLabel.setBounds(527, 210, 93, 16);
		add(lblNewLabel);

		createField.setBounds(656, 207, 116, 22);
		add(createField);
		createField.setColumns(10);
		
		JLabel lblPublicOrPrivate = new JLabel("Public or Private");
		lblPublicOrPrivate.setBounds(796, 210, 92, 16);
		add(lblPublicOrPrivate);
		
		createCombo.setModel(new DefaultComboBoxModel(new String[] {"Public", "Private"}));
		createCombo.setBounds(900, 207, 79, 22);
		add(createCombo);
		
		JLabel lblDeleteCalendar = new JLabel("Delete Calendar");
		lblDeleteCalendar.setBounds(527, 317, 91, 16);
		add(lblDeleteCalendar);
		
		JLabel lblCalendarName_1 = new JLabel("Calendar Name:");
		lblCalendarName_1.setBounds(527, 346, 93, 16);
		add(lblCalendarName_1);
		
		deleteField.setBounds(656, 343, 116, 22);
		add(deleteField);
		deleteField.setColumns(10);	
		
		btnCreateCalendar.setBounds(527, 250, 125, 25);
		add(btnCreateCalendar);	
		
		btnDeleteCalendar.setBounds(527, 388, 123, 25);
		add(btnDeleteCalendar);
	}

	public JButton getBtnSubscribe() {
		return btnSubscribe;
	}
	
	public JTextField getSubscribeField() {
		return subscribeField;
	}

	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}

	public JButton getBtnCreateCalendar() {
		return btnCreateCalendar;
	}

	public JButton getBtnDeleteCalendar() {
		return btnDeleteCalendar;
	}

	public JTextField getCreateField() {
		return createField;
	}

	public JTextField getDeleteField() {
		return deleteField;
	}

	public JComboBox getCreateCombo() {
		return createCombo;
	}

	public void subscribeListener(ActionListener l)
	{
		btnSubscribe.addActionListener(l);
	}
	public void createCalendarListener (ActionListener l)
	{
		btnCreateCalendar.addActionListener(l);
	}
	public void deleteCalendarListener (ActionListener l)
	{
		btnDeleteCalendar.addActionListener(l);
	}
	public void  goToMainMenu (ActionListener l)
	{
		btnMainMenu.addActionListener(l);
	}
}