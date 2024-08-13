package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.ScrollTo;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterface.LoginUI.*;

public class Login implements Task {
    public static Login ingresandoConCredencialesCorrectas(){
        return instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("standard_user").into(CAMPO_USUARIO),
                Enter.theValue("secret_sauce").into(CAMPO_CONTRASEÑA),
                Click.on(BOTON_LOGIN)
        );
    }
}
