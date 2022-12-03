import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Employee> map = new HashMap<>();
        map.put(1, new Employee(1, "Yuri", 18, new BigDecimal(20_000)));
        Optional<Employee> employee = Optional.ofNullable(map.get(10));
        Employee employeeNotFound = employee.orElseThrow(() -> new RuntimeException("Employee not found"));
    }
}
