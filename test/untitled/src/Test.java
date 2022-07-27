import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

    List<Employee> employeeList = new ArrayList<>();

    public void getEmployeeList(){
        employeeList.add(new Employee(1,"A",new int[31]));
        employeeList.add(new Employee(2,"B",new int[31]));
        employeeList.add(new Employee(3,"C",new int[31]));
        employeeList.add(new Employee(4,"D",new int[31]));
        employeeList.add(new Employee(5,"E",new int[31]));
        employeeList.add(new Employee(6,"F",new int[31]));
        employeeList.add(new Employee(7,"G",new int[31]));
        employeeList.add(new Employee(8,"H",new int[31]));
        employeeList.add(new Employee(9,"I",new int[31]));
        employeeList.add(new Employee(10,"J",new int[31]));
        employeeList.add(new Employee(11,"K",new int[31]));
        employeeList.add(new Employee(12,"L",new int[31]));
        employeeList.add(new Employee(13,"M",new int[31]));
        employeeList.add(new Employee(14,"N",new int[31]));
        employeeList.add(new Employee(15,"0",new int[31]));
    }

    public void list() {
        Random rd = new Random();
        for (int j = 0; j < employeeList.get(0).getDayOff().length; j++) {
            int limit = 11;
            while (limit > 0) {
                for (Employee employee : employeeList) {
                    int check = sum(employee.getDayOff());
                    if (employee.getDayOff()[j] != 1) {
                        employee.getDayOff()[j] = rd.nextInt(2);
                        if (j > 4) {
                            int count = 0;
                            for (int k = 0; k < 5; k++) {
                                count += employee.getDayOff()[j - k - 1];
                            }
                            if (count == 5) {
                                employee.getDayOff()[j] = 0;
                            }
                            if (check >= 24) {
                                employee.getDayOff()[j] = 0;
                            }
                        }

                        limit = limit - employee.getDayOff()[j];
                        if (limit == 0) break;
                    }
                }
            }
        }
        System.out.print(" " + "\t");
        for(int l = 0 ; l < 31 ;l ++){

            System.out.print(l+1 + "\t");
        }
        System.out.println();
        for (Employee employee : employeeList) {
            System.out.print(employee.getName() + "\t");
            for (int j = 0; j < employeeList.get(0).getDayOff().length; j++) {
                System.out.print(employee.getDayOff()[j] + "\t");
            }
            System.out.print(sum(employee.getDayOff()));
            System.out.println();
        }
    }

    public int sum(int[] arr) {
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        return total;
    }
}
