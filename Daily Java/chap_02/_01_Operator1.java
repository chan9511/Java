package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 2.5 지만 결과값으론 2가 나옴.
        System.out.println(2 / 4); // 0.5 지만 결과값으론 0이 나옴.
        System.out.println(4 % 2);
        System.out.println(5 % 2);

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증간 연산 ++, --
        int val;
        val = 10;

        // val = val + 1; 와 같은 것
        //val++;  다른 문장을 수행하고 나서 value의 연산
        //++val;  value의 연산이 먼저.
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        // 은행 대기번호 표
        int waiting = 0;
          System.out.println("대기 인원 : " + waiting++);
          System.out.println("대기 인원 : " + waiting++);
          System.out.println("대기 인원 : " + waiting++);
          System.out.println("총 대기 인원 : " + waiting++);

    }
}
