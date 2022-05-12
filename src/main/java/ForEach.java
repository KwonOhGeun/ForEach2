public class ForEach {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : n) {
            sum += num;
        }
        System.out.println(sum);
    }
}
