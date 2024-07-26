import java.util.List;

public class GanttChart {
    public static void display(List<Process> processList) {
        System.out.println("Gantt Chart:");
        for (Process p : processList) {
            System.out.print("| P" + p.getId() + " ");
        }
        System.out.println("|");
    }
}
