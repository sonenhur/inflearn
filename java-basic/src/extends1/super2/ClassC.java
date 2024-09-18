package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        //super(); // Class B에는 기본 생성자가 아닌 생성자를 이미 만들었기 때문에 자바가 기본 생성자를 자동으로 만들어주지 않음
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
