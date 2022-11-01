package javaptit;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class J01012_UocSoChiaHet2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println(0);
            } else {
                int k = (int) sqrt(n);
                int cnt1 = 0;
                int cnt2 = 0;
                int ans = 0;
                if (k * k == n) {
                    if (k % 2 == 0) {
                        cnt1 = 1;
                    } else {
                        cnt2 = 0;
                    }
                    for (int i = 1; i < k; i++) {
                        if (n % i == 0) {
                            if (i % 2 == 0 && (n / i) % 2 == 0) {
                                cnt1 += 2;
                                cnt2 += 2;
                            } else if (i % 2 == 0 || (n / i) % 2 == 0) {
                                cnt1 ++;
                                cnt2 ++;
                            }
                        }
                    }
                    if (k % 2 == 0) {
                        System.out.println(cnt1);
                    } else {
                        System.out.println(cnt2);
                    }
                } else {
                    for (int i = 1; i <= k; i++) {
                        if (n % i == 0) {
                            if (i % 2 == 0 && (n / i) % 2 == 0) {
                                ans += 2;
                            } else if (i % 2 == 0 || (n / i) % 2 == 0) {
                                ans++;
                            }
                        }
                    }
                    System.out.println(ans);
                }
            }
        }
    }
}