public class Persegi extends ParentBangunDatar implements InterfaceBangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void menggambarBangun() {
        System.out.println("===PERSEGI===");
        for(int i=0;i<this.sisi;i++){
            for(int j=0;j<this.sisi;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String karakteristikBangun() {
        return "Bangun datar: Persegi";
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }
}