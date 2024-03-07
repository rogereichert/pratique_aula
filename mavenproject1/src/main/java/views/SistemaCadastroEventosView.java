/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class SistemaCadastroEventosView {

    public void mostrarMenu() {
        System.out.println("==== Sistema de Cadastro e Notificação de Eventos ====");
        System.out.println("1. Cadastrar Usuário");
        System.out.println("2. Cadastrar Evento");
        System.out.println("3. Consultar Eventos");
        System.out.println("4. Visualizar Participações");
        System.out.println("6. Buscar Usuário");
        System.out.println("5. Sair");
        System.out.print("Escolha a opção: ");
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public String lerEntrada() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
