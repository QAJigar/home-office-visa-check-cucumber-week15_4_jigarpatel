@visaCheck
Feature: Visa Check function
  As a user I want to check visa on Gov UK

  @author_JigarPatel @smoke @sanity @regression
  Scenario: Australian coming to UK for tourism.
    Given  I am on uk visa check home page
    When I click on start button
    And  I Select a Nationality "Australia"
    And  I Click on Continue button
    And Select reason "Tourism"
    And Click on Continue button
    Then verify result "You will not need a visa to come to the UK"

  @author_JigarPatel @smoke @regression
  Scenario: Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months.
    Given  I am on uk visa check home page
    When I click on start button
    And I Select a Nationality "Chile"
    And Click on Continue button
    And Select reason "Work, academic visit or business"
    And Click on Continue button
    And Select intendent to stay for "longer than 6 months"
    And Click on Continue button
    And Select have planning to work for "Health and care professional"
    And Click on Continue button
    Then verify result "You need a visa to work in health and care"

  @author_JigarPatel @regression
  Scenario: Columbian National Coming To The UK To Join A Partner For ALong Stay They Do Have An Article10Or20 Card.
    Given  I am on uk visa check home page
    When I click on start button
    And I Select a Nationality "Dominica"
    And Click on Continue button
    And Select reason "Join partner or family for a long stay"
    And Click on Continue button
    And Select state My partner of family member have uk immigration status "Yes"
    And Click on Continue button
    Then verify result "You’ll need a visa to join your family or partner in the UK"
