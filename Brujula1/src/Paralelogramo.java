

public class Paralelogramo extends Figura {
	
	String nombre = "Paralelogramo";
	boolean paralelogramo;
	
	
	@Override
	public void pintar() {
		System.out.println(nombre);;
	}
	
	@Override
	public boolean xParalelogramo() {
		return paralelogramo;
	}

}
