import java.util.Comparator;

public class SJFScheduler extends Scheduler {
    @Override
    public void schedule() {
        System.out.println("SJF Scheduling:");
        processList.sort(Comparator.comparingInt(Process::getBurstTime));
        for (Process p : processList) {
            System.out.println("Process ID: " + p.getId());
        }
    }
}
