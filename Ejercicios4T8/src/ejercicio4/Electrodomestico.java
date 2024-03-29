package ejercicio4;

public class Electrodomestico {
	double precio, peso;
    String color;
    char consumo;

    public Electrodomestico(double precio, double peso, String color, char consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumoEnergetico(consumo);
    }
    public Electrodomestico(double precio, double peso){
        this.precio = precio;
        this.peso = peso;
    }
    public Electrodomestico(){
        this.color = "blanco";
        this.consumo = 'F';
        this.precio = 100;
        this.peso = 5;
    }
    public static char comprobarConsumoEnergetico(char letra){
        switch (letra){
            case 'A','B','C','D','E':
                break;
            default:
                letra = 'F';
        }
        return letra;
    }
    public static String comprobarColor(String color){
        switch (color.toLowerCase()){
            case "blanco", "negro","rojo", "azul", "gris":
                break;
            default:
                color = "blanco";
        }
        return color;
    }
    public void precioFinal(){
        switch (consumo){
            case 'A':
                precio+=100;
                break;
            case 'B':
                precio+=80;
                break;
            case 'C':
                precio+=60;
                break;
            case 'D':
                precio+=50;
                break;
            case 'E':
                precio+=30;
                break;
            case 'F':
                precio+=10;
                break;
        }
        if (peso <20 && peso>=0){
            precio+=10;
        } else if (peso <50 && peso>19) {
            precio+= 50;
        }else if (peso <80 && peso>49){
            precio+=80;
        }else precio+=100;
    }
    @Override
    public String toString() {
        return "Eletrodomestico{" +
                "precio=" + precio +
                ", peso=" + peso +
                ", color=" + color +
                ", consumo=" + consumo +
                '}';
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }
	
}
