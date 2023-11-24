import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://leanqa10.lightning.force.com/");
		System.out.println("Browser launch");

	}
}
