package com.DesignPattern.flyweight;

public class ConcreteWebsite extends Website{
    private String type;//网站的内容在哪里发布

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("website published [" + type + "], " + user.getName() + " is using");
    }


}
