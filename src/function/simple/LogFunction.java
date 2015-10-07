package function.simple;
import function.base.Function;
/**
 * Created by asus on 2015/10/7.
 */
public class  LogFunction extends Function {
    private double a;
    //y=logax

    public LogFunction(double a) {
        this.a = a;
    }

    public boolean isOnGraph(int x, int y) {
        if (Math.log(x) / Math.log(a) == y) {
            return true;
        } else {
            return false;
        }
    }
}

