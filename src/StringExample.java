public class StringExample {

    public static void main(String[] args) {

        // String => 문자열 객체
        // 객체 => 힙 메모리 영역
        // 변수 => 힙 메모리 영역의 주소
//
//        String str="안녕하쇼"; // 문자열 리터럴
//        String str_2=new String("안녕하쇼"); // 생성자
//        String str_3="안녕하쇼";
//
//        if (str==str_2){
//            System.out.println("str==str_2");
//        }
//        if (str==str_3){
//            System.out.println("str==str_3");
//        }

        // 값을 비교할 시 equals사용

//        if(str.equals(str_2)){
//            System.out.println("str.equals(str_2)");
//        }
//        if(str.equals(str_3)){
//            System.out.println("str.equals(str_3)");
//        }
//        if(str_2.equals(str_3)){
//            System.out.println("str_2.equals(str_3)");
//        }

        // 문자열 병합

        // 1. '+' 연산자
//        String str1="Hello";
//        String str2="World!";
//
//        System.out.println(str1+" "+str2);

        // 2. StringBuilder
//        StringBuilder strBdr_1=new StringBuilder("Hello");
//        strBdr_1.append("World~");
//
//        System.out.println(strBdr_1);


        // 문자열 슬라이스

//        String str_1="이름: 임승제";
//        System.out.println(str_1.indexOf("이"));
//        System.out.println(str_1.indexOf("름"));
//        String str_name=str_1.substring(4,7);
//        System.out.println(str_name);


        // 문자열 대소문자 변환
//        String str_1="abc";
//        String str_2="ABC";
//
//        str_1=str_1.toUpperCase();
//        str_2=str_2.toLowerCase();
//
//        System.out.println(str_1);
//        System.out.println(str_2);


        // 공백 제거

        // 1. 양쪽 끝 공백
        String str_1="        Hello         ~";
        System.out.println(str_1);
        str_1=str_1.trim();
        System.out.println(str_1);

        // 2. 문자열 중간 공백
        String str_2="   Hel   lo    ";
        str_2=str_2.trim();
        str_2=str_2.replace(" ", "");
        System.out.println(str_2);

    }
}
