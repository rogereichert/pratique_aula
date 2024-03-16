/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.User;
import views.SistemaCadastroEventosView;

/**
 *
 * @author roger
 */
public class UserController {
    
    private List<User> users;
    private SistemaCadastroEventosView view;
    
    public UserController(){
         this.users = new ArrayList<>();
         this.view = new SistemaCadastroEventosView();
    }
    
    public void cadastrarUsuario() {
        view.mostrarMensagem("==== Cadastro de Usuário ====");
        User user = new User();

        view.mostrarMensagem("Nome: ");
        user.setName(view.lerEntrada());
        
        view.mostrarMensagem("CPF: ");
        user.setCpf(view.lerEntrada());

        view.mostrarMensagem("Endereço: ");
        user.setEndereco(view.lerEntrada());

        view.mostrarMensagem("Cidade: ");
        user.setCidade(view.lerEntrada());
        
        view.mostrarMensagem("Estado: ");
        user.setEstado(view.lerEntrada());
        
        view.mostrarMensagem("Idade: ");
        user.setIdade(Integer.parseInt(view.lerEntrada()));

        users.add(user);
        view.mostrarMensagem("Usuário cadastrado com sucesso!\n");
    }
    
    // Método para buscar um usuário pelo nome
    public User buscarUsuario(String nome) {
        for (User user : users) {
            if (user.getName().equals(nome)) {
                // return user; // Retorna o usuário se encontrado
                System.out.println("Usuário encontrado: " + user.getName() + "\n");
            }else{
                System.out.println("Usuário não encontrado! \n");
            }
        }
        return null; // Retorna null se o usuário não for encontrado
    }
}
