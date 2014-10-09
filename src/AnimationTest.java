import animotion.Animation;
import display.Displayer;
import function.graph.SolidCircle;
import function.simple.Circle;
import function.simple.QuadraticFunction;


public class AnimationTest {

	public static void main(String[] args) {
		Displayer a=new Displayer(40,40);
		a.setCoordinateVisiable(true);
		final SolidCircle circle = new SolidCircle(5);
		a.addFunction(circle);
		
		Animation anim = new Animation(a) {
			
			@Override
			public void prepareNextFrame(float rate) {
				circle.setRadius(rate*20);
			}
		};
		anim.setFPS(20);
		anim.setDuring(1000);
		anim.setCirculation(true);
		anim.start();
	}

}
