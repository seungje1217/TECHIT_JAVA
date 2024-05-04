public class ClassExample {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        bankAccount.changePassword(123456);
        System.out.println(bankAccount.getPassword());

//        BankAccount account=new BankAccount(
//                777,
//                12,
//                "lim",
//                10000,
//                1217,
//                false
//        );
//        System.out.println(account.accountNo);
    }
}
