package display;

import java.util.ArrayList;
import java.util.List;

import function.base.Function;

/**
 * 显示器类，每一次调用show就重新绘图显示
 * @author Mr
 *
 */
public class Displayer {
	private List<Function> functions;
	private int height;
	private int width;	
	private int[][] canvas;
	
	private boolean isShowCoordinate = false;
	
	public  Displayer(){
		this(50,50);
	}
	
	public  Displayer(int width, int height){
		this.height=height;
		this.width=width;
		functions = new ArrayList<Function>();
	}
	//是否显示坐标系
	public void setCoordinateVisiable(boolean isShow){
		isShowCoordinate = isShow;
	}
	//设置大小
	public void setSize(int width, int height){
		this.height=height;
		this.width=width;
	}
	//添加函数
	public void addFunction(Function function){
		functions.add(function);
	}
	//删除函数
	public void removeFunction(Function function){
		functions.remove(function);
	}
	//初始化画布
	private void initCanvas(){
		canvas=new int[height][width];
	}
	
	//画坐标系
	public void drawCoordinate(){
		for(int y=0;y<height;++y){
			canvas[y][width/2]=3;
		}
		for(int x=0;x<width;++x){
			canvas[height/2][x]=2;
		}
	}
	//画函数
	public void drawFunction(){
		for(Function temp:functions){
			canvas=temp.drawGraph(canvas);
		}
	}
	//清除画布
	public void clear(){
		canvas=new int[height][width];
	}
	//绘制画布
	public void show(){
		initCanvas();
		if(isShowCoordinate){
			drawCoordinate();
		}
		drawFunction();
		print();
	}
	//显示画布
	private void print(){
		for(int i=height-1;i>0;--i){
			for(int j=0;j<width;++j){
				switch(canvas[i][j]){
				case 0:  
					System.out.print("   ");
					break;
				case 1:
					System.out.print(" * ");
					break;
				case 2:
					System.out.print(" · ");
					break;
				case 3:
					System.out.print(" · ");
					break;
				}	
			}
			System.out.println("");
		}
	}
}
