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
public class ImpresoraAdicional extends Impresora {

    public ImpresoraAdicional() {
    }

    public ImpresoraAdicional(String texto) {
        super("Excel", "A3", false, texto);
    }

    ImpresoraAdicional(String tipoDocumento, String hoja, boolean color, String texto) {
        super(tipoDocumento, hoja, color, texto);
    }
    
}
