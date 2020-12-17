package com.gao.controller;

/**
 * @program: tx_springcloud_02
 * @description: 测试内部类的方法调用关系
 * @author: gaowz
 * @create: 2020-12-10 10:56
 **/
public class TestInnorMethod {

    private int  age;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public TestInnorMethod(){

    }

    public TestInnorMethod(TestInnorMethod testInnorMethod){
        this.age = testInnorMethod.getAge();
    }

    public static class Build{

        private String name;
        private TestInnorMethod testInnorMethod;

        public Build(){
            testInnorMethod = new TestInnorMethod();
        }

        public Build age(int age){
            testInnorMethod.setAge(age);
            return this;
        }
        public TestInnorMethod build(){
            return new TestInnorMethod(testInnorMethod);
        }
    }
}
