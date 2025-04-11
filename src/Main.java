import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    System.out.println("Enter task description: ");
                    String description = sc.nextLine();
                    manager.addTask(description);
                    break;
                case "2":
                    manager.viewTasks();
                    break;
                case "3":
                    System.out.println("Enter task number to remove: ");
                    int TaskNum;
                    try{
                        TaskNum = Integer.parseInt(sc.nextLine());
                        manager.removeTask(TaskNum);
                    }catch (NumberFormatException e){
                        System.out.println("Please enter a valid task number⚠️");

                    }
                    break;
                case "4":
                    System.out.println("Goodbye👋!");
                    return;
                default:
                    System.out.println("Invalid option❓");
            }
        }
    }
}
