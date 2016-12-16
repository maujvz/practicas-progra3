/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseño;

/**
 *
 * @author Estudiante
 */
public class FachadaImpresora extends Impresora {
    
    private ImpresoraNormal in;
    private ImpresoraAdicional ia;

    public FachadaImpresora() {
    }
        
    public String imprimirNormal(String texto){
        in = new ImpresoraNormal(texto);
        return in.toString();
    }
    
    public String imprimirAdicional(String texto){
        ia = new ImpresoraAdicional(texto);
        return ia.toString();
    }
    
    
}
