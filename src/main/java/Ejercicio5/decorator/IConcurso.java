package Ejercicio5.decorator;

import Ejercicio5.Participante;

import java.time.LocalDate;

public interface IConcurso {
    void inscribirParticipante(Participante participante, LocalDate fechaInscripcion);
}
