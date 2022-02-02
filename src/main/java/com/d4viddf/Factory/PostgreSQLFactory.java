package com.d4viddf.Factory;

import java.sql.Connection;
import java.sql.SQLException;

import com.d4viddf.Connections.BasicConnectionPool;
import com.d4viddf.Error.Errores;
import com.d4viddf.TablasDAO.AlumnosDAO;
import com.d4viddf.TablasDAO.AsignaturasDAO;
import com.d4viddf.TablasDAO.DepartamentosDAO;
import com.d4viddf.TablasDAO.ImpartenDAO;
import com.d4viddf.TablasDAO.ProfesoresDAO;
import com.d4viddf.TablasDAO.ViewImpartenDAO;

public class PostgreSQLFactory extends DAOFactory {
    Errores errores = new Errores();
    final static String url = "jdbc:postgresql://localhost:5432/yourclass";
    final static String user = "postgres";
    final static String password = "abc123";
    static BasicConnectionPool bcp;

    public PostgreSQLFactory(){
        try {
            bcp = BasicConnectionPool.create(url, user, password);
        } catch (SQLException e) {
           errores.muestraErrorSQL(e);

        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        return bcp.getConnection();
    }

    @Override
    public boolean releaseConnection(Connection connection) {
        return bcp.releaseConnection(connection);
    }

    @Override
    public int getSize() {
        return bcp.getSize();
    }

    // add getUser, getURL....
    @Override
    public void shutdown() throws SQLException {
        bcp.shutdown();
    }

    @Override
    public AlumnosDAO getAlumnosDAO() {
        return new AlumnosDAO();
    }

    @Override
    public AsignaturasDAO getAsignaturasDAO() {
        return new AsignaturasDAO();
    }

    @Override
    public DepartamentosDAO getDepartamentosDAO() {
        return new DepartamentosDAO();
    }

    @Override
    public ProfesoresDAO getProfesoresDAO() {
        return new ProfesoresDAO();
    }

    @Override
    public ImpartenDAO getImpartenDAO() {
        return new ImpartenDAO();
    }

    @Override
    public ViewImpartenDAO getViewImpartenDAO() {
        return new ViewImpartenDAO();
    }
    
}
