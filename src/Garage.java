
public class Garage {
	Car car;
	Garage(Car car){
		this.car = car;
	}
	public void pack() {
		System.out.println("The " + car.name + " is packed in garage");
	}
}
