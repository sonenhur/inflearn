package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max; // 생성자에서 전달된 max 값을 클래스 필드에 저장
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최댓값을 초과할 수 없습니다");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}