/**
 * @author Daniel Gil
 */
package db.exceptions;

/**
 * Exceção personalizada
 * Exceção de conexão há DB
 */
public class DbException extends RuntimeException {

    public DbException(String msg) {
        super(msg);
    }
}
