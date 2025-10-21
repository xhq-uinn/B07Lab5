
public class Circle {
	double radius;
	
	public Circle(double radius) {  
		 this.radius = radius;
	}
	
	public double perimeter() {        
		return 2 * Math.PI * radius;
    }
	
	public double area() {
	        return Math.PI * Math.pow(radius, 2);
	}
}
