package extends1.super1;

public class Child extends Parent {
    public String value = "Child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // this는 생략 가능
        System.out.println("super value = " + super.value);

        this.hello(); //생략 가능
        super.hello();
    }
}
