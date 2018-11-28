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
    public void generateLoginForNomAndPrenom(String nom, String prenom) {
        // On verifie que l'ajout de Paul Durand soit ajouté de la forme PDUR
/*        LoginGenerator login = new generateLoginForNomAndPrenom( "paul", "durand");
        assertSame("PDUR", login);*/

    }

    @Test
    public void CT1(){
        //on vérifie que l'ajout de John Ralling soit mentionné en "JRAL2"
        /*String login = generateLoginForNomAndPrenom( "jean", "ralling");
        assertSame("JRAL2", login);*/
    }

    @Test
    public void CT2(){
        //génération de Jean Rolling donne "JROL1"
        /*String login = generateLoginForNomAndPrenom( "jean", "rolling");
        assertSame("JROL1", login);*/
    }

    @Test
    public void CT3(){
        //génération de Paul Dùrand donne "PDUR"
        /*String login = generateLoginForNomAndPrenom( "paul", "dùrand");
        assertSame("PDUR", login);*/
    }

    @Test
    public void CT(){
        // Paul DU genere le login "PDU"
    }
}