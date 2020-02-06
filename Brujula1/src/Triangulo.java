

public class Triangulo extends Figura {
	
	String nombre = "Triangulo";
	boolean paralelogramo = false;
	
	@Override
	public void pintar() {
		System.out.println(nombre);;
	}
	
	@Override
	public boolean xParalelogramo() {
		return paralelogramo;
	}

}
