package utility;

public class Trail
{

	public static void main(String[]args)
	 {
	   Object[]input=new Object[2];        //browser launch
	   input[0]="Chrome";
	   input[1]="F:\\Automation Support\\chromedriver.exe";
	   SeleniumOperation.browserLaunch(input);
	   
	   Object[]input1=new Object[1];            //open application
	   input1[0]="https://www.flipkart.com/";
	   SeleniumOperation.openapplication();
	   
	    Object[]input2=new Object[1];               //close button
	   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
      SeleniumOperation.clickonelement(input2);
	   
	   Object[]input3=new Object[1];                //move to login
	   input3[0]="//*[text()='Login']";
	   SeleniumOperation.movetoelement(input3);
	   
	    
       Object[]input4=new Object[1];               //click on element
	   input4[0]="//*[text()='My Profile']";
	   SeleniumOperation.clickonelement(input4);
	   
	   
	   Object[]input5=new Object[2];        
	   input5[0]="//*[@class='_2IX_2- VJZDxU']";     //enter user name
	   input5[1]="7350578090";
	   SeleniumOperation.sendkeys(input5); 
	   
	   Object[]input6=new Object[2];        
	   input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";     //password
	   input6[1]="Pass@123";
	   SeleniumOperation.sendkeys(input6); 
	   
	   Object[]input7=new Object[1];       
	   input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";       //click on element
	   SeleniumOperation.clickonelement(input7);
	   
	   Object[]input9=new Object[2];        
	   input9[0]="//*[@class='_14mvAI']";     //get text
	   input9[1]="hello";
	   SeleniumOperation.gettext(input9);
	   
	   
	  }

}

