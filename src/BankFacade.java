class BankFacade {
    private AccountSystem accountSystem;
    private LoanSystem loanSystem;
    private TransactionSystem transactionSystem;

    public BankFacade() {
        this.accountSystem = new AccountSystem();
        this.loanSystem = new LoanSystem();
        this.transactionSystem = new TransactionSystem();
    }

    public void performBankOperations() {
        accountSystem.manageAccount();
        loanSystem.processLoan();
        transactionSystem.makeTransaction();
    }
}