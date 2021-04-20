import static org.junit.Assert.*;

import org.junit.Test;



public class MathUtilTest {

	@Test
	public void test() {
	MathUtil m=new MathUtil();
		
		int expected=2;
		int actual= m.add(1, 1);
		assertEquals(expected,actual);
	}
	@Test
	public void test2() {
		MathUtil m=new MathUtil();
		
		int expected=8;
		int actual= m.add(1, 1);
		assertEquals(expected,actual);
	}
}
