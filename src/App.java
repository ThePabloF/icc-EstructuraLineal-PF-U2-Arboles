import controllers.ArbolBinario;

public class App {
        public static void main(String[] args) throws Exception {
        ArbolBinario ab = new ArbolBinario();

        ab.insert(50);
        ab.insert(17);
        ab.insert(9);
        ab.insert(23);
        ab.insert(76);
        ab.insert(54);

        ab.imprimirArbol();
        ab.buscar(54);
    }

}
