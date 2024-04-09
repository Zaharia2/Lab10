package Exemplu2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicul {
    @Value("Mercedes")
    private String marca;
    @Value("13000")
    private int pret;

    public Vehicul() {
    }
    public Vehicul(String marca, int pret) {
        this.marca = marca;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
