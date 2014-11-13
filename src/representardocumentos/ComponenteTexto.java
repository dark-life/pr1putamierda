package representardocumentos;

import java.util.StringTokenizer;

public class ComponenteTexto extends Componente{

    private final String name;
    
    public ComponenteTexto(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int nCaracteres() {
        int nChar = 0;
        int cont = 0;
        while (cont < name.length()){
            if (name.charAt(cont) != ' '){
                nChar ++;
            }
            cont ++;
        }
        
        return nChar;
    }

    @Override
    public int nPalabras() {
        StringTokenizer result = new StringTokenizer(name);
        return result.countTokens();
    }

    @Override
    public Componente copia() {
        return new ComponenteTexto(name);
    }

    
    
    
}
