Feature: Login Functionality

  Background: User is successfully logged in
 Given User open "Chrome" browser with exe 
 Given User open url as 

@SmokeTest
  Scenario: Login functionality with valid credintials
 When User click on cancel button
 When User move on login dropdown
 When User click on my profile
 When User enter "7350578090" as username
 When User enter "Pass@123" as password
 When user click on login button
 Then Application shows user profile to user
