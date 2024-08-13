package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarCamisetaUI {
    public static final Target MAMELUCO_ROJO = Target.the("nombre mameluco rojo").located(By.xpath("(//android.widget.TextView[@text=\"Mameluco Sauce Labs\"])"));
    public static final Target BOTON_AÑADIR_AL_CARRITO = Target.the("boton para añadir al carrito").located(By.xpath("(//android.widget.TextView[@text=\"AÑADIR A CARRITO\"])[3]"));
    public static final Target BOTON_CARRITO = Target.the("Boton carrito").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-Carrito\"]"));
    public static final Target BOTON_CHECKOUT = Target.the("Boton checkout").located(By.xpath("//android.widget.TextView[@text=\"CHECKOUT\"]"));
    public static final Target ESPACIO_NOMBRE = Target.the("campo nombre").located(By.xpath("//android.widget.EditText[@text=\"Nombre\"]"));
    public static final Target ESPACIO_APELLIDO = Target.the("campo apellido").located(By.xpath("//android.widget.EditText[@text=\"Apellido\"]"));
    public static final Target ESPACIO_CODIGO_POSTAL = Target.the("campo codigo postal").located(By.xpath("//android.widget.EditText[@text=\"Código postal\"]"));
    public static final Target BOTON_CONTINUAR = Target.the("boton continuar").located(By.xpath("//android.widget.TextView[@text=\"CONTINUAR\"]"));
    public static final Target PRECIO = Target.the("valor de prenda").located(By.xpath("//android.widget.TextView[@text=\"$7.99\"]"));
    public static final Target BOTON_TERMINAR = Target.the("boton terminar").located(By.xpath("//android.widget.TextView[@text=\"TERMINAR\"]"));
    public static final Target TEXTO_COMPLETADO = Target.the("texto completado").located(By.xpath("//android.widget.TextView[@text=\"GRACIAS POR SU ORDEN\"]"));

}
