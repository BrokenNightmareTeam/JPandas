package types;

public class IntegerEvaluable implements Evaluable{
	private Integer i;
	
	public IntegerEvaluable(){
		this.i = 0;
	}
	
	public IntegerEvaluable(Integer i){
		this.i = i;
	}
	
	public IntegerEvaluable(int i){
		this.i = i;
	}
	
	public double getValue() {
		return i;
	}
	
	public Integer get() {
		return i;
	}

	public int compareTo(Evaluable o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
