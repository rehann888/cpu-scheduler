# Java Scheduler Project

## Overview

This project implements various CPU scheduling algorithms including First-In-First-Out (FIFO), Round Robin, and Shortest Job First (SJF). The project also includes additional features such as visualizing Gantt charts, calculating scheduling statistics, and providing a dynamic user interface for process input and algorithm selection.

## Features

1. **Scheduling Algorithms**:
   - FIFO (First-In-First-Out)
   - Round Robin
   - SJF (Shortest Job First)

2. **Visualization**:
   - Displays Gantt charts for process scheduling.

3. **Statistics**:
   - Calculates average waiting time, average turnaround time, and CPU utilization for each scheduling algorithm.

4. **Dynamic Input**:
   - Provides a GUI to add processes dynamically and select scheduling algorithms.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (IntelliJ IDEA, Eclipse, VSCode, etc.)

### Installation

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/rehann888/cpu-scheduler.git
   cd SchedulerSimulation

2. **Open the project in your IDE.**

3. **Build the project.**

### Usage
To run the simulation:

- Open `Main.java`.
- Run the `Main method`.
- Follow the GUI prompts to input process details and select the scheduling algorithm.

### Input Example
The input for the processes can be entered dynamically through the GUI. The input includes:

- Process ID
- Arrival Time
- Burst Time
- Time Quantum (for Round Robin Scheduler)

### Example Output
The output will include:

- A Gantt Chart visualizing the scheduling.
- Statistics such as average waiting time, average turnaround time, and CPU utilization.



