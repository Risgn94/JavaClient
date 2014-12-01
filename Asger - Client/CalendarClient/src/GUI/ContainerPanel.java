package GUI;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerPanel extends JFrame {
	public static final String loginScreen = "LoginScreen";
	public static final String mainMenu = "MainMenu";
	public static final String dayView = "DayView";
	public static final String weekView = "WeekView";
	
	private static JPanel contentPane;
	CardLayout c;
	
	private LoginScreen LS;
	private MainMenu MM;
	private DayView DV;
	private WeekView WV;
	
	public ContainerPanel() throws Exception
	{
		setTitle("Doek Calendar System");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		setResizable(false);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		c = (CardLayout) getContentPane().getLayout();
		
		LS = new LoginScreen();
		contentPane.add(LS, loginScreen);
		
		MM = new MainMenu();
		contentPane.add(MM, mainMenu);
		
		DV = new DayView();
		contentPane.add(DV, dayView);

		WV = new WeekView();
		contentPane.add(WV, weekView);
	}
	public LoginScreen getLS() {
		return LS;
	}
	public MainMenu getMM() {
		return MM;
	}
	public DayView getDV() {
		return DV;
	}
	public WeekView getWV() {
		return WV;
	}
	public void show(String card)
	{
		c.show(getContentPane(), card);
	}
}