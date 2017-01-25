
package edu.eci.pdsw.pizzafactory.consoleview;

import edu.eci.pdsw.pizzafactory.model.AbstractAmasadorPizza;
import edu.eci.pdsw.pizzafactory.model.AbstractComponentFactory;
import edu.eci.pdsw.pizzafactory.model.AbstractHorneadorPizza;
import edu.eci.pdsw.pizzafactory.model.AbstractMoldeadorPizza;
import edu.eci.pdsw.pizzafactory.model.AmasadorPizzaDelgada;
import edu.eci.pdsw.pizzafactory.model.ExcepcionParametrosInvalidos;
import edu.eci.pdsw.pizzafactory.model.HorneadorPizzaDelgada;
import edu.eci.pdsw.pizzafactory.model.Ingrediente;
import edu.eci.pdsw.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.eci.pdsw.pizzafactory.model.Tamano;
import edu.eci.pdsw.pizzafactory.model.Masa;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();
            Masa ma = Masa.DELGADA;
            AbstractComponentFactory fab = AbstractComponentFactory.getInstance(ma);
            pp.prepararPizza(ingredientes, Tamano.MEDIANO, fab);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(Ingrediente[] ingredientes, Tamano tam, AbstractComponentFactory fab)
            throws ExcepcionParametrosInvalidos {
        
        AbstractAmasadorPizza am = fab.getAmasador();
        AbstractHorneadorPizza hpd = fab.getHorneador();
        AbstractMoldeadorPizza mp = fab.getMoldeador();
        
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
