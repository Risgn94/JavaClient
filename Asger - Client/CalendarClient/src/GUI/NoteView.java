package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;

public class NoteView extends JPanel {
	private JButton mainMenuBtn = new JButton("Main Menu");

	/**
	 * Create the panel.
	 */
	public NoteView() {
		setLayout(null);
		setBounds(0, 0, 1366, 768);
		
		mainMenuBtn.setBounds(1129, 13, 225, 70);
		add(mainMenuBtn);
	}

	public JButton getMainMenuBtn() {
		return mainMenuBtn;
	}
	public void mainMenuListener(ActionListener l)
	{
		mainMenuBtn.addActionListener(l);
	}
}
