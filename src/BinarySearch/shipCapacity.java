package BinarySearch;

public class shipCapacity {
    public static void main(String[] args) {
        int[] weight = {3, 2, 2, 4, 1, 4};
        int days = 3;
        System.out.println(shipWithinDays(weight, days));
    }

    public static int shipWithinDays(int[] weight, int days) {
        int start = 0, end = 0;
        for (int w : weight) {
            start = Math.max(start, w);
            end += w;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int neededDays = findDays(weight, mid);

            if (neededDays <= days) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int findDays(int[] weight, int capacity) {
        int days = 1;
        int sum = 0;
        for (int w : weight) {
            if (sum + w > capacity) {
                days++;
                sum = 0;
            }
            sum += w;
        }
        return days;
    }
}

