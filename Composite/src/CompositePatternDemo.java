// Composite: Manager (Birden fazla çalışanı yönetebilir)
import java.util.ArrayList;
import java.util.List;


public class CompositePatternDemo {
    public static void main(String[] args) {
        // Tekil çalışanlar (Leaf)
        Employee dev1 = new Developer("Ahmet", "Backend Developer");
        Employee dev2 = new Developer("Mehmet", "Frontend Developer");
        Employee des1 = new Designer("Elif", "UI/UX Designer");

        // Orta seviye yönetici
        Manager teamLead = new Manager("Zeynep", "Team Lead");

        teamLead.addEmployee(dev1);
        teamLead.addEmployee(dev2);
        teamLead.addEmployee(des1);

        Employee dev3 = new Developer("Ahmet1", "Backend Developer");
        Employee dev4 = new Developer("Mehmet1", "Frontend Developer");
        Employee des5 = new Designer("Elif1", "UI/UX Designer");

        // Orta seviye yönetici
        Manager teamLead1 = new Manager("Zeynep1", "Team Lead");

        teamLead.addEmployee(dev3);
        teamLead.addEmployee(dev4);
        teamLead.addEmployee(des5);

        // Üst yönetici
        Manager ceo = new Manager("Burak", "CTO");
        ceo.addEmployee(teamLead);
        ceo.addEmployee(teamLead1);

        // Hiyerarşiyi yazdır
        ceo.showDetails();
    }
}


class Manager implements Employee {
    private String name;
    private String position;
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println(name + " - " + position);
        for (Employee employee : employees) {
            System.out.print("\t");
            employee.showDetails();
        }
    }
}

// Leaf 1: Developer
class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " - " + position);
    }
}

// Leaf 2: Designer
class Designer implements Employee {
    private String name;
    private String position;

    public Designer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " - " + position);
    }
}

// Component
interface Employee {
    void showDetails();
}

