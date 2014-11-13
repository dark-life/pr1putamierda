package representardocumentos;

public class ComponenteNumero extends Componente {

    private final int number;

    public ComponenteNumero(int number) {
        this.number = number;
    }
    
    

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    @Override
    public int nCaracteres() {
        return Integer.toString(number).length();
    }

    @Override
    public int nPalabras() {
        return 1;
    }

    @Override
    public Componente copia() {
        return new ComponenteNumero(number);
    }
}
