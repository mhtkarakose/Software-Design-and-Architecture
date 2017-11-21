package Adapter;

public class Adapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager productManager = new ProductManager(new Log4NetAdapter());
		productManager.Save();
		
	}

}

class ProductManager{
	
	private ILogger _logger;
	
	public ProductManager(ILogger logger) {
		_logger = logger;
	}
	
	public void Save() {
		_logger.Log("User Data");
		System.out.println("Saved");
	}
}

interface ILogger {
	void Log(String message);
}

class MehmetLogger implements ILogger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		System.out.println("Logged " + message);
	}
	
}

//framework dont touch
class Log4Net {
	public void LogMessage(String message) {
		System.out.println("Logged with Log4Net " + message);
	}
}

class Log4NetAdapter implements ILogger {

	@Override
	public void Log(String message) {
		// TODO Auto-generated method stub
		Log4Net log4Net = new Log4Net();
		log4Net.LogMessage(message);
	}
	
}











