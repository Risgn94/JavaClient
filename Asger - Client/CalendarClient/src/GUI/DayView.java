package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;

import java.awt.ScrollPane;

import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class DayView extends JPanel {
	private JTable table;
	private JButton mainMenuBtn = new JButton("Go To Main Menu");
	private JButton weekViewBtn = new JButton("Go To Week view");

	/**
	 * Create the panel.
	 */
	public DayView() {
		setBounds(0, 0, 1366, 768);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(374, 76, 618, 639);
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
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
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
				"From", "To", "Description", "Location"
			}
		));
		scrollPane.setViewportView(table);
		
		weekViewBtn.setBounds(1147, 72, 207, 54);
		add(weekViewBtn);
		
		mainMenuBtn.setBounds(12, 72, 191, 54);
		add(mainMenuBtn);
	}

	public JButton getMainMenuBtn() {
		return mainMenuBtn;
	}

	public JButton getWeekViewBtn() {
		return weekViewBtn;
	}
	public void menuListener(ActionListener l)
	{
		mainMenuBtn.addActionListener(l);
	}
}