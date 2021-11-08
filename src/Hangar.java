public class Hangar {
    //crea un array di oggetti Aereo e chiamalo Aerei   
    private Aereo[] aerei;
    private int numeroAereiPresenti = 0;

    //costruttore
    public Hangar(int numeroAerei) {
        aerei = new Aereo[numeroAerei];
    }
    //costruttore con passaggio di array
    public Hangar(Aereo[] aerei) {
        this.aerei = aerei;
        this.numeroAereiPresenti = aerei.length;
    }
    //metodo per aggiungere un oggetto Aereo all'array
    public void aggiungiAereo(Aereo aereo) {
        for (int i = 0; i < aerei.length; i++) {
            if (aerei[i] == null) {
                aerei[i] = aereo;
                numeroAereiPresenti += 1;
                break;
            }
        }
    }
    //metodo per rimuovere un oggetto Aereo dall'array
    public void rimuoviAereo(Aereo aereo) {
        for (int i = 0; i < aerei.length; i++) {
            if (aerei[i] == aereo) {
                aerei[i] = null;
                numeroAereiPresenti -= 1;
                break;
            }
        }
    }
    //metodo per rimuovere un aereo specifico
    public void rimuoviAereoPosizione(int posizione) {
        aerei[posizione] = null;
        numeroAereiPresenti -= 1;
    }
    //metodo per ottenere un oggetto Aereo dall'array
    public Aereo getAereo(int posizione) {
        return aerei[posizione];
    }
    //crea un metodo compatta che rimuova i buchi vuoti nell'array
    public void compatta() {
        Aereo[] nuovoArray = new Aereo[aerei.length];
        int j = 0;
        for (int i = 0; i < aerei.length; i++) {
            if (aerei[i] != null) {
                nuovoArray[j] = aerei[i];
                j++;
            }
        }
        aerei = nuovoArray;
    }
    //metodo per ordinare l'array di oggetti Aereo per NumeroIdentificativoInterno
    public void ordinaPerNumeroIdentificativoInterno() {
        for (int i = 0; i < numeroAereiPresenti; i++) {
            for (int j = 0; j < numeroAereiPresenti - 1; j++) {
                if (aerei[j].getNumeroIdentificativoInterno() > aerei[j + 1].getNumeroIdentificativoInterno()) {
                    Aereo temp = aerei[j];
                    aerei[j] = aerei[j + 1];
                }
            }
        }
    }
    //metodo per ordinare l'array di oggetti Aereo per nomeVeivolo
    public void ordinaPerNomeVeivolo() {
        for (int i = 0; i < numeroAereiPresenti; i++) {
            for (int j = 0; j < numeroAereiPresenti - 1; j++) {
                if (aerei[j].getNomeVeivolo().compareTo(aerei[j + 1].getNomeVeivolo()) > 0) {
                    Aereo temp = aerei[j];
                    aerei[j] = aerei[j + 1];
                    aerei[j + 1] = temp;
                }
            }
        }
    }
    public int postiDisponibili() {
        int postiDisponibili = 0;
        for (int i = 0; i < aerei.length; i++) {
            if(aerei[i] == null) {
                postiDisponibili += 1;
            }
        }
       return postiDisponibili;
    }
    //crea getter numeroaereipresenti
    public int getNumeroAereiPresenti() {
        return numeroAereiPresenti;
    }

    //stampa le variabili degli oggetti Aereo
    public void stampa() {
        for (int i = 0; i < aerei.length; i++) {
            if (aerei[i] != null) {
                System.out.println("Aereo " + i + ": " + aerei[i].getNomeVeivolo() + " " + aerei[i].getNumeroIdentificativoInterno());
            }
        }
    }
}
