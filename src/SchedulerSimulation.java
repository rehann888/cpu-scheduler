import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SchedulerSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Process> processes = new ArrayList<>();

        System.out.println("Enter the number of processes:");
        int numProcesses = scanner.nextInt();

        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Enter process ID, arrival time and burst time for process " + (i + 1) + ":");
            int id = scanner.nextInt();
            int arrivalTime = scanner.nextInt();
            int burstTime = scanner.nextInt();
            processes.add(new Process(id, arrivalTime, burstTime));
        }

        System.out.println("Enter the time quantum for Round Robin Scheduler:");
        int timeQuantum = scanner.nextInt();

        System.out.println("FIFO Scheduler:");
        Scheduler fifo = new FIFOScheduler();
        for (Process p : processes) {
            fifo.addProcess(p);
        }
        fifo.schedule();
        GanttChart.display(fifo.getProcessList());
        Statistics.calculate(fifo.getProcessList());

        System.out.println("\nRound Robin Scheduler (Time Quantum = " + timeQuantum + "):");
        Scheduler rr = new RoundRobinScheduler(timeQuantum);
        for (Process p : processes) {
            rr.addProcess(p);
        }
        rr.schedule();
        GanttChart.display(rr.getProcessList());
        Statistics.calculate(rr.getProcessList());

        System.out.println("\nSJF Scheduler:");
        Scheduler sjf = new SJFScheduler();
        for (Process p : processes) {
            sjf.addProcess(p);
        }
        sjf.schedule();
        GanttChart.display(sjf.getProcessList());
        Statistics.calculate(sjf.getProcessList());

        scanner.close();
    }
}
