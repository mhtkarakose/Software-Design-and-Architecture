package StrategyPattern;

public class Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.CreditCalcultorBase = new After2010CreditCalculator();
		customerManager.SaveCredit();

		customerManager.CreditCalcultorBase = new Before2010CreditCalculator();
		customerManager.SaveCredit();
	}

}

abstract class CreditCalculatorBase{
	public abstract void calculate();
}

class Before2010CreditCalculator extends CreditCalculatorBase{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Credit calculated before 2010");
	}
	
}

class After2010CreditCalculator extends CreditCalculatorBase{

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Credit calculated after 2010");
	}
	
}

class CustomerManager {
	
	public CreditCalculatorBase CreditCalcultorBase;
	
	public CreditCalculatorBase getCreditCalcultorBase() {
		return CreditCalcultorBase;
	}

	public void setCreditCalcultorBase(CreditCalculatorBase creditCalcultorBase) {
		CreditCalcultorBase = creditCalcultorBase;
	}

	public void SaveCredit() {
		System.out.println("Customer manager business");
		CreditCalcultorBase.calculate();
	}
}