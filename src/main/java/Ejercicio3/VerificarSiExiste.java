package Ejercicio3;

import java.io.File;

public class VerificarSiExiste implements Reporte{
    private Reporte reporte;

    public VerificarSiExiste(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        this.reporte.export(file);
    }
}
