/**
 @author Daniel Hilarion
 */
package principios.solid;

public class Santiago implements Operaciones{

    @Override
    public int sumar() {
        return a + b;
    }

    @Override
    public int restar() {
        return a - b;
    }
    
    public int multiplicar(){
        return a * b;
    }
 
}
