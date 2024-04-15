package fourteen;

class Client extends Person {
    String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    public void displayInfo() {
        System.out.println("Client: " + getFullName());
        System.out.println("Bank Name: " + bankName);
    }
}