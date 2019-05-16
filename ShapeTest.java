package hello;

public class ShapeTest {
	public static void main(String[] args)
	{
		int cirnum = 3;
		int cocirnum = 3;
		int trinum = 3;
		int recnum = 3;
		int fulnum = 12;
		if (args.length == 4) { // args의 길이가 4가 아니면 default 3, 맞으면 적용.
			cirnum = Integer.parseInt(args[0]);
			cocirnum = Integer.parseInt(args[1]);
			trinum = Integer.parseInt(args[2]);
			recnum = Integer.parseInt(args[3]);
			fulnum = cirnum + cocirnum + trinum + recnum;
		}
		Shape[] shapeList;
		shapeList = new Shape[fulnum];
		for (int i =0;i<cirnum;i++) { // circle 넣기 
			Circle cr = new Circle(i+2,new Point(0,0));
			shapeList[i] = cr;
		}
		for (int i =0; i<cocirnum; i++) { // color circle 넣기 
			ColorCircle cocr = new ColorCircle(i+2,new Point(0,0),"Blue");
			shapeList[i+cirnum] = cocr;
		}
		for (int i =0; i<trinum; i++) { // triangle 넣기 
			Triangle tri = new Triangle(i+1, i+2, new Point(0,0));
			shapeList[i+cirnum+cocirnum] = tri;
		}
		for (int i=0; i<recnum; i++) { // Rectangle 넣기 
			Rectangle rec = new Rectangle(i+3, i+4, new Point(0,0));
			shapeList[i+cirnum+trinum+cocirnum] = rec;
		}
		for (int i = 0; i<fulnum ; i++) { // to string 사용 print 하기 
			System.out.println(shapeList[i].toString());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0;i<fulnum;i++) {
			if (shapeList[i] instanceof ColorCircle) { // color circle 인 경우 색바꾸깅 ლ(╹◡╹ლ)
				ColorCircle cc = (ColorCircle) shapeList[i];
				cc.setColor("Hot Pink");
				System.out.print("YOU'VE CHANGED HIS COLOR! ");
				System.out.println(shapeList[i].toString()); // verify changes
			}
			if (shapeList[i] instanceof Rectangle) {
				exchangeHW(shapeList[i]);
				System.out.print("YOU'VE CHANGED HIS WIDTH AND HEIGHT! ");
				System.out.println(shapeList[i].toString());
			}
		}
		
	}// end of main
	public static void exchangeHW(Shape i) { // 높이와 너비 바꾸깅 (・∀・)
		Rectangle rc = (Rectangle) i; // down casting(?)
		int inith = rc.getHeight();
		int initw = rc.getWidth();
		rc.setHeight(initw);
		rc.setWidth(inith);
	}
}
