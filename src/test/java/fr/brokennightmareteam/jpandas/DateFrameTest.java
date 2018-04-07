package fr.brokennightmareteam.jpandas;

import org.junit.Test;

import fr.brokennightmareteam.jpandas.dataframe.DataFrame;
import fr.brokennightmareteam.jpandas.types.IntegerEvaluable;
import fr.brokennightmareteam.jpandas.types.StringEvaluable;
import junit.framework.TestCase;

public class DateFrameTest extends TestCase{
	
	private DataFrame df;
    /**
     * Create the dataframetest case
     *
     * @param testName name of the test case
     */
    public DateFrameTest(String testName){
        super(testName);
    }

	@Test
	public void construstorEmptyTest() {
		df = new DataFrame();
		assert(df.isEmpty());
	}
	
	@Test
	public void construstorFromArrayTest() {
		StringEvaluable [] column1 = {new StringEvaluable("Patrick"), new StringEvaluable("Bob"), new StringEvaluable("Frederick"), new StringEvaluable("Alfred"), new StringEvaluable("George")};
		IntegerEvaluable[] column2 = {new IntegerEvaluable(0), new IntegerEvaluable(1), new IntegerEvaluable(2), new IntegerEvaluable(3), new IntegerEvaluable(4), new IntegerEvaluable(5), new IntegerEvaluable(6)};
		df = new DataFrame(column1, column2);
		//TODO Assert from array constructor
	}

}
