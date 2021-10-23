package www.OOps.java;

public class Automobile {

		private String color;
		private int speed;
		private String make;
		
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getSpeed()
		{
			return speed;
		}
		public void setSpeed(int speed)
		{
			this.speed = speed;
		}
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public void Break (double p)
		{
			if(speed>=p)
			{
				System.out.println("Break "+ (speed -20));
			}
		}
		public void Acceleration(double b)
		{
			if(speed<= b)
				System.out.println(" Acclerator "+( speed +50));
		}
		
}
