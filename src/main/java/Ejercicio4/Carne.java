package Ejercicio4;

public class Carne extends AdicionalesCombo{
    private static final double PRECIO_CARNE = 15;

    public Carne(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + PRECIO_CARNE;
    }
    @Override
    public String descripcion() {
        return super.descripcion() + "+ Carne ";
    }
}
