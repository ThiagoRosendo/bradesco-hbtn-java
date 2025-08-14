import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (FileWriter arquivo = new FileWriter(fileName, true);
                PrintWriter linha = new PrintWriter(arquivo)) {
            System.out.println("Digite o conteúdo do arquivo:");
            while (true) {
                String text = scanner.nextLine();
                if (text.equalsIgnoreCase("sair")) {
                    break;
                }
                linha.println(text);
            }
            System.out.println("Arquivo criado om sucesso");

        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}