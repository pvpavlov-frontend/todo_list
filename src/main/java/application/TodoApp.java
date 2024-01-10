package application;

import dao.TodoDAO;
import dao.TodoDAOImpl;
import model.TodoTask;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TodoApp {
    private static TodoDAO todoDAO = new TodoDAOImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int choice;
        do {
            System.out.println("Todo List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Search by Keyword");
            System.out.println("6. View Tasks for a Period");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewAllTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    searchByKeyword();
                    break;
                case 6:
                    viewTasksForPeriod();
                    break;
                case 0:
                    System.out.println("Exiting Todo List Application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }

    private static void addTask() {
        // реализация добавления задачи
    }

    private static void viewAllTasks() {
        // реализация просмотра всех задач
    }

    private static void updateTask() {
        // реализация обновления задачи
    }

    private static void deleteTask() {
        // реализация удаления задачи
    }

    private static void searchByKeyword() {
        // реализация поиска по ключевому слову
    }

    private static void viewTasksForPeriod() {
        // реализация просмотра задач за указанный период времени
    }
}
