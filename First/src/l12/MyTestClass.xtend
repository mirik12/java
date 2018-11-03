package l12

import static org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.JUnitCore
import org.junit.runner.Result

class MyTestClass {
	package Cat cat

	@Before def void createCat() {
		cat = new Cat("Susleg", 13)
	}

	@After def void deleteCat() {
		cat = null
	}

	@Test def void checkAge() {
		assertTrue(cat.getAge() === 13)
	}

	@Test def void checkAgNamee() {
		assertEquals(cat.getName(), "Susleg")
	}

	@Test def void checkDivOk() {
		assertTrue(cat.div(10, 5) === 2)
	}

	@Test(expected=typeof(ArithmeticException)) def void checkDivNotOk() {
		cat.div(10, 1)
	}

	def static void main(String[] args) {
		var JUnitCore runner = new JUnitCore()
		var Result result = runner.run(typeof(MyTestClass))
		System::out.println('''Run tests: «result.getRunCount()»'''.toString)
		System::out.println('''Failed tests: «result.getFailureCount()»'''.toString)
		System::out.println('''Success: «result.wasSuccessful()»'''.toString)
	}
}
