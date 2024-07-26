import java.util.List;

public class Statistics {
    public static void calculate(List<Process> processList) {
        double totalWaitTime = 0;
        double totalTurnaroundTime = 0;
        int currentTime = 0;

        for (Process p : processList) {
            totalWaitTime += currentTime - p.getArrivalTime();
            currentTime += p.getBurstTime();
            totalTurnaroundTime += currentTime - p.getArrivalTime();
        }

        double avgWaitTime = totalWaitTime / processList.size();
        double avgTurnaroundTime = totalTurnaroundTime / processList.size();

        System.out.println("Average Wait Time: " + avgWaitTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
}
