import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] flowers = new String[]{"G", "C", "V"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество дней: ");
        int days = scan.nextInt();
        for (int i = 0; i < days ; i++) {
            String temp = flowers[2];
            flowers[2] =flowers[1];
            flowers[1] = temp;
           for (int j = 0; j < days; j++) {
                String temp2 = flowers[0];
                flowers[0] =flowers[1];
                flowers[1] = temp2;
            }}


        for (String f : flowers) {
            System.out.print(f);
        }
    }
}
