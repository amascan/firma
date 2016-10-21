public class Venituri {
    String numeF;
    double trim1;
    double trim2;
    double trim3;
    double trim4;
    String cod;
    double venittotal = 0;
    double venitmediu = 0;
    double venitminim = 0;
    double venitmaxim = 0;
    double[] doublesplit2;


    public Venituri(String linie) {
        String[] split1 = linie.split(" ;   ");
        numeF = split1[0].replaceAll("\\s+$", "");
        String[] split2 = (split1[1].replaceAll("\\s+", "")).split(";");
        doublesplit2 = new double[split2.length - 1];
        for (int i = 0; i < (split2.length-1); i++) doublesplit2[i] = Double.valueOf(split2[i]);
        trim1 = doublesplit2[0];
        trim2 = doublesplit2[1];
        trim3 = doublesplit2[2];
        trim4 = doublesplit2[3];
        cod = (split2[4]).replaceAll("\\s+$", "");
    }

    public String getCod() {
        return cod;
    }

    public void calculare() {

        venitmaxim = doublesplit2[0];
        for (int i = 0; i < doublesplit2.length; i++) {
            if (doublesplit2[i] > venitmaxim) {
                venitmaxim = doublesplit2[i];
            }
        }

        venitminim = doublesplit2[0];
        for (int i = 0; i < doublesplit2.length; i++) {
            if (doublesplit2[i] < venitminim) {
                venitminim = doublesplit2[i];
            }
        }

        venittotal = trim1 + trim2 + trim3 + trim4;
        venitmediu = venittotal / 4;

        System.out.println("Firma " + numeF + "  -cod " + cod);
        System.out.print("Venit total: " + venittotal);
        System.out.print("\t\tVenit trimestru1: " + trim1);
        System.out.println("\t\tImpozit trim1: " + calculimpozit(trim1));
        System.out.print("Venit mediu: " + venitmediu);
        System.out.print("\t\tVenit trimestru2: " + trim2);
        System.out.println("\t\tImpozit trim2: " + calculimpozit(trim2));
        System.out.print("Venit minim: " + venitminim);
        System.out.print("\t\tVenit trimestru3: " + trim3);
        System.out.println("\t\tImpozit trim3: " + calculimpozit(trim3));
        System.out.print("Venit maxim: " + venitmaxim);
        System.out.print("\t\tVenit trimestru4: " + trim4);
        System.out.println("\t\tImpozit trim4: " + calculimpozit(trim4));
        System.out.println("-----------------------------------------------------------------------");

    }

    public double calculimpozit(double valoare) {
        if (valoare < 15.5) {
            return 15 * valoare / 100;
        }
        else {
            return 20 * valoare / 100;
        }
    }

    public void printeaza (String cod){

    }

}