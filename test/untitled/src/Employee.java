import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private int id;
    private String name;
    private int[] dayOff;
    private Map<Integer, List<Integer>> selectedDayOff;

    public Employee(int id, String name, int[] dayOff) {
        this.id = id;
        this.name = name;
        this.dayOff = dayOff;
        this.selectedDayOff = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int[] getDayOff() {
        return dayOff;
    }

    public Map<Integer, List<Integer>> getSelectedDayOff() {
        return selectedDayOff;
    }
}
