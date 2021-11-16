package www.OOps.java;

public class TestAutomobile {
public static void main(String[] args) {
	Automobile ab = new Automobile();
	
	ab.setColor("Red");
	ab.setSpeed(120);
	ab.setMake("asbvd");
    ab.Acceleration(50);
	ab.Break(20);
	System.out.println(ab.getColor());
	System.out.println(ab.getSpeed());
	System.out.println(ab.getMake());
	
	System.out.println("initial speed  " +ab.getSpeed());
	
	int b = ab.getSpeed();
	
	int c= b+10;
	int d = c+10;
	int e= d+10;
	
	if(gear()==1)
	{
		System.out.println("speed 1st gear:"+b);
	}
	else if(gear()==2)
	{
		System.out.println("speed 2nd gear:"+c +"kmph");
	}
	else if(gear()==3) {
		
		System.out.println("speed 3rd gear:"+d);
	}
	else if(gear()==4)
	{
		System.out.println("speed 4th gear:"+e);
	
	}
	else {
		System.out.println("speed 0kmph");
	}
	
	
}

private static int gear() {
	// TODO Auto-generated method stub
	return 4;
}
}
