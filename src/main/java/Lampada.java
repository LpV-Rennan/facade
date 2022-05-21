import java.util.HashMap;
import java.util.Map;

public class Lampada extends Componente {
    private static Map<String, Lampada> lampadas = new HashMap<String, Lampada>();

    public static Lampada obterLampada(String nome) {
        return lampadas.get(nome);
    }

    public static void cadastrarLampada(String nome) {
        lampadas.put(nome, new Lampada(nome));
    }

    public Lampada(String nome) {
        super(nome);
    }
}
