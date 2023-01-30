public class week3_practice {
    public static void main(String[] args) throws Exception {

        // 6-2 문제 6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 결과와 같은 결과 얻기
        /*
        SutdaCard card1 = new SutdaCard(3,false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
        */

        // 6-4 문제 6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드 getTotal(), getAverage() 를 추가하기
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " + s.name);
        System.out.println("총점: " + s.getTotal());
        System.out.println("평균: " + s.getAverage());

        //6-5 class Student에  생성자와 info를 추가




    }
}

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

    void info(){
        return name+"," +ban + "," +no + "," + kor+","+eng+","+math + ","+getTotal() + "," + getAverage();
         
    }

}  

