public class Stack {
    int maxSize;
    int[] stackArray;
    int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push element");
            return;
        }
        top++;
        stackArray[top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty, cannot pop element");
        }
        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is Empty, cannot peek");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        // Creating a stack of size 5
        Stack stack = new Stack(5);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
