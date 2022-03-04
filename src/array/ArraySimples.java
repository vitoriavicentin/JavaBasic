import java.util.Arrays;

/**
 * Array Simples
 * 
 * @author Vitoria
 */

public class ArraySimples {
    public static void main(String[] args) {

        String[] paises = { "BRASIL", "UCRANIA", "INDIA", "AFRICA" };

        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));

        int posicao = Arrays.binarySearch(paises, "BRASIL");
        System.out.print(posicao);

        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));

    }
}