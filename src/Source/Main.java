package Source;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack(); // Create a MinStack with capacity of 10

        // Test Case 1
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        System.out.println("Min after pushing 3, 2, 5, 1: " + minStack.min()); // Output: 1

        // Test Case 2
        minStack.pop();  // Removes 1
        System.out.println("Min after popping: " + minStack.min()); // Output: 2

        // Test Case 3
        minStack.push(1);
        System.out.println("Min after pushing 1: " + minStack.min()); // Output: 1

        // Test Case 4
        minStack.pop();  // Removes 1
        minStack.pop();  // Removes 2
        System.out.println("Min after popping 1 and 2: " + minStack.min()); // Output: 3
    }
}
