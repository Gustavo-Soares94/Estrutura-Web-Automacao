package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\gusta\\OneDrive\\Documentos\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //navegando para a página Taskit
        driver.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link que possui o texto "Sign in"
        driver.findElement(By.linkText("Sign in")).click();

        //Identificando o formulario de Login"
        WebElement formularioSignInbox = driver.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que está dentro do formulario de id "signinbox o texto "Julio001"
        formularioSignInbox.findElement(By.name("login")).sendKeys("Julio0001");

        //Digitar no campo com name "password" que está dentro do formulario de id "signinbox o texto "123456"
        formularioSignInbox.findElement(By.name("password")).sendKeys("123456");

        //Clicar no link com o texto "SIGN IN"
        driver.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me" o texto "Hi, Julio"
        WebElement me = driver.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio", textoNoElementoMe);
    }

}
