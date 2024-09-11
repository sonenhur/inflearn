package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();


        // 이후 물려받은 담당자가 잘 모른채 200까지 올리려고 함
        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // private 접근 오류
        // 스피커 폭발 엔딩
        // volume 필드를 private로 변경해서 예방
    }
}
