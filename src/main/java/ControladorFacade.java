import java.util.HashMap;
import java.util.Map;

public class ControladorFacade {
    public static String ligarSala(){
        String message = new String();
        message += ligarLampada("sala")+" ";
        message += ligarTelevisao("sala")+" ";
        message += ligarAr("sala")+" ";
        return message;
    }
    public static String desligarSala(){
        String message = new String();
        message += desligarLampada("sala")+" ";
        message += desligarTelevisao("sala")+" ";
        message += desligarAr("sala")+" ";
        return message;
    }
    public static String momentoCinema(){
        String message = new String();
        message += desligarLampada("quarto")+" ";
        message += ligarTelevisao("quarto")+" ";
        message += ligarAr("quarto")+" ";
        message += abaixarTemperatura("quarto")+" ";
        return message;
    }
    public static String aSalaTaFria(){
        String message = new String();
        message += ligarAr("sala")+" ";
        message += aumentarTemperatura("sala")+" ";
        message += aumentarTemperatura("sala")+" ";
        message += aumentarTemperatura("sala")+" ";
        return message;
    }
    public static String boaNoite(){
        String message = new String();
        message += ligarAr("quarto")+" ";
        message += abaixarTemperatura("quarto")+" ";
        message += desligarTelevisao("quarto")+" ";
        message += desligarLampada("quarto")+" ";
        return message;
    }


    private static String ligarLampada(String nome) {
        Lampada lampada = Lampada.obterLampada(nome);
        if (lampada == null)
            return "Componente não encontrado";
        return lampada.ligar();
    }
    private static String desligarLampada(String nome) {
        Lampada lampada = Lampada.obterLampada(nome);
        if (lampada == null)
            return "Componente não encontrado";
        return lampada.desligar();
    }
    public static void cadastrarLampada(String nome){Lampada.cadastrarLampada(nome);}

    private static String ligarTelevisao(String nome) {
        Televisao televisao = Televisao.obterTelevisao(nome);
        if (televisao == null)
            return "Componente não encontrado";
        return televisao.ligar();
    }
    private static String desligarTelevisao(String nome) {
        Televisao televisao = Televisao.obterTelevisao(nome);
        if (televisao == null)
            return "Componente não encontrado";
        return televisao.desligar();
    }
    private static String aumentarVolume(String nome) {
        Televisao televisao = Televisao.obterTelevisao(nome);
        if (televisao == null)
            return "Componente não encontrado";
        return televisao.aumentarVolume();
    }
    private static String abaixarVolume(String nome) {
        Televisao televisao = Televisao.obterTelevisao(nome);
        if (televisao == null)
            return "Componente não encontrado";
        return televisao.abaixarVolume();
    }
    private static String mudo(String nome) {
        Televisao televisao = Televisao.obterTelevisao(nome);
        if (televisao == null)
            return "Componente não encontrado";
        return televisao.mudo();
    }
    public static void cadastrarTv(String nome){Televisao.cadastrarTelevisao(nome);}

    private static String ligarAr(String nome) {
        Ar ar = Ar.obterAr(nome);
        if (ar == null)
            return "Componente não encontrado";
        return ar.ligar();
    }
    private static String desligarAr(String nome) {
        Ar ar = Ar.obterAr(nome);
        if (ar == null)
            return "Componente não encontrado";
        return ar.desligar();
    }
    private static String abaixarTemperatura(String nome) {
        Ar ar = Ar.obterAr(nome);
        if (ar == null)
            return "Componente não encontrado";
        return ar.abaixarTempreratura();
    }
    private static String aumentarTemperatura(String nome) {
        Ar ar = Ar.obterAr(nome);
        if (ar == null)
            return "Componente não encontrado";
        return ar.aumentarTempreratura();
    }
    public static void cadastrarAr(String nome){Ar.cadastrarAr(nome);}
}
