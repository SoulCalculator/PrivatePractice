// Client Program to connect to Server socket and read the incoming data from server

import java.net.*;
import java.io.*;

class HelloClient
{
	Socket socket;
	InputStream in;
	DataInputStream dis;
	String str;

	HelloClient()
	{
		try
		{
			// establish the connection with local server on port number 1234
			socket = new Socket(InetAddress.getLocalHost(), 1234);
			in = socket.getInputStream();
			dis = new DataInputStream(in);
			str = dis.readUTF();
			System.out.println("From server: " + str);

			dis.close();
			in.close();
			socket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main( String args[] )
	{
		new HelloClient();
	}
}