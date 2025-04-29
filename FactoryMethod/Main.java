public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        PasteleriaFactory chocolate = new PasteleriaChocolate();
        PasteleriaFactory frutas = new PasteleriaFrutas();

        cliente.pedirPastel(chocolate); // Output: Pastel de chocolate preparado
        cliente.pedirPastel(frutas); // Output: Pastel de frutas preparado
    }
}
