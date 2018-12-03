package Exercicio3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws Exception {
		Scanner tc = new Scanner(System.in);
		System.out.println("File:");
		
		String fName = tc.nextLine();
		File f = new File(" " + fName);
		FileInputStream in = new FileInputStream(f);
		
		Socket socket = new Socket("localhost", 5678);
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter writer = new BufferedWriter(osw);
		
		writer.write(f.getName() + "\n");
		writer.flush();
		
		int tamanho = 4096; // buffer de 4KB  
	    byte[] buffer = new byte[tamanho];  
	    int lidos = -1;  
	    while ((lidos = in.read(buffer, 0, tamanho)) != -1) {  
	        out.write(buffer, 0, lidos);  
	    }  
	}
}