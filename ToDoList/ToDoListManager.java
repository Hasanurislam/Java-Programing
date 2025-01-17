import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    static class Task {
        private String description;
        private boolean isComplete;

        public Task(String description) {
            this.description = description;
            this.isComplete = false;
        }

        public void markComplete() {
            this.isComplete = true;
        }

        public String getDescription() {
            return description;
        }

        public boolean isComplete() {
            return isComplete;
        }

        @Override
        public String toString() {
            return (isComplete ? "[✔]" : "[ ]") + " " + description;
        }
    }

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in your to-do list.");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Task removed: " + tasks.get(index).getDescription());
            tasks.remove(index);
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void markTaskComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            System.out.println("Task marked as complete: " + tasks.get(index).getDescription());
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoListManager manager = new ToDoListManager();

        while (true) {
            System.out.println("\nTo-Do List Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Mark Task as Complete");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    manager.viewTasks();
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    manager.removeTask(removeIndex);
                    break;
                case 4:
                    manager.viewTasks();
                    System.out.print("Enter task number to mark as complete: ");
                    int completeIndex = scanner.nextInt() - 1;
                    manager.markTaskComplete(completeIndex);
                    break;
                case 5:
                    System.out.println("Exiting To-Do List Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
