// Server Program to send data to client

import java.net.*;
import java.io.*;

class HelloServer
{
	ServerSocket ss;
	Socket socket;
	OutputStream os;
	DataOutputStream dos;
	String data = "Hello World!";

	HelloServer()
	{
		try
		{
			ss = new ServerSocket(1234); // init server on port number

			System.out.println("Server Init...");
			System.out.println("Waiting connection...");

			socket = ss.accept(); // wait for the client's connection

			System.out.println("About the send data...");
			OutputStream os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF(data);

			dos.close();
			os.close();
			socket.close();
			System.out.println("Sending Success!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main( String args[] )
	{
		new HelloServer();
	}
}