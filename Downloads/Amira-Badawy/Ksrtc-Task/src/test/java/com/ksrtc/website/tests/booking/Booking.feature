Feature: Ksrtc Functionality

  Scenario Outline: Booking functionality
    Given website is opened
    When choose from target trip from the popular routes in home page
    And choose the arrival date in home page
    And click on arrow in calender in home page
    And click on target arrival date in home page
    And click on Search for bus button in home page
    And click on select seats button in booking page
    And click on the dropping point tab in booking page
    And choose the  target dropping point in booking page
    And type mobile number "<mobileNumber>" in customer details in booking page
    And type email "<email>" customer details in booking page
    And Choose the seventeenth seat in booking page
    And type passenger name "<passengerName>" in passenger details in booking page
    And Choose gender in passenger details in booking page
    And type passenger age "<passengerAge>" in passenger details in booking page
    And choose concession in passenger details in booking page
    And click on make payment button in booking page
    And type card Number "<cardNumber>" in payment page
    And type cvv Number "<cvvNumber>" in payment page
    And type card Holder Name "<cardHolderName>" in payment page
    And select expiry month and expiry year in payment page
    Then make payment button should be displayed in cart page
    Examples:
      | mobileNumber | email                  | passengerName | passengerAge |   cardNumber              | cvvNumber   | cardHolderName |
      | 6789125987   | am6789125987@gmail.com | Amira         | 30           |   5482742856191443        |    359      |  Amira Badawy  |