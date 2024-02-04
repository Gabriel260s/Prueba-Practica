/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.practica.pkg1;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class PruebaPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Repetir mi nombre \n 2. Submenu de mensajes \n 3. Salir");
        System.out.println("Selecione una opcion: ");
        int opc = input.nextInt();
        char resp = 's';
        int cont_menu = 0;
        while (resp == 's' || resp == 'S') {
            switch (opc) {
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    input.nextLine();
                    String nombre = input.nextLine();
                    System.out.println("Ingrese cuando veces quiere que se repita:");
                    int rep = input.nextInt();
                    for (int i = 0; i < rep; i++) {
                        System.out.println("!Hola mi nombre es " + nombre + " y miren mi prueba!");

                    }

                    break;
                case 2:
                    char respSubMenu = 's';

                    while (respSubMenu == 's' || respSubMenu == 'S') {

                        System.out.println("\nSubmenú de mensajes:");
                        System.out.println("1. Bienvenida\n2. Despedida\n3. Salir del submenú");
                        System.out.println("Seleccione una opción: ");

                        int opt = input.nextInt();

                        switch (opt) {
                            case 1:
                                System.out.println("Bienvenido a mi programa!");
                                break;
                            case 2:
                                System.out.println("Hasta luego, gracias por usar mi programa!");
                                break;
                            case 3:
                                System.out.println("Saliendo del submenú...");
                                resp = 'n';
                                break;
                            default:
                                System.out.println("Opción incorrecta. Vuelve a intentarlo.");
                        }

                        if (resp != 'n') {
                            System.out.println("Quieres seguir en el submenu? S/N");
                            resp = input.next().charAt(0);
                            if(resp=='n'||resp=='N'){
                                break;
                            }
                        }
                    }

                    System.out.println("Regresando al menú principal...");
                    break;

                case 3:
                    System.out.println("Estuviste " + cont_menu + " veces dentro del menu.");
                    System.out.println("Saliendo");
                    resp = 'n';
            }
            System.out.println("Quieres seguir en el menu? S/N");
            resp = input.next().charAt(0);
            if (resp == 's' || resp == 'S') {
                cont_menu++;
                System.out.println("1. Repetir mi nombre \n 2. Submenu de mensajes \n 3. Salir");
                System.out.println("Selecione una opcion: ");
                opc = input.nextInt();
            }

        }
    }

}
