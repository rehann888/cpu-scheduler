import java.util.LinkedList;
import java.util.Queue;

public class RoundRobinScheduler extends Scheduler {
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    @Override
    public void schedule() {
        System.out.println("Round Robin Scheduling:");
        int time = 0;
        Queue<Process> queue = new LinkedList<>(processList);

        while (!queue.isEmpty()) {
            Process p = queue.poll();
            int remainingTime = p.getRemainingTime();
            if (remainingTime > timeQuantum) {
                p.setRemainingTime(remainingTime - timeQuantum);
                time += timeQuantum;
                queue.add(p);
            } else {
                time += remainingTime;
                p.setRemainingTime(0);
            }
            System.out.println("Process ID: " + p.getId() + " executed at time " + time);
        }
    }
}
