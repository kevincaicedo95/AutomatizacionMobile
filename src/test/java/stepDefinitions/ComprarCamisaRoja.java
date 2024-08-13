package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.ComprarMameluco;
import task.Login;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userInterface.ComprarCamisetaUI.TEXTO_COMPLETADO;

public class ComprarCamisaRoja {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("kevin");
    }

    @Dado("Que el usuario está logeado dentro de la aplicación")
    public void queElUsuarioEstáLogeadoDentroDeLaAplicación() {
        theActorCalled("kevin").attemptsTo(Login.ingresandoConCredencialesCorrectas());
    }
    @Cuando("El usuario ordena una camiseta roja")
    public void elUsuarioOrdenaUnaCamisetaRoja() {
        theActorInTheSpotlight().attemptsTo(ComprarMameluco.paraCompletarOrden());
    }
    @Entonces("Se valida que se realice la compra correctamente")
    public void seValidaQueSeRealiceLaCompraCorrectamente() {
        theActorInTheSpotlight().should(eventually(seeThat(the(TEXTO_COMPLETADO), isCurrentlyVisible())));
    }

}
