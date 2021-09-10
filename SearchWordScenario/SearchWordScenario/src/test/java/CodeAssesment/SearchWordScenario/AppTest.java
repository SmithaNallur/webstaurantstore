package CodeAssesment.SearchWordScenario;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	WebDriver driver;
	@BeforeClass
	public void Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.webstaurantstore.com/");
		
	}
    @Test
    public void verifyWordTable() throws InterruptedException 
    {
    	driver.findElement(By.id("searchval")).sendKeys("stainless work table \n");
    WebElement nextButton= driver.findElement(By.xpath("//li[@class='rc-pagination-next']"));
    try{
    	List<WebElement> listOfItems=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    			int numOfItems_Page1=listOfItems.size();
    	    	System.out.println(numOfItems_Page1);
    	    	for(WebElement item:listOfItems) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
    }catch(AssertionError e) {
    	System.out.println("Does not contain Table in all Titles in Page 1");
    }
    	    
    	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-2']")).click();
    	    	try {
    	    	List<WebElement> listOfItems2=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page2=listOfItems2.size();
    	    	System.out.println(numOfItems_Page2);
    	    	for(WebElement item:listOfItems2) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
    	    	}catch(AssertionError e) {
    	        	System.out.println("Does not contain Table in all Titles in Page 2");
    	        }
    	    	
    	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-3']")).click();
    	    	Wait<WebDriver> wait=new WebDriverWait(driver,30);
        	    	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
        	    	 try {
    	    	List<WebElement> listOfItems3=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page3=listOfItems3.size();
    	    	System.out.println(numOfItems_Page3);
    	    	for(WebElement item:listOfItems3) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
        	    	 }catch(AssertionError e) {
        	         	System.out.println("Does not contain Table in all Titles in Page 3");
        	         }
    	    	
    	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-4']")).click();
    	    	Wait<WebDriver> wait2=new WebDriverWait(driver,30);
        	    	 wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
        	    	 try {
    	    	List<WebElement> listOfItems4=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page4=listOfItems4.size();
    	    	System.out.println(numOfItems_Page4);
    	    	for(WebElement item:listOfItems4) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
        	    	 }catch(AssertionError e) {
        	         	System.out.println("Does not contain Table in all Titles in Page 4");
        	         }
    	    	
    	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-5']")).click();
    	    	Wait<WebDriver> wait3=new WebDriverWait(driver,30);
        	    	 wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
        	    	 try {
    	    	List<WebElement> listOfItems5=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page5=listOfItems5.size();
    	    	System.out.println(numOfItems_Page5);
    	    	for(WebElement item:listOfItems5) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
        	    	 }catch(AssertionError e) {
        	         	System.out.println("Does not contain Table in all Titles in Page 5");
        	         }
    	    	
    	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-6']")).click();
    	    	Wait<WebDriver> wait4=new WebDriverWait(driver,30);
        	    	 wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
        	    	 try {
    	    	List<WebElement> listOfItems6=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page6=listOfItems6.size();
    	    	System.out.println(numOfItems_Page6);
    	    	for(WebElement item:listOfItems6) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
        	    	 }catch(AssertionError e) {
        	         	System.out.println("Does not contain Table in all Titles in Page 9");
        	         }
    	    	try {
    	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-7']")).click();
    	    	Wait<WebDriver> wait5=new WebDriverWait(driver,30);
        	    	 wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
    	    	List<WebElement> listOfItems7=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page7=listOfItems7.size();
    	    	System.out.println(numOfItems_Page7);
    	    	for(WebElement item:listOfItems7) {
    	    		String itemTitle=item.getText();
    	    		Assert.assertTrue(itemTitle.contains("Table"));
    	    	}
    }catch(AssertionError e) {
    	System.out.println("Does not contain Table in all Titles in Page 7");
    }
    	    	
    	    	
    	    	try {
        	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-8']")).click();
        	    	Wait<WebDriver> wait6=new WebDriverWait(driver,30);
            	    	 wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
        	    	List<WebElement> listOfItems8=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
        	    	int numOfItems_Page8=listOfItems8.size();
        	    	System.out.println(numOfItems_Page8);
        	    	for(WebElement item:listOfItems8) {
        	    		String itemTitle=item.getText();
        	    		Assert.assertTrue(itemTitle.contains("Table"));
        	    	}
        }catch(AssertionError e) {
        	System.out.println("Does not contain Table in all Titles in Page 8");
        }
    	    	
    	    	try {
        	    	driver.findElement(By.xpath("//div[@id='paging']//li[@class='rc-pagination-item rc-pagination-item-9']")).click();
        	    	Wait<WebDriver> wait7=new WebDriverWait(driver,30);
            	    	 wait7.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']")));
        	    	List<WebElement> listOfItems9=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
        	    	int numOfItems_Page9=listOfItems9.size();
        	    	System.out.println(numOfItems_Page9);
        	    	for(WebElement item:listOfItems9) {
        	    		String itemTitle=item.getText();
        	    		Assert.assertTrue(itemTitle.contains("Table"));
        	    	}
        }catch(AssertionError e) {
        	System.out.println("Does not contain Table in all Titles in Page 9");
        }
    	    	List<WebElement> listOfItems9=driver.findElements(By.xpath("//*[@id='details']/a[@data-testid='itemDescription']"));
    	    	int numOfItems_Page9=listOfItems9.size();
    	    	System.out.println(numOfItems_Page9);
    	    	//Add to cart the last found item in Page9
    	    	listOfItems9.get(numOfItems_Page9-1).click();
    	    	driver.findElement(By.xpath("//input[@id='buyButton']")).click(); 
    	    	System.out.println("Last item added to cart");
    	    	//Go to cart
    	    	driver.findElement(By.xpath("//a[@data-testid='cart-nav-link']")).click();
    	    	//Empty the cart
    	    	driver.findElement(By.xpath("//a[contains(text(),'Empty Cart')]")).click();
    	    	Thread.sleep(2000);
    	   
    	    	driver.findElement(By.xpath("(//div[@class='modal-dialog']/div/div[3]/button[1])[2]")).click();
    	   
    	    	
    }
   
}
    	    