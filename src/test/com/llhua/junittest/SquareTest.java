package test.com.llhua.junittest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.llhua.junittest.Calculator;

@RunWith(Parameterized.class)
public class SquareTest {
	private static Calculator calculator = new Calculator();
	int param;
	int result;
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{
				{2, 4},
				{0, 0},
				{-3, 9}
		});
	}
	
	public SquareTest(int param, int result){
		this.param = param;
		this.result = result;
	}
	
	@Test
	public void square(){
		calculator.square(param);
		assertEquals(result, calculator.getResult());
	}
}
