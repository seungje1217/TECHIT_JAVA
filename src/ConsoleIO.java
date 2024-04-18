import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("아이디를 입력하시오: ");
        String username=sc.nextLine();

        System.out.println("생년월일를 입력하시오: ");
        // System.out.print("~")로 입력시 바로 옆에 입력가능
        int birthDate=sc.nextInt();

//        System.out.printf("%s %d\n", username, birthDate);
        System.out.printf("아이디 : %s\n생년월일 : %d", username,birthDate);


    }
}
