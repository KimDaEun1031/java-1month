package abstractEx;

public class Main {

    public static void main(String[] args) {

    Rect r1 = new Rect(4,5);

    System.out.println("가로가 "+r1.width+", 세로가 "+r1.height+"인 사각형의 넓이는 " 
    +r1.getArea()+"이고 둘레는 "+r1.getRound()+" 입니다.");

    Circle c1 = new Circle(4);

    System.out.println("반지름이 "+c1.r+"인 원의 넓이는 "+c1.getArea()+ "이고 "
    		+ "둘레는"+c1.getRound()+"입니다.");



    //Dohyung d = new Dohyung(); >> 에러남.
    /*

    Dohyung d1 = new Rect(4,3);  //Rect 처음에 super 생략 >Dohyung 만들어짐, 
    Dohyung super> Object 만들어짐
    //d는 실제 Dohyung을 뜻함.

    System.out.println("가로가 "+d1.width+", 세로가 "+d1.height+"인 
    사각형의 넓이는 " +d1.getArea()+"이고 둘레는 "+d1.getRound()+" 입니다.");

    //>>에러남. why? Dohyung에는 width,height가 없기 때문

    //getArea와 getRound는 에러X why? Rect class와 getArea,getRound에 연결되어있기 때문

    */

    Geometry d1 = new Rect(4,3);

    System.out.println("도형의 넓이는"+d1.getArea()+"이고 둘레는 "+d1.getRound()+" 입니다.");

    Rect r2 = (Rect) d1; //따라서 바꿔줘야 한다.

    System.out.println("가로가 "+r2.width+", 세로가 "+r2.height+"인 사각형의 넓이는 " +r2.getArea()+"이고 둘레는 "+r2.getRound()+" 입니다.");
    }
}