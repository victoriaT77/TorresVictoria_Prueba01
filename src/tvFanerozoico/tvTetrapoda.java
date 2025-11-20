package tvFanerozoico;
public abstract class tvTetrapoda extends tvSarcopterygli{
    private String tvNombre="Tetrapoda";
    @Override
    public void tvLineaTiempo(){ super.tvLineaTiempo(); System.out.println("Tetrapoda"); }
    public String getTvNombre(){return tvNombre;}
    public void setTvNombre(String n){tvNombre=n;}
}