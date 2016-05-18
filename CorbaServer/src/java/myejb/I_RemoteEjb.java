
package myejb;

import javax.ejb.Remote;

/**
 *
 * @author dordonez@ute.edu.ec
 */
@Remote
public interface I_RemoteEjb {
    public String hola(String nombre);
}
