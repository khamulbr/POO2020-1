package edu.uniritter.poo2020_1.ex1;

public class Ponto {

	private int x;
	private int y;
	private int z;

	public Ponto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Ponto(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}		
}
