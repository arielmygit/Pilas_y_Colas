package Cola;

import java.util.Scanner;

public class TestCola {
    public static void main(String[] args) {

        int select = 0;
        boolean b = true;
        int x = 0;

        Cola cola = new Cola();
        Scanner scanner = new Scanner(System.in);

        while (b) {

            System.out.print("Elija una opcion para la Cola" + "\n" +
                    "1.Enqueue" + "\n" +
                    "2.Dequeue" + "\n" +
                    "3.Peek:" + "\n");
            select = scanner.nextInt();

            switch (select) {
                case 1:
                    String value;
                    System.out.print("Valor: " + "\n");
                    value = scanner.next();
                    cola.enqueue(value);
                    break;

                case 2:
                    cola.deque();
                    break;

                case 3:
                    cola.peek();
                    break;
            }

            System.out.print("4.Continuar" + "\n" +
                    "5.Salir" + "\n");
            x = scanner.nextInt();

            switch (x) {
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
