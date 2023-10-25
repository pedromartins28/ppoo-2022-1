import java.util.ArrayList;

public class Zoologico {

    ArrayList<Gato> gatos = new ArrayList<Gato>();
    ArrayList<Lobo> lobos = new ArrayList<Lobo>();
    ArrayList<Galinha> galinhas = new ArrayList<Galinha>();
    ArrayList<Aguia> aguias = new ArrayList<Aguia>();

    public void cadastrarGato(String nome, String cor){
        Gato gato = new Gato(nome, cor);
        gatos.add(gato);
    }

    public void cadastrarLobo(String nome, String cor){
        Lobo lobo = new Lobo(nome, cor);
        lobos.add(lobo);
    }

    public void cadastrarGalinha(String nome){
        Galinha galinha = new Galinha(nome);
        galinhas.add(galinha);
    }

    public void cadastrarAguia(String nome){
        Aguia aguia = new Aguia(nome);
        aguias.add(aguia);
    }

    public String getDescLonga(String nome){
        for(Lobo lobo : lobos){
            if(lobo.getNome().equals(nome)){
                return lobo.getDescricaoLonga();
            }
        }
        for(Gato gato : gatos){
            if(gato.getNome().equals(nome)){
                return gato.getDescricaoLonga();
            }
        }
        for(Galinha galinha : galinhas){
            if(galinha.getNome().equals(nome)){
                return galinha.getDescricaoLonga();
            }
        }
        for(Aguia aguia : aguias){
            if(aguia.getNome().equals(nome)){
                return aguia.getDescricaoLonga();
            }
        }
        return "Esse animal não existe!";
    }

    public String getAllDesc(){
        String texto = "";
        for(Lobo lobo : lobos){
            texto += lobo.getDescricao() + "\n";
        }
        for(Gato gato : gatos){
            texto += gato.getDescricao() + "\n";
        }
        for(Galinha galinha : galinhas){
            texto += galinha.getDescricao() + "\n";
        }
        for(Aguia aguia : aguias){
            texto += aguia.getDescricao() + "\n";
        }
        return texto;
    }

    public String getAllDescLonga(){
        String texto = "";
        for(Lobo lobo : lobos){
            texto += lobo.getDescricaoLonga() + "\n";
        }
        for(Gato gato : gatos){
            texto += gato.getDescricaoLonga() + "\n";
        }
        for(Galinha galinha : galinhas){
            texto += galinha.getDescricaoLonga() + "\n";
        }
        for(Aguia aguia : aguias){
            texto += aguia.getDescricaoLonga() + "\n";
        }
        return texto;
    }

}
