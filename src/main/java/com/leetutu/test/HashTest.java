package com.leetutu.test;

public class HashTest {
    public static void main(String[] args) {
        System.out.println(HashTest.hash(10));
    }

    private static int hash(int h){
        h+=(h<<15)^0xffffcd7d;
        h^=(h>>>10);
        h+=(h<<3);
        h^=(h>>>6);
        h+=(h<<2)+(h<<14);
        return h^(h>>>16);
    }
}
