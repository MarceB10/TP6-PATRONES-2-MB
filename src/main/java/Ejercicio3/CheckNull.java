package Ejercicio3;

import java.io.File;

public class CheckNull implements Reporte{
    private Reporte reporte;

    public CheckNull(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        this.reporte.export(file);
    }
}
