import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {

        // 예외 (Exceptions)

//        int a = 10;
//        int b = 0;
//        int c = a/b;
        ArrayList arrayList=new ArrayList(3);
        // arrayList.get(10); // list에 10이 없기에 리턴 (get) 못함 -> 에러

//        try{
//            arrayList.get(10);
//        }catch (Exception e){
//            // e.printStackTrace(); // 에러 메세지
//            System.out.println("에러발생");
//        }finally {
//            System.out.println("finally");
//        }

        try{
            //arrayList.get(10);
            int a = 10;
            int b = 0;
            int c = a/b;
        }catch (IndexOutOfBoundsException ioe){
            // e.printStackTrace(); // 에러 메세지
            System.out.println("IndexOutOfBoundsException 발생");
        }catch (IllegalArgumentException iae){
            System.out.println("IllegalArgumentException 발생");
        }catch (Exception e){
            System.out.println("Exception 발생");
        } finally{
            System.out.println("finally");
        }
    }
}
