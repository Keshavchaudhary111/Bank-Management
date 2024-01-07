import java.util.*;
import java.time.LocalDateTime;
// import java.time.LocalDate;

class Transaction {
	private String type;
	private double balance;
	private LocalDateTime time;

	public void setType(String type) {
		this.type = type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}

	public double getBalance() {
		return this.balance;
	}

	public LocalDateTime getTime() {
		return this.time;
	}
}

class Address {
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String country;
	private String pincode;

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreet1() {
		return this.street1;
	}

	public String getStreet2() {
		return this.street2;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getCountry() {
		return this.country;
	}

	public String getPincode() {
		return this.pincode;
	}
}

class Account {
	private int accountNO;
	private double balance;
	private String phoneNo;
	private String email;
	private String name;
	private String pan;
	private Address addr;
	LinkedList<Transaction> temp = new LinkedList<>();

	public void setTemp(LinkedList<Transaction> temp) {
		this.temp = temp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNO(int accountNO) {
		this.accountNO = accountNO;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setPhoneNO(String phoneNO) {
		this.phoneNo = phoneNO;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public int getAccountNO() {
		return this.accountNO;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getName() {
		return this.name;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPan() {
		return this.pan;
	}

	public Address getAddr() {
		return this.addr;
	}

	public LinkedList<Transaction> getTemp() {
		return this.temp;
	}
}

class Balance {
	public static void main(String[] argd) throws Exception {
		int baseAccount = 1000;
		Scanner sc = new Scanner(System.in);
		LinkedList<Account> alldata = new LinkedList<>();
		while (true) {
			System.out.println("1->open account");
			System.out.println("2->checking balance");
			System.out.println("3->add money");
			System.out.println("4->withdraw money");
			System.out.println("5->Transfer money");
			System.out.println("6->search by pincode");
			System.out.println("7->search by name");
			// System.out.println("8->previous transactions");
			System.out.println("9->exit");

			int ch = sc.nextInt();
			sc.nextLine();
			if (ch == 1) {
				Account a = new Account();
				// System.out.println("enter ur name");
				String name;
				while (true) {
					System.out.println("enter your name");
					name = sc.nextLine();
					if (name.matches("^[a-zA-Z\\s]+")) {
						break;
					} else {
						System.out.println("Invalid name, Please enter again");
					}
				}
				a.setName(name);

				// System.out.println("enter ur phoneNO");
				String phoneNO;
				while (true) {
					System.out.println("enter your phoneNO");
					phoneNO = sc.nextLine();
					// Pattern p = Pattern.compile("^\\d{10}$");

					if (phoneNO.matches("^[0-9\\s]{10}+")) {
						break;
					} else {
						System.out.println("Invalid phone NO, Please enter again");
					}
				}
				a.setPhoneNO(phoneNO);

				// System.out.println("enter ur email");
				String email;
				while (true) {
					System.out.println("enter your email");
					email = sc.nextLine();
					// Pattern p = Pattern.compile("^\\d{10}$");

					if (email.matches("[a-zA-Z0-9.]+[@]{1}[a-z]+[.]{1}[a-z]+")) {
						break;
					} else {
						System.out.println("Invalid email, Please enter again");
					}
				}
				a.setEmail(email);

				String pan;
				while (true) {
					System.out.println("enter pan no");
					pan = sc.nextLine();
					if (pan.matches("^[0-9A-Z\\s]{10}+")) {
						break;
					} else {
						System.out.println("invalid pan,enter pan no");
					}
				}
				a.setPan(pan);

				Address a1 = new Address();
				System.out.println("enter address");
				String street1;
				while (true) {
					System.out.println("enter street1");
					street1 = sc.nextLine();
					if (street1.matches("^[a-zA-Z0-9\\s]+")) {
						break;
					} else {
						System.out.println("Invalid street1, Please enter again");
					}
				}
				a1.setStreet1(street1);
				String street2;
				while (true) {
					System.out.println("enter street2");
					street2 = sc.nextLine();
					if (street2.matches("^[a-zA-Z0-9\\s]+")) {
						break;
					} else {
						System.out.println("Invalid street2, Please enter again");
					}
				}
				a1.setStreet2(street2);

				String city;
				while (true) {
					System.out.println("enter city");
					city = sc.nextLine();
					if (city.matches("^[a-zA-Z\\s]+")) {
						break;
					} else {
						System.out.println("Invalid city, Please enter again");
					}
				}
				a1.setCity(city);

				String state;
				while (true) {
					System.out.println("enter state");
					state = sc.nextLine();
					if (state.matches("^[a-zA-Z\\s]+")) {
						break;
					} else {
						System.out.println("Invalid state, Please enter again");
					}
				}
				a1.setState(state);

				String country;
				while (true) {
					System.out.println("enter country");
					country = sc.nextLine();
					if (country.matches("^[a-zA-Z\\s]+")) {
						break;
					} else {
						System.out.println("Invalid country, Please enter again");
					}
				}
				a1.setCountry(country);

				String pincode;
				while (true) {
					System.out.println("enter pincode");
					pincode = sc.nextLine();
					if (pincode.matches("^[0-9\\s]{6}+")) {
						break;
					} else {
						System.out.println("Invalid pincode, Please enter again");
					}
				}
				a1.setPincode(pincode);

				a.setAddr(a1);
				a.setAccountNO(baseAccount);
				System.out.println("ur account is ready & ur accountNO is" + baseAccount);
				baseAccount++;
				alldata.add(a);
				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} 
			
			else if (ch == 2) {
				// check balance;
				System.out.println("enter account no");
				int tempacc = sc.nextInt();
				sc.nextLine();
				boolean flag = true;
				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getAccountNO() == tempacc) {
						flag = false;
						System.out.println("user found");
						System.out.println(alldata.get(i).getName());
						System.out.println("ur balance is" + "  " + alldata.get(i).getBalance());
					}
				}
				if (flag) {
					System.out.println("user not found");
				}

				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} 
			
			else if (ch == 3) {
				// add money
				System.out.println("enter account NO");
				int tempacc = sc.nextInt();
				sc.nextLine();
				boolean flag = true;
				boolean flag1 = true;
				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getAccountNO() == tempacc) {
						flag = false;
						System.out.println("user found");
						Thread.sleep(2000);
					} else {
						System.out.println("user not found");
						break;
					}
					System.out.println("enter amount to add");
					double money = sc.nextDouble();
					if (money % 10 == 0 && money > 0) {
						double extblan = alldata.get(i).getBalance();
						alldata.get(i).setBalance(money + extblan);
						System.out.println("balance added succesfully");
						System.out.println("Adding trans" + " " + money + " " + extblan + " " + (money + extblan));

						Transaction qw = new Transaction();
						qw.setType("credit");
						qw.setBalance(money + extblan);
						qw.setTime(LocalDateTime.now());
						alldata.get(i).getTemp().add(qw);

						flag1 = false;
						break;
					}

					if (flag1) {
						System.out.println("please add valid balance");
						break;
					}
					if (flag) {
						System.out.println("user not found");
					}
				}
				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			 else if (ch == 4) {
				// withdraw money
				System.out.println("enter account NO");
				int tempacc = sc.nextInt();
				boolean flag = true;
				boolean flag2 = true;
				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getAccountNO() == tempacc) {
						flag = false;
						System.out.println("enter money to withdraw");
						double money = sc.nextDouble();
						double extblan = alldata.get(i).getBalance();
						if (extblan >= money && money > 0) {
							System.out.println("count ur cash");
							alldata.get(i).setBalance(extblan - money);
							System.out.println("withdraw success");
							flag2 = false;
							Transaction ttt = new Transaction();
							ttt.setType("debit");
							ttt.setBalance(money);
							ttt.setTime(LocalDateTime.now());
							alldata.get(i).getTemp().add(ttt);
						}
					}
				}
				if (flag2) {
					System.out.println("enter proper balance balance");
					break;
				}
				if (flag) {
					System.out.println("user not found");
				}

				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			 else if (ch == 5) {
				// Transfer money
				System.out.println("enter sender account no");
				int sa = sc.nextInt();
				System.out.println("enter receiver account no");
				int ra = sc.nextInt();
				sc.nextLine();
				int j = 0;
				int k = 0;
				boolean abc = true;
				boolean pqr = true;

				if (sa == ra) {
					System.out.println("money can't transfer,enter valid account no");
					break;
				}

				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getAccountNO() == sa) {
						abc = false;
						j = i;
						System.out.println("sender account found");
					}
					if (alldata.get(i).getAccountNO() == ra) {
						pqr = false;
						k = i;
						System.out.println("receiver account found");
					}
				}
				if (abc) {
					System.out.println("sender account not found");
				} else if (pqr) {
					System.out.println("receiver account not found");
				} else {
					System.out.println("enter amount to transfer");
					double temp = sc.nextDouble();
					sc.nextLine();
					if (alldata.get(j).getBalance() < temp) {
						System.out.println("not sufficient balance to transfer");
						break;
					} else if (alldata.get(j).getBalance() >= temp) {
						double curr = alldata.get(j).getBalance();
						curr = curr - temp;
						alldata.get(j).setBalance(curr);
						Transaction ttt = new Transaction();
						ttt.setType("credit");
						ttt.setBalance(temp);
						ttt.setTime(LocalDateTime.now());
						alldata.get(j).getTemp().add(ttt);

						double rc = alldata.get(k).getBalance();
						rc = rc + temp;
						alldata.get(k).setBalance(rc);
						System.out.println("transfer success");
						Transaction ttt1 = new Transaction();
						ttt1.setType("debit");
						ttt1.setBalance(temp);
						ttt1.setTime(LocalDateTime.now());
						alldata.get(k).getTemp().add(ttt1);
					}
				}

				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} 
			else if (ch == 6) {
				// search by pincode
				String pincode;
				while (true) {
					System.out.println("enter pincode");
					pincode = sc.nextLine();
					if (pincode.matches("^[0-9\\s]{6}+")) {
						break;
					} else {
						System.out.println("Invalid pincode, Please enter again");
					}
				}
				boolean flag = true;
				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getAddr().getPincode().equals(pincode)) {
						System.out.println(alldata.get(i).getName());
						System.out.println(alldata.get(i).getAccountNO());
						flag = false;
					}
				}
				if (flag) {
					System.out.println("user not found");
				}

				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}

