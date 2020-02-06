package escritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Escribir escritura = new Escribir();
		
		escritura.escribe();
		
	}
}


class Escribir {
	
	public void escribe() {
		String frase = "Prueba para escribir de nuevo en el fichero";
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/imoji/OneDrive/Escritorio 1/prueba.txt", true);
		
			BufferedWriter bufferWriter = new BufferedWriter(escritura);
			
			bufferWriter.write(frase);
			bufferWriter.flush();
			
			
			escritura.close();
			
		} catch (IOException e) {
			System.out.println("Error");
			
		}
	}
}