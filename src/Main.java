public class Main {
    public static void main(String[] args) {
        Quadrilatere quadrilatere= new Quadrilatere();
        System.out.println("La surface du 1er quadrilatere est:" + quadrilatere.getSurface());
        System.out.println("Le perimetree du 1er quadrilatere est:" + quadrilatere.getPerimetre());

        Quadrilatere quadrilatere1 = new Quadrilatere(2,3,2,4);
        System.out.println("La surface du 2eme est:" + quadrilatere1.getSurface());
        System.out.println("Le perimetre du 2eme est:" + quadrilatere1.getPerimetre());
    }
}
