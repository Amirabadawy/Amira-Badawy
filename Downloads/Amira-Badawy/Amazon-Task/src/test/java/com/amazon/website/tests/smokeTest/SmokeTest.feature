Feature: Amazon Functionality

  Scenario Outline: Search functionality
    Given website is opened
    When search for "<searchQuery>" in home page
    And click on search button in home page
    And click on the Item in result page
    And click on add to cart button in product page
    And click on cart icon in nav bar in home page
    Then proceedToCheckout button should be displayed in cart page
    Examples:
    | searchQuery |
    | car accessories |

  Scenario: Filter Functionality
    Given website is opened
    When click on today's deals section in home page
    And select Headphones in today's deals page
    And select on grocery in today's deals page
    And select on 10% off or more in today's deals page
    And click on third page in nav bar in today's deals page
    And click on fourth page in nav bar in today's deals page
    And click on Item in forth page in today's deals page
    And click on add to cart button in product page
    And click on cart icon in nav bar in home page
    Then proceedToCheckout button should be displayed in cart page



