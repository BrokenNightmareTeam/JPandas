package types;

public class StringEvaluable implements Evaluable{
	private String s;
	
	public StringEvaluable(){
		this.s = "";
	}
	
	public StringEvaluable(String s){
		this.s = s;
	}
	
	public double getValue() {
		return s.length();
	}

	public int compareTo(Evaluable o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
