public class Kubus extends ParentBangunRuang implements InterfaceBangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getVolume() {
        return sisi * sisi * sisi;
    }
}