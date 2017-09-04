public class Automovil{
    private String placa;
    private int hora;
    private int minutos;
    
    public Automovil(String placa, int horaI, int minI){
        placa = placa;
        hora = horaI;
        minutos = minI;
    }
    
    public String Placa(){
        return placa;
    }
    
    public String HoraMin(){
        String Inf="";
        Inf += hora;
        Inf += ":";
        Inf += minutos;
        return Inf;
    }
}