package src.FP01.priorityQueue.withDifferentPriorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Task {
    String name;
    int priority;
    int rank;

    public Task(String name, int priority, int rank) {
        this.name = name;
        this.priority = priority;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", rank=" + rank + "}";
    }
}

public class SortedListExample {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();

        // Adding tasks to the list
        taskList.add(new Task("Write report", 2, 5));
        taskList.add(new Task("Pay bills", 1, 3));
        taskList.add(new Task("Attend meeting", 3, 4));

        // Custom comparator to sort tasks based on their priority
        Comparator<Task> priorityComparator = Comparator.comparingInt(task -> task.priority);

        // Sort the list
        Collections.sort(taskList, priorityComparator);

        System.out.println("Tasks sorted by priority:");
        for (Task task : taskList) {
            System.out.println(task);
        }

        // Custom comparator to sort tasks based on their rank
        Comparator<Task> rankComparator = Comparator.comparingInt(task -> task.rank);

        // Sort the list
        Collections.sort(taskList, rankComparator);

        System.out.println("Tasks sorted by rank:");
        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}
