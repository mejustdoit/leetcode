package com.mejustdoit.leetcode.custome;

import java.util.logging.Logger;

/**
 * 辗转相除法-最大公约数
 *
 * 定理: 两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数。
 * 证明:
 * 假设 c = gcd(a,b)   a = mc , b = nc ,
 * 由于 r = a - kb => r = (m - nk)c 可得余数的公约数是两个整数的公约数
 *
 * 假设 d = gcd(b, a % b)  xd = b, r = a - kb = yd
 * a = yd + kb => (kx + y)d => d 是a的公约数
 * 正反都成立所以得证 其公约数相同，最大公约数也必然相同
 *
 */
public class GreatestCommonDivisor {
    static Logger LOGGER = Logger.getLogger("GreatestCommonDivisor.class");
    public static void main(String[] args) {
        int a = 343543, b = 493943;
        LOGGER.info(" get getGcd is " + getGcd(a,b));
    }

    private static int getGcd(int p, int q){
        if(q == 0){
            return p;
        }
        int r = p % q;
        return getGcd(q,r);

    }
}
