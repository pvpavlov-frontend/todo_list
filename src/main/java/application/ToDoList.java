package application;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }
    public void removeTask(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            System.out.println("Task deleted: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }
    public void displayTasks() {
        System.out.println("Task list:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add task");
            System.out.println("2. Delete task");
            System.out.println("3. Show tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a task to add:");
                    scanner.nextLine(); // Consume the newline character
                    String newTask = scanner.nextLine();
                    toDoList.addTask(newTask);
                    break;
                case 2:
                    System.out.println("Enter the task to delete:");
                    scanner.nextLine(); // Consume the newline character
                    String taskToRemove = scanner.nextLine();
                    toDoList.removeTask(taskToRemove);
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Exit the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Incorrect choice. Please enter a number from 1 to 4.");
            }
        }
    }
}