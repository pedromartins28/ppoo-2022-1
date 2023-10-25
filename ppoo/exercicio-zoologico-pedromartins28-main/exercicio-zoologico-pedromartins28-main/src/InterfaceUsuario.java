import java.util.Scanner;

/*
 * Classe que trata a interface com o usuário (menu de opções)
 */
public class InterfaceUsuario {

    private Zoologico zoologico = new Zoologico();
    // Scanner para obter dados do usuário via terminal
    private Scanner entrada;

    /* 
     * Construtor da classe
     */
    public InterfaceUsuario() {
        entrada = new Scanner(System.in);
    }

    /*
     * Método que trata o loop de exibição e tratamento do menu
     */
    public void executar() {
        int opcao;
        do {
            exibirMenu();
            
            System.out.println("\nDigite sua opção: ");
            opcao = Integer.parseInt(entrada.nextLine());

            tratarMenu(opcao);

        } while (opcao != 5);

        // fecha o objeto Scanner para liberar os seus recursos
        entrada.close();
    }

    /*
     * Método que exibe as opções de menu
     */
    public void exibirMenu() {
        System.out.println("1 - Cadastrar animal");
        System.out.println("2 - Descrever animal");
        System.out.println("3 - Listar animais");        
        System.out.println("4 - Listar animais completo");
        System.out.println("5 - Sair");
    }

    /*
     * Método que trata uma opção de menu escolhida pelo usuário
     */
    private void tratarMenu(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarAnimal();
                break;
            case 2:
                descreverAnimal();
                break;
            case 3:
                listarAnimais();
                break;
            case 4:
                listarAnimaisCompleto();
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        // se o usuário não estiver saindo do programa, pede para ele digitar ENTER antes de exibir o menu novamente
        if (opcao != 5) {
            System.out.println("\nDigite ENTER para continuar!");
            entrada.nextLine();
        }
    }

    /*
     * Método auxiliar que obtém uma String do usuário
     */
    private String pedirString(String instrucao) {
        System.out.print(instrucao + ": ");
        String informacao = entrada.nextLine();
        return informacao;
    }

    /*
     * Trata a opção de menu: Cadastrar Animal
     */
    private void cadastrarAnimal() {
        // implemente seu código aqui.
        String nome = pedirString("Digite o nome do animal");
        String especie = pedirString("Qual a especie do animal?");
        if(especie.equals("lobo") || especie.equals("gato")){
            String cor = pedirString("Qual a cor do pelo do animal?");
            if(especie.equals("lobo")){
                zoologico.cadastrarLobo(nome, cor);
            }
            else{
                zoologico.cadastrarGato(nome, cor);
            }
        }
        else if(especie.equals("galinha")){
            zoologico.cadastrarGalinha(nome);
        }
        else if(especie.equals("aguia")){
            zoologico.cadastrarAguia(nome);
        }
        else{
            System.out.println("Espécie desconhecida pelo programa!");
        }
    }

    /*
     * Trata a opção de menu: Descrever Animal
     */
    private void descreverAnimal() {
        String nome = pedirString("Digite o nome do animal");
        System.out.println(zoologico.getDescLonga(nome));
    }

    /*
     * Trata a opção de menu: Listar Animais
     */
    private void listarAnimais() {
        System.out.println(zoologico.getAllDesc());
    }

    /*
     * Trata a opção de menu: Listar Animais
     */
    private void listarAnimaisCompleto() {
        System.out.println(zoologico.getAllDescLonga());
    }
}