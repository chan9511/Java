package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score);
        System.out.println((double) score);

        //float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f); //93
        System.out.println((int) score_d); //98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        score_d = 93 + 98.8; // 93이 자동으로 double로 변환됨.
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0 자동 형변환
        // int -> long -> float -> double 점점 커지는 범위 (자동 형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191 (큰 것에서 작은 것으로 변환)
        // double -> float -> long -> int 작아지는 건 (수동 형변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        System.out.println(s1); // 문자형 93을 정수형 93으로 변환
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        System.out.println(s2);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        //"자바" 처럼 잘못된 것이 들어가면 안돼!
        //int error = Integer.parseInt("자바");
    }
}
