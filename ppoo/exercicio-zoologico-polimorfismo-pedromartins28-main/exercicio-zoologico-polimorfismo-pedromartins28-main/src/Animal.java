public class Animal{
    private String nome;
    private String especie;
    private int patas;
    private String som;

    public Animal(String nome, String especie, String som, int patas){
        this.nome=nome;
        this.especie=especie;
        this.som=som;
        this.patas=patas;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

    public String getSom(){
        return som;
    }

    public int getPatas(){
        return patas;
    }

    public String getDescricao(){
        return nome + " é um(a) " + getEspecie();
    }

    public String getDescricaoLonga(){
        return getDescricao() + " que faz " + getSom();
    }
}