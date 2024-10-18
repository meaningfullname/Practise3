class RealBankAccount implements BankAccount {
    private String accountHolder;
    public RealBankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void accessAccount() {
        System.out.println("Accessing bank account of: " + accountHolder);
    }
}
