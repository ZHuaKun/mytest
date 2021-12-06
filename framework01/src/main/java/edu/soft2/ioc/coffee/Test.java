package edu.soft2.ioc.coffee;

import edu.soft2.ioc.coffee.CoffeeBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CoffeeBean myBean = (CoffeeBean) context.getBean("coffeeBean");
        myBean.drink();

    }
}
