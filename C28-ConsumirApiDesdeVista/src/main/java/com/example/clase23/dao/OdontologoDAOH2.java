package com.example.clase23.dao;

import com.example.clase23.model.Odontologo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.List;


@Component
public class OdontologoDAOH2 implements IDao<Odontologo> {
    private static final String SQL_INSERT="INSERT INTO ODONTOLOGOS(NOMBRE, APELLIDO, MATRICULA) VALUES(?,?,?)";
    private static final Logger LOGGER= Logger.getLogger(OdontologoDAOH2.class);
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        LOGGER.info("Guardando un odontologo");
        Connection connection=null;
        try{
            connection= BD.getConnection();
            PreparedStatement ps_insert= connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
            ps_insert.setString(1, odontologo.getNombre());
            ps_insert.setString(2, odontologo.getApellido());
            ps_insert.setString(3,odontologo.getMatricula());
            ps_insert.execute();
            //ahora necesitamos recuperar el id
            ResultSet clave= ps_insert.getGeneratedKeys();
            while(clave.next()){
                odontologo.setId(clave.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public Odontologo buscar(Integer id) {
        return null;
    }

    @Override
    public void actualizar(Odontologo odontologo) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Odontologo> listarTodos() {
        return null;
    }

    @Override
    public Odontologo buscarXString(String valor) {
        return null;
    }
}
