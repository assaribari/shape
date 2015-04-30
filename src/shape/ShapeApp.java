package shape;

public class ShapeApp {

	public static void main(String[] args) {
//		Point point1 = new Point();
//		point1.setX(2);
//		point1.setY(5);
//		
//		Point point2 = new Point();
//		point2.setX(10);
//		point2.setY(23);
//		
//		Point point3 = new Point(50, 50);
//		point1.show();
//		point2.show();
//		point3.show();
		
//		ColorPoint point4 = new ColorPoint();
//		point4.setX(20);
//		point4.setY(30);
//		point4.setColor("red");
//		point4.show();
	    Shape rect = new Rect();
	    Shape circle = new Circle();
	    
//	    rect.draw();
//	    circle.draw();

		Drawable drawable = new Point(10, 20);
		drawable.draw();
	
		// instanceof 테스트
		Circle c = new Circle();
		
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		
//		System.out.println(c instanceof Rect);     //Error!!
		
		Shape s = c;
		System.out.println(s instanceof Rect);
		
	}

}
