public class FIFOScheduler extends Scheduler {
    @Override
    public void schedule() {
        System.out.println("FIFO Scheduling:");
        for (Process p : processList) {
            System.out.println("Process ID: " + p.getId());
        }
    }
}
