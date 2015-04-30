package shape;

public class Rect extends Shape implements Drawable{
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	@Override 
	public void draw(){
		System.out.println("사각형을 그렸습니다.");
	}

	@Override    //annotation
	public double calculaterArea() {
		return width * height;
	}
		
}
