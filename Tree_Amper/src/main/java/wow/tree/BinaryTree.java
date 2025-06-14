/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wow.tree;

public class BinaryTree {

    Node root;

    public void insert(int value) {
        root = insertRec(root, value);

    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }
    
    public void inorder(){inorderRec(root);}
    
    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.value + " ");
            inorderRec(root.right);
        }
    }

}
