/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.obraspublicas.Ciudadano;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author teito
 */
public class CiudadanoTest {

     static Ciudadano ciu;
    static int i = 1;

    @BeforeAll
    public static void antesDeTodo() {

        ciu = new Ciudadano("Anonimus", 1212);

        System.out.println("INGRESO de ciudadano del bien");
    }

    @AfterAll
    public static void despuesDeTodo() {

        System.out.println(
                LocalDate.now().minusDays(1)
                + " Baches reparados, Ciudadanos Felices");
    }

    @BeforeEach
    public void before() {

        System.out.println("--------------------");
        System.out.println("Test N° " + i++);
    }

    @AfterEach
    public void after() {

        System.out.println("--------------------");
    }

    @Test
    public void testValidarUsr() {

        boolean resultado = ciu.validarIngreso(123456);

        assertTrue(resultado); // Debe FALLAR
    }

    @Test
    public void testValidarEmail() {

        String email = "juan@gmail.com";

        boolean valido =
                email.contains("@")
                && email.contains(".")
                && email.length() < 20;

        assertTrue(valido);
    }

    @Test
    public void testCambioPass() {

        String newPass = "1234";

        ciu.cambiarPassword(newPass);

        assertEquals(1234, ciu.getPassword());

        System.out.println(
                "Password cambiada: "
                + ciu.getPassword());
    }

    @Test
    @Timeout(30)
    public void testDelay() {

        ciu.delay(45);
    }

    @Test
    public void testCiudadanosDiferentes() {

        Ciudadano c1 =
                new Ciudadano("Juan", 1111);

        Ciudadano c2 =
                new Ciudadano("Pedro", 2222);

        assertNotSame(c1, c2, "misma persona");
    }
}

