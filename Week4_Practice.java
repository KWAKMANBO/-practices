public class App {
    public static void main(String[] args) throws Exception {
               // 6-2 문제 6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 결과와 같은 결과 얻기
        /*
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
        */

        // 6-4 문제 6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal(), getAverage() 를 추가하기
       /* 
        Student s = new Student("홍길동", 1,1,100,60,76);
        /*s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;/* */
        /*
        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());
        */
        //6-5 class Student에  생성자와 info를 추가

        //System.out.println(s.info());

        // 6-6 두점의 거리를 구하는 getDistance()를 완성하시오
         //System.out.println(Exercise6_6.getDistance(1, 1, 2, 2));

        //6-7  6-6 에서 작성한 getDistance()를 MyPoint클래스의 인스턴스에서 메서드로 정의하시오
        /*
        MyPoint p  = new MyPoint(1,1);

        System.out.println(p.getDistance(2, 2));
        */

        // 6-8 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
        //PlayingCard card = new PlayingCard(1,1); // 지역변수

        // 6 - 10 다음 중 생성자에 대한 설명으로 옳지 않은것은?(모두 고르시오)
        // a. 모든 생성자의 이름은 클래스의 이름과 동일해야 한다  --> o
        // b. 생성자는 객체를 생성하기 위한 것이다. --> x --> 객체를 생성하는 것은 new 연산자
        // c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다 --> o
        // d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가해야한다 --> o
        // e. 생성자는 오버로딩 할 수 없다. --> x --> 생성자도 오버로딩이 가능함

        // 6-11 다음 중 this에 대한 설명으로 맞지 않은 것은?(모두 고르시오)
        // a. 객체 자신을 가리키는 참조변수 이다. --> o
        // b. 클래스 내에서라면 어디서든 사용할 수 있다. --> x --> 인스턴스 메서드에서만 사용할 수 있음
        // c. 지역변수와 인스텬스변수를 구별할 때 사용한다. --> o
        // d. 클래스 메서드 내에서는 사용할 수 없다. --> o
        // 부가설명: this는 인스턴스 자신의 주소를 저장하고 있으며, 모든 인스턴스메서드에 숨겨진 채로 존재하는 지역변수임 --> 따라서 인스턴스메서드 내에서만 사용할 수 있음
 
        // 6-12 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은?(모두 고르시오)
        // a. 메서드의 이름이 같아야 한다 --> o
        // b. 매개변수의 개수나 타입이 달라야 한다 -->o
        // c. 리턴타입이 달라야 한다 -->x --> 리턴타입은 오버로딩에 영향x
        // d. 매개변수의 이름이 달라야 한다. -->x --> 매개변수이름은 오버로딩에 영향x

        // 6-13  다음 중 아래의 add메서드를 올바르게 오버로딩 한것은?(모두 고르시오)
        // 원본: long add(int a, int b){return a+b;}
        // a. long add(int x, int y){ return x+y;} --> x
        // b. lond add(long a,long b){return a+b;} --> o
        // c. int add(byte a, byte b){return a+b;} --> o
        // d. int add(long a, ing b){return (int)(a+b);} --> o

        // 6-14 다음 중 초기화에 대한 설명으로 옳지 않은 것은?(모두 고르시오)
        // a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다. --> o
        // b. 지역변수는 사용하기 전에 반드시 초기화해야한다. --> o
        // c. 초기화 블럭보다 생성자가 먼저 수행된다. --> x
        // d. 명시적초기화를 제일 우선적으로 고려해야한다. --> o
        // e. 클래스변수보다 인스턴스변수가 먼저 초기화 된다. --> x

        // 6-15 다음중 인스턴스변수의 초기화 순서가 올바른 것은? -
        // a. 기본값 - 명시적초기화 - 초기화블럭 - 생성자 --> o
        // b. 기본값 - 명시적초기화 - 생성자  - 초기화 블럭
        // c. 기본값 - 초기화블럭 - 명시적초기화 - 생성자
        // d. 기본값 - 초기화블럭 - 생성자 - 명시적 초기화

        // 6-16 다음 중 지역변수에 대한 설명으로 옳지 않은 것은?(모두 고르시오)
        // a. 자동 초기화되므로 별도의 초기화가 필요없다 -->x
        // b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함계 소멸된다. -->o
        // c. 메서드의 매개변수로 선언된 변수도 지역변수다 --> o
        // d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다 --> o
        // e. 힙역영에 생셩되며 가비지컬렉터에 의해 소멸된다.--> x --> 지역변수는 호출스택에 생성됨


        // 6-17 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은?(모두 고르시오)
        //호출스택: println
        //         method1
        //         method2
        //         main
        // a. 제일 먼저 호출스택에 저장된 것은 main메서드이다 --> o
        // b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.--> x
        // c. method2메서드를 호출한 것은 main메서드이다 --> o
        // d. println메서드가 종료되면 method1메서드가 수행을 재개한다. --> o
        // e. main -method2 - method1 - println 순서로 호출되었따. --> o
        // g. 현재 실행중인 메서드는 println뿐이다. --> o


        // 6-19 다음 코드읠 실행 결과를 예측하여 적으시오
        /*
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change: " + str);
        */
        // 실행결과는 "ABC123"으로 동일함
        // change메서드내에서 +456한 후새로운 str이 생성되고 새로운 주소를 갖게됨

        // 6-20 랜덤으로 shuffle하는 메서드를 만드시오
        /*
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
        */

        // 6-21
        /*
        MyTv t= new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL: " + t.volume);

        t.channelDwon();
        t.vloumeDown();
        System.out.println("CH : " + t.channel + ", VOL: " + t.volume);

        t.volume = 100;
        t.channelUp();
        t.vloumeUp();
        System.out.println("CH:" + t.channel+", VOL : " + t.volume);
        */

        // 6-22 주어진 문자열이 숫자로만 이루어져잇는지 판별하는 코드
        /*
        String str = "123";
        System.out.printl(str+ "는 숫자입니까?" + isNumber(str));

        str = "12345o";
        System.out.println(str+ "는 숫자입니까?" + isNumber(str));
        */

        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(null));
        System.out.println("최대값: " + max(new int[]{}));

    }


