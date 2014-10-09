package function.base;
public abstract class Function {
	
	public abstract boolean isOnGraph(int x,int y);
	
	public int[][] drawGraph(int[][] canvas){
		int height=canvas.length;
		int width=canvas[0].length;
		
		for(int x=-width/2;x<width/2;++x){
			for(int y=-height/2;y<height/2;++y){
				if(isOnGraph(x, y)){
					canvas[y+height/2][x+width/2]=1;
				}
			}
		}
		return canvas;
	}
}
