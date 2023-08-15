public class PersegiPanjang implements InterfaceBangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void menggambarBangun() {
        //logika untuk membuat persegi
        System.out.println("===PERSEGI PANJANG===");
        for(int i=0;i<this.lebar;i++){
            for(int j=0;j<this.panjang;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String karakteristikBangun() {
        return "Bangun datar: Persegi Panjang";
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }
}