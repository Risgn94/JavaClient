package GUI;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NoteView extends JPanel {
	private JButton mainMenuBtn = new JButton("Main Menu");
	private JTextField eventIDField = new JTextField();
	private JTable eventTable = new JTable();
	private JTextArea noteTextArea = new JTextArea();
	private JButton getNoteBtn = new JButton("Get Existing Note");
	private JButton updateNoteBtn = new JButton("Update Note");

	/**
	 * Create the panel.
	 */
	public NoteView() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		mainMenuBtn.setBounds(1129, 13, 225, 70);
		add(mainMenuBtn);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(MainMenu.class.getResource("/Img/BlueBG.jpg")));
		lblBackground.setBounds(0, 0, 1366, 768);
		lblBackground.isForegroundSet();
		
		eventIDField.setBounds(809, 104, 228, 22);
		add(eventIDField);
		eventIDField.setColumns(10);
		
		noteTextArea.setText("Enter note here...");
		noteTextArea.setBounds(734, 170, 300, 229);
		add(noteTextArea);
		
		JLabel lblEventid = new JLabel("EventID* :");
		lblEventid.setBounds(737, 107, 60, 16);
		add(lblEventid);
		
		getNoteBtn.setBounds(734, 132, 129, 25);
		add(getNoteBtn);
		
		updateNoteBtn.setBounds(734, 425, 103, 25);
		updateNoteBtn.setEnabled(false);
		add(updateNoteBtn);
		
		JLabel whiteSpace = new JLabel("");
		whiteSpace.setBounds(714, 80, 349, 387);
		add(whiteSpace);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 13, 639, 742);
		add(scrollPane);
		
		
		eventTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Event ID", "Type", "Start", "End", "Name"
			}
		));
		scrollPane.setViewportView(eventTable);
		add(lblBackground);
	}

	public JButton getMainMenuBtn() {
		return mainMenuBtn;
	}
	
	public JTextField getEventIDField() {
		return eventIDField;
	}

	public JTable getEventTable() {
		return eventTable;
	}

	public JTextArea getNoteTextArea() {
		return noteTextArea;
	}

	public JButton getGetNoteBtn() {
		return getNoteBtn;
	}

	public JButton getUpdateNoteBtn() {
		return updateNoteBtn;
	}

	public void mainMenuListener(ActionListener l)
	{
		mainMenuBtn.addActionListener(l);
	}
	public void getNoteListener (ActionListener l)
	{
		getNoteBtn.addActionListener(l);
	}
	public void addNoteListener(ActionListener l)
	{
		updateNoteBtn.addActionListener(l);
	}
}