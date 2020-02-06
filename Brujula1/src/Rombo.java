

public class Rombo extends Paralelogramo {

	String nombre = "Rombo";
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
