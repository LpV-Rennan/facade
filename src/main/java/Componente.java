public abstract class Componente {
    private String nome;
    protected boolean status = false;

    public Componente(String nome) {
        this.nome = nome;
    }
    public String desligar(){
        this.status = false;
        return "Componente "+nome+" desligado";
    }
    public String ligar(){
        this.status = true;
        return "Componente "+nome+" ligado";
    }
    public String getNome() {
        return nome;
    }
}
