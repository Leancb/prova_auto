package Steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prova {

    private WebDriver navegador;


    @Dado("^que configurei ambiente para acessar URL Chrome$")
    public void configuraDriverChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\leanc\\Documents\\GitHub\\prova_4all\\src\\main\\resources\\chromedriver.exe");
    }

    @Dado("^que configurei ambiente para acessar URL Firefox$")
    public void configuraDriverFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\leanc\\Documents\\GitHub\\prova_4all\\src\\main\\resources\\geckodriver.exe");
    }

    @Quando("^abri tela do simulador de investimento$")
    public void abreSimulador() {
        navegador = new ChromeDriver();
        navegador.get("https://shopcart-challenge.4all.com/");
        navegador.manage().window().maximize();

    }

    @Entao("^Retorna a tela com resultado$")
    public void retornaSimulacao() throws InterruptedException {

        Thread.sleep(500);
/*
        String var2;

        var2 = navegador.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/div[2]/a")).getText();

        if (var2 == null) {
            System.out.println("\nErro, algo n�o funcionou");
        } else {
            Assert.assertTrue(var2.contains("REFAZER A SIMULA��O"));
        }
*/
        navegador.quit();
    }


}
