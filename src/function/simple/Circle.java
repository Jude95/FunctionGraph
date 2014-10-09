package function.simple;

import function.base.Function;

public class Circle extends Function {

	private double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public boolean isOnGraph(int x,int y){
		if(x*x+y*y==radius*radius){
			return true;
		}else{
			return false;
		}
	}

}
