
import javax.management.timer.Timer;

import display.Displayer;
import function.graph.SolidCircle;
import function.simple.Circle;
import function.simple.LinearFunction;
import function.simple.QuadraticFunction;
import function.simple.CubicFunction;
import function.simple.PowerFunction;
import function.simple.LogFunction;

public class SimpleTest {
	public static void main(String[] args) {
		Displayer a=new Displayer(40,40);
		a.setCoordinateVisiable(true);
		a.addFunction(new QuadraticFunction(1,2,3));
		Circle ciecle = new Circle(0);
		a.addFunction(new CubicFunction(0,0,0,0));
		a.addFunction(new PowerFunction(0));
		a.addFunction(new LogFunction(0));
		a.addFunction(ciecle);
		a.show();
	}
}
