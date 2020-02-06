import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public String recorrerLista() {
		return null;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList <Figura> listaFiguras = new ArrayList <>();
		
		Figura Paralelogramo = new Paralelogramo();
		Figura Triangulo = new Triangulo();
		Paralelogramo Cuadrado = new Cuadrado();
		Paralelogramo Rombo = new Rombo();
		
		
		listaFiguras.add(Triangulo);
		listaFiguras.add(Cuadrado);
		listaFiguras.add(Triangulo);
		listaFiguras.add(Cuadrado);
		listaFiguras.add(Rombo);
		
		
		Iterator<Figura> lf = listaFiguras.iterator();
		
		int opcionCase;
		do {
			
			System.out.println("\n1. Acceder a los paralelogramos");
			System.out.println("2. Acceder a los no paralelogramos (Triangulos)");
			System.out.println("3. Salir");

			opcionCase = sc.nextInt();
		
		switch(opcionCase) {
			case 1:
				while (lf.hasNext()) {
		    		Figura l1 = lf.next();
		    		if (l1.xParalelogramo()) {
		    			l1.pintar();
		    		}
					
					}
				
			
			case 2:
				while (lf.hasNext()) {
		    		Figura l1 = lf.next();
		    		if (l1.xParalelogramo()==false) {
		    			l1.pintar();
		    		}
					}
				
		}
				
		} while (opcionCase!=3);
			
		}
}