
import javax.management.timer.Timer;

import display.Displayer;
import function.graph.SolidCircle;
import function.simple.Circle;
import function.simple.LinearFunction;
import function.simple.QuadraticFunction;

public class SimpleTest {
	public static void main(String[] args) {
		Displayer a=new Displayer(40,40);
		a.setCoordinateVisiable(true);
		a.addFunction(new QuadraticFunction(1,8,4));
		Circle ciecle = new Circle(5);
		a.addFunction(ciecle);
		a.show();
	}
}
