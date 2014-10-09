package animotion;

import display.Displayer;

public abstract class Animation extends Thread{
	private int velocity = 20;
	
	private long during = 1000;
	
	private Displayer player;
	
	private long beginTime;
	
	private boolean stop = false;
	
	private boolean isCirculation = false;
	
	public Animation(Displayer player){
		this.player = player;
	}
	
	public void setFPS(int fps){
		this.velocity = 1000/fps;
	}
	
	/*
	 * 持续时间   -1为无限
	 */
	public void setDuring(long during){
		this.during = during;
	}
	@Override
	public void interrupt() {
		stop = true;
	}


	public abstract void prepareNextFrame(float rate);

	@Override
	public void run() {
		beginTime = System.currentTimeMillis();
		for(;;){
			long delta = System.currentTimeMillis()-beginTime;
			if(stop){
				break;
			}
			if(delta>during){
				if(!isCirculation){
					break;
				}
				beginTime = System.currentTimeMillis();
			}
			prepareNextFrame((float)delta/during);
			player.show();
			try {
				sleep(velocity);
			} catch (InterruptedException e) {
			}
		}

	}

	public boolean isCirculation() {
		return isCirculation;
	}

	public void setCirculation(boolean isCirculation) {
		this.isCirculation = isCirculation;
	}
	
}
