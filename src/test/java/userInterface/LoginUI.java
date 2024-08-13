package userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target CAMPO_USUARIO = Target.the("Campo usuario en login").located(By.xpath("//android.widget.EditText[@text=\"Usuario\"]"));
    public static final Target CAMPO_CONTRASEÑA = Target.the("Campo contraseña en login").located(By.xpath("//android.widget.EditText[@text=\"Contraseña\"]"));
    public static final Target BOTON_LOGIN = Target.the("Boton login").located(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]"));
}
