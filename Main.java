import java.util.Scanner;
public class Main {
    private static int readInt(Scanner sc, String prompt) {
        while(true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) return sc.nextInt();
            System.out.println("Ошибка: введите целое число");
            sc.next();
        }
    }

    private static String readLine(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static String readNonEmpty(Scanner sc, String prompt) {
        while(true) {
            String s = readLine(sc, prompt);
            if (!s.isEmpty()) return s;
            System.out.println("Ошибка: строка не должна быть пустой");
        }
    }

    private static void task1() {
        System.out.println("\nЗадача 1. Имена");
        Name n1=new Name(null, "Клеопатра", null);
        Name n2=new Name("Пушкин", "Александр", "Сергеевич");
        Name n3=new Name("Маяковский", "Владимир", null);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    private static void task2() {
        System.out.println("\nЗадача 2. Дом");
        System.out.println(new House(1));
        System.out.println(new House(5));
        System.out.println(new House(23));
    }

    private static void task3() {
        System.out.println("\nЗадача 3. Сотрудники и отделы");
        Department it=new Department("IT");
        Employee petrov=new Employee("Петров");
        Employee kozlov=new Employee("Козлов");
        Employee sidorov=new Employee("Сидоров");
        petrov.setDepartment(it);
        kozlov.setDepartment(it);
        sidorov.setDepartment(it);
        it.setChief(kozlov);
        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }

    private static void task4() {
        System.out.println("\nЗадача 4. Список сотрудников отдела");
        Department it=new Department("IT");
        Employee petrov=new Employee("Петров");
        Employee kozlov=new Employee("Козлов");
        Employee sidorov=new Employee("Сидоров");
        petrov.setDepartment(it);
        kozlov.setDepartment(it);
        sidorov.setDepartment(it);
        it.setChief(kozlov);
        Employee any=petrov;
        System.out.println("Сотрудники отдела "+any.getDepartment().getName()+":");
        for (Employee e : any.getDepartment().getEmployees()) {
            System.out.println(" - "+e.getName());
        }
    }

    private static void task5() {
        System.out.println("\nЗадача 5. Создаем Имена");
        Name n1=new Name("Клеопатра");
        Name n2=new Name("Пушкин", "Александр", "Сергеевич");
        Name n3=new Name("Маяковский", "Владимир");
        Name n4=new Name("Бонифатьевич", "Христофор");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }

    private static void task6() {
        System.out.println("\nЗадача 6. Дроби");
        Fraction f1=new Fraction(1, 3);
        Fraction f2=new Fraction(2, 3);
        Fraction f3=new Fraction(3, 4);
        System.out.println(f1+" + "+f2+" = "+f1.sum(f2));
        System.out.println(f1+" - "+f2+" = "+f1.minus(f2));
        System.out.println(f1+" * "+f2+" = "+f1.mult(f2));
        System.out.println(f1+" / "+f2+" = "+f1.div(f2));
        System.out.println(f1+" + 5 = "+f1.sum(5));
        Fraction result=f1.sum(f2).div(f3).minus(5);
        System.out.println("f1.sum(f2).div(f3).minus(5) = "+result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nМЕНЮ");
            System.out.println("1. Имена");
            System.out.println("2. Дом");
            System.out.println("3. Сотрудники и отделы");
            System.out.println("4. Список сотрудников отдела");
            System.out.println("5. Создаем Имена");
            System.out.println("6. Дроби");
            System.out.println("0. Выход");
            choice=readInt(sc, "\nВыберите задачу (0-6): ");
            switch (choice) {
                case 1->task1();
                case 2->task2();
                case 3->task3();
                case 4->task4();
                case 5->task5();
                case 6->task6();
                case 0->System.out.println("Выход из программы");
                default->System.out.println("Ошибка: выберите пункт от 0 до 6");
            }
        } while (choice!=0);
        sc.close();
    }
}
