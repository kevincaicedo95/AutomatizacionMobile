package task;

import interactions.SwipeCordenadas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static userInterface.ComprarCamisetaUI.*;

public class ComprarMameluco implements Task {
    public static ComprarMameluco paraCompletarOrden(){
        return instrumented(ComprarMameluco.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SwipeCordenadas.paraHacerScroll(353,1472,145),
                Click.on(BOTON_AÑADIR_AL_CARRITO),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_CHECKOUT),
                Enter.theValue("Kevin").into(ESPACIO_NOMBRE),
                Enter.theValue("Caicedo").into(ESPACIO_APELLIDO),
                Enter.theValue("005").into(ESPACIO_CODIGO_POSTAL),
                Click.on(BOTON_CONTINUAR),
                Ensure.that(PRECIO).isEnabled(),
                SwipeCordenadas.paraHacerScroll(353,1472,417),
                Click.on(BOTON_TERMINAR)
        );
    }
}
