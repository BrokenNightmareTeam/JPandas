package fr.brokennightmareteam.jpandas.types;

public class StringEvaluable implements Comparable<StringEvaluable>{
	private String s;
	
	public StringEvaluable(){
		this.s = "";
	}
	
	public StringEvaluable(String s){
		this.s = s;
	}
	
	public String get() {
		return this.s;
	}

	public int compareTo(StringEvaluable arg0) {
		return this.s.length() - arg0.get().length();
	}

}
