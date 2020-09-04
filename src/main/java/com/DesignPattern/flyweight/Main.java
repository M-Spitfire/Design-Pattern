package com.DesignPattern.flyweight;

/**
 * 享元模式
 *
 * 当类似的对象非常多时, 非常适合使用享原模式
 * 将相同的内容抽取出来进行共享
 *
 * 在这个例子中, website属于共享的内容, Pool根据不同的需求创建出稍有不同的website, 并充当缓存的作用
 * User属于不共享的内容, 同一个website可以有不同的user使用
 *
 * 有一个更好的例子: 围棋
 *      共享的内容就是棋子, 如果每一次落子都创建一个新的棋子对象, 显然是比较浪费内存的
 *      我们可以用享元模式的思路
 *      使用一个Pool创建出黑白两种棋子, 在落子时使用Pool里面创建好的棋子即可的
 *      当然还有一个不共享的内容: 棋子的坐标
 *      这样的方式实现, 不管棋盘上有多少棋子, 实际上都只有Pool中的一黑一白两个棋子, 其余的只是引用
 *
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("john");
        User user1 = new User("lily");

        Website website = WebsitePool.getWebsite("NEWS");
        Website website1 = WebsitePool.getWebsite("TOUR");
//        Website website2 = WebsitePool.getWebsite("TOUR");
//
//        System.out.println(WebsitePool.getWebsiteNum());

        website.use(user);
    }
}
