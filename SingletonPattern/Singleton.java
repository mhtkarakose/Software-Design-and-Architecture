package SingletonPattern;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customerManager = CustomerManager.CreateAsSingleton();
		
		customerManager.Save();

	}

}

class CustomerManager{
	
	private static CustomerManager _customerManager;
	
	private CustomerManager() {
		
	}
	
	public static CustomerManager CreateAsSingleton() {
//		check
		if(_customerManager == null) {
			_customerManager = new CustomerManager();
		}
		return _customerManager;
	}
	
	public void Save() {
		System.out.println("Saved");
	}
	
}
