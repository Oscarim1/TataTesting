package pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompararPage {
	WebDriver driver=null;
	By btnQuieroSerJobber = By.xpath("//*[@text=\"Quiero ser jobber\"]");
	////////////////////VALIDACION CHROME//////////////////////////
	By btnAccept = By.id("com.android.chrome:id/terms_accept");	
	By btnNext = By.id("com.android.chrome:id/next_button");
	By btnNoThanks = By.id("com.android.chrome:id/negative_button");
	//////////////////FIN VALIDACION CHROME////////////////////////
	By btnAcepto = By.xpath("//*[@resource-id=\"com.android.chrome:id/terms_accept\"]");
	By btnNo = By.xpath("//*[@resource-id=\"com.android.chrome:id/negative_button\"]");
	By btnSearch = By.xpath("//*[@resource-id=\"com.android.chrome:id/search_box_text\"]");
	By btnLink = By.xpath("//*[@text=\"testing.jobbiando.cl/registroPrestador\"]");
	By btnCerrar = By.xpath("//*[@resource-id=\"com.android.chrome:id/infobar_close_button\"]");
	By btnBlock = By.xpath("//*[@text=\"BLOCK\"]");
	By btnAllow = By.xpath("//*[@text=\"ALLOW\"]");
	By txtNombres=By.xpath("//*[@resource-id=\"mat-input-0\"]");
	By txtApellidos=By.xpath("//*[@resource-id=\"mat-input-\"]");//aca
	By txtFechaNacimiento=By.xpath("//*[@resource-id=\"fecha_nacimiento\"]");
	By btnFormulario = By.xpath("//*[@text=\"Crea una cuenta\"]");
	By txtCorreo=By.xpath("//*[@resource-id=\"mat-input-3\"]");
	By txtContrasena=By.xpath("//*[@resource-id=\"password\"]");
	By txtContrasena2=By.xpath("//*[@resource-id=\"mat-input-5\"]");
	By btnTipoDocumento = By.xpath("//*[@resource-id=\"selectTipo\"]");
	By btnCedulaDeIdentidadOpcion0 = By.xpath("//*[@resource-id=\"optionTipo0\"]");
	By txtNumeroIdentificador= By.xpath("//*[@resource-id=\"mat-input-6\"]");
	By txtNumeroSerie= By.xpath("//*[@resource-id=\"numero_serie\"]");
	By txtCalle= By.xpath("//*[@resource-id=\"mat-input-8\"]");
	By txtDireccion= By.xpath("//*[@resource-id=\"mat-input-9\"]");
	By txtNombreDireccion= By.xpath("//*[@resource-id=\"mat-input-10\"]");
	By txtReferencia= By.xpath("//*[@resource-id=\"mat-input-11\"]");
	By btnRegistrar= By.xpath("//*[@resource-id=\"btnSaveRegistro\"]"); 
	
	public CompararPage(WebDriver elemento) 
	{
		this.driver=elemento;
	}
	
	public void irALaPagina() throws InterruptedException {
		driver.navigate().to("https://www.gadgetsnow.com/compare-laptops");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
}
