<<<<<<< HEAD
package TestCases;

import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoTest extends TestBase {

    private final WebDriver driver = getDriverManager();

    ProdutoTask produtoTask = new ProdutoTask(driver);

    LoginTask loginTask = new LoginTask(driver);

    @Test
    public void realizarCompra() throws InterruptedException {

        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();
    }

}
=======
package TestCases;

import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class RealizarCompraComSucessoTest extends TestBase {

    private final WebDriver driver = getDriverManager();

    ProdutoTask produtoTask = new ProdutoTask(driver);

    LoginTask loginTask = new LoginTask(driver);

    @Test
    public void realizarCompra() throws InterruptedException {

        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();
    }

}
>>>>>>> d54359a62d34ae1dc574116d7a079229c4d95d72
