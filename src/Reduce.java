public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int ans = 0;

        while (i!=0) {
            if (i%2==0) {
                i = i/2;
                ans++;
            } else if (i%1==0) {
                i = i-1;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
