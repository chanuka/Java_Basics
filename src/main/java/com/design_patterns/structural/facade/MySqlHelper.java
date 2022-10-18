package com.design_patterns.structural.facade;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        System.out.println("getMySqlDBConnection");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateMySqlPDFReport");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
        System.out.println("generateMySqlHTMLReport");
    }
}
