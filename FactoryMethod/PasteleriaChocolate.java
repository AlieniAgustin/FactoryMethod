//ConcreteCreator1
public class PasteleriaChocolate implements PasteleriaFactory {
    @Override
    public Pastel crearPastel() {
        return new PastelDeChocolate();
    }
}
