package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MainMenu extends JPanel {
	private JButton btnLogOut = new JButton("Log Out");
	private JButton btnViewWeekView = new JButton("View Week View");
	private JButton btnViewDayView = new JButton("View Day View");
	
	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		btnLogOut.setBounds(1245, 49, 97, 25);
		add(btnLogOut);
		
		btnViewWeekView.setBounds(768, 169, 225, 70);
		add(btnViewWeekView);
		
		btnViewDayView.setBounds(1028, 169, 224, 71);
		add(btnViewDayView);
		
		JButton button = new JButton("View Week View");
		button.setBounds(768, 269, 225, 70);
		add(button);
		
		JButton button_1 = new JButton("View Day View");
		button_1.setBounds(1028, 269, 224, 71);
		add(button_1);
	}
	public JButton getBtnLogOut() {
		return btnLogOut;
	}
	public JButton getBtnViewWeekView() {
		return btnViewWeekView;
	}
	public JButton getBtnViewDayView() {
		return btnViewDayView;
	}
	public void logOutListener(ActionListener l)
	{
		btnLogOut.addActionListener(l);
	}
}