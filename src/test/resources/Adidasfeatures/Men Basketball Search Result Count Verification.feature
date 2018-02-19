Feature: Men Basketball Search Result Count Verification


	@web
  Scenario: Validate Basketball Search Result Count Verification
    When Open a browser and open Adidas online store site
    Then Verify Adidas online store Home Page
    And Hover over Men Menu
    Then Verify Men Menu opens
    Then Click on Basketball link
    Then verify Men Basketball page appears
    Then Validate Search Count of Men basketball