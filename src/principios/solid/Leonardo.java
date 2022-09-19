/**
@author Daniel Hilarion
 */
package principios.solid;

public class Leonardo implements Operaciones{

    @Override
    public int sumar() {
        return a + b;
    }

    @Override
    public int restar() {
        return a - b;
    }
    
    public int dividir(){
        return a / b;
    }
 
}
