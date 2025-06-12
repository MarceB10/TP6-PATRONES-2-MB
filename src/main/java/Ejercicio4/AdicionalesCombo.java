package Ejercicio4;

public abstract class AdicionalesCombo implements Combo{
    protected Combo combo;

    public AdicionalesCombo(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return this.combo.descripcion();
    }

    @Override
    public double precio() {
        return this.combo.precio();
    }
}
