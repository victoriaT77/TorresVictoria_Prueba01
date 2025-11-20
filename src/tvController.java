
import java.util.Scanner;
import tvFanerozoico.*;
import tvMutacion.*;

public class tvController {

    public void tvMostrarLineaT() {

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
    public void tvInicializar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("BIENVENIDO A BIOTECH");
        System.out.print("Ingrese el nombre de su salamandra: ");
        String nombre=sc.nextLine();
        tvSalamanders sal=new tvSalamanders();
        sal.setTvNombre(nombre);
        sal.setTvSexo("F");
        int op=0;
        
        do{
            System.out.println("==MENU BIOTECH 2K25==");
            System.out.println("1.Ver linea evolutiva");
            System.out.println("2.Hacer que coma");
            System.out.println("3.Mutar");
            System.out.println("0.Salir");
            System.out.println("ingresa una opcion: ");
            try{ op=Integer.parseInt(sc.nextLine()); }catch(Exception e){ op=-1; }
            switch(op){
                case 1: tvMostrarLineaT(); break;
                case 2: sal.tvComer(); break;
                case 3:
                    tvTanqueMutacion t=new tvTanqueMutacion();
                    System.out.println(t.tvMutar(sal));
                    break;
            }
        }while(op!=0);
        sc.close();
    }
}