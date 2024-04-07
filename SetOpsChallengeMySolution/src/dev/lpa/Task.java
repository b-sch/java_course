package dev.lpa;

import java.util.Objects;

public class Task implements Comparable<Task> {

    private String assignee;
    private String projectName;
    private String description;
    private Status status;
    private Priority priority;

    public Task(String assignee, String projectName, String description, Priority priority, Status status) {
        this.assignee = assignee;
        this.projectName = projectName;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(getProjectName(), task.getProjectName()) && Objects.equals(getDescription(), task.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProjectName(), getDescription());
    }

    @Override
    public int compareTo(Task task) {
        return 0;
    }

    @Override
    public String toString() {
        return "Assignee: %-10s Project Name: %-20s Description: %-30s Status: %-10s Priority: %-10s".formatted(assignee, projectName, description, status, priority);
    }
}
