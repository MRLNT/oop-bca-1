public class Tabung extends ParentBangunRuang implements InterfaceBangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double getVolume() {
        double volume = 3.14 * jariJari * jariJari * tinggi;
        return volume;
    }

}