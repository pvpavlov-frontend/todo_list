package model;

import java.time.LocalDate;
import java.util.Objects;

public class TodoTask {
    private String title;
    private String content;
    private LocalDate dueDate;

    public TodoTask(String title, String content, LocalDate dueDate) {
        this.title = title;
        this.content = content;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoTask todoTask = (TodoTask) o;
        return Objects.equals(title, todoTask.title) && Objects.equals(content, todoTask.content) && Objects.equals(dueDate, todoTask.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, dueDate);
    }

    @Override
    public String toString() {
        return "TodoTask{" +
            "title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", dueDate=" + dueDate +
            '}';
    }
}
