package Test_0306;

/*
202. 快乐数
编写一个算法来判断一个数是不是“快乐数”。
一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。

示例: 
输入: 19
输出: true
解释: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
/*
 *分析：
 *无限循环按照题目所给的方法计算，当计算结果为1时返回true,
 *返回false的条件是计算结果为4，因为只要陷入4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4这个循环，
 *就为不快乐数。
 */
//public class LeetcodeTest {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int n = 2;
//		System.out.println(So.isHappy(n));
//	}
//}
//class Solution {
//    public boolean isHappy(int n) {
//    	int t = n;
//    	int sum = 0;
//    	while(true){
//    		while(t != 0){
//            	sum += ((t%10)*(t%10));
//            	t /= 10;
//            }
//            if(sum == 1){
//            	return true;
//            }else if(sum == 4){
//            	return false;
//            }else{
//            	t = sum;
//            	sum = 0;
//            }
//    	}
//    }
//}
/*
 * 
258. 各位相加
 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
示例:
输入: 38
输出: 2 
解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
进阶:
你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 */
/*
 * 分析：
 * 方法一：
 * 循环法或递归法，直到各位相加结果是一位数返回。
 * 方法二：
 * 余九法：一个数对九取余，得到的数称之为九余数；一个数的九余数等于它的各个数位上的数之和的九余数。
 */
public class LeetcodeTest {
	public static void main(String[] args) {
		Solution So = new Solution();
		int num = 38;
		System.out.println(So.addDigits2(num));
	}
}
class Solution {
    public int addDigits1(int num) {
    	int sum = 0;
    	while(true){
        	while(num != 0){
            	sum += (num%10);
            	num /= 10;
            }
        	if(sum < 10){
        		return sum;
        	}
        	num = sum;
        	sum = 0;
    	}   
    }
    public int addDigits2(int num) {
    	return 1+(num-1)%9;//防止9被模掉，如18，结果应该为9
    }
}