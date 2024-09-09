package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인:");
        if (isOn) {
            System.out.println("=========================");
            System.out.println("음악 플레이어 ON, 현재 볼륨: " + volume);
            System.out.println("=========================");
        } else {
            System.out.println("=========================");
            System.out.println("음악 플레이어 OFF");
            System.out.println("=========================");
        }
    }
}
