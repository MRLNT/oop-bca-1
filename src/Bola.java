public class Bola extends ParentBangunRuang implements InterfaceBangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double getVolume() {
        double volume = 4.0 / 3.0 * 3.14;
        double pangkat = 3;
        
        for (int i = 1; i <= pangkat; i++) {
            volume *= jariJari;
        }
        
        return volume;
    }

}