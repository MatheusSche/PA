/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocommand;

/**
 *
 * @author mathe
 */
public class AbrirCommand implements Command{
    
    private Portao portao;
    
    public AbrirCommand(Portao portao){
        this.portao = portao;
    }

    @Override
    public void execute() {
        portao.abrir();
    }
    
    
}
