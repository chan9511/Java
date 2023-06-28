package chap_02;

public class _06_Quiz {
    // 퀴즈 2
    // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
    // 조건
    // 키가 120cm이상인 경우에만 탑승가능
    // 삼항 연산자 이용
    // 실행 결과
    // 키가 115cm 이므로 탑승 불가능합니다. 값이 115인 경우
    // 키가 121cm 이므로 탑승 가능합니다. 값이 121인 경우
    public static void main(String[] args) {

        int x = 115;
        int y = 121;

        String a = (x >= 120) ? "키가" + x + "cm 이므로 탑승 가능합니다" : "키가" + x + "cm 이므로 탑승 불가능합니다";
        System.out.println(a);

        String b = (y >= 120) ? "키가" + y + "cm 이므로 탑승 가능합니다" : "키가" + y + "cm 이므로 탑승 불가능합니다";
        System.out.println(b);
    }
}
