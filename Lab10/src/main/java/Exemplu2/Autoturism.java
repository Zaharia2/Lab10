package Exemplu2;

public class Autoturism extends Vehicul{
    private int volum_portbagaj;
    private int greutate;

    public Autoturism() {}

    public Autoturism(String marca, int pret, int volum_portbagaj, int greutate)
    {
        super(marca, pret);
        this.volum_portbagaj = volum_portbagaj;
        this.greutate = greutate;
    }
    @Override
    public String toString()
    {
        return "Autoturism{" +
                "volum_portbagaj=" + volum_portbagaj +
                ", greutate=" + greutate +
                "} " + super.toString();
    }
    public int getVolum_portbagaj() {
        return volum_portbagaj;
    }

    public void setVolum_portbagaj(int volum_portbagaj) {
        this.volum_portbagaj = volum_portbagaj;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
}
