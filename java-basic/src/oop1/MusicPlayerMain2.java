package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerdata = new MusicPlayerData();

        // 음악 플레이어 켜기
        musicPlayerdata.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        // 볼륨 증가
        musicPlayerdata.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerdata.volume);
        musicPlayerdata.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerdata.volume);
        //볼륨 감소
        musicPlayerdata.volume--;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerdata.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (musicPlayerdata.isOn) {
            System.out.println("플레이어 ON, 볼륨: " + musicPlayerdata.volume);
        } else {
            System.out.println("플레이어 OFF");
        }
        musicPlayerdata.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
