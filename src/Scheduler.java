import java.util.ArrayList;
import java.util.List;

public abstract class Scheduler {
    protected List<Process> processList;

    public Scheduler() {
        processList = new ArrayList<>();
    }

    public void addProcess(Process p) {
        processList.add(p);
    }

    public List<Process> getProcessList() {
        return processList;
    }

    public abstract void schedule();
}
