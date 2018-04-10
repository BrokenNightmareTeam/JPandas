package fr.brokennightmareteam.jpandas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import fr.brokennightmareteam.jpandas.dataframe.DataFrame;
import junit.framework.TestCase;

public class TestDateFrameThrowable extends TestCase{
	
    public TestDateFrameThrowable(String testName){
        super(testName);
    }
    
	@Test
	public void testCreateWithDifferentNumberOfColumnsFromArrays1() {
		List<String> columnsName = Arrays.asList("1","2","3");
		Comparable<?>[] column1 = {"item1","item2","item3"};
		Comparable<?>[] column2 = {1,2,3};
		try{
			new DataFrame(columnsName, column1, column2);
			fail("Should raise IllegalArgumentException");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().equals("Nombre de colonnes incorrect"));
		} catch (Exception e){
			fail("Should raise IllegalArgumentException");
		}
	}
	
	@Test
	public void testCreateWithDifferentNumberOfColumnsFromArrays2() {
		List<String> columnsName = Arrays.asList("1","2","3");
		Comparable<?>[] column1 = {"item1","item2","item3"};
		Comparable<?>[] column2 = {1,2,3};
		Comparable<?>[] column3 = {1.0,2.0,3.0};
		Comparable<?>[] column4 = {true,true,false};
		try{
			new DataFrame(columnsName, column1, column2, column3, column4);
			fail("Should raise IllegalArgumentException");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().equals("Nombre de colonnes incorrect"));
		} catch (Exception e){
			fail("Should raise IllegalArgumentException");
		}
	}
	
	@Test
	public void testCreateWithDifferentNumberOfColumnsFromList1() {
		List<String> columnsName = Arrays.asList("1","2","3");
		List<List<Comparable<?>>> data = new ArrayList<List<Comparable<?>>>();
		data.add(Arrays.asList("item1","item2","item3"));
		data.add(Arrays.asList(1,2,3));
		try{
			new DataFrame(columnsName, data);
			fail("Should raise IllegalArgumentException");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().equals("Nombre de colonnes incorrect"));
		} catch (Exception e){
			fail("Should raise IllegalArgumentException");
		}
	}
	
	
	@Test
	public void testCreateWithDifferentNumberOfColumnsFromList2() {
		List<String> columnsName = Arrays.asList("1","2","3");
		List<List<Comparable<?>>> data = new ArrayList<List<Comparable<?>>>();
		data.add(Arrays.asList("item1","item2","item3"));
		data.add(Arrays.asList(1,2,3));
		data.add(Arrays.asList(1.0,1.2,2.2));
		data.add(Arrays.asList(true,false,true));
		try{
			new DataFrame(columnsName, data);
			fail("Should raise IllegalArgumentException");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().equals("Nombre de colonnes incorrect"));
		} catch (Exception e){
			fail("Should raise IllegalArgumentException");
		}
	}

	@Test
	public void testConstWithDifferentNumberOfColumnsFromFileName() throws IOException {
		try{
			new DataFrame(this.getClass().getResource("/DifferentNumberOfColumns.csv").getFile());
			fail("Should raise IllegalArgumentException");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().equals("Format de fichier incorrect"));
		} catch (Exception e){
			fail("Should raise IllegalArgumentException");
		}
	}

}
