package task_5;
abstract class Vehicle{
	abstract void startEngine();
	abstract void stopEngine();
}
class Car extends Vehicle{
	private String brand;
	public Car(String brand) {
		this.brand=brand;
	}
	void startEngine() {
		System.out.println(brand+" car engine get's started with a key");
	}
	void stopEngine() {
		System.out.println(brand+" car engine stopped with a key");
	}
}
class Motorcycle extends Vehicle{
	private String brand;
	public Motorcycle(String brand) {
		this.brand=brand;
	}
	void startEngine() {
		System.out.println(brand+" motorcycle engine get's started with a button");
	}
	void stopEngine() {
		System.out.println(brand+" motorcycle engine stopped with a button");
	}
}
public class VehicleAbstraction {

	public static void main(String[] args) {
		Vehicle car=new Car("Mercedes Benz");
		Vehicle motorcycle=new Motorcycle("Ducati");
		car.startEngine();
		car.stopEngine();
		motorcycle.startEngine();
		motorcycle.stopEngine();

	}

}
