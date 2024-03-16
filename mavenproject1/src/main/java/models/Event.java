/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author roger
 */
public class Event {
    
    private String descricao;
    private String dataEvento;
    private String horaEvento;
    private String horaFinalizarEvento;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }
    
    public String getHoraFinalizaEvento(){
        return this.horaFinalizarEvento;
    }
    
    public void setHoraFinalizaEvent(String horaFinalizarEvento){
        this.horaFinalizarEvento = horaFinalizarEvento;
    }
    
}
