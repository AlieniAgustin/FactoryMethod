import java.util.Random;

public class Chef {
    private int numKitchens; // el chef tiene acceso a cocinas representadas como enteros
    private Random rand;

    public Chef(int numKitchens) {
        this.numKitchens = numKitchens;
        rand = new Random();
    }

    public void servirPlato(int index) {
        if (index >= 0 && index < numKitchens) {
            MagicDish dish = crearPlatoAleatorio();
            dish.servir();
        } else {
            System.out.println("¡No hay cocina disponible en esa posición!");
        }
    }

    private MagicDish crearPlatoAleatorio() {
        int option = rand.nextInt(3);

        if (option == 0)
            return new FlyingPizza();
        else if (option == 1)
            return new ExplodingBurger();
        else if (option == 2)
            return new EndlessSoup();
        else
            throw new IllegalStateException("No se pudo crear el plato magico");
    }
}
