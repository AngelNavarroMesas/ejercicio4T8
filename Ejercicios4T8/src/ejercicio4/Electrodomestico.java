package ejercicio4;

public class Electrodomestico {
	String color;
	String consumoEnergetico;
	int precioBase;
	int peso;
	
	public Electrodomestico() {
	}

	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(String color, String consumoEnergetico, int precioBase, int peso) {
		super();
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public String getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public int getPeso() {
		return peso;
	}
	
	public void comprobarConsumoEnergetico() {
		if(consumoEnergetico=="f") {
			
		}
	}
	
	
}
