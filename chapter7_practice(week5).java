public class chapter7_practice {
    public static void main(String[] args) throws Exception {
       // 7-1,7-2
       /* 
       SutdaDeck deck = new SutdaDeck();

        for(int i=0; i < deck.cards.length;i++){
            System.out.print(deck.cards[i]+", "); 
        } 
        System.out.println();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++){
            System.out.print(deck.cards[i]+", "); 
        }
        System.out.println();
        System.out.println(deck.pick(0));
        */

        // 7-3 오버라이딩의 정의와 필요성에 대서 설명하시오
        // 오버라이딩란 조상클래스로부터 상속받은 클래스로부터 상속받은 메서드를 자손클래스에 맞게재정의하는것으로 
        // 조상 클래스로부터 상속받은 메서드를 자손 클래스에서 그대로 사용할 수  없는 경우가 많기 때문에 오버라이딩이 필요하다.
        

        // 7-4 다음 중 오버라이딩의 조건으로 옳지 않은 것은?
        // a. 조상의 메서드와 이름이 같아야 한다. --> o
        // b. 매개변수의 수와 타입이 같아야 한다. --> o
        // c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다. --> x --> 좁은 범위로 변경할 수 없음
        // d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다. --> x --> 조상 보다 예외를 많이 선언 할 수 없음

        // 7-6 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는?
        // 답: 조상 클래스의 멤버의 초기화를 위해선 조상의 생성자가 필요하기 때문에
    
        // 7-7 아래 코드 실행 시 호출되는 생성자의 순서와 실행결과
        /*
        Child c = new Child();
        
        System.out.println("x = " + c.getX()); // --> 조상에서 정의된 메서드이므로 x=200;
        */
        // 호출되는 생성자 순서: Child() -> Child(int x)-> Parent(int x)->Object()순서
        // 실행결과: x = 3000

        // 7-8 다음 중 접근제어자를 점근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
        // a. public - protected - (default) - private --> o
        // b. public - (default) - protected - private
        // c. (default) - public - protected - private
        // d. private - protected - (default) - public

        // 7-9 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것중 옳지 않은 것은?
        // a. 지역변수 - 값을 변경할 수 없다. --> o
        // b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다 --> O 
        // c. 메서드 -  오버로딩을 할 수 없다. --> x --> 오버라이딩을 할 수 없다.
        // d. 멤버변수 - 값을 변경할 수 없다. --> o

        // 7-10 MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값으 어디서나 읽고 변경할 수 있도록 getter, setter메서드 추가
        /*
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH: " + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL: " + t.getVolume());
        */

        // 7-11 MyTv2클래스에 이전 채널로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오
        /*
        MyTv2 tv = new MyTv2();
        tv.setChannel(10);
        System.out.println("CH: " + tv.getChannel());
        tv.setChannel(20);
        System.out.println("CH: " + tv.getChannel());
        tv.gotoPrevChannel();
        System.out.println("CH: " + tv.getChannel());
        tv.gotoPrevChannel();
        System.out.println("CH: " + tv.getChannel());
        */

        // 7-12 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은?
        // a. public은 접근제한이 전혀 없는 접근 제어자이다. --> o
        // b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다. --> o
        // c. 지역변수에도 접근 제어자를 사용할 수 있다. --> x
        // d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다. --> o
        // e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다. --> o
        
        // 7-13 Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
        // 답: Math클래스의 모든 메서드가 static메서드이고, 인스턴스변수가 존재하지 않기때문에 객체 생성할 필요 x

        // 7-15 클래스가 아래와 같이 정의되어 있을때, 형변환을 올바르게 하지 않은것은?
        class Unit{}
        class AirUnit extends Unit{}
        class GroundUnit extends Unit{}
        class Tank extends GroundUnit{}
        class AirCraft extends AirUnit{}

        Unit u = new GroundUnit();
        Tank t = new Tank();
        AirCraft ac = new AirCraft();
        // 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있음
        // a. u = (Unit)ac; --> 조상 u에서 자손 ac로 가능
        // b. u = ac: --> 조상에서 자손으로의 형변환은 생략가능 
        // c. GroundUnit gu = (GroundUnit)u; --> 조상
        // d. AirUnit au =ac;
        // e. t = (tank)u; --> 조상타입의 인스턴스로 자손타입 형변한x
        // f. GrountUnit gu = t;
    }
}
// 7-1 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오
// 7-2 SutdaDeck클래스에 shuffle, pick, pick메서드를 추가
class SutdaDeck{
    final int CARD_NUM =20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        int cnt =0;
            for(int j=0; j < cards.length; j++){
                cards[j] = new SutdaCard(j+1,false);
                if(cards[j].num >10)cards[j].num -=10;
                if(cards[j].num==1|| cards[j].num==3 ||cards[j].num==8){
                    if(cnt !=3){
                    cards[j].isKwang = true;
                    cnt++;
                    }
                }
            }
    }
    void shuffle(){
        for(int i=0; i<cards.length;i++){
            int tmp = (int)(Math.random()*20);
            SutdaCard tmp_Card = cards[i];
            cards[i] = cards[tmp];
            cards[tmp] = tmp_Card;
        }
    }
    SutdaCard pick(int index){
        return cards[index];
    }

    SutdaCard pick(){
        int i = (int)(Math.random()*20);
        return cards[i];
    }

}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1,true);
    }
    SutdaCard(int num, boolean isKwang){
        this.num =num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num+(isKwang ? "K":"");
    }
}

// 7-5 다음의 코드를 실행시키면 에러가 발생하는 라인과 그 이유는?
/*
class Product{
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product{
    Tv(){ }
    
    public  String toString(){
        return "Tv";
    }
}

class Exercise7_5{
    public static void main(String[] args){
        Tv t = new Tv(); // 에러발생 컴파일러가 생성자Tv()에서 super()을 자동으루 추가해주지만 조상인Product에서 Product()가 없기떄문에 에러발생
    } 
}
*/

// 7-7 아래 코드 실행 시 호출되는 생성자의 순서와 실행결과
class Parent{
    int x =100;

    Parent(){
        this(200);
    }
    Parent(int x){
        this.x = x;
    }
    int getX(){
        return x;
    }
}

class Child extends Parent{
    int x = 3000;

    Child(){
        this(1000);
    }
    Child(int x){
        this.x = x;
    }
}

// 7-10 MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값으 어디서나 읽고 변경할 수 있도록 getter, setter메서드 추가
// 7-11 MyTv2클래스에 이전 채널로 이동하는 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오
class MyTv2{
    private boolean inPowerOn;
    private int channel;
    private int volume;
    private int pre_channel;

    final int MAX_VOLUME =100;
    final int MIN_VOLUME =0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL =1;

    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL )
        return;
        pre_channel = this.channel;
        this.channel = channel;
        
    }

    public void gotoPrevChannel(){
        /*int tmp;
        tmp = channel;
        channel = pre_channel;
        pre_channel=  tmp;
        return channel;*/

        setChannel(pre_channel);
    }

    public void setVolume(int volume) {
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
        return;

        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }
    
    public int getVolume() {
        return volume;
    }
}