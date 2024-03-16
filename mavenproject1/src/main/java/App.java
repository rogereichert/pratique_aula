/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controllers.EventoController;
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
        EventoController eventController = new EventoController();
        SistemaCadastroEventosView view = new SistemaCadastroEventosView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            view.mostrarMenu();
            int choice = Integer.parseInt(view.lerEntrada());

            switch (choice) {
                case 1:
                    userController.cadastrarUsuario();
                    break;
                case 2:
                    eventController.cadastroEventos();
                    break;
                case 3:
                    System.out.println("Digite um nome para consulta: ");
                    String buscarNome = scanner.nextLine();
                    userController.buscarUsuario(buscarNome);
                    break;
                case 4:
                    System.out.println("Digite o nome do evento: ");
                    String buscarEvento = scanner.next();
                    eventController.consultarEventos(buscarEvento);
                    break;
                case 5:
                    // consultar participa
                case 6:
                    System.exit(0);
                    break;
                default:
                    view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        }

    }
}
