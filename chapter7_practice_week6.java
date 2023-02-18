import javax.sound.sampled.Port;
import javax.swing.Action;



public class chapter7_practice_week6 {
    public static void main(String[] args) throws Exception {

        // 7-15 클래스가 아래와 같이 정의되어 있을때, 형변환을 올바르게 하지 않은것은?
        /*
        class Unit{}
        class AirUnit extends Unit{}
        class GroundUnit extends Unit{}
        class Tank extends GroundUnit{}
        class AirCraft extends AirUnit{}

        Unit u = new GroundUnit();
        Tank t = new Tank();
        AirCraft ac = new AirCraft();
        */
        // 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있음
        // a. u = (Unit)ac; --> 조상 u에서 자손 ac로 가능
        // b. u = ac: --> 조상에서 자손으로의 형변환은 생략가능 
        // c. GroundUnit gu = (GroundUnit)u; --> 조상타입에서 자손타입으로 형변환 가ㄴ,ㅇ
        // d. AirUnit au =ac; --> 자손에서 조상가능
        // e. t = (tank)u; --> 조상타입의 인스턴스로 자손타입 형변한x
        // f. GrountUnit gu = t; --> 자손에서 조상타입으로 가능

        //7-16 다음 중 연산결과가 true가 아닌 것은?
        /*
        class Car{}
        class FireEngine extends Car implements Movable{}
        class Ambulance extends Car{}
        FireEngine fe = new FireEngine();
        // a. fe instanceof FireEngine
        // b. fe instanceof Movable
        // c. fe instanceof Object
        // d. fe instanceof Car
        // e. fe instanceof Ambulance --> 아무 관계x 
        */

        // 7-18 주어진 객체에 알맞은 문구가 출력되도록 하는 action메서드 작성
        /* 
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0; i < arr.length;i++){
            action(arr[i]);
        }*/

        // 7-19 Buyer클래스에서 add, summary메서드를 작성해라
       /*
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        
        b.summary();
        */

        // 7-20 다음의 코드를 실행한 결과는?
        /*
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();

        // 조상 클래스에 선언되 멤버 변수와 똑같은 변수를 자손 클래스에서 같은 이름의 인스턴스 변수를 중복으로 정의했을때 
        // 조상 타입의 참조변수로 자손타입의 인스턴스를 참조하는 경우와 자손 타입의 참조변수로 자손 인스턴스를 참조하는 경우는 다름
        // 메서드의경우 참조한 인스턴스의 메소드가 호출되지만, 멤버변수의 경우 참조변수에 따라 달라짐
        */

        // 7-23 7-22에서 작성한 클래스에 배열로 입력된 도형들의 면적의 합을 구하는 메서드를 작성하시오
        /*
        Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
        
        System.out.println("면적의 합: " + sumArea(arr));
        */

        // 7-24 다음 중 인터페이스의 장점이 아닌 것은?
        // a. 표준화를 가능하게한다 --> o
        // b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다 --> o
        // c. 독립적인 프로그래밍이 가능하다. --> o
        // d. 다중상속을 가능하게 해준다. --> o
        // e. 패지키지간의 연결을 도와준다. --> x

        // 7-25 Outer클래스 의 내부 클래스 inner의 멤버변수 iv값을 출력
        /*
        Outer o = new Outer();
        Outer.inner ii = o.new inner();
        System.out.println(ii.iv);
        */

        // 7-26 Outer클래스 의 내부 클래스 inner의 멤버변수 iv값을 출력
        // statci클래스는 인스턴스를 생성하지 않고 사용가능
        /*
        Outer_v2.inner_V2 ii = new Outer_v2.inner_V2();
        System.out.println(ii.iv);
        */


        // 7-27 30 20 10의 결과를 얻도록 클래스를 작성하시오
        Outer_v3 o = new Outer_v3();
        Outer_v3.inner_v3 ii = o.new inner_v3();
        ii.method();

    }
    // 7-23 7-22에서 작성한 클래스에 배열로 입력된 도형들의 면적의 합을 구하는 메서드를 작성하시오
        public static double sumArea(Shape[] s){
            double sum=0;
            for(int i=0; i<s.length;i++){
                sum+=s[i].caclArea();
            }

            return sum;
        }
    public  static void action(Robot r){
        if(r instanceof DanceRobot){
            DanceRobot dr = new DanceRobot();
            dr.dance();
        }
        if(r instanceof SingRobot){
            SingRobot sr =  new SingRobot();
            sr.Sing();
        }
        if(r instanceof DrawRobot){
            DrawRobot dr = new DrawRobot();
            dr.draw();
        }
    }
    // 7-21 attack메서드가 정의되어 있을 때, 이 메서드의 매개변수로 가능한 것은?
    /*
    interface Mavable{
        void move(int x, int y);   
    }
    attack(Movable f){
        //내용 생략
    }
    // null,Movable인터페이스를 구현한 모든 클래스 또는 그자손의 인스턴스가 매개변수로 사용될 수 있음
    */
}
// 7-17 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit 이라는 클래스를 만들고, 이 클래슬 상속받는 클래스를 작성
class Marine extends Unit{
    //int x,y;
    void move(int x,int y){}
    //void stop(){}
    void stimPack(){}
}

