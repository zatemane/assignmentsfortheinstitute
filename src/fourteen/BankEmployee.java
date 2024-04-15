package fourteen;

class BankEmployee extends Person {
    String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void displayInfo() {
        System.out.println("Bank Employee: " + getFullName());
        System.out.println("Bank Name: " + bankName);
    }
}
