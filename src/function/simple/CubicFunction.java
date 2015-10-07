package function.simple;
import function.base.Function;

/**
 * Created by asus on 2015/10/7.
 */
public class CubicFunction extends Function{
    private double a;
    private double b;
    private double c;
    private double d;

    public CubicFunction(double a,double b,double c,double d){
        this.a=a;
        this.b=b;
        this.d=d;
        this.c=c;
    }
    public boolean isOnGraph(int x,int y){
        if (a*x*x*x+b*x*x+c*x+d==y){
            return true;
        }else{
            return false;
        }
    }
}
