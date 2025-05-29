package wow.tree;

import java.util.Scanner;
import java.util.ArrayList;

public class Tree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner jm = new Scanner(System.in);
        ArrayList<Integer> AllowancesList = new ArrayList<>();

        tree.insert(100);
        tree.insert(6);
        tree.insert(100);
        tree.insert(345);
        tree.insert(78);
        tree.insert(23);
        tree.insert(0);

        boolean running = true;

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Display Allowances");
            System.out.println("2. Add Allowances");
            System.out.println("3. Exit Program");
            System.out.print("Choose Option: ");

            int choice = jm.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- ALLOWANCES LIST (Descending) ---");
                    descending(tree.root, AllowancesList);
                    if (AllowancesList.isEmpty()) {
                        System.out.println("\nNo allowances added yet.");
                    } else {
                        for (int value : AllowancesList) {
                            System.out.println(value);
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n--- ADD ALLOWANCE ---");
                    System.out.print("Input Allowance: ");
                    int allowance = jm.nextInt();
                    tree.insert(allowance);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void descending(Node root, ArrayList<Integer> AllowancesList) {
        if (root != null) {
            descending(root.right, AllowancesList);
            AllowancesList.add(root.value);
            descending(root.left, AllowancesList);
        }
    }
}
