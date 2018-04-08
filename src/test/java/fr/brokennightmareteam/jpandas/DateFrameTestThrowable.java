package fr.brokennightmareteam.jpandas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fr.brokennightmareteam.jpandas.dataframe.DataFrame;
import junit.framework.TestCase;

public class DateFrameTestThrowable extends TestCase{
	
    public DateFrameTestThrowable(String testName){
        super(testName);
    }
	
	@Test(expected=IllegalArgumentException.class)
	public void constWithDifferentNumberOfColumnsFromArrays() {
		List<String> columnsName = Arrays.asList("1","2","3");
		Comparable<?>[] column1 = {"item1","item2"};
		Comparable<?>[] column2 = {1,2,3};
		new DataFrame(columnsName, column1, column2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void constWithDifferentNumberOfColumnsFromList() {
		List<String> columnsName = Arrays.asList("1","2","3");
		List<List<Comparable<?>>> data = new ArrayList<List<Comparable<?>>>();
		data.add(Arrays.asList("item1","item2"));
		data.add(Arrays.asList(1,2,3));
		new DataFrame(columnsName, data);
	}

	@Test(expected=IllegalArgumentException.class)
	public void constWithDifferentNumberOfColumnsFromFile() {
		List<String> columnsName = Arrays.asList("1","2","3");
		Comparable<?>[] column1 = {"item1","item2"};
		Comparable<?>[] column2 = {1,2,3};
		new DataFrame(columnsName, column1, column2);
	}
	
}
