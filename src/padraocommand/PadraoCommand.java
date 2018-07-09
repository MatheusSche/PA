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
public class PadraoCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Portao p = new Portao();
        Command ac = new AbrirCommand(p);
        Command af = new FecharCommand(p);
        ControleRemoto c = new ControleRemoto(ac, af);
        System.out.println(p.toString());
        c.fecharPortao();
        c.abrirPortao();
        System.out.println(c.verUltimo());
        //c.fecharPortao();
        //System.out.println(c.verUltimo());
    }
    
}
