/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criar um arraylist
        ArrayList <Contato> contactos = new ArrayList ();
          
          Contato contato = new Contato();
         
          contato.setNome("Ana Esteves");
          contato.setEmail("aaa@gmail.com");
          contato.setTelefone(25135478);
          
          contactos.add(contato);
          
          Contato contato1 = new Contato();
         

          contactos.add(contato1);

          //Ciclo para percorrer o arraylist
          for(Contato c: contactos){
            System.out.println(c.getNome());
          }
        
          //Total de items da lista
          System.out.println("Tamanho da lista "+contactos.size());


    }
    
}
