package ToDo.com;
import java.util.ArrayList;
import java.util.Scanner;
class Task {
    private String title;
    private boolean isComplete;
    public Task(String title) {
        this.title = title;
        this.isComplete = false; 
    }
    public String getTitle() {
        return title;
    }
    public boolean isComplete() {
        return isComplete;
    }
    public void markComplete() {
        this.isComplete = true;
    }
    public void displayTask() {
        String status = isComplete ? "Completed" : "Not Completed";
        System.out.println(title + " - " + status);
    }
}
class ToDoList {
    private ArrayList<Task> tasks;
    public ToDoList() {
        tasks = new ArrayList<>();
    }
    public void addTask(String title) {
        Task newTask = new Task(title);
        tasks.add(newTask);
        System.out.println("Task added: " + title);
    }
    public void markTaskComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markComplete();
            System.out.println("Task marked as completed: " + tasks.get(index).getTitle());
        } else {
            System.out.println("Invalid task index.");
        }
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.print((i + 1) + ". ");
                tasks.get(i).displayTask();
            }
        }
    }
}
public class ToDoListApplication {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList todoList = new ToDoList();
        while (true) {          
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add a Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    todoList.addTask(title);
                    break;
                case 2:                
                    todoList.displayTasks();
                    System.out.print("Enter task number to mark as completed: ");
                    int taskIndex = scanner.nextInt();
                    todoList.markTaskComplete(taskIndex - 1); 
                    break;
                case 3:                   
                    todoList.displayTasks();
                    break;
                case 4:                 
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
