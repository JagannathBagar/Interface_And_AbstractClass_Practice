
public class Human extends Monkey implements BasicAnimal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Eating human");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
		System.out.println("Sleeping human");
	}

	@Override
	void jump() {
		// TODO Auto-generated method stub
		//super.jump();
		System.out.println("Human jumping");
	}

	@Override
	void bite() {
		// TODO Auto-generated method stub
		//super.bite();
		
		System.out.println("Human biting");
	}
	
	

}
