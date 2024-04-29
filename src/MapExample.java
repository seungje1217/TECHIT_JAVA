import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {

        // Map
        // 키-값 쌍을 요소로 가지는 데이터의 모음
        // 순서 구분 없음
        // 키는 중복 불가, 값은 중복 허용
        // HashMap

        HashMap<String, Integer> map = new HashMap();
        map.put("age",26);
        //map.put("mbti","EMTP");

        System.out.println("나의 나이는 " + map.get("age"));

    }
}
