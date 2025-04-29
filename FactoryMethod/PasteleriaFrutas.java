//Concrete Creator2
public class PasteleriaFrutas implements PasteleriaFactory {
    @Override
    public Pastel crearPastel() {
        return new PastelDeFrutas();
    }
}
