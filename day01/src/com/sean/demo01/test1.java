package com.sean.demo01;

public class test1 {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p);
        System.out.println(p.toString());


    }

    public static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        //另外一个git操作
	}
    }

    //增加一个git更新操作
}
