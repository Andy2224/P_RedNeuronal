package paper_redneuronal;

/**
 *
 * @author Ivan Andres Mogollon Sumarraga
 */
import java.util.Scanner;
public class Paper_RedNeuronal {

    public static String Reconocer_tecnica(){
        String tipo_tecnica;
        Scanner tec=new Scanner(System.in);
        System.out.println("-Identificación de tecnica para hallar fallas- \n");
        System.out.println("El nombre de la tecnica es: \n");
        return null;
    }
    public static int Diagnosticar_fallas(){

        Scanner diganostico=new Scanner(System.in);
        System.out.println("-Deteccion de Fallas en el motor de combustion-\n ");
        System.out.println("Identificar el tipo de falla: ");
        System.out.println("Determinar el cilindraje del motor: ");
        System.out.println("Establecer las valvulas del motor: \n");
        return 0;
    }
    public static String Ordenar_fallas(){
        Scanner ordenar=new Scanner(System.in);
        System.out.println("-Clasificación de fallas encontradas-\n");
        System.out.println("Reconocer la cantidad de fallas encontradas: ");
        System.out.println("Determinar los tipos de fallas: ");
        System.out.println("Ordenar los tipos de clasificacion: \n");
        return null;
    }
    public static int Recoger_datos(){
        Scanner recoger=new Scanner(System.in);
        System.out.println("-Recoleccion de datos \n");
        System.out.println("Calcular los datos obtenidos: ");
        System.out.println("Archivar los datos: \n");
        return 0;
    }
    public static String Imprimir_datos(){
        Scanner imprimir=new Scanner(System.in);
        System.out.println("-Resultados Experimentales del proceso realizado-\n");
        System.out.println("Identificar el tipo de dato: ");
        System.out.println("Reconocer el origen de la falla: ");
        System.out.println("Describir la falla encontrada: \n");
        return null;
    }

    public static void main(String[] args) {
        Reconocer_tecnica();
        Diagnosticar_fallas();
        Ordenar_fallas();
        Recoger_datos();
        Imprimir_datos();

    }

}
