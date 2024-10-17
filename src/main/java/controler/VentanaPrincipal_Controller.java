/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ventana.Ventana_Principal;

/**
 *
 * @author coguox
 */
public class VentanaPrincipal_Controller implements ActionListener{
    
    //Creamos objetos
    Ventana_Principal view;
        
    //Creacion de metodo para poder visualizar los objetos
    public VentanaPrincipal_Controller (Ventana_Principal view){
    
        this.view = view;
        
        //Llamamos el metodo para hacignar eventos
        events();
        
    }
    //Asigna eventos a los objetos 
    public void events(){
    
        //Manda a llamas a los botoes
        view.btn_Compras.addActionListener(this);
        view.btn_Ventas.addActionListener(this);
        view.btn_Productos.addActionListener(this);
        view.btn_Pedidos.addActionListener(this);
        view.btn_Salir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object evt = e.getSource();
        if(evt.equals(view.btn_Salir)){
            System.exit(0);
        }
        
    }
    
}
