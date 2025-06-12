package Ejercicio2;

import java.awt.*;

public class Graphics2DAdapter implements Panel{
    private final Graphics2D graphics2D;

    public Graphics2DAdapter(Graphics2D graphics2D) {
        this.graphics2D = graphics2D;
    }

    @Override
    public void dibujarCirculo(int x, int y, int radio) {
        graphics2D.drawOval(x, y, radio,radio);
    }

    @Override
    public void dibujarLinea(int x, int y, int longitud) {
        graphics2D.drawLine(x,y,x + longitud,y);
    }

    @Override
    public void dibujarTexto(int x, int y, String texto) {
        graphics2D.drawString(texto,x,y);
    }
}
