package Ejercicio4;

public class ComboFamiliar implements Combo{
    private String descripcion;
    private double precio;

    public ComboFamiliar(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return "Combo Familiar: " + this.descripcion;
    }

    @Override
    public double precio() {
        return this.precio;
    }
}
