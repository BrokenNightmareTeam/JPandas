package fr.brokennightmareteam.jpandas;

import java.io.IOException;

import org.junit.Test;

import fr.brokennightmareteam.jpandas.dataframe.DataFrame;
import junit.framework.TestCase;

public class TestDateFrameCreate extends TestCase{
	
    
	@Test
	public void testEmptyDataFrame() {
		DataFrame df = new DataFrame();
		assertTrue(df.isEmpty());
	}
	
	@Test
	public void testCreateWithDifferentNumberOfColumnsFromFileName1() throws IOException {
		DataFrame df = new DataFrame(this.getClass().getResource("/GoodTest.csv").getFile());
		assertEquals("     || Name     || Age || Poid || EstBlond ||\n" + 
				 "|| 0 || Isabelle || 25  || 73.2 || true     ||\n" + 
				 "|| 1 || Gaspard  || 54  || 64.5 || false    ||\n" + 
				 "|| 2 || Léo      || 17  || 55.8 || false    ||\n" + 
				 "|| 3 || Arthur   || 33  || 71.9 || true     ||\n" + 
				 "\n", df.print());
	}
	
}
