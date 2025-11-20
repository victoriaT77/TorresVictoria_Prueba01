package tvFanerozoico;
public abstract class tvAmphibians extends tvTetrapoda{
    private String tvNombre="Amphibians";
    @Override
    public void tvLineaTiempo(){ super.tvLineaTiempo(); System.out.println("Amphibians"); }
    public String getTvNombre(){return tvNombre;}
    public void setTvNombre(String n){tvNombre=n;}
}