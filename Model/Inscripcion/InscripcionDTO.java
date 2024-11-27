package Model.Inscripcion;

import java.util.Date;

/**
 *
 * @author Student
 */
public class InscripcionDTO {

    private final int id;
    private final Taller taller;
    private final Participante participante;
    private final Date fecha;
    private final String asistencia;

    public int getId() {
        return id;
    }

    public Taller getTaller() {
        return taller;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public InscripcionDTO(int id, Taller taller, Participante participante, Date fecha, String asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participante;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
}
