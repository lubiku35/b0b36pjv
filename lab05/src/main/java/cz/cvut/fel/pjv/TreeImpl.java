package cz.cvut.fel.pjv;
 
public class TreeImpl implements Tree{
    private Node root;
    private int START = 0;
    @Override
    public void setTree(int[] values) {
        root = generateTree(values, START, values.length);
    }
 
    public Node generateTree(int[] values, int start, int end) {
        if (start > end || start == end) { return null;}
        int middle_value = (start + end) / 2;
        NodeImpl curr_node = new NodeImpl();
        curr_node.setLeft_node(generateTree(values, start, middle_value));
        curr_node.setRight_node(generateTree(values, middle_value + 1, end));
        curr_node.setValue(values[middle_value]);
        return curr_node;
    }
    @Override
    public Node getRoot() {
        return root;
    }
 
    @Override
    public String toString() {
        return recursiveOutput(root, START);
    }
 
    private String recursiveOutput(Node node, int floor_level) {
        String output = "";
        if (node == null) { return ""; }
        for (int i = 0; i < floor_level; i++) { output += " "; }
        output += "- " + node.getValue() + "\n";
        if (node.getLeft() != null ) { output += recursiveOutput(node.getLeft(), floor_level + 1); }
        if (node.getRight() != null ) { output += recursiveOutput(node.getRight(), floor_level + 1); }
        return output;
    }
}
