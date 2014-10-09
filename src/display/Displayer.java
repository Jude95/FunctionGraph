package display;

import java.util.ArrayList;
import java.util.List;

import function.base.Function;

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
	
	public void setCoordinateVisiable(boolean isShow){
		isShowCoordinate = isShow;
	}
	
	public void setSize(int width, int height){
		this.height=height;
		this.width=width;
	}
	
	public void addFunction(Function function){
		functions.add(function);
	}
	
	public void removeFunction(Function function){
		functions.remove(function);
	}
	
	private void initCanvas(){
		canvas=new int[height][width];
	}
	
	
	public void drawCoordinate(){
		for(int y=0;y<height;++y){
			canvas[y][width/2]=3;
		}
		for(int x=0;x<width;++x){
			canvas[height/2][x]=2;
		}
	}

	public void drawFunction(){
		for(Function temp:functions){
			canvas=temp.drawGraph(canvas);
		}
	}
	
	public void clear(){
		canvas=new int[height][width];
	}
	
	public void show(){
		initCanvas();
		if(isShowCoordinate){
			drawCoordinate();
		}
		drawFunction();
		print();
	}
	
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
					System.out.print(" ¡¤ ");
					break;
				case 3:
					System.out.print(" ¡¤ ");
					break;
				}	
			}
			System.out.println("");
		}
	}
}
