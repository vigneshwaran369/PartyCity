package com.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;
import com.utility.X_PartyCity_Single_Ton_Design;
import com.web.properties.Configuration_Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Partycity_Stepdef extends Base_Class {

	X_PartyCity_Single_Ton_Design v = new X_PartyCity_Single_Ton_Design(driver);

	@Given(": User can launch the Party city URL")
	public void user_can_launch_the_party_city_url() throws IOException {

		String url = Configuration_Helper.getTheDetails().getUrl();
		getURL(url);

		waits();

	}

	@When(": User can see the candy and BakeWare element is visible or not")
	public void user_can_see_the_candy_and_bake_ware_element_is_visible_or_not() {
		boolean displayed = v.getA().getCandy().isDisplayed();
		System.out.println(displayed);
	}

	@When(": User can click the candy and BakeWare element")
	public void user_can_click_the_candy_and_bake_ware_element() {

		moveToElement(v.getA().getCandy(), "move to element");

	}

	@Then(": User can successfully navigate to the next page by cliking chocolate candy")
	public void user_can_successfully_navigate_to_the_next_page_by_cliking_chocolate_candy() {

		scrollDown();

		v.getA().getChocolateCandy().click();

	}

	@Given(": User can see the Kitkat Milk chocolate visible or not")
	public void user_can_see_the_kitkat_milk_chocolate_visible_or_not() {

		boolean displayed = v.getB().getKitkat().isDisplayed();
		System.out.println(displayed);

	}

	@When(": User can click the Kitkat Milk chocolate")
	public void user_can_click_the_kitkat_milk_chocolate() {
		v.getB().getKitkat().click();
	}

	@When(": User can successfully navigate to the next page")
	public void user_can_successfully_navigate_to_the_next_page() {

	}

	@When(": User can verify the selected product")
	public void user_can_verify_the_selected_product() {

	}

	@When(": User can click ship it for add the product to the cart")
	public void user_can_click_ship_it_for_add_the_product_to_the_cart() {
		v.getB().getShipIt().click();
	}

	@Then(": User can see the added product by clicking view cart")
	public void user_can_see_the_added_product_by_clicking_view_cart() {

		v.getB().getViewCart().click();
	}

	@Given(": User can click the change zip code")
	public void user_can_click_the_change_zip_code() {

		scrollDown();

		v.getC().getZipCode().click();
	}

	@When(": User can click either use my location or enter the zipcode to detect the location")
	public void user_can_click_either_use_my_location_or_enter_the_zipcode_to_detect_the_location() {

		v.getC().getUseMyLocation().click();
	}

	@Then(": User can click the contiue to checkout button")
	public void user_can_click_the_contiue_to_checkout_button() {

		scrollDown();
		v.getC().getCheckOut().click();
	}

	@Given(": User can click the create your party city account")
	public void user_can_click_the_create_your_party_city_account() {
		v.getD().getCreateAccount().click();
	}

	@When(": User can enter their email address in the given field")
	public void user_can_enter_their_email_address_in_the_given_field() throws IOException {

		String email = Configuration_Helper.getTheDetails().getEmail();

		sendKeys(v.getD().getEmail(), email);

	}

	@When(": User can enter their first name in the given field")
	public void user_can_enter_their_first_name_in_the_given_field() throws IOException {
		String firstName = Configuration_Helper.getTheDetails().firstName();
		sendKeys(v.getD().getFirstName(), firstName);
	}

	@When(": User can enter their last name in the given field")
	public void user_can_enter_their_last_name_in_the_given_field() throws IOException {

		String lastName = Configuration_Helper.getTheDetails().lastName();

		sendKeys(v.getD().getLastName(), lastName);
	}

	@When(": User can enter their password and confirm password in the given field")
	public void user_can_enter_their_password_and_confirm_password_in_the_given_field() throws IOException {

		String password = Configuration_Helper.getTheDetails().password();
		sendKeys(v.getD().getPassword(), password);
		sendKeys(v.getD().getConfirmPassword(), password);
	}

	@Then(": User can click the create my account")
	public void user_can_click_the_create_my_account() {
		v.getD().getClickCreateMyAcc().click();
	}

	@Given(": User can click the Alert message")
	public void user_can_click_the_alert_message() {

	}

	@When(": User can enter their first name, last name , address line {int} , and address line and city")
	public void user_can_enter_their_first_name_last_name_address_line_and_address_line_and_city(Integer int1)
			throws IOException, InterruptedException {

		String address = Configuration_Helper.getTheDetails().address();

		sendKeys(v.getE().getAddress(), address);

		Thread.sleep(3000);

		click(v.getE().getCity());
		

		String fname = Configuration_Helper.getTheDetails().fname();
		String lname = Configuration_Helper.getTheDetails().lname();
		sendKeys(v.getE().getfName(), fname);
		sendKeys(v.getE().getlName(), lname);

	}

	@When(": User can choose their state from the drop down")
	public void user_can_choose_their_state_from_the_drop_down() throws IOException {
		String state = Configuration_Helper.getTheDetails().state();
		dropDownText(v.getE().getState(), state);
	}

	@Then(": User can click the yes check box to receive email from the party city")
	public void user_can_click_the_yes_check_box_to_receive_email_from_the_party_city() {
		click(v.getE().getYes());

	}

	@Given(": User can click the Go to payment")
	public void user_can_click_the_go_to_payment() {
		click(v.getE().getPayment());
	}

	@When(": User can see the address verification and click continue")
	public void user_can_see_the_address_verification_and_click_continue() {

		click(v.getF().getContinu());
	}

	@When(": User can click the credit card option")
	public void user_can_click_the_credit_card_option() {
		click(v.getF().getCreditCard());
	}

	@When(": User can enter their card details in the given field")
	public void user_can_enter_their_card_details_in_the_given_field() throws IOException {

		String cardNumber = Configuration_Helper.getTheDetails().cardNum();
		String expDate = Configuration_Helper.getTheDetails().expDate();
		String cvv = Configuration_Helper.getTheDetails().cvv();

		sendKeys(v.getF().getCardNum(), cardNumber);
		sendKeys(v.getF().getExDate(), expDate);
		sendKeys(v.getF().getCvv(), cvv);
	}

	@When(": User can click Use shipping address check box")
	public void user_can_click_use_shipping_address_check_box() {
		click(v.getF().getCheckBox());
	}

	@When(": User can enter their mobile number in the given field")
	public void user_can_enter_their_mobile_number_in_the_given_field() throws IOException {
		String mobileNum = Configuration_Helper.getTheDetails().mobileNum();
		sendKeys(v.getF().getMobileNum(), mobileNum);
	}

	@Then(": User can click the review my order and checkout the kitkat milk chocolate")
	public void user_can_click_the_review_my_order_and_checkout_the_kitkat_milk_chocolate() throws IOException {

		click(v.getF().getReviewMyOrder());
		screenShot("partycity");
	}

}
