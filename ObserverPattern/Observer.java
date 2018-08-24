package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Observer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerObserver ali = new CustomerObserver();
		
		ProductManager productManager = new ProductManager();
		productManager.Attach(ali);
		productManager.Attach(new EmployeeObserver());
		productManager.Detach(ali);
		productManager.UpdatePrice();
 
	}

}

class ProductManager{
	
	List<AbstractObserver> _observers = new ArrayList<AbstractObserver>(); 
	
	public void UpdatePrice() {
		System.out.println("fiyat güncellendi");
		Notify();
	} 
	
	public void Attach(AbstractObserver o ) {
		_observers.add(o);
	}
	
	public void Detach(AbstractObserver o) {
		_observers.remove(o);
	}
	
	private void Notify() {
		_observers.forEach(item -> item.Update());
	}
}

abstract class AbstractObserver{
	public abstract void Update();
}

class CustomerObserver extends AbstractObserver{

	@Override
	public void Update() {
		System.out.println("Message to customer: Product price change ");
		 
	}
	
}

class EmployeeObserver extends AbstractObserver{

	@Override
	public void Update() {
		System.out.println("Message to employee: Product price change");
	}
	
}


vay bagun kemuguneee
