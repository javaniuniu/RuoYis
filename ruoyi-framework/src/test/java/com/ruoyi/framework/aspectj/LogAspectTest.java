package com.ruoyi.framework.aspectj;


import org.apache.commons.lang3.builder.ToStringExclude;

/**
 * @Author: java牛牛
 * @Web: http://javaniuniu.com
 * @GitHub https://github.com/minplemon
 * @Date: 2020/3/10 8:49 PM
 */
public class LogAspectTest {
    public static void main(String[] args) {
        LogAspectTest logAspectTest = new LogAspectTest();
        logAspectTest.setUser();

    }

    public void setUser() {
        User user = new User();
        user.setId(1);
        setUser2(user);
    }

    public void setUser2(User user2) {
        user2.setName("minp");
        setUser3(user2);
    }

    public void setUser3(User user3) {
        user3.setAge(17);
    }

    class User {
        int id;
        String name;
        int age;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}