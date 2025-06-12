package Ejercicio4;

public class ComboEspecial implements Combo{
    private String descripcion;
    private double precio;

    public ComboEspecial(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return "Combo Especial: " + this.descripcion;
    }

    @Override
    public double precio() {
        return this.precio;
    }
}
