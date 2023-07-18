package com.code.bull.driver;

import org.testng.annotations.BeforeSuite;

public class Driver {
    private static String env= null;
    private static String browser = null;
    @BeforeSuite
    public void setup(){

    }
    private void envSetup(){
        if(env.equalsIgnorecase("sit")){
            env = "SIT";
        } else if(env.equalsIgnoreCase("UAT")){
            env = "UAT";
        } else if (env.equalsIgnoreCase("PROD")) {
            env= "PROD";
        } else {
            env= "SIT";
        }


    }
    private void browserr(){
        if(browser.equalsIgnoreCase("CHROME")){
            System.out.println("Browser as chrome chal gya");
            browser ="Chrome";
        } else if (browser.equalsIgnoreCase("FIREFOX")){
            System.out.println("Firefox chal gya");
            browser ="Firefox";
        }else if (browser.equalsIgnoreCase("EDGE")){
            System.out.println("Edge chal gya");
            browser ="Firefox";
    } else {
            browser = "CHROME";

        }

}
