public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef(2); // tiene acceso a 2 cocinas (0 y 1)

        // El Chef elige qué cocina utilizar. En este caso, seleccionamos la cocina en
        // la posición 1
        chef.servirPlato(1);

        // También podría haber elegido otra cocina:
        chef.servirPlato(0);
    }
}
