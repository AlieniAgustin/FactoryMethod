import java.util.List;

//CreationRequester
public class Chef {
    private List<MagicKitchenFactory> kitchens; // puede haber muchas (o ninguna)

    public Chef(List<MagicKitchenFactory> kitchens) {
        this.kitchens = kitchens;
    }

    public void servirPlato(int index) {
        if (index >= 0 && index < kitchens.size()) {
            MagicDish dish = kitchens.get(index).createDish(); // solo uso un dish
            dish.servir();
        } else {
            System.out.println("¡No hay cocina disponible en esa posición!");
        }
    }
}
