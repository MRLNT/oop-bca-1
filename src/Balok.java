public class Balok extends ParentBangunRuang implements InterfaceBangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume() {
        return panjang * lebar * tinggi;
    }
}
