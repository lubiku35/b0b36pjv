package cz.cvut.fel.pjv;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    protected String[] circular_array_queue;
    protected int size;
    protected int capacity;
    protected int front_pointer;
    protected int rear_pointer;

    public CircularArrayQueue() {
        this.capacity = 5;
        this.circular_array_queue = new String[5];
        this.front_pointer = 0;
        this.rear_pointer = 0;
    }

    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.circular_array_queue = new String[capacity];
        this.front_pointer = 0;
        this.rear_pointer = 0;
    }

    @Override
    public int size() {
        return size;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public boolean enqueue(String obj) {
        if (this.isFull()) { return false; }
        else {
            size++;
            circular_array_queue[rear_pointer] = obj;
            rear_pointer = (rear_pointer + 1) % capacity;
            return true;
        }
    }

    @Override
    public String dequeue() {
        if (this.isEmpty()) {
            return null;
        } else {
            size--;
            String front_circular_array_queue = circular_array_queue[front_pointer];
            front_pointer = (front_pointer + 1) % capacity;
            return  front_circular_array_queue;
        }
    }

    @Override
    public void printAllElements() {
        for (int i = front_pointer; i < rear_pointer; i++) {
            System.out.println(circular_array_queue[i]);
        }
    }
}