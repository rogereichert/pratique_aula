/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controllers.UserController;
import java.util.Scanner;
import views.SistemaCadastroEventosView;

/**
 *
 * @author roger
 */
public class App {

    public static void main(String[] args) {
        UserController userController = new UserController();
        SistemaCadastroEventosView view = new SistemaCadastroEventosView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.mostrarMenu();
            int choice = Integer.parseInt(view.lerEntrada());
            
             switch (choice) {
                case 1:
                    userController.cadastrarUsuario();
                    break;
                case 5:
                    //System.exit(0);
                case 6:
                    System.out.println("Digite um nome para busca: ");
                    String buscarNome = scanner.nextLine();
                    userController.buscarUsuario(buscarNome);
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        }

    }
}
