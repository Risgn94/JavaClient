import GUILogic.Logic;
public class Main {

	public static void main(String[] args) {
		try {
			Logic GL = new Logic();
			GL.startApp();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}