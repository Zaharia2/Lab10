package Exemplu2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans_lab1.xml");
        Vehicul v = (Vehicul)context.getBean("Autoturism");
        System.out.println(v);
        Vehicul m = (Vehicul)context.getBean("Motocicleta");
        System.out.println(m);

        context.registerShutdownHook();
        context.close();

        AbstractApplicationContext context1= new ClassPathXmlApplicationContext("beans_lab2.xml");
        Vehicul t = (Vehicul)context1.getBean("tir");
        System.out.println(t);
        context.registerShutdownHook();
        context1.close();

    }

}
