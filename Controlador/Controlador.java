package Controlador;

import Model.Inscripcion.InscripcionesDAO;
import Model.Participantes.Participante;
import Model.Participantes.ParticipanteDao;
import Model.Participantes.ParticipanteMapper;
import java.sql.SQLException;

/**
 *
 * @author Student
 */
public class Controlador {
    private InscripcionesDAO dao;
    private ParticipanteDao pardao;
    private ParticipanteMapper parMapper;

    public Controlador(InscripcionesDAO dao, ParticipanteDao pardao, ParticipanteMapper parMapper) {
        this.dao = dao;
        this.pardao = pardao;
        this.parMapper = parMapper;
    }
    
    
    public Participante buscarParticipante(String id) throws SQLException{
      if(id==null){
          return null;
      }  
 
         return parMapper.toEnt(pardao.leer(id));
      
 }
}
