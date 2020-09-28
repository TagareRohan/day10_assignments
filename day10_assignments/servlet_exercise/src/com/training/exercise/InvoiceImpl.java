package com.training.exercise;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InvoiceImpl {

	
	private Connection derbyConnection;
	
	
	
	public InvoiceImpl() {
		super();
		// TODO Auto-generated constructor stub
				
		this.derbyConnection=ConnectionUtility.getDerbyConnection();
	}

	

	
	public boolean add(int invoiceNumber, String customerName, double amount) {
		// TODO Auto-generated method stub
		
		String sql="insert into invoice values(?,?,?)";
		PreparedStatement pstmt = null;
		
		try
		{
			pstmt.setInt(1,invoiceNumber);
			pstmt.setString(2,customerName);
			pstmt.setDouble(3,amount);
			pstmt=this.derbyConnection.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery();
			if(result.next())
			{
				return true;
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return false;
		//return this.invList.add(entity);
	}

	

}