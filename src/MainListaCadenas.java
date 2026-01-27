import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MainListaCadenas {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();

        palabras.add("sol");
        palabras.add("casa");
        palabras.add("coche");
        palabras.add("cadena");
        palabras.add("PC");
        palabras.add("platano");

        System.out.println("Palabras: " + palabras);

        Iterator<String> it = palabras.iterator();

        while (it.hasNext()) {
            String palabra2 = it.next();
            if (palabra2.length() < 4) {
                it.remove();
            }
        }

        System.out.println("Palabras sin palabras que tienen menos de 4 caracteres: " + palabras);
    }
}