			else if (ch == 7) {
				// search by name
				String name;

				while (true) {
					System.out.println("enter name to search");
					name = sc.nextLine();

					if (name.matches("^[a-zA-Z\\s]+")) {
						break;
					} else {
						System.out.println("Invalid name, Please enter again");
					}
				}
				boolean flag = true;
				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getName().contains(name)) {
						System.out.println(alldata.get(i).getName());
						System.out.println(alldata.get(i).getAccountNO());
						flag = false;
					}
				}
				if (flag) {
					System.out.println("user not found");
					Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				}

				Thread.sleep(3000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			}
			
			 else if (ch == 8) {
				// previous transaction
				System.out.println("enter account number");
				int accnt = sc.nextInt();
				sc.nextLine();
				boolean flag = true;

				for (int i = 0; i < alldata.size(); i++) {
					if (alldata.get(i).getAccountNO() == accnt) {
						flag = false;
						System.out.println("user found");
						LinkedList<Transaction> list = alldata.get(i).getTemp();
						for (int j = 0; j < list.size(); j++) {
							System.out.println(list.get(j).getType() + "  " + list.get(j).getBalance() + "  "
									+ list.get(j).getTime());
						}
					}
				}
				if (flag) {
					System.out.println("user not found");
				}
			}
                    
			else {
				break;
			}
			
		}
	}
}
