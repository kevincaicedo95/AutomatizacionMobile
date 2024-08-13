package task;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterface.ComprarCamisetaUI.*;

public class ComprarMameluco implements Task {
    public static ComprarMameluco paraCompletarOrden(){
        return instrumented(ComprarMameluco.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                new ScrollToTarget((MAMELUCO_ROJO)),
                Click.on(BOTON_AÑADIR_AL_CARRITO),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_CHECKOUT),
                Enter.theValue("Kevin").into(ESPACIO_NOMBRE),
                Enter.theValue("Caicedo").into(ESPACIO_APELLIDO),
                Enter.theValue("005").into(ESPACIO_CODIGO_POSTAL),
                Click.on(BOTON_CONTINUAR),
                Ensure.that(PRECIO).isEnabled(),
                new ScrollToTarget(BOTON_TERMINAR),
                Click.on(BOTON_TERMINAR)
        );
    }
}
