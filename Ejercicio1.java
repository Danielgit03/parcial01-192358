import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        

        Scanner scan =new Scanner(System.in);

        System.out.println("Ingrese la palabra que desea saber si es palindromo  :)  ");
        String frase =scan.nextLine();
        boolean Palindromo=true;

        
       
        frase=frase.toLowerCase().replaceAll("\\s+", "");

        String reverso = new StringBuilder(frase).reverse().toString();

        if(frase.equals(reverso)){
            System.out.println("La frase es Palindromo : ");
            System.out.println(Palindromo);
        }else{
            System.out.println("La frase es Palindromo : ");
            System.out.println(!Palindromo);
        }


        // eso fue lo que se ocurrio xd
        
    }


}