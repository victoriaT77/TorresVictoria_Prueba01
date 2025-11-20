package tvProterozoico;
public abstract class tvOsteichtyes extends tvGnathostomata{
    private String tvNombre="Osteichtyes";
    @Override
    public void tvLineaTiempo(){ super.tvLineaTiempo(); System.out.println("Osteichtyes"); }
    public String getTvNombre(){return tvNombre;}
    public void setTvNombre(String n){tvNombre=n;}
}