public class Kubus implements InterfaceBangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    //polymorphism
    @Override
    public double getVolume() {
        return sisi * sisi * sisi;
    }
}