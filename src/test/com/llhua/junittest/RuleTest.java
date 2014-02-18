package test.com.llhua.junittest;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class RuleTest implements MethodRule {

	@Override
	public Statement apply(Statement arg0, FrameworkMethod arg1, Object arg2) {
		// TODO Auto-generated method stub
		return new Statement(){
			@Override
			public void evaluate() throws Throwable {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
