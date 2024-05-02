import java.util.SplittableRandom;

public class MethodsExample {
    public static void main(String[] args) {

        int mod_result=mod(3,2);
        System.out.println(mod_result);

        printNum(10);

        String str=greeting();
        System.out.println(str);

        greeting2();
    }

    // 함수 (입출력 모두 있는 경우)
    static int mod (int a, int b){
        int result=a%b;
        return result;
    }

    // 입력만 있는 경우
    static void printNum(int a){
        System.out.println(a); // 콘솔에만 출력하는 경우
    }

    // 출력만 있는 경우
    static String greeting(){
        return "Hello";
    }

    // 입출력 모두 없는 경우
    static void greeting2(){
        System.out.println("Hello!");
    }
}
