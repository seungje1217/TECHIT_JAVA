public class TypeCasting {
    public static void main(String[] args) {

        // 형변환
        // byte < short < int < long < float < double

        short x=10;
        int y=x;

        // 강제 형변환
        int a=128;
        short b=(short)a;
        //btye c=(byte)a; // -128~127
        System.out.println(a);
        System.out.println(b);
        //System.out.println(c);
    }
}
