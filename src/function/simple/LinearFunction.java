package function.simple;

import function.base.Function;

public class LinearFunction extends Function{
	private double a;
	private double b;
	
	public LinearFunction(double a,double b){
		this.a = a;
		this.b = b;
	}
	
	public boolean isOnGraph(int x,int y){
		if(y==a*x+b){
			return true;
		}else{
			return false;
		}
	}
}
