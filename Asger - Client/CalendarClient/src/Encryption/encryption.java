package Encryption;

public class encryption {
	public byte[] decrypt(byte[] b)
	{
//		Defines the decryption value of the byte
		//The 4 lines below needs to work later on, but for now, it will be hardcode
//		This is the old method for declaring encrpytkey
//		byte ff = (byte) 3.1470;
//		Imports encryption key from external file
		Byte ff = (byte) 3.1470;
//		Generates for loop containing decryption value
		for(int i = 0 ; i<b.length ; i++)
		{
			b[i] = (byte)(b[i]^ff);
		}
//		Generates new String without any white spaces following or leading
		byte[] encrypted = b;
//		Returns decrypted String
		return encrypted;
	}

}
