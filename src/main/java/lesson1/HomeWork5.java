package lesson1;

public class HomeWork5 {

    public static void main(String[] args) {
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mail.ru", "892312312",50000,27);
        empCorp[1] = new Employee("Krylov Ivan", "Writer", "krylov@mail.ru", "892312314",50000,75);
        empCorp[2] = new Employee("Bunin Ivan", "Water pot", "sidorov@mail.ru", "892312315",10000,43);
        empCorp[3] = new Employee("Urgant Ivan", "Celebrety", "urgant@mail.ru", "892312316",5000,39);
        empCorp[4] = new Employee("Ohlabyustin", "Actor", "ohlabyustin@mail.ru", "892312317",3000,50);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
