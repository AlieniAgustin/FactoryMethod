/**
 * Creador Concreto
 */
public class ConcreteLoggerCreator extends LoggerCreator {
    @Override
    public Logger createLogger() {
        return new Logger();
    }
}