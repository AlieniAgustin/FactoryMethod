import java.util.Random;

//ConcreteCreator
public class MagicKitchen implements MagicKitchenFactory {
    private Random rand = new Random();

    @Override
    public MagicDish createDish() {
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
