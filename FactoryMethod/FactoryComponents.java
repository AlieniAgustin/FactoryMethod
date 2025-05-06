/* Este codigo es solo para mostrar la estructura tipica en general, 
 * no se espera que compile o ejecute */

// Interfaz del producto
public interface ProductIF {
    void operation1();
    void operation2();
}

// Producto concreto 1
public class ConcreteProduct1 implements ProductIF {

    @Override
    public void operation1() {
       //Desarrollo de operation1
    }

    //Más operaciones si se desea
}

// Producto concreto 2
public class ConcreteProduct2 implements ProductIF {

    @Override
    public void operation1() {
        //Desarrollo de operation1
    }

    //Más operaciones si se desea
}

// Interfaz del creador
public interface FactoryIF {
    ProductIF createProduct(String discriminator);
}

// Fábrica concreta
public class Factory implements FactoryIF {

	//discriminator sería el atributo que se utiliza para elegir entre los 
	//concrete products que hay
    @Override
    public ProductIF createProduct(Object discriminator) {
        //Elección de qué producto concreto se utilizaría
    }
}

// Clase solicitante de creación
public class CreationRequester {

    private FactoryIF factory;

    public CreationRequester(FactoryIF factory) {
        this.factory = factory;
    }

    public ProductIF newProduct(boolean tipo) {
        ProductIF product = factory.createProduct(tipo);

        return product;
    }
}


