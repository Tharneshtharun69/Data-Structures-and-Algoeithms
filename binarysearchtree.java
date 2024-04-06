import java.util.Scanner;

class binarysearchtree {
    public static int binary_search(int a[], int left, int right, int k) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == k) {
                return mid;
            }
            if (a[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80};
        int size = a.length;
        System.out.print("Enter the number to search: ");
        int search_item = sc.nextInt();
        int b = binary_search(a, 0, size - 1, search_item);
        if (b == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + b);
        }
    }
}
