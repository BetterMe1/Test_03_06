package Test_0306;

/*
202. ������
��дһ���㷨���ж�һ�����ǲ��ǡ�����������
һ����������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�
Ȼ���ظ��������ֱ���������Ϊ 1��Ҳ����������ѭ����ʼ�ձ䲻�� 1��������Ա�Ϊ 1����ô��������ǿ�������

ʾ��: 
����: 19
���: true
����: 
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */
/*
 *������
 *����ѭ��������Ŀ�����ķ������㣬��������Ϊ1ʱ����true,
 *����false�������Ǽ�����Ϊ4����ΪֻҪ����4 �� 16 �� 37 �� 58 �� 89 �� 145 �� 42 �� 20 �� 4���ѭ����
 *��Ϊ����������
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
258. ��λ���
 ����һ���Ǹ����� num������������λ�ϵ�������ӣ�ֱ�����Ϊһλ����
ʾ��:
����: 38
���: 2 
����: ��λ��ӵĹ���Ϊ��3 + 8 = 11, 1 + 1 = 2�� ���� 2 ��һλ�������Է��� 2��
����:
����Բ�ʹ��ѭ�����ߵݹ飬���� O(1) ʱ�临�Ӷ��ڽ�����������
 */
/*
 * ������
 * ����һ��
 * ѭ������ݹ鷨��ֱ����λ��ӽ����һλ�����ء�
 * ��������
 * ��ŷ���һ�����Ծ�ȡ�࣬�õ�������֮Ϊ��������һ�����ľ������������ĸ�����λ�ϵ���֮�͵ľ�������
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
    	return 1+(num-1)%9;//��ֹ9��ģ������18�����Ӧ��Ϊ9
    }
}