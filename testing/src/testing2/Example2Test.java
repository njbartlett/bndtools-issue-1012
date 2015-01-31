package testing2;

import junit.framework.TestCase;

public class Example2Test extends TestCase {

	public void testExample2() throws Exception {
		System.out.println("testExample2 was executed");
		fail("deliberately failing");
	}

}
