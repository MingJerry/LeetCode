package EX07;

import java.util.Scanner;

/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Fanzhuan {
    public static int reverse(int x) {
        int rev=0;
        while(x!=0){
            int pop = x % 10;
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7 )) return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8 )) return 0;
            rev = rev * 10 +pop;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("输入待反转数");
        int inx = x.nextInt();
        x.close();
        int revx = reverse(inx);
        System.out.println(revx);
    }
}
// @lc code=end

