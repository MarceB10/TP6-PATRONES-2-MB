package Ejercicio4;

public class ComboBasico implements Combo{
    private String descripcion;
    private double precio;

    public ComboBasico(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return "Combo Básico: " + this.descripcion;
    }

    @Override
    public double precio() {
        return this.precio;
    }

}
