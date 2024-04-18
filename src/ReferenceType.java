public class ReferenceType {
    public static void main(String[] args) {

        // 참조형
        // 참조형 데이터의 값 => 힙 메모리 영역
        // 변수에 대입되는 값 => 힙 메모리 영역의 주소값

        String a = new String("Hello");
        System.out.println(a);

        String b="Hello!";

        if (a==b){
            System.out.println("a==b");
        }
        else{
            System.out.println("nono");
        }
    }
}
