import com.sun.deploy.panel.ITreeNode;
import jdk.nashorn.internal.ir.Flags;
import jdk.nashorn.internal.ir.FunctionNode;
import sun.print.SunMinMaxPage;

import javax.xml.stream.events.Characters;
import javax.xml.ws.Response;
import java.time.temporal.ValueRange;
import java.util.*;
import java.util.function.IntPredicate;

/**
 * @author 海绵宝宝
* @create 2020- 03- 02 20:43
 **/
public class Solution {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public static int Func(int n){
//        if (n==1||n==0)return n;
//        return Func(n-1)+Func(n-2);
        return (n==1||n==0)?n : Func(n-1)+Func(n-2);
    }
    public static int[] quick_sort(int left,int right,int[]nums){
        if (left>=right)return nums;
        int l = left;
        int r = right;
        int base = nums[left];
        while (l<r){
            if (l<r&&nums[r]>=base)r--;
            if (l<r&&nums[l]<=base)l++;
            if (l<r){
                int tmp = nums[r];
                nums[r]=nums[l];
                nums[l]=tmp;
            }
        }
        nums[left]=nums[l];
        nums[l]=base;
        //l 3 6 5 2 1 4
        // 1 2 3 6 5 4
        quick_sort(left,l-1,nums );
        quick_sort(l+1, right, nums);
        return nums;
    }
    public static void Hanoi(String A,String B,String C,int k){
        if (k==1){
            System.out.println(A+"---->"+C);
            return;
        }
        Hanoi(A,C, B, k-1);
        System.out.println(A+"---->"+C);
        Hanoi(B, A, C, k-1);
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(),ans = 0;
        Map<Character,Integer>map = new HashMap<>();
        for (int j = 0,i=0; j < n; j++) {
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m==0){
            if (n%2!=0){
                return 1.0*nums2[n/2];
            }
            return (nums2[n/2]+nums2[n/2-1])/2.0;
        }
        if (n==0){
            if (m%2!=0){
                return 1.0*nums1[m/2];
            }
            return (nums1[m/2]+nums1[m/2-1])/2.0;
        }
        int total = n+m;
        if ((total&1)==1){
            return find_kth(nums1,0,nums2,0,total/2+1);
        }else{
            return (find_kth(nums1,0,nums2,0,total/2)+find_kth(nums1,0,nums2,0,total/2+1))/2;
        }
    }

    private double find_kth(int[] nums1, int a_begin, int[] nums2, int b_begin,int k) {
        if (a_begin>=nums1.length)
            return nums2[b_begin+k-1];
        if (b_begin>=nums2.length)
            return nums1[a_begin+k-1];
        if (k==1)
                return Math.min(nums1[a_begin],nums2[b_begin]);
        int mid_a = Integer.MAX_VALUE;
        int mid_b = Integer.MAX_VALUE;
        if (a_begin+k/2-1<nums1.length)
            mid_a = nums1[a_begin+k/2-1];
        if (b_begin+k/2-1<nums2.length)
            mid_b = nums2[b_begin+k/2-1];
        if (mid_a<mid_b)
            return find_kth(nums1, a_begin+k/2, nums2, b_begin, k-k/2);
        return find_kth(nums1, a_begin, nums2, b_begin+k/2, k-k/2);


    }

    public boolean isValid(String s) {
        Map<Character,Character>map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ("(".equals(Character.toString(s.charAt(i)))||"[".equals(Character.toString(s.charAt(i)))||"{".equals(Character.toString(s.charAt(i)))){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty())return false;
                Character c = stack.pop();
                if (c.equals(map.get(s.charAt(i)))==false)
                    return false;

            }

        }
        if(stack.isEmpty())
         return  true;
        return false;

    }
    public int[][] findContinuousSequence(int target) {
       int i = 1;
       int j = 1;
       int sum = 0;
       List<int[]>res = new ArrayList<>();
       while (i<=target/2){
           if (sum<target){
               sum+=j;
               j++;
           }else if(sum>target){
               sum-=i;
               i++;
           }else{
               int[]arr = new int[j-i];
               for (int k = i; k < j; k++) {
                   arr[k-i] = k;
               }
               res.add(arr);
               sum-=i;
               i++;
           }
       }
        return res.toArray(new int[res.size()][]);

    }
    class MaxQueue {
        private Deque<Integer>queue;
        private Deque<Integer>help;


        public MaxQueue() {
            queue = new ArrayDeque<>();
            help = new ArrayDeque<>();
        }

        public int max_value() {
            return queue.isEmpty()?-1:help.peek();
        }

        public void push_back(int value) {
            queue.offer(value);
            while (!help.isEmpty()&&value>help.peekLast()){
                help.pollLast();
            }
            help.offer(value);
        }

        public int pop_front() {
            if (queue.isEmpty())return -1;
            int val = queue.pop();
            if (help.peek()==val){
                help.pop();
            }
            return val;
        }
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int low =0;
            for (int i = 1; i <nums.length ; i++) {
                if (nums[low]!=nums[i]){
                    nums[low]=nums[i];
                    low++;
                }
            }
            return low+1;

        }
        public int coinChange(int[] coins, int amount) {

            int[]dp = new int[amount+1];
            for (int i = 0; i < dp.length; i++) {
                for (int coin :
                        coins) {
                    if (i - coin < 0)continue;
                    dp[i]=Math.min(dp[i],dp[i-coin]);
                }
            }
            return (dp[amount]==amount+1)?-1:dp[amount];
        }
        public int maxProfit(int[] prices) {
//            int max = 0;
//            for (int i = 0; i < prices.length; i++) {
//                for (int j = i+1; j <prices.length ; j++) {
//                    if (prices[j]>prices[i]){
//                        max = max >(prices[j]-prices[i])?max:(prices[j]-prices[i]);
//                    }
//                }
//            }
//            return max;
            if (prices.length<=1)return 0;
            int min = prices[0],max = 0;
            for (int i = 1; i < prices.length; i++) {
                max = Math.max(max, prices[i]-min);
                min = Math.min(min, prices[i]);
            }
            return max;
        }
        private int max;

        public int diameterOfBinaryTree(TreeNode root) {
              depth(root);
              return max;
        }
        private int depth(TreeNode root){
            int left = depth(root.left);
            int right = depth(root.right) ;
            max = Math.min(left+ right,max);
            return Math.max(left,right )+1;

        }
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[]arr = new int[nums1.length];

            Arrays.fill(nums1, -1);
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < nums2.length; j++) {
                    if (nums1[i]==nums2[j]){
                        int k = j;
                        while (k<nums2.length){
                            if (nums1[i]<nums2[k]){
                                arr[i]=nums2[k];
                                break;
                            }
                            k++;
                        }

                    }
                }

            }
            return arr;
        }




    }


}
