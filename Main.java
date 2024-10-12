//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //datos de la piscina uno
    int largoPiscina1 = 300;
    int anchoPiscina1 = 150;
    int profundidadPiscina1 = 20;
    //datos de la piscina dos
        int largoPiscina2 = 300;
        int anchoPiscina2 = 80;
        int profundidadPiscina2 = 35;
        //variables que nos serviran para calcular area y volumen de piscinas
        int areaPiscina1 = anchoPiscina1 * largoPiscina1;
        int volumenPiscina1 = areaPiscina1 * profundidadPiscina1;
        int areaPiscina2 = largoPiscina2 * anchoPiscina2;
        int volumenPiscina2 = areaPiscina2 * profundidadPiscina2;
        //vamos a crear datos de las dos piscinas juntas una al lado de la otra
        int anchoTotalPiscinas = anchoPiscina1 + anchoPiscina2;
        int areaTotalPiscinas = areaPiscina1 + areaPiscina2;
        int volumenTotalPiscinas = volumenPiscina1 + volumenPiscina2;
        //mostrar resultados en pantalla: area, volumen, longitud total,
        //ancho total, area total y volumen total
        System.out.println("El área de la piscina 1 es: " + areaPiscina1);
        System.out.println("El área de la piscina 2 es: " + areaPiscina2);
        System.out.println("El volumen de la piscina 1 es: " + volumenPiscina1);
        System.out.println("El volumen de la piscina 2 es: " + volumenPiscina2);
        System.out.println("La longitud total de las dos piscinas juntas es: " + largoPiscina1);
        System.out.println("El ancho de las dos piscinas juntas es: " + anchoTotalPiscinas);
        System.out.println("El área total de la dos piscinas juntas es: " + areaTotalPiscinas);
        System.out.println("El volumen total de las dos piscinas juntas es: " + volumenTotalPiscinas);
        //intercambiamos los valores de profundidad de piscina 1 y 2
        int profundidadTemporalPiscina1 = profundidadPiscina1;
        profundidadPiscina1 = profundidadPiscina2;
        profundidadPiscina2 = profundidadTemporalPiscina1;
        //nueva operación de volumen de las piscinas
        int nuevoVolumenPiscina1 = areaPiscina1 * profundidadPiscina1;
        int nuevoVolumenPiscina2 = areaPiscina2 * profundidadPiscina2;
        // imprimimos nuevos resultados con los datos de profundidad intercambiados
        System.out.println("El nuevo volumen de la piscina 1 es: " + nuevoVolumenPiscina1);
        System.out.println("El nuevo volumen de la piscina 2 es: " + nuevoVolumenPiscina2);




    }
}