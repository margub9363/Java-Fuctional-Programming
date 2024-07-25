package src.FP01.priorityQueue;

import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class CustomPriorityQueueExample {
    public static void main(String[] args) {
        // Custom comparator to prioritize tasks based on their priority value
        Comparator<Task> taskComparator = (task1, task2) -> Integer.compare(task1.priority, task2.priority);

        // Creating a PriorityQueue with the custom comparator
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(taskComparator);

        // Adding tasks to the PriorityQueue
        taskQueue.add(new Task("Write report", 2));
        taskQueue.add(new Task("Pay bills", 1));
        taskQueue.add(new Task("Attend meeting", 3));

        // Removing tasks from the PriorityQueue
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing task: " + taskQueue.poll());
        }
    }
}
