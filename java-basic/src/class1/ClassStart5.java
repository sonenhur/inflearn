package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};
        // 향상된 for 문 단축키 : iter
        for (Student std : students) {
            System.out.println("이름: " + std.name + " 나이: " + std.age + " 성적: " + std.grade);
        }
    }
}
