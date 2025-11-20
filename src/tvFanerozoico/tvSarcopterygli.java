package tvFanerozoico;
import tvProterozoico.*;
public abstract class tvSarcopterygli extends tvOsteichtyes {
    private String tvNombre="Sarcopterygli";
    @Override
    public void tvLineaTiempo(){ super.tvLineaTiempo(); System.out.println("Sarcopterygli"); }
    public String getTvNombre(){return tvNombre;}
    public void setTvNombre(String n){tvNombre=n;}
}