package lab5;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public boolean isRectangle() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		
		double dBD = B.distance(D);
		boolean rightangle = Math.abs(dBC*dBC + dCD*dCD - dBD*dBD) < 1e-6;
		
		if(dAB==dCD && dBC==dDA && rightangle)
			return true;
		else
			return false;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public double area() {
		return A.distance(B)*B.distance(C);
	}
		
		
	public boolean isSquare() {
		double dAB = A.distance(B);
		double dBC = B.distance(C);
		double dCD = C.distance(D);
		double dDA = D.distance(A);
		if(dAB==dBC && dBC==dCD && dCD==dDA)
			return true;
		else
			return false;
	}
}

