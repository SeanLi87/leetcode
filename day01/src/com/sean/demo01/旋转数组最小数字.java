package com.sean.demo01;

/*

标签：二分法，递归

我们考虑数组中的最后一个元素x：在最小值右侧的元素，它们的值一定都小于等于x；
而在最小值左侧的元素，它们的值一定都大于等于x。因此，我们可以根据这一条性质，通过二分查找的方法找出最小值。
作者：LeetCode-Solution
链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/solution/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-by-leetcode-s/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

 * 查找旋转数组的最小值
 * 思路：
 * 1.获取到中间的元素
 *   1.1 和最右侧元素比较，如果小于最右侧元素，说明最小值在左侧： 如果左侧有元素，则继续二分，如果左侧没有元素，则当前元素为最小值；
 *   1.2 和最右侧元素比较，如果大于最右侧元素，说明最小值在右侧： 如果右侧有元素，则继续二分，如果右侧没有元素，则当前元素为最小值‘’
 *   1.2 和最右侧元素比较，如果相等，则忽略最右端点
 *
 * */
public class 旋转数组最小数字 {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 3};
        System.out.println(minArray(numbers));
    }

    public static int minArray(int[] numbers) {

        int mid = numbers.length / 2;
        int end = numbers.length - 1;
        int result = 0;
        System.out.println(mid + ":" + end);

        while (mid != end) {
            //和最右侧元素比较，如果小于最右侧元素，说明最小值在左侧： 如果左侧有元素，则继续二分，如果左侧没有元素，则当前元素为最小值
            if (numbers[mid] < numbers[end]) {
                end = mid;
                mid = mid / 2;
            } else if (numbers[mid] > numbers[end]) {
                mid = mid + (end - mid) / 2 + (end - mid) % 2;
            } else {
                end = end - 1;
                mid = end / 2;
            }
        }

        if (numbers.length == 2) {
            result = numbers[0] > numbers[1] ? numbers[1] : numbers[0];
        } else {
            result = numbers[mid];
        }

        return result;
    }

}
