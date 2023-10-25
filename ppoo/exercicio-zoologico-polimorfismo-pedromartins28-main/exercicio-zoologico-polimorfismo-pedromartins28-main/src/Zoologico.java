import java.util.ArrayList;

public class Zoologico {

    private ArrayList<Animal> animais = new ArrayList<Animal>();

    public void cadastrarGato(String nome, String cor){
        Gato gato = new Gato(nome, cor);
        animais.add(gato);
    }

    public void cadastrarLobo(String nome, String cor){
        Lobo lobo = new Lobo(nome, cor);
        animais.add(lobo);
    }

    public void cadastrarGalinha(String nome){
        Galinha galinha = new Galinha(nome);
        animais.add(galinha);
    }

    public void cadastrarAguia(String nome){
        Aguia aguia = new Aguia(nome);
        animais.add(aguia);
    }

    public String getDescLonga(String nome){
        for(Animal animal : animais){
            if(animal.getNome().equals(nome)){
                return animal.getDescricaoLonga();
            }
        }
        return "Esse animal não existe!";
    }

    public String getAllDesc(){
        String texto = "";
        for(Animal animal : animais){
            texto += animal.getDescricao() + "\n";
        }
        return texto;
    }

    public String getAllDescLonga(){
        String texto = "";
        for(Animal animal : animais){
            texto += animal.getDescricaoLonga() + "\n";
        }
        return texto;
    }

}
