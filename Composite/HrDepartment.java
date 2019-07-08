public class HrDepartment  implements Department {

    String name = "HR department";

    public HrDepartment(String name) {
        this.name = name;
    }

    public void printDepartmentName() {
        System.out.println(name);
    }
}
