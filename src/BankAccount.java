public class BankAccount {

    // 맴버변수
    // private => 동일 클래스
    private int bankCode; // 은행코드
    private int accountNo; // 계좌번호
    private String owner; // 소유자
    private int balance; // 잔액
    private boolean isDormant; // 휴먼상태 여부
    private int password; // 계좌 비밀번호

    // 메소드
    public void inquiry(){} // 계좌 조회
    public void deposit(){} // 계좌 입금
    //public void withdraw(){} // 계좌 출금
    public void heldInDormant(){} // 휴먼 계좌 전환

    public void changePassword(int password){
        this.password=password;
    }

    // 생성자
    // 클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치
    // new 연산자와 함께 사용
    BankAccount() {

    }
    // 비어있는 생성자가 필요한 경우도 있기에 수동으로 만들어줘야함
    // 아무런 생성자가 없을 시 자바가 자동적으로 만들어주는 것
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ){
        this.bankCode=bankCode; // 오른쪽값은 입력받은 것
        this.accountNo=accountNo;
        this.owner=owner;
        this.balance=balance;
        this.password=password;
        this.isDormant=isDormant;

    }

    // 값을 리턴 => get
    // 값을 변경 => set
    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isDormant() {
        return isDormant;
    }

    public void setDormant(boolean dormant) {
        isDormant = dormant;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
