package tvFanerozoico;

public class tvSalamanders extends tvAmphibians{
    private String tvNombre="Salamanders";
    private String tvSexo="H";

    public void tvComer(){
        if(tvSexo.equals("H")) System.out.println(tvNombre+" está comiendo");
    }

    public void tvLineaTiempoConAnimacion() {

        String[] niveles = {
            "Gnathostomata",
            "Osteichtyes",
            "Sarcopterygli",
            "Tetrapoda",
            "Amphibians",
            "Salamanders"
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

            indent += 1;
        }
    }



    public String getTvNombre(){return tvNombre;}
    public void setTvNombre(String n){tvNombre=n;}
    public String getTvSexo(){return tvSexo;}
    public void setTvSexo(String s){tvSexo=s;}
}