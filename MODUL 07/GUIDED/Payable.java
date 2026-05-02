public interface Payable {
    double getPaymentAmount(); // calculate payment; no implementation

    static void main(String[] args) {
        Payable payable = new Invoice("56789", "hammer", 3, 49.50);
        System.out.printf("payment amount: $%,.2f%n", payable.getPaymentAmount());
    }
} // end interface Payable