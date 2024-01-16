import java.util.Scanner;

public class Ui {
    private final CaesarCipher caesarCipher = new CaesarCipher();
    private final Scanner scanner = new Scanner(System.in);
    private final ReaderFromFile reader = new ReaderFromFile();
    private final WriterToFile writer = new WriterToFile();
    public void start() {
        int select;
        while(true) {
            menu();
            select = scanner.nextInt();
            scanner.nextLine();
            switch (select) {
                case 1 -> {
                    String inputPath = getInputPath();
                    String text = reader.getText(inputPath);
                    String outputPath = getOutputFile();
                    int key = getKey();
                    String encryptedText = caesarCipher.encrypt(text, key);
                    writer.saveText(encryptedText, outputPath);
                }
                case 2 -> {
                    String inputPath = getInputPath();
                    String text = reader.getText(inputPath);
                    String outputPath = getOutputFile();
                    int key = getKey();
                    String decryptedText = caesarCipher.decrypt(text, key);
                    writer.saveText(decryptedText, outputPath);
                }
                case 3 -> {
                    System.out.println("Bye!)");
                    return;
                }
                default -> System.out.println("Please select number from 1 to 3");
            }

        }
    }

    private void menu(){
        System.out.println("Please select an option:");
        System.out.println("1. Encrypt text");
        System.out.println("2. Decrypt text");
        System.out.println("3. Exit");
    }

    private String getInputPath() {
        System.out.println("Please enter a path to input file:");
        return scanner.nextLine();
    }

    private String getOutputFile() {
        System.out.println("Please enter a path to output file:");
        return scanner.nextLine();
    }
    private int getKey() {
        System.out.println("Please enter a key value in digits:");
        return scanner.nextInt();
    }

}
