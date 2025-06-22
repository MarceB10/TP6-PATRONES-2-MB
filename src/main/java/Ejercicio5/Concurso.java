package Ejercicio5;
import Ejercicio5.decorator.IConcurso;

import java.time.LocalDate;

public class Concurso implements IConcurso {
    private MailService mailService;
    private RegistroInscripcion registro;
    private int idConcurso;
    private String nombre;
    private final LocalDate fechaInicioInscripcion;
    private final LocalDate fechaFinInscripcion;

    public Concurso(int idConcurso, String nombre, LocalDate fechaInicioInscripcion, LocalDate fechaFinInscripcion, RegistroInscripcion registro, MailService mailService ){
        this.mailService = mailService;
        this.idConcurso = idConcurso;
        this.registro = registro;
        this.nombre = nombre;
        this.fechaInicioInscripcion= fechaInicioInscripcion;
        this.fechaFinInscripcion = fechaFinInscripcion;
    }

    public void inscribirParticipante(Participante participante, LocalDate fechaInscripcion) throws RuntimeException{
        //comparar si esta dentro del rango de incripcion para ver si se puede inscribir
        //si puede, comparar si es el primer dia para darle 10 puntos
        if(!estaEnRangoDeInscripcion()){
            throw new RuntimeException("Fuera del rango de inscripción");
        }
        registro.registrar(fechaInscripcion, participante.getID(), this.idConcurso);

        if(LocalDate.now().isEqual(fechaInicioInscripcion)){
            otorgarPuntos(participante);
        }
        mailService.enviarEmail("angelbaldome@gmail.com",
                                    "Inscripcion",
                                    "Usted se ha regitrado en el Concurso.");

    }

    public boolean estaEnRangoDeInscripcion(){
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fechaInicioInscripcion) && !hoy.isAfter(fechaFinInscripcion);
    }

    public void otorgarPuntos(Participante participante){
        participante.sumarPuntos(10);
    }

}
