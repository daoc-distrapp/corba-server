
package myejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author dordonez@ute.edu.ec
 */
@Stateless
@EJB(name = "java:global/Saludo", beanInterface = I_RemoteEjb.class)
public class Bienvenida implements I_RemoteEjb {

    @Override
    public String hola(String nombre) {
        return String.format("Hola %s !!!", nombre);
    }

}
