package access.b;

//권한이 없어서 import 자체가 불가
//import access.a.DefaultClass1;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지에서 접근 불가
        // DefaultClass1 defaultClass = new DefaultClass1();
    }
}
