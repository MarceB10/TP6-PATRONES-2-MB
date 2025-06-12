package Ejercicio3;

import java.io.File;

public class main {
    public static void main(String[] args) {
//        String contenido = "algo de contenido";
//        Report reporte = new Report(contenido);
//        reporte.export(new File("src/main/java/Ejercicio3/contenido/reporte.txt"),true);

        var r = new CheckNull(new VerificarSiExiste(new DefaultReporte("algo de contenido")));
        r.export(new File("src/main/java/Ejercicio3/contenido/reporte.txt"));
    }
}
