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
public class ControleRemoto {
    private Command[] comandos;
    private Command ultimocomando;
    
    public ControleRemoto(Command abrirCommand, Command fecharCommand){
        this.comandos = new Command[2];
        comandos[0] = abrirCommand;
        comandos[1] = fecharCommand;
        
    }
    
    public void fecharPortao(){
        comandos[1].execute();
        ultimocomando = comandos[1];
    }
    
    public void abrirPortao(){
        comandos[0].execute();
        ultimocomando = comandos[0];
    }
    
    public String verUltimo(){
        if (ultimocomando==comandos[0]){
            return "O ultimo comando foi abrir";
        } else{
            return "O ultimo comando foi fechar";
        }
    
    }
    
}
