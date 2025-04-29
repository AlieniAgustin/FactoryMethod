//CreationRequester
public class Cliente {

    public void pedirPastel(PasteleriaFactory fabrica) {
        Pastel pastel = fabrica.crearPastel();
        System.out.println(pastel.preparar());
    }
}
