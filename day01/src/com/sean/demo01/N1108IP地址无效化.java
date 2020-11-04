package com.sean.demo01;

public class N1108IP地址无效化 {
    public String defangIPaddr(String address) {
        address = address.replaceAll("\\.","[\\.]");
        return address;
    }

}
