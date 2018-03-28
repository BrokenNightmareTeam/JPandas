package types;

public class DoubleEvaluable implements Evaluable{
	
	private Double d;
	
	public DoubleEvaluable(){
		this.d = 0.0;
	}
	
	public DoubleEvaluable(Double d){
		this.d = d;
	}
	
	public DoubleEvaluable(double d){
		this.d = d;
	}

	public double getValue() {
		return d;
	}

	public int compareTo(Evaluable arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
