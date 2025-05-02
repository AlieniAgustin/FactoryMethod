/**
 * Cliente
 */
public class Main {
    public static void main(String[] args) {
        LoggerCreator creator = new ConcreteLoggerCreator();
        Logger logger = creator.createLogger();
        logger.log("Sistema iniciado");
    }
}

