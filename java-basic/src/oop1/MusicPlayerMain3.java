package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerdata = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(musicPlayerdata);
        // 볼륨 증가
        volumeUp(musicPlayerdata);
        volumeUp(musicPlayerdata);
        //볼륨 감소
        volumeDown(musicPlayerdata);
        // 음악 플레이어 상태
        showStatus(musicPlayerdata);
        // 음악 플레이어 종료
        off(musicPlayerdata);
    }

    static void on(MusicPlayerData musicPlayerdata) {
        musicPlayerdata.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData musicPlayerdata) {
        musicPlayerdata.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void volumeUp(MusicPlayerData musicPlayerdata) {
        musicPlayerdata.volume++;
        System.out.println("볼륨: " + musicPlayerdata.volume);
    }

    static void volumeDown(MusicPlayerData musicPlayerdata) {
        musicPlayerdata.volume--;
        System.out.println("볼륨: " + musicPlayerdata.volume);
    }

    static void showStatus(MusicPlayerData musicPlayerdata) {
        System.out.println("음악 플레이어 상태 확인");
        if (musicPlayerdata.isOn) {
            System.out.println("음악 플레이어 ON, 현재 볼륨: " + musicPlayerdata.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
