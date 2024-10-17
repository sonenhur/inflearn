package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울"); //x001
        //사이드이펙트 해결방안: a와 b가 처음부터 다른 인스턴스를 참조하면 된다
        Address b = new Address("서울"); //x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