// 6-19 다음 코드의 실행 결과를 예측하여 적으시오
    public static void change(String str){
        str +="456";
    }

// 6-20 랜덤으로 shuffle 하는 메서드를 만드시오
public static int[] shuffle (int[] arr){
    for(int i=0; i<arr.length; i++){
        int j= (int)(Math.random()*arr.length);
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
    return arr;
}


// 6-22 주어진 문자열이 숫자인지 판별하는 예제
public static boolean isNumber(String str){
    for(int i =0; i< str.length(); i ++){
        if(str.charAt(i) > '0' && str.charAt(i)<'9'){

        }else{
            return false;
        }
    }

    return true;
}

public static int max(int[] arr){
    if(arr.length == 0 || arr == null){return -99;}
    
    int max;
    max = arr[0];
    for(int i = 1 ; i <arr.length; i++){
        if(arr[i] > max)max = arr[i];
    } 
    return max;
}

} // main 클래스

//예제 6-1 클래스 정의하기
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num  =  num;
        this.isKwang = isKwang;
    }

    String info(){
        return num + (isKwang? "K":""); //  isKwang가 true이면 K를 반환, false이면 ""를 반환
        // 삼항연산자  형식 : 조건문? 값1:값2 --> 참이면 값1을 반환, 거짓이면 값2를 반환
    }

}

// 예제6-2 Student클래스 선언하기
class Student{
    String name; // 이름
    int ban; // 반
    int no; // 번호
    int kor; // 국어점수
    int eng; // 영어점수
    int math; // 수학점수


    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor =kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal(){
        return kor+eng+math;
    }

    float getAverage(){
        return (int)(getTotal()/3f *10 + 0.5f)/10f; 
    }//반올림하기 위해서 평균을 구하고 곱하기 10후 0.5f를 더해서 다시 10으로 나눔

    String info(){
        return name+"," +ban + "," +no + "," + kor+","+eng+","+math + ","+getTotal() + "," + getAverage();
         
    }
    }

// 6-6 두점의 거리를 구하는 getDistance()를 완성하시오
class Exercise6_6{
    static double getDistance(int x, int y, int x1,int y1){
        return Math.sqrt((x - x1)*(x-x1) + (y - y1)*(y- y1));
    }
}

// 6-6 에서 작성한 getDistance()를 MyPoint클래스의 인스턴스에서 메서드로 정의하시오
class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y =y;
    }

    double getDistance(int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }

}

// 6-8 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
class PlayingCard{
    int kind;  // 인스턴스변수
    int num;    // 인스턴스변수

    static int width; //클래스 변수
    static int height; // 클래스 변수

    PlayingCard(int k, int n){
         // k, n은 지역변수
        kind = k;
        num = n;
    }
}

// 6-9 컴퓨터 게임의 병사를 클래스로 정의한 것이다. 이 클래스의 멤버중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
class Marine{
    int x =0, y=0;
    int hp = 60;
    //int weapon =6;
    //int armor =0;
    static int weapon =6;
    static int armor =0;


    static void weaponUp(){
        weapon++;
    }
    static void armorUp(){
        armor++;
    }
    void move(int x, int y){
        this.x = x;
        this. y =y;
    }

}

// 6-18 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그 이유를 설명하시오
/*class MemberCall{
    int iv = 10;
    static int cv = 20;

    int iv2 =cv;
    static int cv2 =iv; // 라인A --> static변수의 초기화에 인스턴스변수를 사용할 수 없음, 꼭 하고자 한다면 객체를 생성해야함

    static void staticMethod1(){
        System.out.println(cv); 
        System.out.println(iv); // 라인 B --> static 메서드에서는 인스턴스변수를 사용할 수 없음
    }

    void instanceMethod1(){
        System.out.println(cv);
        System.out.println(iv); // 라인C
    }

    static void staticMethod2(){
        staticMethod1();
        instancdMethod1(); // 라인D --> static 메서드에서는 인스턴스 메서드를 사용할 수 없음
    }

    void instancdMethod2()[
        staticMethod1(); // 라인 E
        instanceMethod1();
    ]


}*/

// 6-21 Tv클래스의 주언지 로직대로 완성하시오, 완성한 후에 실행해서 주어진 실행결과 와 일치하는지 확인하시오
class MyTv{
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME =0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff(){
        isPowerOn = !isPowerOn;
    }

    void vloumeUp(){
        if(volume < MAX_VOLUME){
            volume++;
        }
    }

    void vloumeDown(){
        if( volume > MIN_VOLUME)volume --;
    }

    void channelUp(){
        if(channel == MAX_CHANNEL){
            channel = MIN_CHANNEL;
        }else channel++;
    }

    void channelDwon(){
        if( channel == MIN_CHANNEL){
            channel =  MAX_CHANNEL;
        }else{channel--;}
    }

} 
