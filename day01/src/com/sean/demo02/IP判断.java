package com.sean.demo02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IP判断 {

    /**
     * 1.null,空字符串
     * 2.正常ip字符串
     * 3.包含0和255的字符串
     * 4.小于0和大于255的字符串
     * 5.非四段格式字符串
     * 6.包含非数字字符的字符串
     */

    @Test
    void test1() {

        /**
         * 正常场景*/
        //标准ip字符串
        Assertions.assertTrue(ifIp("1.1.1.1"));
        //标准ip字符串，包含0和255边界
        Assertions.assertTrue(ifIp("0.0.0.255"));

        /**异常场景
         * */
        //null
        Assertions.assertFalse(ifIp(null));
        //空字符串
        Assertions.assertFalse(ifIp(""));
        //包含小于0的字符串
        Assertions.assertFalse(ifIp("1.1.1.-1"));
        //包含大于255的字符串
        Assertions.assertFalse(ifIp("1.1.1.256"));
        //非四段格式字符串
        Assertions.assertFalse(ifIp("1.1.1"));
        Assertions.assertFalse(ifIp("1.1.1.1.1"));
        Assertions.assertFalse(ifIp(".1.1.1.1"));
        Assertions.assertFalse(ifIp("1.1.1.1."));
        Assertions.assertFalse(ifIp("1.1.1."));
        Assertions.assertFalse(ifIp(".1.1.1"));
        Assertions.assertFalse(ifIp("1.1..1.1"));
        Assertions.assertFalse(ifIp("1.1..1"));
        //包含非数字字符的字符串
        Assertions.assertFalse(ifIp("1.1.1.a"));
        Assertions.assertFalse(ifIp("1.1.1.*"));
        //分隔符错误
        Assertions.assertFalse(ifIp("1&1&1&1"));
        Assertions.assertFalse(ifIp("aaa"));



    }

    public static void main(String[] args) {

        String nums1 = "123";
        String nums2 = "456";



    }


    public static boolean ifIp(String ip) {
        if (ip == null || ip.trim().length()==0) {
            return false;
        }
        String[] nodes = ip.split("\\.");
        if (nodes.length != 4) {
            return false;
        }
        if (ip.charAt(ip.length() - 1) == '.') {
            return false;
        }
        try {
            for (String node : nodes) {
                if (Integer.valueOf(node) >= 0 && Integer.valueOf(node) <= 255) {
                    continue;
                }
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
