package Ejercicio5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegistroEnArchivo implements RegistroInscripcion {
    private static final String FALLO_ESCRITURA = "Error al escribir en el archivo";

    private String rutaArchivo;

    public RegistroEnArchivo(String rutaArchivo) {

        this.rutaArchivo = rutaArchivo;

    }



    public void registrar(LocalDate fecha, int idParticipante, int idConcurso) {
        String linea = fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", " + idParticipante + ", " + idConcurso + "\n";

        try {
            Path path = Paths.get(rutaArchivo);
            Files.write(
                    path,
                    linea.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            throw new RuntimeException(FALLO_ESCRITURA, e);
        }
    }
}
