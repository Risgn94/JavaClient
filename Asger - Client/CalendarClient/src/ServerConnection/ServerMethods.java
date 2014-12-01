package ServerConnection;

import ClientSocket.TCPClient;
import JsonClasses.AuthUserJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ServerMethods {
	TCPClient TC = new TCPClient();
	public String userLogin (String username, String password)
	{
		String userExists ="";
		Gson gson = new GsonBuilder().create();
		AuthUserJson AU = new AuthUserJson();
		AU.setAuthUserEmail(username);
		AU.setAuthUserPassword(password);
		String gsonString = gson.toJson(AU);
		try {
			userExists = TC.sendMessage(gsonString);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userExists;
	}
}