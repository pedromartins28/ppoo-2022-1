package corredores;

public class Corredor implements Competidor {
    private String nome;
    private int velocidade, distanciaDaCorrida, distanciaPercorrida;
    private boolean correndo;

    public Corredor(String nome, int velocidade){
        this.nome = nome;
        this.velocidade = velocidade;
    }

    @Override
    public String getNome(){
        return nome;
    }
    @Override
    public int getVelocidade(){
        return velocidade;
    }
    @Override
    public int getDistanciaPercorrida(){
        return distanciaPercorrida;
    }
    @Override
    public boolean estaCorrendo(){
        return correndo;
    }
    @Override
    public void prepararParaNovaCorrida(int distanciaDaCorrida){
        this.distanciaDaCorrida = distanciaDaCorrida;
        distanciaPercorrida = 0;
        correndo = false;
    }
    @Override
    public void run() {
        correndo = true;
        while(distanciaPercorrida<distanciaDaCorrida){
            distanciaPercorrida+=1;
            try {
                Thread.sleep(1000/velocidade);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        correndo = false;
    }
}
