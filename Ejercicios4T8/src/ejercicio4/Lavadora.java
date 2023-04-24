package ejercicio4;

public class Lavadora extends Electrodomestico{
	int carga;
	
	public Lavadora() {
		super();
	}
	
	public Lavadora(double precio, double peso, String color, char consumo, int carga) {
		super(precio, peso, color, consumo);
		this.carga = carga;
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public void precioFinal(){
		if(carga>30) {
			precio +=50;
		}
	}
	
	
}
