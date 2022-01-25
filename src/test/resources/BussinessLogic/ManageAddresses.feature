Feature: Manage Addresses Functionality

  Background: User is successfully logged in
 Given User open "Chrome" browser with exe 
 Given User open url as 
 Given User click on cancel button
 Given User move on login dropdown
 Given User click on my profile
 Given User enter "7350578090" as username
 Given User enter "Pass@123" as password
 Given user click on login button
 
 @SmokeTest
 Scenario: Manage addresses functionality with valid data
 When User click on manage addresses
 When User click on add a new address
 When User enter "Prashant" as name
 When User enter "7350578090" as mobile number
 When User enter "411015" as pin code
 When User enter "Alandi Road" as locality
 When User enter "Gaikwadnagar" as address
 When User select Home as address type
 When User click on save button
 Then Application shows new address added successfully
