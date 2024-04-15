package fourteen;

public class RunnerOne {
    public static void main(String[] args) {
        Person person = new Person("Джон", "Сина") {
            @Override
            public void displayInfo() {
                System.out.println("Person: " + getFullName());
            }
        };

        Client client = new Client("Алиса", "Мармеладова", "Bank of R");
        BankEmployee employee = new BankEmployee("Кевин", "Самсонов", "Bank N");

        person.displayInfo();
        client.displayInfo();
        employee.displayInfo();
    }
}
