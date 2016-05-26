package com.sura.policycenter;

import com.sura.configuracion.AbstractJBehaveStory;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.model.TestOutcome;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SerenityStoriesGuidewire extends AbstractJBehaveStory {

    @Before
    public void reset_driver() {

        environmentVariables.setProperty("webdriver.driver", "chrome");
        environmentVariables.setProperty("serenity.logging", "NORMAL");
        environmentVariables.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        environmentVariables.setProperty("serenity.console.colors", "true");
        environmentVariables.setProperty("serenity.dry.run", "FALSE");
        environmentVariables.setProperty("serenity.project.name", "Resultados De Pruebas Funcionales");
        environmentVariables.setProperty("serenity.verbose.steps", "FALSE");
    }

    @Test
    public void ingreso_a_guidewire_como_administrador() throws Throwable {
        SerenityStories login_policy_story = newStory("policycenter/login_policy.story");
        run(login_policy_story);
        List<TestOutcome> outcomes = loadTestOutcomes();
        assertThat(outcomes.size(), is(1));
    }

    @Test
    public void carga_datos_a_guidewire_con_datos_de_muestra_sura() throws Throwable {
        SerenityStories login_policy_story = newStory("policycenter/login_policy.story");
        run(login_policy_story);
        List<TestOutcome> outcomes = loadTestOutcomes();
        assertThat(outcomes.size(), is(1));
    }



}
