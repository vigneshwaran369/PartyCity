Feature: Order KitKat Cady in party city website


Scenario: Visit Home page of the Party City website


Given : User can launch the Party city URL

When : User can see the candy and BakeWare element is visible or not

And : User can click the candy and BakeWare element

Then : User can successfully navigate to the next page by cliking chocolate candy



Scenario: Choose the Product and add to the cart

Given : User can see the Kitkat Milk chocolate visible or not

When : User can click the Kitkat Milk chocolate 

And : User can successfully navigate to the next page 

And : User can verify the selected product

And : User can click ship it for add the product to the cart

Then : User can see the added product by clicking view cart



Scenario: Detect the location

Given : User can click the change zip code

When : User can click either use my location or enter the zipcode to detect the location 

Then : User can click the contiue to checkout button 


Scenario: Create the account 

Given : User can click the create your party city account

When : User can enter their email address in the given field

And : User can enter their first name in the given field

And : User can enter their last name in the given field

And : User can enter their password and confirm password in the given field

Then : User can click the create my account


Scenario: Address

Given : User can click the Alert message

When : User can enter their first name, last name , address line 1 , and address line and city 

And : User can choose their state from the drop down 

Then : User can click the yes check box to receive email from the party city


Scenario: Payment 

Given : User can click the Go to payment

When : User can see the address verification and click continue

And : User can click the credit card option 

And : User can enter their card details in the given field

And : User can click Use shipping address check box

And : User can enter their mobile number in the given field

Then : User can click the review my order and checkout the kitkat milk chocolate




