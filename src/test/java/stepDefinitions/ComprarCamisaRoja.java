package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ComprarCamisaRoja {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("kevin");
    }

    @Dado("Que el usuario está logeado dentro de la aplicación")
    public void queElUsuarioEstáLogeadoDentroDeLaAplicación() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Cuando("El usuario ordena una camiseta roja")
    public void elUsuarioOrdenaUnaCamisetaRoja() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("Se valida que se realice la compra correctamente")
    public void seValidaQueSeRealiceLaCompraCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
