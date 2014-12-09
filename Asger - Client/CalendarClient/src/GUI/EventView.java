package GUI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class EventView extends JPanel {
	private JTextField eventNameField = new JTextField();;
	private JButton mainMenuBtn = new JButton("Main Menu");
	private JTextField deleteField = new JTextField();
	private JButton deleteBtn = new JButton("Delete event");
	private JTextField calendarNameField = new JTextField();
	private JButton clearFields = new JButton("Clear Fields");
	private JTextPane infoText = new JTextPane();
	private JComboBox<Object> typeCombo = new JComboBox<Object>();
	private JComboBox<Object> startMinute = new JComboBox<Object>();
	private JComboBox<Object> startYear = new JComboBox<Object>();
	private JComboBox<Object> startHour = new JComboBox<Object>();
	private JComboBox<Object> startDay = new JComboBox<Object>();
	private JComboBox<Object> startMonth = new JComboBox<Object>();
	private JComboBox<Object> endMinute = new JComboBox<Object>();
	private JComboBox<Object> endYear = new JComboBox<Object>();
	private JComboBox<Object> endHour = new JComboBox<Object>();
	private JComboBox<Object> endDay = new JComboBox<Object>();
	private JComboBox<Object> endMonth = new JComboBox<Object>();
	private JButton createEventBtn = new JButton("Create Event");
	private JTextField locationField = new JTextField();
	
	/**
	 * Create the panel.
	 */
	public EventView() {
		setBounds(0, 0, 1366, 768);
		setLayout(null);
		
		mainMenuBtn.setBounds(1129, 13, 225, 70);
		add(mainMenuBtn);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Arial", Font.BOLD, 18));
		label.setBounds(177, 180, 51, 22);
		add(label);
		
		JLabel label_1 = new JLabel("Type");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(177, 223, 43, 22);
		add(label_1);
		
		JLabel label_2 = new JLabel("Location");
		label_2.setFont(new Font("Arial", Font.BOLD, 18));
		label_2.setBounds(177, 258, 75, 22);
		add(label_2);
		
		JLabel label_3 = new JLabel("Start Date");
		label_3.setFont(new Font("Arial", Font.BOLD, 18));
		label_3.setBounds(176, 297, 86, 22);
		add(label_3);
		
		JLabel label_4 = new JLabel("End Date");
		label_4.setFont(new Font("Arial", Font.BOLD, 18));
		label_4.setBounds(176, 328, 86, 22);
		add(label_4);
		
		JLabel label_5 = new JLabel("Calendar");
		label_5.setFont(new Font("Arial", Font.BOLD, 18));
		label_5.setBounds(174, 363, 78, 22);
		add(label_5);
		
		JLabel label_6 = new JLabel("Information");
		label_6.setFont(new Font("Arial", Font.BOLD, 18));
		label_6.setBounds(174, 401, 100, 22);
		add(label_6);
	
		eventNameField.setText("Enter Event Name");
		eventNameField.setColumns(10);
		eventNameField.setBounds(298, 180, 266, 22);
		add(eventNameField);
		
		infoText.setText("If any, enter further information here...");
		infoText.setBounds(177, 436, 391, 118);
		add(infoText);
		
		typeCombo.setBounds(298, 223, 266, 22);
		add(typeCombo);
		
		startMinute.setBounds(513, 293, 51, 22);
		add(startMinute);
		
		startYear.setBounds(298, 293, 55, 22);
		add(startYear);
		
		startHour.setBounds(463, 293, 43, 22);
		add(startHour);
		
		startDay.setBounds(415, 293, 43, 22);
		add(startDay);
		
		startMonth.setBounds(357, 293, 51, 22);
		add(startMonth);
		
		endMinute.setBounds(513, 328, 51, 22);
		add(endMinute);
		
		endYear.setBounds(298, 328, 55, 22);
		add(endYear);
		
		endHour.setBounds(463, 329, 43, 22);
		add(endHour);
		
		endDay.setBounds(415, 329, 43, 22);
		add(endDay);
		
		endMonth.setBounds(357, 329, 51, 22);
		add(endMonth);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/Img/BlueBG.jpg")));
		lblBackground.setBounds(0, 0, 1366, 768);
		lblBackground.isForegroundSet();
		
		JLabel lblDeleteEvent = new JLabel("Delete event");
		lblDeleteEvent.setBounds(701, 184, 71, 16);
		add(lblDeleteEvent);
		
		JLabel lblEventid = new JLabel("eventID");
		lblEventid.setBounds(701, 226, 56, 16);
		add(lblEventid);
		
		deleteField.setBounds(781, 225, 116, 22);
		add(deleteField);
		deleteField.setColumns(10);
		
		deleteBtn.setBounds(701, 271, 97, 25);
		add(deleteBtn);
		
		calendarNameField.setBounds(298, 364, 266, 22);
		add(calendarNameField);
		calendarNameField.setColumns(10);
		
		createEventBtn.setBounds(177, 579, 97, 25);
		add(createEventBtn);
		
		clearFields.setBounds(463, 579, 97, 25);
		add(clearFields);
		locationField.setBounds(298, 259, 266, 22);
		locationField.setColumns(10);
		
		add(locationField);
		add(lblBackground);
	}

	public JButton getMainMenuBtn() {
		return mainMenuBtn;
	}
	public void mainMenuListener (ActionListener l)
	{
		mainMenuBtn.addActionListener(l);
	}
	public void deleteEventListener (ActionListener l)
	{
		deleteBtn.addActionListener(l);
	}
	public void createEventListener (ActionListener l)
	{
		createEventBtn.addActionListener(l);
	}
	public void clearFieldsListener (ActionListener l)
	{
		clearFields.addActionListener(l);
	}

	public JTextField getDeleteField() {
		return deleteField;
	}

	public JButton getDeleteBtn() {
		return deleteBtn;
	}

	public JTextField getEventNameField() {
		return eventNameField;
	}

	public JTextField getCalendarNameField() {
		return calendarNameField;
	}

	public JButton getClearFields() {
		return clearFields;
	}

	public JTextPane getInfoText() {
		return infoText;
	}

	public JComboBox<Object> getTypeCombo() {
		return typeCombo;
	}

	public JComboBox<Object> getStartMinute() {
		return startMinute;
	}

	public JComboBox<Object> getStartYear() {
		return startYear;
	}

	public JComboBox<Object> getStartHour() {
		return startHour;
	}

	public JComboBox<Object> getStartDay() {
		return startDay;
	}

	public JComboBox<Object> getStartMonth() {
		return startMonth;
	}

	public JComboBox<Object> getEndMinute() {
		return endMinute;
	}

	public JComboBox<Object> getEndYear() {
		return endYear;
	}

	public JComboBox<Object> getEndHour() {
		return endHour;
	}

	public JComboBox<Object> getEndDay() {
		return endDay;
	}

	public JComboBox<Object> getEndMonth() {
		return endMonth;
	}
	public JButton getCreateEventBtn() {
		return createEventBtn;
	}

	public JTextField getLocationField() {
		return locationField;
	}
}