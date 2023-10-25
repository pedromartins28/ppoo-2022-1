public class Teste {
    public static void main(String[] args) throws Exception {
        Animal animal = new Lobo("fred", "laranja");
        System.out.println(animal.getDescricaoLonga());
        animal = new Galinha("coco");
        System.out.println(animal.getDescricaoLonga());
    }
}
