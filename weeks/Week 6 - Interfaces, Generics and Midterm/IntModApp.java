package interfaces;

public class IntModApp {
	
	public static void main(String[] args){
		IntMod5 nine = new IntMod5(9);
		//Should be 4 since 9%5=4
		System.out.println("nine.toString(): "+nine.toString());
		IntMod5 ten = new IntMod5(10);
		IntMod newInt = nine.add(ten);
		//should be 4 as well since 10%5=0
		System.out.println("nine.add(ten): "+newInt.toString());
		newInt = nine.multiply(ten);
		//should be 0 since 10%5=0
		System.out.println("nine.multiply(ten): "+newInt.toString());
		newInt = nine.subtract(ten);
		//should be 4 since 10%5=0
		System.out.println("nine.subtract(ten): "+newInt.toString());
		IntMod five = new IntMod7(5);
		
		//should be 2 since 5%7=5 and 5+4%7=2
		System.out.println("five.add(nine): "+five.add(nine).toString());
		//should be 4 since 9%5=5 and 4+5%5=4
		System.out.println("nine.add(five): "+nine.add(five).toString());
	}

}
