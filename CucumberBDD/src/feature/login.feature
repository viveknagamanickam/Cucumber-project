Feature: CRM website

@login
Scenario: Login to CRM website
Given I am in the CRM index page
When I enter userid and password
And click on login
Then I am in home page

@newTask
Scenario: Creating a new task
Given I am in the home page
When I click on the tasks taskbar
Then I am in the create task page