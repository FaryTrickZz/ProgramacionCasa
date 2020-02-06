package lectura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Leer_fichero accediendo = new Leer_fichero();
		
		accediendo.leer();
		
	}

}

class Leer_fichero {
	
	public void leer () {
		try {
			FileReader entrada = new FileReader("C:/Users/imoji/OneDrive/Escritorio 1/prueba.txt");
			
			BufferedReader bufferReader = new BufferedReader (entrada);
 			
			//int c ="";
			
			String linea = "";
			
			while (linea != null) {
				linea = bufferReader.readLine();
				
				//char letra = (char)c;
				
				System.out.print(linea);
				
			}
			
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("Archivo no encontrado");
		
		}
	}
}