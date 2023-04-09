package cz.cvut.fel.pjv;
 
public class NodeImpl implements Node {
    private Node left_node;
    private Node right_node;
    private int value;
    @Override
    public Node getLeft() {
        return left_node;
    }
 
    @Override
    public Node getRight() {
        return right_node;
    }
 
    @Override
    public int getValue() {
        return value;
    }
 
    public void setLeft_node(Node new_left) {
        this.left_node = new_left;
    }
 
    public void setRight_node(Node new_right) {
        this.right_node = new_right;
    }
 
    public void setValue(int value) {
        this.value = value;
    }
}
