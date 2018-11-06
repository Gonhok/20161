class Car {
	int speed;
	int gear;
	public String color;
	
	public Car() { 
		this(100, 5, "silver");	
	}
	
	public Car(int s, int g, String c){
		speed = s;
		gear = g;
		color = c;
	}
	public String toString(){
		return String.format("%dkm/h %dgears %s", speed, gear, color);
	}
}
class NamedCar extends Car {
	public String name;
	public NamedCar(String name){ 
		super(); 
		this.name = name; 
	}
	public NamedCar(int s, int g, String c, String n){
		super(s, g, c);
		name = n;
	}
	public String toString() {
		return super.toString()+" "+name;
	}
}
public class Test_toString {
	public static void main(String[] args) {
	Car c = new Car();
	System.out.println(c.toString());
	NamedCar c2 = new NamedCar(160, 8, "green", "Pony");
	System.out.println(c2);
	}
}