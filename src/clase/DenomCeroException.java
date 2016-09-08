/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SERVIDOR
 */
public class DenomCeroException extends Exception{
   public DenomCeroException(){
        super ("No se permite denominadores en cero");
    }
}
