package function.base;
/*
 * 函数的顶级父类
 *
 */
public abstract class Function {
	
	/*
	 * 判断当前点是否满足函数
	 */
	public abstract boolean isOnGraph(int x,int y);
	
	/**
	 * 画出图像
	 * @param canvas
	 * @return
	 */
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
