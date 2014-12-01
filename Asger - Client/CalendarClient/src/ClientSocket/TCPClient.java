package ClientSocket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import JsonClasses.*;

public class TCPClient {
	public String sendMessage(String gsonString) throws Exception {
		String stringToBeReturned = null;
		String modifiedSentence;
		Socket clientSocket = new Socket("localhost", 8888);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		
		byte[] input = gsonString.getBytes();
		byte key = (byte) 3.1470;
		byte[] encrypted = input;
		for (int i = 0; i < encrypted.length; i++)
		{
			encrypted[i] = (byte) (encrypted[i] ^ key);
		}

		outToServer.write(encrypted);
		outToServer.flush();
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		modifiedSentence = inFromServer.readLine();
		System.out.println(modifiedSentence);
		String TestingString = new String(modifiedSentence).trim();
		
		byte[] input2 = TestingString.getBytes();
		byte key2 = (byte) 3.1470;
		byte[] encrypted2 = input2;
		for (int i = 0; i < encrypted2.length; i++)
		{
			encrypted2[i] = (byte) (encrypted2[i] ^ key2);
		}
		String decrypted2 = new String(encrypted2).trim();
		System.out.println("FROM SERVER: " + decrypted2);
		clientSocket.close();
		stringToBeReturned = decrypted2;
		
		return stringToBeReturned;
	}
	
}