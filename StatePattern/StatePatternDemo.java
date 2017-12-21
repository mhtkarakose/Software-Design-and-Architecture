package State3Pattern;


public class StatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
		Turbo turbo = new Turbo();
		turbo.SpeedUp(car);
		turbo.SpeedDown(car);
		
		Normal normal = new Normal();
		normal.SpeedUp(car);
		normal.SpeedDown(car);

	}
}

interface Istate{
	public void SpeedUp(Car context);
	public void SpeedDown(Car context);
}

class Turbo implements Istate{

	@Override
	public void SpeedUp(Car context) {
		// TODO Auto-generated method stub
		System.out.println("Turbo Speed Up");
		context.setState(this);
	}

	@Override
	public void SpeedDown(Car context) {
		// TODO Auto-generated method stub
		System.out.println("Tubo Speed Down");
		context.setState(this);
	}
}

class Normal implements Istate{

	@Override
	public void SpeedUp(Car context) {
		// TODO Auto-generated method stub
		System.out.println("normal Speed Up");
		context.setState(this);
		
	}

	@Override
	public void SpeedDown(Car context) {
		// TODO Auto-generated method stub
		System.out.println("normal Speed Down");
		context.setState(this);
	}
	
}

class Car{
	private Istate state;

	   public Car(){
	      state = null;
	   }

	   public void setState(Istate state){
	      this.state = state;		
	   }

	   public Istate getState(){
	      return state;
	   }
}