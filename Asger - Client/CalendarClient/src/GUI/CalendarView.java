package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalendarView extends JPanel {
	private JTable table;
	private JTextField subscribeField = new JTextField();
	private JButton btnSubscribe = new JButton("Subscribe");

	/**
	 * Create the panel.
	 */
	public CalendarView() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		JButton btnMainMenu = new JButton("Main Menu");
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
	}

	public JButton getBtnSubscribe() {
		return btnSubscribe;
	}
	
	public JTextField getSubscribeField() {
		return subscribeField;
	}

	public void subscribeListener(ActionListener l)
	{
		btnSubscribe.addActionListener(l);
	}
}