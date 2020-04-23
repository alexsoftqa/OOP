package list;

import java.util.Arrays;
import java.util.Scanner;

public class ListRunner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {    //  PSVM

        //VOT ON VINOVNIK TORCHESTVA       LIST
        ToDoList list = new ToDoList();

        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Please, enter a Task to add");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToList(task1);
                    System.out.println("Please, chose an action by typing [0-6] ");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Printing out ToDoList");
                    list.printToDoList();
                    System.out.println("Please, chose an action by typing [0-6] ");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Please, enter Task to update");
                    scanner.nextLine();
                    int i = scanner.nextInt();
                    System.out.println("Please, enter new Task");
                    scanner.nextLine();
                    String task3 = scanner.nextLine();
                    list.changeTask(i, task3);
                    System.out.println("Please, chose an action by typing [0-6] ");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Please, enter a Task to remove");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    System.out.println("Please, chose an action by typing [0-6] ");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Please enter a Task to get priority");
                    String task5 = scanner.nextLine();
                    System.out.println("Priority of the task is: " + list.getPriority(task5));
                    System.out.println("Please, chose an action by typing [0-6] ");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Pleaseenter a number of position for the Task");
                    scanner.nextLine();
                    int index = scanner.nextInt();
                    System.out.println("Please, enter a new Task");
                    scanner.nextLine();
                    String task6 = scanner.nextLine();
                    list.addToListAtPosition(index, task6);
                    System.out.println("Please, chose an action by typing [0-6] ");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }


    }    //  PSVM

    private static void printOut() {
        System.out.println("Please, chose an action, then Press :\n"
                + "1 to add a new Task in to ToDoList\n"
                + "2 to to print out the List\n"
                + "3 to update an existing Task\n"
                + "4 to remove an Task from the List\n"
                + "5 to get Task priority or number in the List\n"
                + "6 to add a new Task at specific position\n"
                + "0 for Exit \n"
                + "AFTER CHOOSING AN OPTION, PLEASE PRESS ENTER\n");
    }


}
