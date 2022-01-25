package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class ManageAddress
{
   
	@When("User click on manage addresses")
	public void user_click_on_manage_addresses() throws InterruptedException 
	{   Thread.sleep(9000);
	    Object [] input=new Object[1];
		input[0]="(//*[@class='NS64GK'])[1]";
		Hashtable<String, Object> output= SeleniumOperation.clickonelement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"User click on manage addresses",output.get("MESSAGE").toString());
    
	}

	@When("User click on add a new address")
	public void user_click_on_add_a_new_address()
	{
		Object [] input1=new Object[1];
        input1[0]="//*[@class='_1QhEVk']";
        Hashtable<String, Object> output1= SeleniumOperation.clickonelement(input1);
        HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"User click on add a new address",output1.get("MESSAGE").toString());
	}

	@When("User enter {string} as name")
	public void user_enter_as_name(String name)
	{
		Object[]input2=new Object[2];        
		input2[0]="//*[@name='name']";        
		input2[1]=name;
		Hashtable<String,Object> output2= SeleniumOperation.sendkeys(input2); 
        HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"User enter {string} as name" , output2.get("MESSAGE").toString());	
		
	}

	@When("User enter {string} as mobile number")
	public void user_enter_as_mobile_number(String number) 
	{
		Object[]input3=new Object[2];        
		input3[0]="//*[@name='phone']";         
		input3[1]=number;
		Hashtable<String,Object> output3= SeleniumOperation.sendkeys(input3); 
        HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"User enter {string} as mobile number" , output3.get("MESSAGE").toString());
	
	}

	@When("User enter {string} as pin code")
	public void user_enter_as_pin_code(String pin)
	{
		Object[]input4=new Object[2];        
		input4[0]="//*[@name='pincode']";        
		input4[1]=pin;
		Hashtable<String,Object> output4= SeleniumOperation.sendkeys(input4); 
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"User enter {string} as pin code" , output4.get("MESSAGE").toString());

	}

	@When("User enter {string} as locality")
	public void user_enter_as_locality(String locality) 
	{ 
		Object[]input5=new Object[2];        
		input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";       
		input5[1]=locality;
		Hashtable<String,Object> output5= SeleniumOperation.sendkeys(input5); 
        HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"User enter {string} as locality" , output5.get("MESSAGE").toString());

		
	}

	@When("User enter {string} as address")
	public void user_enter_as_address(String address)
	{
		Object[]input6=new Object[2];        
		input6[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";       
		input6[1]=address;
		Hashtable<String,Object> output6= SeleniumOperation.sendkeys(input6); 
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"User enter {string} as address" , output6.get("MESSAGE").toString());
		
	}

	@When("User select Home as address type")
	public void user_select_home_as_address_type() 
	{
		Object [] input7=new Object[1];
        input7[0]="(//*[@class='_1XFPmK'])[1]";
        Hashtable<String, Object> output7= SeleniumOperation.clickonelement(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"User select Home as address type",output7.get("MESSAGE").toString());	
		
	}

	@When("User click on save button")
	public void user_click_on_save_button()
	{
		Object [] input8=new Object[1];
        input8[0]="//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL']";
        Hashtable<String, Object> output8= SeleniumOperation.clickonelement(input8);
        HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"User click on save button",output8.get("MESSAGE").toString());
		
	}

	@Then("Application shows new address added successfully")
	public void application_shows_new_address_added_successfully() 
	{
		 Object[]input9=new Object[2];        
		 input9[0]="(//*[text()='Prashant'])[1]";  
		 input9[1]="Prashant";
		 Hashtable<String,Object> output9= SeleniumOperation.gettext(input9);	
       HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"Application shows new address added successfully",output9.get("MESSAGE").toString());
		
		
	}

}
