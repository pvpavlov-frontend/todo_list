package dao;

import model.TodoTask;

import java.util.List;

public interface TodoDAO {
    List<TodoTask> getAllTasks();
    TodoTask getTaskById(int taskId);
    void addTask(TodoTask task);
    void updateTask(TodoTask task);
    void deleteTask(int taskId);
}
