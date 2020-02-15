interface Area{
	final static float pi = 3.14F;
	float findArea(float x,float y);
}

class Rect implements Area{
	public float findArea(float x,float y){
		return x*y;
	}
}

class Circle implements Area{
	public float findArea(float x,float y){
		return pi*x*y;
	}
}

class Main{
	public static void main(String args[]){
		Rect rect = new Rect();
		Area area;
		area = rect;
		System.out.println("Rectangles area is "+(area.findArea(10,20)));

		Circle cir = new Circle();
		area = cir;
		System.out.println("Circles area is "+(area.findArea(10,10)));
	}
}