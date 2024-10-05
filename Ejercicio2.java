import java.util.Scanner;
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);

        System.out.println("Recuerde que la longitud va hasta 5");
        
        
        System.out.println("Ingrese el primer numero de 5 : ");
        int num1=scan.nextInt();

        System.out.println("Ingrese el segundo numero de 5 : ");
        int num2=scan.nextInt();

        System.out.println("Ingrese el tercer numero de 5 : ");
        int num3=scan.nextInt();

        System.out.println("Ingrese el cuarto numero de 5 : ");
        int num4=scan.nextInt();

        System.out.println("Ingrese el ultimo numero de 5 : ");
        int num5=scan.nextInt();



        

    
      
        int [] numeros={num1,num2,num3,num4,num5};
        int long_numeros=numeros.length;
        int suma=0; // este es un acumulador
        
        for(int i=0;i<long_numeros;i++){

            suma +=numeros[i];


        }

System.out.println("El resultado de numero ingresado es =  "+suma);


















 // joa profe este ejercicio si esta dificil

    }
}
