/* Este codigo es solo para mostrar la estructura tipica en general, 
 * no se espera que compile o ejecute */

//Interfaz del producto
public interface Product{
	void use();
}

//Interfaz del creador
public interface Creator{
	Product createProduct();
}

//Producto concreto
public class ConcreteProduct implements Product{
	
	@Override
	public void use(){
		//Implementración concreta	
	}

	//Otros metodos si se desea
}

public class ConcreteCreator implements Creator {

	@Override 
	public Product createProduct(){
		//Impletanción concreta
	}
	//Otros métodos si se desea
}

