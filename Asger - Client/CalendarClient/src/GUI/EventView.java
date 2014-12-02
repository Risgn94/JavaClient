package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class EventView extends JPanel {
	private JTextField textField = new JTextField();;
	private JButton button = new JButton("Main Menu");

	/**
	 * Create the panel.
	 */
	public EventView() {
		setBounds(0, 0, 1366, 768);
		setLayout(null);
		
		button.setBounds(1129, 13, 225, 70);
		add(button);
		
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
		

		textField.setText("Enter Event Name");
		textField.setColumns(10);
		textField.setBounds(298, 180, 266, 22);
		add(textField);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("If any, enter further information here...");
		textPane.setBounds(177, 436, 391, 118);
		add(textPane);
		
		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.setBounds(298, 223, 266, 22);
		add(comboBox);
		
		JComboBox<Object> comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(513, 293, 51, 22);
		add(comboBox_1);
		
		JComboBox<Object> comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(298, 293, 55, 22);
		add(comboBox_2);
		
		JComboBox<Object> comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(463, 293, 43, 22);
		add(comboBox_3);
		
		JComboBox<Object> comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(415, 293, 43, 22);
		add(comboBox_4);
		
		JComboBox<Object> comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(357, 293, 51, 22);
		add(comboBox_5);
		
		JComboBox<Object> comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(513, 328, 51, 22);
		add(comboBox_6);
		
		JComboBox<Object> comboBox_7 = new JComboBox<Object>();
		comboBox_7.setBounds(298, 328, 55, 22);
		add(comboBox_7);
		
		JComboBox<Object> comboBox_8 = new JComboBox<Object>();
		comboBox_8.setBounds(463, 329, 43, 22);
		add(comboBox_8);
		
		JComboBox<Object> comboBox_9 = new JComboBox<Object>();
		comboBox_9.setBounds(415, 329, 43, 22);
		add(comboBox_9);
		
		JComboBox<Object> comboBox_10 = new JComboBox<Object>();
		comboBox_10.setBounds(357, 329, 51, 22);
		add(comboBox_10);
		
		JComboBox<Object> comboBox_11 = new JComboBox<Object>();
		comboBox_11.setBounds(298, 364, 266, 22);
		add(comboBox_11);
		
		JComboBox<Object> comboBox_12 = new JComboBox<Object>();
		comboBox_12.setBounds(298, 259, 128, 22);
		add(comboBox_12);
	}
}
