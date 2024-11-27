package Model.Inscripcion;

import java.util.Date;

/**
 *
 * @author Student
 */
public class InscripcionDTO {

    private final int id;
    private final int taller;
    private final int participante;
    private final Date fecha;
    private final String asistencia;

    public int getId() {
        return id;
    }

    public int getTaller() {
        return taller;
    }

    public int getParticipante() {
        return participante;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public InscripcionDTO(int id, int taller, int participante, Date fecha, String asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participante;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
}
