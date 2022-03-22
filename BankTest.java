import java.time.LocalDate;
public class BankTest {

	public static void main(String[] args) {

		BankAccount baObj1 = new BankAccount();
//		BankAccount baObj2 = new BankAccount();
//		BankAccount baObj3 = new BankAccount();

		baObj1.setAccountDetails(980, "tony", 500000, LocalDate.of(2022, 1, 2), LocalDate.of(1991, 12, 1));
		baObj1.printAccountDetail();
		baObj1.withdraw(1000000);
		baObj1.printAccountDetail();
		baObj1.deposit(200000);
		baObj1.printAccountDetail();
		baObj1.changeAccountHolderName("Tony Stark");
		
		
		

	}

}

class BankAccount {

	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	private LocalDate accountOpeningDate;
	private LocalDate accountHolderDOB;
	private int age;

	public void setAccountDetails(int accNumber, String accHolderName, float accBalance, LocalDate aod, LocalDate dob) {

		accountNumber = accNumber;
		accountHolderName = accHolderName;
		accountBalance = accBalance;
		accountHolderDOB = dob;
		accountOpeningDate = aod;
		age = LocalDate.now().getYear() - dob.getYear();

	}

	public void printAccountDetail() {

		System.out.println("Account Number is           :" + accountNumber);
		System.out.println("Account Holder Namer is     :" + accountHolderName);
		System.out.println("Account Balance is          :" + "Rs." + accountBalance + "/-");
		System.out.println("Account Opening date is     :" + accountOpeningDate);
		System.out.println("Account Holder DOB is       :" + accountHolderDOB);
		System.out.println("Account Holder's age is     :" + age);
		Float si = calculateSimpleInterest();
		System.out.println("Interest                    :" + si);
		System.out.println("--------------------------------------------------");

	}

	public float withdraw(float amountToWithdraw) {
		if (amountToWithdraw > accountBalance)
			System.out.println("Insufficient Balance");
		else
			accountBalance = accountBalance - amountToWithdraw;
		return accountBalance;
	}

	public float deposit(float amountToDeposit) {
		if (amountToDeposit > 50000)
			System.out.println("Please provide proof of income");
		else
			accountBalance = accountBalance - amountToDeposit;
		return accountBalance;
	}

	private float calculateSimpleInterest() {

		float si = accountBalance * 2.5f * 1 / 100;
		return si;
	}

	public void changeAccountHolderName(String newName) {
		String oldName = accountHolderName;
		accountHolderName = newName;
		System.out.println("Account holder name changed from " + oldName + " to " + newName);
	}

}
