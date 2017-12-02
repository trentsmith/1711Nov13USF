package com.bank.pojos;

public class Account
{

	private int accountId, userId;
	private double balance;

	public int getAccountId()
	{
		return accountId;
	}

	public void setAccountId(int accountId)
	{
		this.accountId = accountId;
	}

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	@Override
	public String toString()
	{
		return this.getAccountId() + "," + this.getUserId() + "," + this.getBalance() + "\n";
	}

}
