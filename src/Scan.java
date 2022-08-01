import java.util.Scanner;

public class Scan {
    public static void main(String[] args) throws Exception {
        //programa que permite ingresar calificaciones y calcular promedio de un estudiante
       
        Scanner in = new Scanner(System.in);

        int Quimica=0;
        int literatura=0; 
        int matematicas=0;
        float promedio=0;
        String Estudiante="";

        System.out.println("Digite el nombre del estudiante al cual le quiere ingresar la calificacion: ");
        Estudiante = in.nextLine();
        System.out.println("Digite la calificacion que el estudiante obtuvo en Quimica: ");
        Quimica = in.nextInt();
        System.out.println("Digite la calificacion que el estudiante obtuvo en literatura: ");
        literatura = in.nextInt();
        System.out.println("Digite la calificacion que el estudiante obtuvo en matematicas: ");
        matematicas = in.nextInt();

        promedio = (Quimica + literatura +  matematicas)/3;

        if(promedio >= 6.0){
          System.out.println("El Estudiante: " + Estudiante + "Aprovo con: " + promedio);
        } else{
          System.out.println("El Estudiante: " + Estudiante + "Reprovo con: " + promedio);
        }
    }
}
