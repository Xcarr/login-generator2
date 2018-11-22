package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Before
    public void init(){
        LoginService loginService = new LoginService(new String[] {"JROL",
                "BPER","CGUR","JDU","JRAL","JRAL1"});
    }
    @Test
    public void generateLoginForNomAndPrenom() {
        // On verifie que l'ajout de Paul Durand soit ajouté de la forme PDUR
    }
}