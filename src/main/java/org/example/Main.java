package org.example;

public class Main {
    public static void main(String[] args) {

        Employee[] emArray = new Employee[5];
        emArray[0] = new Employee("Ivanov Ivan", "Engineer", "Ivan@mail.ru", "4124555", 50000, 30);
        emArray[1] = new Employee("Petrov Peter", "Director", "Peter@mail.ru", "4124550", 55000, 35);
        emArray[2] = new Employee("Sidorov Slava", "Manager", "Slava@mail.ru", "4124551", 51000, 29);
        emArray[3] = new Employee("Putin Vladimir", "Controller", "Vladimir@mail.ru", "4124552", 70000, 44);
        emArray[4] = new Employee("Medvedev Dmitrii", "QA Leader", "Dmitrii@mail.ru", "4124554", 65000, 38);
        for (int i = 0; i < emArray.length; i++) {
            System.out.println("Name: " + emArray[i].getName());
            System.out.println("Position: " + emArray[i].getPosition());
            System.out.println("Email: " + emArray[i].getEmail());
            System.out.println("Phone: " + emArray[i].getPhone());
            System.out.println("Salary: " + emArray[i].getSalary());
            System.out.println("Age: " + emArray[i].getAge());

            Park park = new Park();

            Park.addAttraction("Карусель", "12:00 - 18:00", "300");
            Park.addAttraction("Ракета", "12:00 - 18:00", "500");
            park.printAttractions();
        }

    }

}
