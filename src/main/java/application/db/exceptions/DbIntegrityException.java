/**
 * @author Daniel Gil
 */
package main.java.application.db.exceptions;
/**
 * Exceção personalizada
 * Exceção de integridade, nao deixa apagar tabelas que estejam relacionadas
 */
public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException(String message) {
        super(message);
    }
}
