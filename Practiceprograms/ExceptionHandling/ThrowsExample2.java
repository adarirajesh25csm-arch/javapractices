class ThrowsExample {

    static void withdraw(int balance, int amount) throws Exception {

        if (amount > balance) {
            throw new Exception("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String args[]) {

        try {
            withdraw(5000, 7000);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
