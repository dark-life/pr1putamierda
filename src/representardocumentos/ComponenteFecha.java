package representardocumentos;

import java.util.*;

public class ComponenteFecha extends Componente{
    
    private GregorianCalendar calendar;
    
    public ComponenteFecha(Date date) {
        calendar = new GregorianCalendar();
        calendar.setTime(date);
    }

    @Override
    public String toString() {
        String result ="";
        result += calendar.get(GregorianCalendar.DATE)+
                "/"+calendar.get(GregorianCalendar.MONTH)+
                "/"+calendar.get(GregorianCalendar.YEAR);
        return result;
    }

    @Override
    public int nCaracteres() {
        return calendar.toString().length();
    }

    @Override
    public int nPalabras() {
        return 1;
    }

    @Override
    public Componente copia() {
        return new ComponenteFecha(calendar.getTime());
    }
    
    
    
    
}
