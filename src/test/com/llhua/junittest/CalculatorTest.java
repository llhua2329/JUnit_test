package test.com.llhua.junittest;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.llhua.junittest.Calculator;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tear down...");
	}

	private static Calculator calculator = new Calculator();

	@Before
	public void setUp() throws Exception {
		System.out.println("set up...");
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals("test 0 + 2 + 3......", 6, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals("test 10 - 2......", 8, calculator.getResult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}
	
	@Test(timeout = 1000)//限时测试，单位毫秒
	public void testSquareRoot(){
		calculator.squareRoot(4);
		assertEquals("死循环，限时测试。。。", 2, calculator.getResult());
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideByZero(){
		calculator.divide(0);
	}
	
	@Test
	public void testSquare2(){
		calculator.square(2);
		assertEquals(1, calculator.getResult());
	}
	@Test
	public void testSquare0(){
		calculator.square(0);
		assertEquals(1, calculator.getResult());
	}
	@Test
	public void testSquare_3(){
		calculator.square(-3);
		assertEquals(1, calculator.getResult());
	}
}
