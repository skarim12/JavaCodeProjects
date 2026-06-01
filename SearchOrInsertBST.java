package sjuJavaprojects;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class SearchOrInsertBST {

    static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static boolean search(TreeNode root, int value) {
        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }

    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeNode root = null;

        int[] values = {50, 30, 70, 20, 40, 60};

        for (int value : values) {
            root = insert(root, value);
        }

        System.out.print("Enter value to search/add: ");
        int target = sc.nextInt();

        if (search(root, target)) {
            System.out.println("Item found in BST.");
        } else {
            System.out.println("Item not found. Adding item...");
            root = insert(root, target);
        }

        System.out.println("\nUpdated BST (Inorder):");
        inorder(root);

        sc.close();
    }
}