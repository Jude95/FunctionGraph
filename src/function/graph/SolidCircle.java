package function.graph;

import function.base.Function;

public class SolidCircle extends Function{
	private double radius;
	public SolidCircle(double radius){
		this.radius = radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
	public boolean isOnGraph(int x,int y){
		if(x*x+y*y<=radius*radius){
			return true;
		}else{
			return false;
		}
	}
}
