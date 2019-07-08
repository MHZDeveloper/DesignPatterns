public class CompositeDemo {
    public static void main(String args[]) {
        Department hrDepartment = new HrDepartment("Sales department");
        Department financialDepartment = new FinancialDepartment("Financial department");

        HeadDepartment headDepartment = new HeadDepartment("Head department");

        headDepartment.addDepartment(hrDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartmentName();
    }
}