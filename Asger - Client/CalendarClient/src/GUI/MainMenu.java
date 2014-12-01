package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class MainMenu extends JPanel {
	private JButton btnLogOut = new JButton("Log Out");
	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setLayout(null);
		
		btnLogOut.setBounds(341, 13, 97, 25);
		add(btnLogOut);
	}
	public JButton getBtnLogOut() {
		return btnLogOut;
	}
	public void logOutListener(ActionListener l)
	{
		btnLogOut.addActionListener(l);
	}

}
