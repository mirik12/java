package l12;

import l12.Cat;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

@SuppressWarnings("all")
public class MyTestClass {
  Cat cat;
  
  @Before
  public void createCat() {
    Cat _cat = new Cat("Susleg", 13);
    this.cat = _cat;
  }
  
  @After
  public void deleteCat() {
    this.cat = null;
  }
  
  @Test
  public void checkAge() {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
  
  @Test
  public void checkAgNamee() {
    Assert.assertEquals(this.cat.getName(), "Susleg");
  }
  
  @Test
  public void checkDivOk() {
    throw new Error("Unresolved compilation problems:"
      + "\n=== cannot be resolved.");
  }
  
  @Test(expected = ArithmeticException.class)
  public void checkDivNotOk() {
    this.cat.div(10, 1);
  }
  
  public static void main(final String[] args) {
    JUnitCore runner = new JUnitCore();
    Result result = runner.run(MyTestClass.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Run tests: ");
    int _runCount = result.getRunCount();
    _builder.append(_runCount);
    System.out.println(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Failed tests: ");
    int _failureCount = result.getFailureCount();
    _builder_1.append(_failureCount);
    System.out.println(_builder_1.toString());
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Success: ");
    boolean _wasSuccessful = result.wasSuccessful();
    _builder_2.append(_wasSuccessful);
    System.out.println(_builder_2.toString());
  }
}
