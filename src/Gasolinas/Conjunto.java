package Gasolinas;

public class Conjunto {
    
    private String nombre;
    private double valor;
    
    public Conjunto(String nombre,double valor){
        this.nombre=nombre;
        this.valor=valor;
    }
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double getvalor() {
        return valor;
    }

    public void setvalor(double valor) {
        this.valor = valor;
    }
}
