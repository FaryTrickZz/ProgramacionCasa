

public class Cuadrado extends Paralelogramo {

	String nombre = "Cuadrado";
	boolean paralelogramo = true;
	
	@Override
	public void pintar() {
		System.out.println(nombre);;
	}
	
	@Override
	public boolean xParalelogramo() {
		return paralelogramo;
	}
}
