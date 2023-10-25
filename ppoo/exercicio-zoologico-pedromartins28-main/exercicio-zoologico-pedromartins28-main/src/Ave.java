public class Ave extends Animal{
    private boolean voaBem;

    public Ave(String nome, String especie, String som, boolean voaBem, int patas){
        super(nome, especie, som, patas);
        this.voaBem = voaBem;
    }

    public boolean getVoaBem(){
        return voaBem;
    }

    @Override
    public String getDescricaoLonga() {
        // TODO Auto-generated method stub
        String texto = super.getDescricaoLonga() + " e voa "; 
        if(voaBem){
            return texto + "bem";
        }
        return texto + "mal";
    }

}
