package dao;

import model.TodoTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TodoDAOImpl implements TodoDAO {
    private List<TodoTask> tasks;
    private static final String FILE_NAME = "tasks.dat";

    public TodoDAOImpl() {
        tasks = new ArrayList<>();
        loadTasksFromFile();
    }

    private void loadTasksFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            tasks = (List<TodoTask>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("No previous data found. Starting with an empty task list.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void saveTasksToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<TodoTask> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public TodoTask getTaskById(int taskId) {
        // реализация получения задачи по ID
        return null;
    }

    @Override
    public void addTask(TodoTask task) {
        // реализация добавления задачи
    }

    @Override
    public void updateTask(TodoTask task) {
        // реализация обновления задачи
    }

    @Override
    public void deleteTask(int taskId) {
        // реализация удаления задачи
    }
}
