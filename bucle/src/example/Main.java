package example;

public class Main {
    public static void main(String[] args) {

        String[] animales = {"puerco", "serpiente", "pelicano", "llama", "buitre", "rinoceronte", "loro"};

        for(String animal : animales) {
            String textoConcatenado = animal + " ";
            System.out.print(textoConcatenado);
        }

    }
}