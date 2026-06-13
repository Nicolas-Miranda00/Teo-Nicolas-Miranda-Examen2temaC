/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class parameterCIUTest {

    public static Stream<Arguments> tomarDatos() {

        return Stream.of(Arguments.of("jorgesys@tototita.com", true),
                Arguments.of("andre@ulp.com", true),
                Arguments.of("correo", false),
                Arguments.of("pepe@", false)
                
        );
    }

    @ParameterizedTest
    @MethodSource("tomarDatos")
    public void testValidarEmail(String email, boolean esperado) {       
        assertEquals( esperado, validarMail(email));                         
    }

    public static boolean validarMail(String email) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(email);

        return matcher.find();
    }
}
