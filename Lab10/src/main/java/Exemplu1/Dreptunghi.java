package Exemplu1;

public class Dreptunghi {
    private int lungime;
    private int latime;
    public void aria()
    {
        System.out.println("Arie dreptunghi: "+(lungime*latime));
    }

    public Dreptunghi(int lungime, int latime)
    {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }
}
