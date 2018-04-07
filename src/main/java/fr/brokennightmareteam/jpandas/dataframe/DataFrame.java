package fr.brokennightmareteam.jpandas.dataframe;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFrame {
	
	List<List<Comparable<?>>> data;
	Map<String, Integer> indexColumn;
	List<String> types;

	public DataFrame(){
		// TODO Auto-generated constructor stub
	}

	public DataFrame(List<String> columnsName, Comparable<?>[] ... columns){
		data = new ArrayList<List<Comparable<?>>>();
		indexColumn = new HashMap<String, Integer>();
		types = new ArrayList<String>();
		for(int i=0; i<columns.length; i++){
			if(columnsName.size() <= i)
				throw new IllegalArgumentException();
			indexColumn.put(columnsName.get(i), i);
			data.add(Arrays.asList(columns[i]));
			String type = columns[i][0].getClass().getName();
			types.add(type);
			data.get(i).forEach(c -> {
				if(!c.getClass().getName().equals(type))
					throw new IllegalArgumentException();
			});
		}
	}
	
	public DataFrame(File csvFile){
		
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
}
