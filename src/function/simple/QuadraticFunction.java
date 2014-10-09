package function.simple;

import function.base.Function;

public class QuadraticFunction extends Function{
	private double a;
	private double b;
	private double c;
	
	
	/**
	 * –Œ»Á   y=a*x^2+b*x+c
	 * @param a
	 * @param b
	 * @param c
	 */
	public QuadraticFunction(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isOnGraph(int x,int y){
		if(a*x*x+b*x+c==y){
			return true;
		}else{
			return false;
		}
	}
}
