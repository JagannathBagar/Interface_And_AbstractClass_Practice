
public class Main {

	
	
	
	
	/*   
	 * //Q1- Create a abstract class having write and refill method.
	 * 
	 * //Q2- use pen class to create a concrete class Fountainpen with additional
	 * 
	 * method changeNib
	 * 
	 * //Q3 Create a class Monkey with jump () and bite() methods Create a class
	 * Human which inherits. this Monkey class and implements Basic Animal interface
	 * with eal() and sleep methods.
	 * 
	 * //Q-4- Create a class Tele Phone with ring(), lifter and disconnect ()
	 * methods as abstract methods. Create another class Smart Telephone and
	 * demonstrate polymorphism
	 * 
	 * //Q-5 - Demonstrate polymorphisen using monkey class from
	 * 
	 * //Q6- Create an Interface TV Remote and use it to inherit. Another Interface
	 * Smart Tv Remote
	 * 
	 * //Q7 -Create an Interface TV Remote and use it to inherit. Another Interface
	 * Smart Tv Remote
	 */

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		FountainPen fp= new FountainPen();
		fp.write();
		fp.refill();
		fp.changeNib();
		
		System.out.println();
		
		Human h= new Human();
		
		h.bite();
		h.sleep();
		System.out.println("\n demonstrating polymorphism \n");
		//polymorphysm in Q-3
		
		BasicAnimal bA= new Human();
		
		bA.eat();
		bA.sleep();
		
		Monkey m=new Human();
		
		m.bite();
		
		m.jump();
		
		System.out.println("\n\n\n");
		
		TV tv=new TV();
		
		tv.channel(2);
		tv.ott(20);
		
		
		
		

	}

}
