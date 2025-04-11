import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<Task>();

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added✅");
    }
    public void viewTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks yet📭");
            return;
        }
        System.out.println("Your Tasks📖:");
        int counter = 1;
        for (Task task : tasks) {
            System.out.println(counter + ". " + task);
            counter++;
        }
    }
    public void removeTask(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number❌");
        }else{
            Task removed = tasks.remove(index - 1);
            System.out.println("Removed🗑️: " + removed);
        }
    }
}
