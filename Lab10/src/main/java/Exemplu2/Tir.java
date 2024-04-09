package Exemplu2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Tir extends Vehicul{
    @Value("1200")
    private int incarcatura_maxima;
    public Tir(String marca, int pret, int incarcatura_maxima)
    {
        super(marca, pret);
        this.incarcatura_maxima = incarcatura_maxima;
    }
    public Tir() {}

    public int getIncarcatura_maxima() {
        return incarcatura_maxima;
    }

    public void setIncarcatura_maxima(int incarcatura_maxima) {
        this.incarcatura_maxima = incarcatura_maxima;
    }

    @Override
    public String toString()
    {
        return "Tir{" +
                "incarcatura_maxima=" + incarcatura_maxima +
                "} " + super.toString();
    }
    @PostConstruct
    public void init() {
        System.out.println("Bean-ul Tir a fost creat.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean-ul Tir a fost distrus.");
    }
}
