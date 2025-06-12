package Ejercicio3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class DefaultReporte implements Reporte{
    private String reporte;

    public DefaultReporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        try {
            Files.write(
                    file.toPath(),
                    reporte.getBytes(),
                    StandardOpenOption.CREATE,// Crea el archivo si no existe
                    StandardOpenOption.TRUNCATE_EXISTING //Sobreescribe el archivo si ya existe
            );
        } catch (IOException e) {
            throw new RuntimeException("Error al exportar el reporte: " + e.getMessage(), e);
        }
    }
}
