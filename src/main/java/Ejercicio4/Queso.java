package Ejercicio4;

public class Queso extends AdicionalesCombo{
    private static final double PRECIO_QUESO = 10;

    public Queso(Combo combo) {
        super(combo);
    }

    @Override
    public double precio() {
        return super.precio() + PRECIO_QUESO;
    }
    @Override
    public String descripcion() {
        return super.descripcion() + "+ Queso ";
    }
}
