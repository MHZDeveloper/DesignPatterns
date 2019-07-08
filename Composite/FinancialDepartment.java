public class FinancialDepartment implements Department {

    String name = "financial department";

    public FinancialDepartment(String name) {
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(name);
    }
}
