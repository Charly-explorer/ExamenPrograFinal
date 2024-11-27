package Model.Inscripcion;

import Model.Dao.Dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class InscripcionesDAO implements Dao<InscripcionDTO> {

    protected Connection connection;

    public InscripcionesDAO(Connection connection) {

        this.connection = connection;

    }

    @Override
    public boolean crear(InscripcionDTO objeto) throws SQLException {
        if (objeto == null) {
            return false;
        }

        String query = "Inscripcion(?,?,?,?,?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, objeto.getId());
            stmt.setInt(2, objeto.getTaller());
            stmt.setInt(3, objeto.getParticipante());
            stmt.setDate(4, (Date) objeto.getFecha());
            stmt.setString(5, objeto.getAsistencia());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public InscripcionDTO leer(Object objeto) throws SQLException{
        if (objeto==null) {
            return null;
        }
        String query = "Llamar inscripciones";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) objeto);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new InscripcionDTO(
                          rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getDate(4),
                            rs.getString(5)    
                    );
                }
            }
        }
        return null;
    }

    @Override
    public ArrayList leerTodo() throws SQLException {
        String query = "Call PaymentReadAll()";
        List<InscripcionDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new InscripcionDTO(
                            rs.getInt(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getDate(4),
                            rs.getString(5))
                    );
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(InscripcionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (ArrayList) list;
    }
    }


