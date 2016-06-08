
function ATMDispenser(initialVal) {
	var balance = initialVal;

	this.withdraw = function(amnt) {
		balance -= amnt;
	}

	this.balance = function() {
		return balance;
	}
}