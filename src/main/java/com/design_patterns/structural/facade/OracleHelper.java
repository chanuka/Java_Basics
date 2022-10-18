package com.design_patterns.structural.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConnection(){
        //get Oracle DB connection using connection parameters
        System.out.println("getOracleDBConnection");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateOraclePDFReport");
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateOracleHTMLReport");
    }
}
