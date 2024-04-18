public class PrimitiveType {
    public static void main(String[] args) {

        // 정수형

        // 1. byte (-128~127)
        // 2. short (-32768~32767)
        // 3. int (-2^31~2^31-1)
        // 4. long (-2^63~2^63-1)


        // 실수형

        // 1. double - 15자리
        // 2. float - 7자리

        double a=1.23;
        float b=9.45f; // f를 붙어야함 -> 일반적으로는 double 사용

        System.out.println(b);

        // 문자형
        // char
        // 아스키, 유니코드
        char char_1='a';
        char char_2=97; // 아스키코드

        System.out.println(char_1);
        System.out.println(char_2);

        // 논리형
        // boolean(1 byte)

        boolean bool_1=true;
        boolean bool_2=false;
        boolean bool_3=(100<0);

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);
    }
}
