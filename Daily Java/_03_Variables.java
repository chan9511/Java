package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "김찬동";
        int hour = 15;

        //String name = "김찬동"; 위 문장과 같은 코드로 사용가능
        //숫자는 따옴표가 필요없음.
        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "동찬김";
        System.out.println(name + "님의 평균 점수는" + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        //한글자는 char로 표현가능 작은 따옴표로 표현. name을 변경.

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);
        //같은 소수점을 나타내지만 에러가 뜬다 그러므로 f를 뒤에 넣어준다.
        //float는 소수 7번째 자리까지 표현.

        //int i = 1000000000000;
        //int의 범위를 넘어서서 int에 범위를 벗어났기 때문에 빨간줄이 나온다.
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
        //그러므로 long으로 바꿔주고 뒤에 l을 붙여준다.
        //int, long, float, double, char, string, boolean.
    }
}
