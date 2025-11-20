package tvMutacion;

import tvFanerozoico.*;

public class tvTanqueMutacion implements ivilA {

    public String tvMutar(tvSalamanders s) {

        String[] niveles = {
            "Gnathostomata",
            "Osteichtyes",
            "Sarcopterygli",
            "Tetrapoda",
            "Amphibians",
            "Salamanders",
            "SalamandersTorres"
        };

        String[] frames = {"o0o", "0o0", "oo0", "o0o", "0oo", "o0o"};

        int indent = 1;

        for (int i = 0; i < niveles.length; i++) {

            int porc = (int)((i / (double)(niveles.length - 1)) * 100);

            for (int f = 0; f < frames.length; f++) {
                System.out.printf("Waiting %d%%   %s\r", porc, frames[f]);
                try { Thread.sleep(200); } catch (Exception e) {}
            }

            System.out.print("\n");

            for (int j = 0; j < indent; j++) System.out.print("-");
            System.out.println(" " + niveles[i] + "\n");

            indent++;
        }

        int dosis = (int)(Math.random()*901)+100;

        if (dosis < 500)
            return "Mutacion fallida con " + dosis + " mSv";

        tvSalamandersTorres r = new tvSalamandersTorres();
        return "Mutacion exitosa con " + dosis + " mSv -> " + r.getTvNombre();
    }
}
