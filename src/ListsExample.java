import java.util.ArrayList;

public class ListsExample {
    public static void main(String[] args) {
        // List
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList<Integer> list=new ArrayList(10);
        list.add(100);
        list.add(999999);
        //list.add("ENTP");

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
