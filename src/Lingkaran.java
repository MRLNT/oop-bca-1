public class Lingkaran extends ParentBangunDatar implements InterfaceBangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void menggambarBangun() {
        System.out.println("O -> itu harusnya lingkaran");
    }

    @Override
    public String karakteristikBangun() {
        return "Bangun datar: Lingkaran";
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * jariJari;
    }

    @Override
    public double getLuas() {
        return 3.14 * jariJari * jariJari;
    }
}
