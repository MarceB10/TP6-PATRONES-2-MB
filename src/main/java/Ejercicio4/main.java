package Ejercicio4;

public class main {
    public static void main(String[] args) {
        AdicionalesCombo comboPedido = new Queso(new Tomate(new Carne(new Carne(new ComboBasico("1 Medallon de carne, cebolla caramelizada, mayonesa y barbacoa.",100)))));
        System.out.println("Pedido 1: " + comboPedido.descripcion());
        System.out.println("Precio: " + comboPedido.precio() );

        System.out.println("------------------------------------------Con el builder-----------------------------------------");
        var builder = new Builder(new ComboBasico("1 Medallon de carne, cebolla caramelizada, mayonesa y barbacoa.",100));
        var comboPedido2 = builder.conCarne().conQueso().conTomate().build();
        System.out.println("Pedido 2: " + comboPedido2.descripcion());
        System.out.println("Precio: " + comboPedido2.precio() );
    }

}
