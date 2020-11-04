package com.sean.demo01;

import java.util.HashMap;

/**
 * 请你给一个停车场设计一个停车系统。
 * 停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
 * */
public class N1603停车系统 {

    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1, 0);
        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
        System.out.println(obj.addCar(1));
    }

    /*
    * 实现思路：
    * 1.系统需要初始化三种类型的车位总数量
    * 2.系统在接收到对应类型的停车请求方法调用后，判断是否有足够的车位停靠
    * 3.若数量充足，则返回true并且重新计算剩余车位数量
    * 4.若数量不够，则返回false*/
    public static class ParkingSystem {

        public HashMap<Integer,Integer> leftSpace = new HashMap<>();

        public ParkingSystem(int big, int medium, int small) {
            leftSpace.put(1,big);
            leftSpace.put(2,medium);
            leftSpace.put(3,small);
        }

        public boolean addCar(int carType) {
            int tmp = leftSpace.get(carType)- 1;
            switch (carType){
                case 1:
                    if ( tmp >= 0){
                        leftSpace.put(carType,tmp);
                        return true;
                    }
                    return false;
                case 2:
                    if ( tmp >= 0){
                        leftSpace.put(carType,tmp);
                        return true;
                    }
                    return false;
                case 3:
                    if ( tmp >= 0){
                        leftSpace.put(carType,tmp);
                        return true;
                    }
                    return false;
            }
            return false;
        }
    }
}