class Tank extends Unit{
    //int x,y;
    void move(int x, int y){}
    //void stop(){}
    void changeMode(){}
}

class DropShip extends Unit{
    //int x,y;
    void move(int x,int y){}
    //void stop(){}
    void load(){}
    void unload(){}
}

abstract class Unit{
    int x,y;
    abstract void move(int x,int y);
    void stop(){}
}

// 7-18 주어진 객체에 알맞은 문구가 출력되도록 하는 action메서드 작성
class Robot{}

class DanceRobot extends Robot{
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot{
    void Sing(){
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot{
    void draw(){
        System.out.println("그림을 그립니다.");
    }
}

// 7-19 Buyer클래스에서 add, summary메서드를 작성해라
class Buyer{
    int money = 1000;
    Product[] cart = new Product[3];
    int i=0;

    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 살 수 없습니다.");           
            return;}

        money -=p.price;
        add(p);
    
    }
    void add(Product p){
        if(i >= cart.length){
            Product[] tmp = new Product[cart.length*2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart =tmp;
        }
        cart[i++] = p;
    }
    void summary(){
        System.out.print("구입한 물건");
        int sum=0;
        for(int j=0; j<cart.length; j++){
            System.out.print(cart[j] + ", ");
        }
        for(int j=0 ; j<i;j++){
            sum +=cart[j].price;
        }
        System.out.println();
        System.out.println("사용 금액" + sum);
        System.out.println("남은 금액:" + money);
    }
}

class Product{
    int price;

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{
    Tv(){super(100);}

    public String toString(){return "Tv";}
}

class Computer extends Product{
    Computer(){super(200);}

    public String toString(){return "Computer";}
}

class Audio extends Product{
    Audio(){super(50);}

    public String toString(){return "Audio";}
}

// 7-20 다음의 코드를 실행한 결과는?
class Parent{
    int x = 100;
    
    void method(){
        System.out.println("Parent Method");
    }
} 

class Child extends Parent{
    int x =200;

    void method(){
        System.out.println("Child Method");
    }
}

// 7-22 shape클래스를 상속받은 Circle, Rectangle 클래스를 작성하시오, 생성자도 적절히 작성
// 7-23 7-22에서 작성한 클래스에 배열로 입력된 도형들의 면적의 합을 구하는 메서드를 작성하시오
abstract class Shape{
    Point p;

    Shape(){
        this(new Point(0,0));
    }
    
    Shape(Point p){
        this.p = p;
    }

    abstract double caclArea();

    Point getPosPoint(){
        return p;
    }
    
    void setPosition(Point p){
        this.p = p;
    }
}

class Point{
    int x;
    int y;

    Point(){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){return "[" + x +", " + y+"]"; }
}

class Circle extends Shape{
    double r;

    Circle(double r){
        this(new Point(0,0), r);
    }
    Circle(Point p, double r){
        super(p);
        this.r =r;
    }
    public double caclArea(){
        return r*r*Math.PI;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(double width, double height){
        this(new Point(0,0),width, height);
    }

    Rectangle(Point p,double width, double height){
        super(new Point(0,0));
        this.width = width;
        this.height = height;

    }

    public double caclArea(){
        return width*height;
    }

    public boolean isSquare(){
        if(width == height){return true;}
        else return false;
    }

}

// 7-25 Outer클래스 의 내부 클래스 inner의 멤버변수 iv값을 출력
class Outer{
   
    class inner{
        int iv =100;
    }
}

// 7-26 7-25 Outer클래스 의 내부 클래스 inner의 멤버변수 iv값을 출력
class Outer_v2{
    static class inner_V2{
        int iv =200;
    }
}

// 7-27 30 20 10의 결과를 얻도록 클래스를 작성하시오
class Outer_v3{
    int value =10;

    class inner_v3{
        int value =20;
        void method(){
            int value =30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer_v3.this.value);
        }
    }
}