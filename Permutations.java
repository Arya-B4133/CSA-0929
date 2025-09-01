public class Permutations {
    public static void main(String[] args) {
        int n = 147;
        String s = String.valueOf(n);
        permute(s.toCharArray(), 0);
    }
    static void permute(char[] arr, int l) {
        if (l == arr.length - 1) {
            System.out.println(Integer.parseInt(new String(arr)));
            return;
        }
        for (int i = l; i < arr.length; i++) {
            swap(arr, l, i);
            permute(arr, l + 1);
            swap(arr, l, i);
        }
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
