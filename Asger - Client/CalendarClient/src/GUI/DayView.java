package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;

public class DayView extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public DayView() {
		setBounds(0, 0, 1366, 768);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(173, 106, 283, 78);
		add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
}
