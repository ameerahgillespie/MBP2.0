public class CreditCardPayment extends Payment {


  private String cardName;
	public String getCardName() {
	return cardName;
}



public void setCardName(String cardName) {
	this.cardName = cardName;
}



public String getExpireDate() {
	return expireDate;
}



public void setExpireDate(String expireDate) {
	this.expireDate = expireDate;
}



public String getCreditCardNum() {
	return creditCardNum;
}



public void setCreditCardNum(String creditCardNum) {
	this.creditCardNum = creditCardNum;
}

	private String expireDate;
	private String creditCardNum;
	
	public CreditCardPayment(){
		this.cardName="No card name";
		this.expireDate="No expire date";
		this.creditCardNum="No credit card number";
	}



	public CreditCardPayment(String cardName, String expireDate, String creditCardNum){
		this.cardName=cardName;
		this.expireDate=expireDate;
		this.creditCardNum=creditCardNum;
	}

	public void setcardName(String cardName){
		this.cardName=cardName;
	}

	public void setexpireDate(String expireDate){
		this.expireDate=expireDate;
	}

	public void setcreditCardNum(String creditCardNum){
		this.creditCardNum=creditCardNum;
	}
}
