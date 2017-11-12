package CommandPattern;

import java.awt.List;
import java.util.ArrayList;

public class Command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StockManager stockManager = new StockManager();
		BuyStock buyStok = new BuyStock(stockManager);
		SellStock sellStock = new SellStock(stockManager);
		
		StockController stockController = new StockController();
		stockController.TakeOrder(buyStok);
		stockController.TakeOrder(sellStock);
		
		stockController.PlaceOrders();
	}

}

class StockManager{
	
	private String _name = "Laptop";
	
	private int _quantity;
	
	public void Buy() {
		System.out.println("stock"+ _name + _quantity);
	}
	
	public void Sell() {
		System.out.println("stock"+ _name + _quantity);
	}
} 

interface IOrder{
	void Execute();
}

class BuyStock implements IOrder{
	
	private StockManager _stockManager;
	
	public BuyStock(StockManager stockManager) {
		_stockManager = stockManager;
	}

	@Override
	public void Execute() {
		// TODO Auto-generated method stub 
		_stockManager.Buy();
	}
	
}

class SellStock implements IOrder{
	
	private StockManager _stockManager;
	
	public SellStock(StockManager stockManager ) {
		_stockManager = stockManager;
	}
	
	@Override
	public void Execute() {
		// TODO Auto-generated method stub 
		_stockManager.Sell();
	}
}

class StockController {
	ArrayList<IOrder> _orders = new ArrayList<IOrder>();
	
	public void TakeOrder(IOrder o) {
		_orders.add(o);
	}
	
	public void PlaceOrders() {
		_orders.forEach(item -> item.Execute());
		
		_orders.clear();
	}
	
}











