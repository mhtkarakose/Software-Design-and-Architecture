package Facade2Pattern;

public class Facade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EftTransactionMaker eftTransactionMaker = new EftTransactionMaker();
		
		eftTransactionMaker.depositingMoney();
		eftTransactionMaker.withDrawMoney();

	}

}

interface IeftTransaction{
	void withDrawMoney();
	void depositingMoney();
}

class WithDrawMoney implements IeftTransaction{

	@Override
	public void withDrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("using with draw money");
		
	}

	@Override
	public void depositingMoney() {
		// TODO Auto-generated method stub
		
	}
	
}

class DepositingMoney implements IeftTransaction{

	@Override
	public void withDrawMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositingMoney() {
		// TODO Auto-generated method stub
		System.out.println("using depositing money");
		
	}
	
}

class EftTransactionMaker{
	private WithDrawMoney _WithDrawMoney;
	private DepositingMoney _DepositingMoney;
	
	EftTransactionMaker(){
		_WithDrawMoney = new WithDrawMoney();
		_DepositingMoney = new DepositingMoney();
	}
	
	void withDrawMoney() {
		_WithDrawMoney.withDrawMoney();
	}
	
	void depositingMoney() {
		_DepositingMoney.depositingMoney();
	}
}






