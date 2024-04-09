package Exemplu2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Motocicleta extends Vehicul{
    private int viteza_maxima;

    public Motocicleta() {}
    public Motocicleta(String marca, int pret, int viteza_maxima)
    {
        super(marca, pret);
        this.viteza_maxima = viteza_maxima;
    }
    @Override
    public String toString()
    {
        return "Motocicleta{" +
                "viteza_maxima=" + viteza_maxima +
                "} " + super.toString();
    }

    public int getViteza_maxima() {
        return viteza_maxima;
    }

    public void setViteza_maxima(int viteza_maxima) {
        this.viteza_maxima = viteza_maxima;
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean-ul Motocicleta a fost creat.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean-ul Motocicleta a fost distrus.");
    }
}
