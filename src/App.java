public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //dichiara 3 aerei 
        Aereo aereo1 = new Aereo("TRIGEAR XS", "ABC123", 4000, 400, 1);
        Aereo aereo2 = new Aereo("Cessna413", "ZDC123", 4000, 400, 2);
        Aereo aereo3 = new Aereo("Tupolov", "HDK432", 4000, 400, 3);
        System.out.println("Nome aereo 1: " + aereo1.getNomeVeivolo());
        System.out.println("Nome aereo 2: " + aereo2.getNomeVeivolo());
        System.out.println("Nome aereo 3: " + aereo3.getNomeVeivolo());

        Hangar alfonso = new Hangar(40);
        alfonso.aggiungiAereo(aereo1); //posto 0; viene aggiunto aereo 1
        alfonso.aggiungiAereo(aereo2); //posto 1; viene aggiunto aereo 2
        alfonso.aggiungiAereo(aereo3); //posto 2; viene aggiunto aereo 3
        System.out.println("\nAlfonso ha " + alfonso.postiDisponibili() + " posti liberi");
        alfonso.rimuoviAereo(aereo1); //rimuove aereo 1
        System.out.println("\nAlfonso ha " + alfonso.postiDisponibili() + " posti liberi");
        alfonso.stampa();
        alfonso.aggiungiAereo(aereo1); //aggiunge aereo 1
        alfonso.rimuoviAereoPosizione(1); //rimuove aereo 2
        System.out.println("\nAlfonso ha " + alfonso.postiDisponibili() + " posti liberi");
        alfonso.stampa();
        alfonso.compatta(); //funzione che rimuove i buchi in mezzo all'array, in questo modo vengono evitate eccezioni
        System.out.println("\nAereo 0: " + alfonso.getAereo(0).getNomeVeivolo() + "");
        System.out.println("\nAereo 1: " + alfonso.getAereo(1).getNomeVeivolo() + "");
        //stampa numeroaereipresenti
        System.out.println("\nAlfonso ha " + alfonso.getNumeroAereiPresenti() + " aerei");
        alfonso.ordinaPerNumeroIdentificativoInterno();
        alfonso.stampa();

    }
}
