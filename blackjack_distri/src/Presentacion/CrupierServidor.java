package Presentacion;
import java.net.*;
import java.util.List;

import Logica.Jugador;

import java.io.*;

public class CrupierServidor {
	
	private List<Jugador> jugadores; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ServerSocket socket;
		boolean finnal = false;
		
		try{
			socket = new ServerSocket(6000);
			Socket socket_cli = socket.accept();
			
			
			DataInputStream in =
					new DataInputStream(socket_cli.getInputStream());
			
			do{
				String mensaje ="";
				mensaje = in.readUTF();
				System.out.println(mensaje);
				} while(1>0);
			}
		catch (Exception e){
			
			System.err.println(e.getMessage());
			System.exit(1);
		}
	}	

}