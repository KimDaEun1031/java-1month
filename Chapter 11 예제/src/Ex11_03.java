class Car_two {
	private String color;
	private int speed;
	
	void upspeed(int value) {
		speed = speed + value;
	}
	
	void downspeed(int value) {
		speed = speed - value;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}



public class Ex11_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_two MyCar1 = new Car_two();
		MyCar1.setColor("빨강");
		MyCar1.setSpeed(0);
		
		MyCar1.upspeed(30);
		System.out.println("자동차 1의 색상은 "+ MyCar1.getColor()+"이며, 현재속도는 "+MyCar1.getSpeed() +"'km'입니다");
	}

}
