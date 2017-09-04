public class Estacionamiento
{
    private String placas;
    private int horaI;
    private int minI;
    private int horaS;
    private int minS;
    
    private float total;
    private int entradas;
    
    public Estacionamiento(int ent, int horaIni, int minIni, int horaSal, int minSal, String placasIni, float Tot){
        placas = placasIni;
        horaI = horaIni;
        minI = minIni;
        horaS = horaSal;
        minS = minSal;
        total = Tot;
        entradas = ent;
    }
    
    public String RegistraE(){
        for(entradas=0; entradas<=150; entradas++){
            
        }
    }
    
    public String RegistraS(){
        for(entradas=0; entradas>=0; entradas--){
            
        }
    }
    
    public float CostoTotal(){
        return total * 15;
    }
}