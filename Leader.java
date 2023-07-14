import java.util.Scanner;
public class Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findLeaders(arr, n);
        sc.close();
    }

    public static void findLeaders(int[] arr,int n) {
        int flag = 0;
        for(int i=0;i<n-1;i++) {
            flag = 0;
            for(int j=i+1;j<n;j++) {
                if(arr[i]<arr[j]) {
                    flag = 1;
                }
            }
            if(flag == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println(arr[n-1]);
    }
}