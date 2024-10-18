class BankAccountProxy implements BankAccount {
    private RealBankAccount realAccount;
    private String accountHolder;
    public BankAccountProxy(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void accessAccount() {
        if (authenticate()) {
            if (realAccount == null) {
                realAccount = new RealBankAccount(accountHolder);
            }
            realAccount.accessAccount();
        } else {
            System.out.println("Access denied for: " + accountHolder);
        }
    }
    private boolean authenticate() {
        // Simple authentication logic
        return "authorizedUser".equals(accountHolder);
    }
}
