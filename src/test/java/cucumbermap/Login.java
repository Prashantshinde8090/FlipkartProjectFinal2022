package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class Login 
{
	
	
	@Given("^User open \"(.+)\" browser with exe$")
	public void user_open_browser_with_exe(String bname)
	{
		Object[]input=new Object[1];                              //browser launch
		   input[0]=bname;
		   SeleniumOperation.browserLaunch(input);
			
	}

	
	@Given("^User open url as$")
	public void user_open_url_as() 
	{
                                                                //open application
		   SeleniumOperation.openapplication();	
	}

	
	@When("^User click on cancel button$")
	public void user_click_on_cancel_button() 
	{
		   Object[]input2=new Object[1];                        //close button
		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		   Hashtable<String,Object> output2=SeleniumOperation.clickonelement(input2);
  HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"User click on cancel button",output2.get("MESSAGE").toString());
	}

	@When("^User move on login dropdown$")
	public void user_move_on_login_dropdown() 
	{
	       Object[]input3=new Object[1];                       //move to login
		   input3[0]="//*[text()='Login']";
		   Hashtable<String,Object> output3=SeleniumOperation.movetoelement(input3);
  HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"User move on login dropdown",output3.get("MESSAGE").toString());
	}

	@When("^User click on my profile$")
	public void user_click_on_my_profile() 
	{
		   Object[]input4=new Object[1];                       //click on element
		   input4[0]="//*[text()='My Profile']";
		   Hashtable<String,Object> output4=SeleniumOperation.clickonelement(input4);
  HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"User click on my profile" , output4.get("MESSAGE").toString());
	}

	@When("User enter {string} as username")
	public void user_enter_as_username(String name)
	{
		   Object[]input5=new Object[2];        
		   input5[0]="//*[@class='_2IX_2- VJZDxU']";          //enter user name
		   input5[1]=name;
		   Hashtable<String,Object> output5= SeleniumOperation.sendkeys(input5); 
   HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"User enter {string} as username" , output5.get("MESSAGE").toString());
	}

	@When("User enter {string} as password")
	public void user_enter_as_password(String pass)
	{
		   Object[]input6=new Object[2];        
		   input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";     //password
		   input6[1]=pass;
		   Hashtable<String,Object> output6=SeleniumOperation.sendkeys(input6);
   HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"User enter {string} as password",output6.get("MESSAGE").toString());
	}

	@When("user click on login button")
	public void user_click_on_login_button()
	{
		   Object[]input7=new Object[1];       
		   input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";       //click on element
		   Hashtable<String,Object> output7= SeleniumOperation.clickonelement(input7);	
   HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user click on login button",output7.get("MESSAGE").toString());
	}

	@Then("Application shows user profile to user")
	public void application_shows_user_profile_to_user()
	{
		   Object[]input9=new Object[2];        
		   input9[0]="//*[@class='_14mvAI']";     //get text
		   input9[1]="Hello";
		   Hashtable<String,Object> output9= SeleniumOperation.gettext(input9);	
   HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"Application shows user profile to user",output9.get("MESSAGE").toString());
	}

}
