Feature: Checking the hotel booking functionality of an adactin application
Scenario: Login Functionality
Given user Must Launch The Url
When user Enter the Username In The Username Field
And user Enter the Password In The Password Field
Then user Click The LoginButton  It Navigate To The Search Hotel


Scenario: Search Hotel Functionality
When user Select The Location In The Location Field
And user Select The Hotel In The Hotel Field
And user Select The RoomType In The Roomtype Field
And user Select The Numberofrooms In The Numberofrooms Field
And user Enter The CheckInDate In The CheckInDate Field
And user Enter The CheckOutDate In The CheckOutDate Field
And user Select The AdultsPerRoom In The AdultsPerRoom Field
And user Select The ChildrenPerRoom In the ChildrenPerRoom Field
Then user Click The SearchButton And It Navigate To The Select Hotel

Scenario: Select Hotel Functinality
When user Select The RadioButton In The RadioButton Field
Then user Click The ContinueButton And It Navigate To The Book A Hotel

Scenario: Book Hotel Functionality
When user Enter The FirstName In The FirstName Field
And user Enter The LastName In The LastName Field
And user Enter The BillingAddress In The BillingAddress Field
And user Enter The CreditCardNo In The CreditCardNo Field
And user Select The CreditCardType In The CreditCardType Field
And user Select The Month In The Month Field
And user Select The Year In The Year Field
And user Enter The CVV In The CVV Field
Then user Click The BookNowButton In The BookNowButton Field


