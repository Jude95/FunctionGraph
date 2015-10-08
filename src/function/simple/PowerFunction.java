package function.simple;
        import function.base.Function;
     
/**
 * Created by asus on 2015/10/7.
 */
public class PowerFunction extends Function{
    //形如y=x^a
    private double a;

    public PowerFunction(double a){
        this.a = a;
    }
    public boolean isOnGraph(int x,int y){
           if(Math.pow(x,a)==y){
            return true;
        }
            else{
            return false;
        }
    }
}
