package Exemplu1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        // System.out.println("ok");
        // BeanFactory factory = new ClassPathXmlApplicationContext("beans01.xml");
        // Dreptunghi d = (Dreptunghi) factory.getBean("Dreptunghi");
        // d.aria();

        //ex2
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        // Dreptunghi d2 = (Dreptunghi) context.getBean("Dreptunghi");
        // d2.aria();

        //ex3
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        Persoana p = (Persoana)context.getBean("pers");
        System.out.println(p);
    }
}
