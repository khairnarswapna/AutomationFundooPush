
/**
 * Description : HomePage.java init all webelements and Contains the Methods
 * Author      : Sheetal Chaudhari
 * Date        : 13/01/2020
 */

package com.fundoopush.pages;

import com.fundoopush.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class HomePage extends BaseClass
{
	//plus-div
	@FindBy(xpath="/html/body/app-root/app-dashboard/app-article/div/div[3]/div/mat-icon")
	private WebElement ClickAdd;
	
	@FindBy(xpath="//button[contains(text(),'ADD STORY')]")
	private WebElement AddSTORY;
	
    @FindBy(id="mat-input-3")
    private WebElement ClickRedirectLink;
    
    @FindBy(xpath="//span[contains(text(),'Post')]")
	private WebElement Postbtn;
	
	//constructor
	public HomePage(WebDriver driver) 
	{   
		//Initialization
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void ClickAddbtn()
	{
		ClickAdd.click();
	}
	
	public void ClickAddStory() 
	{
		 AddSTORY.click();
	}
	
	public void ClickRedirectLink()
    {
		ClickRedirectLink.sendKeys("https://www.bbc.com/news/world-us-canada-49173804");
	}
	
	public void ClickPost() 
	{
		Postbtn.click();
	}
	
	
}
