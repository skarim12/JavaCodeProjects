package sjuJavaprojects;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BuildBST {

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;

        System.out.print("How many items? ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = insert(root, value);
        }

        System.out.println("\nInorder Traversal of BST:");
        inorder(root);

        sc.close();
    }
}