package com.greatlearning.model;

public class Customer {

		private String accno;
		private String password;
		
		public Customer() {}
		public Customer(String accno, String password) {
			super();
			this.accno = accno;
			this.password = password;
		}
		
		public String getAccno() {
			return accno;
		}
		
		public String getPassword() {
			return password;
		}
		
		
		
}
