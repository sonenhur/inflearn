package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myID", "Kim");
        member.print();
        member.changeData("newID", "김");
        member.print(); // id는 final이라 변경 안됨
        // member.changeData("김"); << 이걸로 바꾸는게 이상적
    }
}
