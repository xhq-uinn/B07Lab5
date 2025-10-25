import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	@Test
	void testPerimeter(){
		Circle c1 = new Circle(9);
		assertEquals(c1.perimeter(), 18 * Math.PI);
	}
	
	@Test
	void testArea(){
		Circle c1 = new Circle(1);
		assertEquals(c1.area(), Math.PI);
	}
}
