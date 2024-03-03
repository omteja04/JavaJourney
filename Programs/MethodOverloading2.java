package Programs;

public class MethodOverloading2 {
    static void max(int a, int b) {
        System.out.println(a > b ? a : b);
    }

    static void max(int a, int b, int c) {
        System.out.println((a > b && a > c) ? a : (b > c ? b : c));
    }

    static void max(int[] arr, int n) {
        int maxi = arr[0];
        for (int i : arr) {
            if (maxi < i)
                maxi = i;
        }
        System.out.println(maxi);
    }

    public static void main(String[] args) {
        max(1, 2);
        max(3, 2, 1);
        max(new int[] { 1, 2, 3, 4 }, 4);
    }
}
