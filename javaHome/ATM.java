class ATM {
    public static void main(String[] args) {

        int balance = 5000;
        int withdraw = 7000;

        try {
            if (withdraw > balance) {
                throw new Exception("Insufficient Balance!");
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: ₹" + balance);

        } catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        System.out.println("Thank you for using our ATM.");
    }
}