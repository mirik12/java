package l12;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MyTestClass {
	Cat cat;

	@Before
	public void createCat() {
		cat = new Cat("Susleg", 13);
	}

	@After
	public void deleteCat() {
		cat = null;
	}

	@Test
	public void checkAge() {
		assertTrue(cat.getAge()==13);
	}
	
	@Test
	public void checkAgNamee() {
		assertEquals(cat.getName(),"Susleg");
	}
	@Test
	public void checkDivOk() {
		assertTrue(cat.div(10, 5)==2);
	}
	
	@Test(expected=ArithmeticException.class)
	public void checkDivNotOk() {
		cat.div(10, 1);
	}
	public static void main(String[] args) {
		JUnitCore runner=new JUnitCore();
		Result result=runner.run(MyTestClass.class);
		System.out.println("Run tests: "+result.getRunCount());
		System.out.println("Failed tests: "+result.getFailureCount());
		System.out.println("Success: "+result.wasSuccessful());

	}

}

