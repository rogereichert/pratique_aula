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
 * @author roger
 */
public class EventoController {
    
    private List<Event> eventos;
    private SistemaCadastroEventosView view;
    
    public EventoController(){
        this.eventos = new ArrayList<>();
        this.view = new SistemaCadastroEventosView();
    } 
    
    public void cadastroEventos(){
         view.mostrarMensagem("==== Cadastro de Eventos ====");
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
         view.mostrarMensagem("Evento cadastrado com sucesso!\n");
    }
    
    private void printEvent(String event, String dataEvent, String horaEvent, String horaFinalizaEvent){
        System.out.println("Nome do evento: " + event);
        System.out.println("Data do evento: " + dataEvent);
        System.out.println("Nome do evento: " + horaEvent);
        System.out.println("Nome do evento: " + horaFinalizaEvent);
    }
    
    public void consultarEventos(String nomeEvento){
        for (Event event: eventos){
            if (event.getDescricao().equals(nomeEvento)){
                System.out.println("Evento localizado: \n");
                printEvent(event.getDescricao(), event.getDataEvento(), event.getHoraEvento(), event.getHoraFinalizaEvento());
            }else{
                System.out.println("Evento não localizado! ");
            }
        }
    }
    
    
    
}
