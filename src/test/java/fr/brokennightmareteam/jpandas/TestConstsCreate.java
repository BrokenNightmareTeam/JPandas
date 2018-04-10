package fr.brokennightmareteam.jpandas;

import org.junit.Test;

import fr.brokennightmareteam.jpandas.utils.Consts;
import junit.framework.TestCase;

public class TestConstsCreate extends TestCase{
	
	@Test
	public void testConsts() {
		new Consts();
		assertEquals("java.lang.String", Consts.StringName);
		assertEquals("int", Consts.intName);
		assertEquals("java.lang.Integer", Consts.IntegerName);
		assertEquals("double", Consts.doubleName);
		assertEquals("java.lang.Double", Consts.DoubleName);
		assertEquals("boolean", Consts.booleanName);
		assertEquals("java.lang.Boolean", Consts.BooleanName);
	}
	
	
}
