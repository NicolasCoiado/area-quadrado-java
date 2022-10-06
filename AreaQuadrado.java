import java.util.Scanner;
public class AreaQuadrado {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do quadrado:");
        double lado = scanner.nextDouble();
        double area = lado*lado;
        System.out.println("O dobro da área do quadrado é igual a: "+ area*2+".");
    }
}
