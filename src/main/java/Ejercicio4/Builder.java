package Ejercicio4;

public class Builder {
    private Combo combo;

    public Builder(ComboBasico comboBasico){
        this.combo = comboBasico;
    }

    public Builder conTomate(){
        combo = new Tomate(combo);
        return this;
    }

    public Builder conQueso(){
        combo = new Queso(combo);
        return this;
    }

    public Builder conCarne() {
        combo = new Carne(combo);
        return this;
    }

    public Combo build() {
        return combo;
    }


}
