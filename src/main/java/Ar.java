import java.util.HashMap;
import java.util.Map;

public class Ar extends Componente{
    private static Map<String, Ar> ares = new HashMap<String, Ar>();
    public static void cadastrarAr(String nome){
        ares.put(nome, new Ar(nome));
    }
    public static Ar obterAr(String nome){
        return ares.get(nome);
    }
    public Ar(String nome) {
        super(nome);
    }

    private int temperatura = 20;

    public String aumentarTempreratura(){
        if(! this.status)
            return "ar desligado";
        this.temperatura += 5;
        if (temperatura >= 30)
            this.temperatura = 30;
        return "temperatura "+ this.temperatura;
    }
    public String abaixarTempreratura(){
        if(! this.status)
            return "ar desligado";
        this.temperatura -= 5;
        if (temperatura <= 15)
            this.temperatura = 15;
        return "temperatura "+ this.temperatura;
    }
}
