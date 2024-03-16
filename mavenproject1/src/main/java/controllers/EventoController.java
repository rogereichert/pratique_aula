/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Event;
import views.SistemaCadastroEventosView;

/**
 *
 * @author roger reichert
 * @version 1.0
 */
public class EventoController {
    
    private List<Event> eventos;
    private SistemaCadastroEventosView view;
    
    public EventoController(){
        this.eventos = new ArrayList<>();
        this.view = new SistemaCadastroEventosView();
    }

    /**
     * Realiza o cadastro de um novo evento.
     */
    public void cadastroEventos(){
         view.mostrarMensagem("\n==== Cadastro de Eventos ====\n");

         Event evento = new Event();
         
         view.mostrarMensagem("Descrição do evento: ");
         evento.setDescricao(view.lerEntrada());
         
         view.mostrarMensagem("Data do Evento: ");
         evento.setDataEvento(view.lerEntrada());
         
         view.mostrarMensagem("Hora do Evento: ");
         evento.setHoraEvento(view.lerEntrada());
         
         view.mostrarMensagem("Hora de Finalização do Evento: ");
         evento.setHoraFinalizaEvent(view.lerEntrada());
         
         eventos.add(evento);
         view.mostrarMensagem("\nEvento cadastrado com sucesso!\n");
    }

    /**
     * Imprime as informações do evento fornecido.
     *
     * @param event O nome do evento.
     * @param dataEvent A data do evento.
     * @param horaEvent A hora de início do evento.
     * @param horaFinalizaEvent A hora de término do evento.
     */
    private void printEvent(String event, String dataEvent, String horaEvent, String horaFinalizaEvent){
        System.out.println("Nome do evento: " + event);
        System.out.println("Data do evento: " + dataEvent);
        System.out.println("Nome do evento: " + horaEvent);
        System.out.println("Nome do evento: " + horaFinalizaEvent);
    }

    /**
     * Consulta eventos por nome na lista de eventos.
     *
     * @param nomeEvento O nome do evento a ser consultado.
     */
    public void consultarEventos(String nomeEvento){
        boolean eventoEncontrado = false;
        for (Event event : eventos) {
            if (event.getDescricao().equals(nomeEvento)) {
                // Se o evento for encontrado, imprime suas informações.
                System.out.println("Evento localizado: \n");
                printEvent(event.getDescricao(), event.getDataEvento(), event.getHoraEvento(), event.getHoraFinalizaEvento());
                eventoEncontrado = true;
                break; // Termina a iteração, pois o evento foi encontrado.
            }
        }
    }

    public Boolean verificarEventosCadastrados(){
        if (eventos.isEmpty()){
            System.out.println("Não há eventos cadastrados!");
            return false;
        }else{
            return true;
        }
    }

    public void listarEventos(){
        if (eventos.isEmpty()){
            view.mostrarMensagem("Não há eventos cadastrados ou ativos");
        }else{
            view.mostrarMensagem("\n==== Lista de Eventos ====\n");

            for (Event evento : eventos){

                System.out.println("-----------------------------------------------------");
                System.out.println("Nome do evento: " + evento.getDescricao());
                System.out.println("Data do evento: " + evento.getDataEvento());
                System.out.println("Nome do evento: " + evento.getHoraEvento());
                System.out.println("Nome do evento: " + evento.getHoraFinalizaEvento());
                System.out.println("-----------------------------------------------------");
            }
        }
    }
}
