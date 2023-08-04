Feature: Test Guru99 Application

  Scenario: Test contact info
    Given User is on Guru99 Application
    When user enter firstname, lastname, phone and email

  Scenario: Test Mailling info
    Then user enter address, city, state, postalcode and country

  Scenario: Test user info
    When user enter username, password and cofirm password
    Then click on submit btn

  Scenario: Test Register Page
    Then user click on sign in link

  Scenario: User test signin page
    When user enter username, password and click on sublit button
    Then user capture the pagetitle
