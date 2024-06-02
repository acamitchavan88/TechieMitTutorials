import java.util.Scanner;

/*
 *  #TechieMit Program to demonstrate static synchronization
 *  ATMWithdrawal class contain withdraw amount specified 
 *  upper limit for withdraw User specific input and messages
 *  StaticSynchronization class to demo the threads created and will invoke the 
 *  ATMWithdrawal class
 *   
 *  
 */

class ATMWithdrawal {

	public static synchronized void withdrawCash() {
		int totalBalance = 15000, remainingAmount;
		System.out.println("Please enter your pin");
		Scanner scan = new Scanner(System.in);
		int atmPinInput = scan.nextInt();
		String atmpinLength = Integer.toString(atmPinInput);
		if (atmpinLength.length() != 4) {
			System.out.println("Invalid pin please enter valid pin");
		} else {
			System.out.println("Enter amount to be withdrawn");
			int amount = scan.nextInt();

			if (amount <= totalBalance) {
				System.out.println("Thread currently executing is::"
						+ Thread.currentThread().getName());
				remainingAmount = totalBalance - amount;
				System.out.println("Amount withdrawn  is :: " + amount);
				System.out.println("Remaining balance is ::" + remainingAmount);
			} else {
				System.out.println(
						"Sorry the cash cannot be dispensed please enter amount less than 15000");
			}
		}
	}

}

public class StaticSynchronizationDemo {
	public static void main(String[] str) {
		Runnable runnable = () -> {
			// The input to 1 thread static synchronized
			for (int i = 0; i < 1; i++) {
				ATMWithdrawal.withdrawCash();
			}
		};

		Thread thread1 = new Thread(runnable, "Sam");
		Thread thread2 = new Thread(runnable, "Sundar");
		Thread thread3 = new Thread(runnable, "Micheal");
		Thread thread4 = new Thread(runnable, "Jack");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}

}
