package objectRepositry;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutpage extends BasePage {

	
	
	public CheckOutpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	// Billing Address
	
	
	
	
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	private WebElement County_dropdown; 
	
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityname;
	
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement Address1;
	
	@FindBy(id= "BillingNewAddress_ZipPostalCode")
	private WebElement Zipcode;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement Phonenumber;
	
	@FindBy(xpath = "(//input[@class='button-1 new-address-next-step-button'])[1]")
	private WebElement billing_Continue_buttton;

	public WebElement getCityname() {
		return cityname;
	}

	public WebElement getAddress1() {
		return Address1;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	public WebElement getCounty_dropdown() {
		return County_dropdown;
	}

	
	public WebElement getbilling_Continue_button() {
		return billing_Continue_buttton;
	}
	
	
	
	//shipping Address
	@FindBy(xpath = "(//input[@class=\"button-1 new-address-next-step-button\"])[2]")

	private WebElement Shippping_address_contiune_button;
	
	
	@FindBy(xpath = "//input[@id=\"PickUpInStore\"]")
	
	private WebElement In_pickup_store;
	
	public WebElement getShippping_address_contiune_button() {
		return Shippping_address_contiune_button;
	}

	public WebElement getIn_pickup_store() {
		return In_pickup_store;
	}

	
	//shipping Method
	
	

	@FindBy(xpath = "//input[@class=\"button-1 shipping-method-next-step-button\"]")
	private WebElement shipping_method_contiune;
	
	@FindBy(xpath = "//div[@id=\"shipping-method-buttons-container\"]//p[@class=\"back-link\"]")
	private WebElement shipping_method_back_button;
	
	@FindBy(xpath ="//input[@id=\"shippingoption_0\"]")
	private WebElement shipping_method_ground_radio_button;
	
	@FindBy(xpath = "//input[@id=\"shippingoption_1\"]")
	private WebElement shipping_method_next_day_air;
	
	@FindBy(xpath = "//input[@id=\"shippingoption_2\"]")
	private WebElement shipping_method_2nd_day_air;
	
	

	public WebElement getShipping_method_ground_radio_button() {
		return shipping_method_ground_radio_button;
	}

	public WebElement getShipping_method_next_day_air() {
		return shipping_method_next_day_air;
	}

	public WebElement getShipping_method_2nd_day_air() {
		return shipping_method_2nd_day_air;
	}

	public WebElement getShipping_method_back_button() {
		return shipping_method_back_button;
	}

	public WebElement getShipping_method_contiune() {
		return shipping_method_contiune;
	}
	
	
	//payment method
	
	@FindBy(xpath = "//input[@id=\"paymentmethod_0\"]")
	private WebElement Payment_CashOnDelivery;
	
	@FindBy(xpath = "//input[@id=\"paymentmethod_1\"]")
	private WebElement Payment_CheckMoney_Order;
	
	@FindBy(xpath = "//input[@id=\"paymentmethod_2\"]")
	private WebElement payment_credit_card;
	
	
	@FindBy(xpath = "//input[@id=\"paymentmethod_3\"]")
	private WebElement payment_purchase_order;
	
	
	@FindBy(xpath = "//input[@class=\"button-1 payment-method-next-step-button\"]")
	private WebElement payment_contiune_button;
	
	@FindBy(xpath = "//div[@id=\"payment-method-buttons-container\"]//p[@class=\"back-link\"]")
	private WebElement payment_back_button;
	
	
	public WebElement getPayment_CheckMoney_Order() {
		return Payment_CheckMoney_Order;
	}

	public WebElement getPayment_credit_card() {
		return payment_credit_card;
	}

	public WebElement getPayment_purchase_order() {
		return payment_purchase_order;
	}

	public WebElement getPayment_CashOnDelivery() {
		return Payment_CashOnDelivery;
	}

	public WebElement getPayment_contiune_button() {
		return payment_contiune_button;
	}

	public WebElement getPayment_back_button() {
		return payment_back_button;
	}

	
	
	//payment info
	
	@FindBy(xpath = "//div[@id=\"payment-info-buttons-container\"]//p[@class=\"back-link\"]")
	private WebElement payment_info_back_button;
	
	@FindBy(xpath = "//input[@class=\"button-1 payment-info-next-step-button\"]")
	private WebElement payment_info_contiune_button;
	
	
	public WebElement getPayment_info_contiune_button() {
		return payment_info_contiune_button;
	}

	public WebElement getPayment_info_back_button() {
		return payment_info_back_button;
		
	}
		
		//confirm order
		
		@FindBy(xpath = "//div[@id=\\\"confirm-order-buttons-container\\\"]//p[@class=\\\"back-link\\\"]")
		private WebElement confirm_order_back_button;

		@FindBy(xpath = "//input[@class=\"button-1 confirm-order-next-step-button\"]")
		private WebElement confirm_order_button;

		public WebElement getConfirm_order_back_button() {
			return confirm_order_back_button;
		}

		public WebElement getConfirm_order_button() {
			return confirm_order_button;
		}
	
		
		//thank you
		
		@FindBy(xpath = "//input[@class=\"button-2 order-completed-continue-button\"]")
		private WebElement thank_you_continue_button;
		
		@FindBy(xpath = "//a[.='Click here for order details.']")
		private WebElement click_here_for_order_details_link;

		public WebElement getClick_here_for_order_details_link() {
			return click_here_for_order_details_link;
		}

		public WebElement getThank_you_continue_button() {
			return thank_you_continue_button;
		}
		
		//order information
		
		@FindBy(xpath = "//a[.='PDF Invoice']")
		private WebElement pdf_invoice_button;
		
		@FindBy(xpath = "//a[.='Print']")
		private WebElement print_button;
		
		@FindBy(css = ".button-1.re-order-button")
		private WebElement Re_order_button;

		public WebElement getPdf_invoice_button() {
			return pdf_invoice_button;
		}

		public WebElement getPrint_button() {
			return print_button;
		}

		public WebElement getRe_order_button() {
			return Re_order_button;
		}
		
		//title
		@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
		private WebElement check_out_page_title;

		public WebElement getBilling_Continue_buttton() {
			return billing_Continue_buttton;
		}

		public WebElement getCheck_out_page_title() {
			return check_out_page_title;
		}
		
		@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
		private WebElement Thank_you_page_title;

		public WebElement getThank_you_page_title() {
			return Thank_you_page_title;
		}
		
	
}
