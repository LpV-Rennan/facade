import java.util.HashMap;
import java.util.Map;

public class Televisao extends Componente {
    private static Map<String, Televisao> tvs = new HashMap<String, Televisao>();
    public static void cadastrarTelevisao(String nome){
        tvs.put(nome, new Televisao(nome));
    }
    public static Televisao obterTelevisao(String nome){
        return tvs.get(nome);
    }

    private boolean mudo = false;
    private int volume = 0;

    public Televisao(String nome) {
        super(nome);
    }

    public String aumentarVolume(){
        if (!this.status){
            return "Televisao desligada";
        }
        this.mudo = false;
        this.volume +=5;
        if (this.volume >= 100 ) {
            this.volume = 100;
        }
        return "volume "+this.volume;
    }
    public String abaixarVolume(){
        if (!this.status){
            return "Televisao desligada";
        }
        this.mudo = false;
        this.volume -=5;
        if (this.volume <= 0) {
            this.volume = 0;
        }
        return "volume "+this.volume;
    }
    public String mudo(){
        if (!this.status){
            return "Televisao desligada";
        }
        this.mudo = true;
        return "mudo";
    }
}
