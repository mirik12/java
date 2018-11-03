package uaitea.ua;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	public boolean myTest() {
		try {
			Dog mockDog = mock(Dog.class);
			System.out.println(mockDog.toString());
			System.out.println(mockDog.getName());
			mockDog.setName("SS");
			verify(mockDog).setName("SS");
			verify(mockDog).getName();
			when(mockDog.getName()).thenReturn("Muller");
			// when(mockDog.getAge()).thenThrow(new RuntimeException());
			when(mockDog.getAge()).thenReturn(11).thenReturn(22).thenReturn(33);

			System.out.println(mockDog.getAge());
			System.out.println(mockDog.getAge());
			System.out.println(mockDog.getAge());
			System.out.println(mockDog.getAge());
			System.out.println(mockDog.getName());

			verify(mockDog, times(2)).getName();
			verify(mockDog, atLeast(2)).getName();
			verify(mockDog, atMost(4)).getName();
			return true;
		} catch (Exception e) {

		}

		return false;
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(myTest());
	}
}

