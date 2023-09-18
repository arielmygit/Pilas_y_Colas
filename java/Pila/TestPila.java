package Pila;

import java.util.Scanner;

public class TestPila {
    public static void main(String[] args) {

        int select = 0;
        boolean b = true;
        int z = 0;

        Pila nueva = new Pila();
        Scanner scanner = new Scanner(System.in);

        while (b) {

            System.out.print("Elija una opcion para la Pila" + "\n" +
                    "1.Push" + "\n" +
                    "2.Pop" + "\n" +
                    "3.Peek" + "\n");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    String value;
                    System.out.print("Valor: " + "\n");
                    value = scanner.nextLine();
                    nueva.push(value);
                    break;
                case 2:
                    nueva.pop();
                    break;
                case 3:
                    nueva.peek();
                    break;
            }

            System.out.print("4.Continuar" + "\n" +
                    "5.Salir" + "\n");
            z = scanner.nextInt();

            switch (z) {
                case 4:
                    b = true;
                    break;
                case 5:
                    System.out.println("Fin");
                    b = false;
                    break;
            }
        }
    }
}
