public class Aereo {
    private String nomeVeivolo;
    private String numeroCoda;
    private double pesoKg;
    private double pesoLb;
    private double capacitaSerbatorioLitri;
    private double capacitaSerbatorioGalloni;
    private int numeroIdentificativoInterno;

    public Aereo(String nomeVeivolo, String numeroCoda, double pesoKg, double capacitaSerbatorioLitri, int numeroIdentificativoInterno) {
        this.setNomeVeivolo(nomeVeivolo);
        this.setNumeroCoda(numeroCoda);
        this.setPesoKg(pesoKg);
        this.setPesoLb(pesoKg * 2.20462262);
        this.setCapacitaSerbatorioLitri(capacitaSerbatorioLitri);
        this.setCapacitaSerbatorioGalloni(capacitaSerbatorioLitri * 0.264172);
        this.setNumeroIdentificativoInterno(numeroIdentificativoInterno);
    }

    public int getNumeroIdentificativoInterno() {
        return numeroIdentificativoInterno;
    }

    public void setNumeroIdentificativoInterno(int numeroIdentificativoInterno) {
        this.numeroIdentificativoInterno = numeroIdentificativoInterno;
    }

    public double getCapacitaSerbatorioGalloni() {
        return capacitaSerbatorioGalloni;
    }

    public void setCapacitaSerbatorioGalloni(double capacitaSerbatorioGalloni) {
        this.capacitaSerbatorioGalloni = capacitaSerbatorioGalloni;
    }

    public double getCapacitaSerbatorioLitri() {
        return capacitaSerbatorioLitri;
    }

    public void setCapacitaSerbatorioLitri(double capacitaSerbatorioLitri) {
        this.capacitaSerbatorioLitri = capacitaSerbatorioLitri;
    }

    public double getPesoLb() {
        return pesoLb;
    }

    public void setPesoLb(double pesoLb) {
        this.pesoLb = pesoLb;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getNumeroCoda() {
        return numeroCoda;
    }

    public void setNumeroCoda(String numeroCoda) {
        this.numeroCoda = numeroCoda;
    }

    public String getNomeVeivolo() {
        return nomeVeivolo;
    }

    public void setNomeVeivolo(String nomeVeivolo) {
        this.nomeVeivolo = nomeVeivolo;
    }
}
