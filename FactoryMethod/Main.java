import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear varias fábricas (cocinas mágicas)
        MagicKitchenFactory kitchen1 = new MagicKitchen();
        MagicKitchenFactory kitchen2 = new MagicKitchen();

        // Agregar las fábricas a una lista (el Chef tiene varias opciones)
        List<MagicKitchenFactory> kitchens = Arrays.asList(kitchen1, kitchen2);

        // Crear un Chef, que puede elegir entre las fábricas
        Chef chef = new Chef(kitchens);

        // El Chef elige qué cocina utilizar. En este caso, seleccionamos la cocina en
        // la posición 1 (kitchen2)
        chef.servirPlato(1); // Llamada a la cocina 2 para crear un plato y servirlo

        // También podría haber elegido otra cocina:
        chef.servirPlato(0); // Llamada a la cocina 1 para crear otro plato y servirlo
    }
}
