/**
 * 
 */
package com.usman.elastic.test;

import java.io.IOException;

import com.usman.elastic.conn.ElasticsearchConn;

/**
 * @author c_farkalit.usman
 *
 */
public class TestElasticSearch {

	
	public static void main(String[] args) {
		try {
			ElasticsearchConn.startTest();
		} catch (IOException e) {
			System.err.println("\n\n*********************************");
			System.err.println("Error Message:"+e.getMessage());
			System.err.println("***************************************\n\n");
			e.printStackTrace();
		}
	}
	
}
