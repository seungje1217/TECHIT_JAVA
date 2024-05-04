public class SavingsAccount extends BankAccount implements Withdrawable {
    boolean isOverdraft;
    void transfer(){};

    // 재정의를 할 경우에는 접근 제어자를 붙여야함
    public void withdraw() {
        System.out.println("Withdraw");
    };
}
