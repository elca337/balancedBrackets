package uk.ac.belfastmet.returnTypes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author CAS14105696
 * @method JUnit tests for balanced brackets question
 */
public class BalancedBracketClassDriverTest {

	
	
	@Test
	public void test() {
	String result1 = BalancedBracketClass.balancedBrackets("[(]");
	assertEquals("Not Balanced", result1);
	}
	
	@Test
	public void test1() {
	String result2 = BalancedBracketClass.balancedBrackets("[()]");
	assertEquals("Balanced", result2);
	}
	
	@Test
	public void test2() {
	String result3 = BalancedBracketClass.balancedBrackets("[(](");
	assertEquals("Not Balanced", result3);
	}
	
	@Test
	public void test3() {
	String result4 = BalancedBracketClass.balancedBrackets("[()()]");
	assertEquals("Balanced", result4);
	}

}
