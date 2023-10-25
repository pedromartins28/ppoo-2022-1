public class Mamifero extends Animal{
    private String cor;

    public Mamifero(String nome, String especie, String som, String cor, int patas){
        super(nome, especie, som, patas);
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String getDescricaoLonga() {
        // TODO Auto-generated method stub
        return super.getDescricaoLonga() + " e tem pelo " + getCor();
    }
}
