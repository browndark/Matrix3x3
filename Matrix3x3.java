import java.util.Scanner;
public class Matrix3x3 {
    public static void main(String[] args) {
        System.out.println("Aluno:Bruno Custodio de Castro Silva");
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        System.out.println("Preencha a Matriz 3x3 com valores inteiros:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite o valor para a posição ["+i+"]["+j+"]:");
                matriz[i][j] = scanner.nextInt();

            }
        }

        System.out.println("\nMatriz 3x3 preenchida:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
