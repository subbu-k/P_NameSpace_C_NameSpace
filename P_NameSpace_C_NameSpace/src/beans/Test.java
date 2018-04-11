package beans;

public class Test {
 private  String name;
 private Car car;
 
public void setName(String name) {
	this.name = name;
}


public void setCar(Car car) {
	this.car = car;
}


public void printData() {
	System.out.println( name+":"+ car.getCarname());
}
}
