package representardocumentos;

import java.util.ArrayList;
import java.util.List;

public class ComponenteCompuesto extends Componente{
    
    private final ArrayList<Componente> listaComponentes;
    private int numAct = 0;
    private int numMax = 100;

    public ComponenteCompuesto() {
        listaComponentes = new ArrayList<Componente>();
        
    }
    
    public void añade (Componente componente){
        if (numAct < numMax){ 
            listaComponentes.add(componente.copia());
            numAct ++;
        }else{
            System.out.println("Componente Lleno");
        }
    }
    
    public int cardinal (){
        return numAct;
    }
    
    public void modifica (int pos, Componente componente){
        if (pos >= 0 || pos <= numAct-1){
            listaComponentes.remove(pos);
            listaComponentes.add(pos, componente);
        }
    }

    @Override
    public String toString() {
        String result= "";
        for (Componente componente : listaComponentes) {
            result+=componente.toString();
        }
        return result;
    }

    @Override
    public int nCaracteres() {
        int n = 0;
        
        for (Componente componente : listaComponentes) {
            n+=componente.nCaracteres();
        }
        return n;
    }

    @Override
    public int nPalabras() {
        int n = 0;
        for (Componente componente : listaComponentes) {
            n+=componente.nPalabras();
        }
        return n;
    }

    @Override
    public Componente copia() {
        ComponenteCompuesto copia = new ComponenteCompuesto();
        for (Componente componente : listaComponentes) {
            copia.añade(componente);
            copia.numAct++;
        }
        return copia;
    }

    
    
    
    
}
