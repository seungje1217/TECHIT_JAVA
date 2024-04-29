public class ArrayExample {
    public static void main(String[] args) {

        // int 값만 담을 수 있는 배열
        int[] price={10000,5000,3000};
        String[] mbti={"ENTP","ISTP"};

        System.out.println(mbti.length); // 크기를 구함

        for (int i=0;i<mbti.length;i++){
            System.out.println(mbti[i]);

        }
//        System.out.println(price[0]);
//        System.out.println(mbti[0]);
//
//        price[1]=8000;
//
//        System.out.println(price);
    }
}
