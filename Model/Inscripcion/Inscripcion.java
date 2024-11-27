package Model.Inscripcion;

import Model.Participantes.Participante;
import Model.Taller.Taller;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Inscripcion {
   private int id;
   private Taller taller;
   private Participante participante;
   private LocalDate fecha;
   private String asistencia;

    public int getId() {
        return id;
    }

    public Taller getTaller() {
        return taller;
    }

    public Participante getParticipante() {
        return participante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public Inscripcion(int id, Taller taller, Participante participante, LocalDate fecha, String asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participante;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
   
   
}
