
describe("ATM Dispenser", function() {
  var atmDispenser;
  beforeEach(function() {
    atmDispenser = new ATMDispenser(500);
  })
  
  it("should withdraw money from account", function(){
    atmDispenser.withdraw(100);
    expect(atmDispenser.balance()).toBe(400);
    
  });

  it("should withdraw multiple times", function() {
    atmDispenser.withdraw(100);
    atmDispenser.withdraw(100);
    expect(atmDispenser.balance()).toBe(300);
  })

})