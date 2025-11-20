package tvProterozoico;

import java.util.Scanner;
import tvFanerozoico.*;
import tvMutacion.*;

public class tvController {
    public void tvIniciar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("BIENVENIDO A BIOTECH");
        System.out.print("Ingrese el nombre de su salamandra: ");
        String nombre=sc.nextLine();
        tvSalamanders sal=new tvSalamanders();
        sal.setTvNombre(nombre);
        sal.setTvSexo("H");
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
                case 1: sal.tvLineaTiempoConAnimacion(); break;
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