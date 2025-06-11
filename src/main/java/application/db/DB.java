/**
 * @author Daniel Gil
 */
package main.java.application.db;

import main.java.application.db.exceptions.DbException;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Class Base de Dados
 * não esquecer de ativar o service do workbench no windows para iniciar o servidor do SQL (MySQL84)
 */
public class DB {

    private static Connection conn = null;

    /**
     * Method Get Connection,
     * usa loadProperties para ler os dados de conexão
     * recebe a url da conexão há BD, para poder utilizar
     * o DriveManager.getConnection() e estabelecer a ligação há BD
     *
     * @return Connection com a BD
     */
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    /**
     * Method Close Connection,
     * fecha conexão com a BD
     */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
     * Method Load Properties,
     * faz a leitura do ficheiro "main.application.db.properties"
     *
     * @return Properties, com os dados do main.application.db.properties
     */
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("resources/db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    /**
     * Method Close Statement,
     * fecha Statement
     *
     * @param st, statement de instrução SQL
     */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
     * Method Close Result Set,
     *
     * @param rs
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
