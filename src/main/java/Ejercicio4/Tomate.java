package Ejercicio4;

public class Tomate extends AdicionalesCombo{
    private static final double PRECIO_TOMATE = 5;

    public Tomate(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + PRECIO_TOMATE;
    }
    @Override
    public String descripcion() {
        return super.descripcion() + "+ Tomate ";
    }
}
