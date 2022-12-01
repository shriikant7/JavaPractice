package Javapractice;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double TotalBalance = 50000;
		double RemainForSaving;
		double RemainForCurrent;
		int AccountNumber = 12345678;
		String BankName = "Central Bank Of India";
		String InsertedString = "Inserted";

		Scanner S = new Scanner(System.in);
		System.out.println("Insert ATM and type 'Inserted' :");
		String Insert = S.nextLine();
		if(Insert.equals(InsertedString)) {

		System.out.println("Select Language 1.English 2. Marathi 3.Hindi");
		int A = S.nextInt();
		switch (A) {
		case 1:
			System.out.println("Enter The Pin");
			int pin = S.nextInt();
			if (pin == 1234) {
				System.out.println("Select Your account Type : 1.Saving Account 2.Current Account");
				int AccountType = S.nextInt();
				switch (AccountType) {

				case 1:
					System.out.println("Select Options 1.Check Balance 2.Withraw Amount");
					int SavingAccount = S.nextInt();
					switch (SavingAccount) {
					case 1:
						System.out.println("Your Available Balance :" + TotalBalance);
						break;
					case 2:
						System.out.println("Select the type of withrawal 1.Cash Withrawal : 2.Bank Transfer");
						int SA = S.nextInt();
						switch (SA) {
						case 1:
							System.out.println("Please Enter Amount to Withraw :");
							double SAA = S.nextDouble();
							if (SAA <= TotalBalance) {
								RemainForSaving = TotalBalance - SAA;
								System.out.println("Withrawal Amount :" + SAA);

								System.out.println("Remaining Balance :" + RemainForSaving);

								System.out.println("Do you want receipt 1.Yes 2.No");
								int SAR = S.nextInt();
								switch (SAR) {
								case 1:
									System.out.println("Transaction is successful");
									System.out.println("Your Receipt is printed please collect your cash and receipt");
									break;
								case 2:
									System.out.println("Transaction is successful");
									System.out.println("Receipt is not printed please collect your cash ");
									break;
								default:
									System.out.println(
											"Invalid Option,Please select between 1 and 2, Do you want receipt or not :");
								}
								System.out.println("Thank You, Visit Again..");
							} else {
								System.out.println("Insufficient Balance :");
							}
							break;
						case 2:

							System.out.println("Enter Your Account Number :");

							int AcNoFromScanner = S.nextInt();
							if (AccountNumber == AcNoFromScanner) {
								
								System.out.println("Enter Bank Name :");
								Scanner NS = new Scanner(System.in);

								String BankNameFromScanner = NS.nextLine();

								if (BankName.equals(BankNameFromScanner)) {
									
								} else {
									System.out.println("wrong bank name");
								}

								if (AccountNumber == AcNoFromScanner && BankName.equals(BankNameFromScanner)) {
									//System.out.println("Correct Bank details");
									//System.out.println("We can procede further ");
									System.out.println("Enter The Amount You want to Transfer:");
									double BankTransfer = NS.nextDouble();
									if (BankTransfer <= TotalBalance) {
										double BankTransferRemain = TotalBalance - BankTransfer;
										System.out.println("Amount Successfully Transferred..");
										System.out.println("Transfered Amount :" + BankTransfer);
										System.out.println("Remained Balance :" + BankTransferRemain);
										System.out.println("Thank You, Visit Again..");
										
									} else {
										System.out.println("Insufficient Fund :");
									}

								}

							} else {
								System.out.println("Wrong Account N");
							}

							break;
						default:
							System.out
									.println(" Invalid option, Please Select Between cash Withrawal & Bank Transfer ");
						}

						break;
					default:
						System.out.println("Invalid Option, Please select between check balance and withraw amount :");
					}
					break;

				case 2:

					System.out.println("Select Options 1.Check Balance 2.Withraw Amount");
					int CurrentAccount = S.nextInt();
					switch (CurrentAccount) {
					case 1:
						System.out.println("Your Available Balance :" + TotalBalance);
						break;
					case 2:
						System.out.println("Select the type of withrawal 1.Cash Withrawal : 2.Bank Transfer");
						int CA = S.nextInt();
						switch (CA) {
						case 1:
							System.out.println("Please Enter Amount to Withraw :");
							double CAA = S.nextDouble();
							if (CAA <= TotalBalance) {
								RemainForCurrent = TotalBalance - CAA;
								System.out.println("Withrawal Amount :" + CAA);

								System.out.println("Remaining Balance :" + RemainForCurrent);

								System.out.println("Do you want receipt 1.Yes 2.No");
								int CAR = S.nextInt();
								switch (CAR) {
								case 1:
									System.out.println("Transaction is successful");
									System.out.println("Your Receipt is printed please collect your cash and receipt");
									break;
								case 2:
									System.out.println("Transaction is successful");
									System.out.println("Receipt is not printed please collect your cash ");
									break;
								default:
									System.out.println(
											"Invalid Option,Please select between 1 and 2, Do you want receipt or not :");
								}
								System.out.println("Thank You, Visit Again..");
							} else {
								System.out.println("Insufficient Balance :");
							}
							break;
						case 2:
							System.out.println(
									"Currently Bank Transfer Option not Available, We are working on that. please select Option Cash Withrawal : ");
							break;
						default:
							System.out
									.println(" Invalid option, Please Select Between cash Withrawal & Bank Transfer ");
						}

						break;
					default:
						System.out.println("Invalid Option, Please select between check balance and withraw amount :");
					}
					break;

				default:
					System.out.println("Invalid Option, Please Select Between Saving Account or Current Account");

				}

			} else {
				System.out.println("Incorrect pin please try again");
			}
			break;
		case 2:
			System.out.println("Currently Marathi Language is not available, Please select English ");
			break;
		case 3:
			System.out.println("Currently Hindi Languages is not available, Please select English ");
			break;
		default:
			System.out.println("Invalid Option, Please Select From Above Three Languages ");

		}
		}else {
			System.out.println("Card not inserted, Or it is corrupted , Please connect Your Bank");
		}

	}

}
