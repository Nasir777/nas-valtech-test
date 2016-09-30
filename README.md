# valtech-test
Automation  Test for Valtech.com  

Author: Nasir Ahmed
Date: 29/09/2016

To run this test
*   This test can run in Chrome and Firefox browsers
*   To run in Chrome browser, you will need to have 'chromedriver.exe' file and full path where the file is located on your system.
*   To run in Chrome browser, you will need to do the following:


1.  You will need to make changes in 'HomePageTest' page. To run in Chrome browser, remove the 
        comments (//) from beginging of the two line as below, also need to insert the chromedriver.exe path. 

        //    System.setProperty("webdriver.chrome.driver","<chromedriver.exe path>");
        //    driver = new ChromeDriver();

        The lines now should look like as below, (the chromedriver.exe path is an example)

         System.setProperty("webdriver.chrome.driver","C:\\Automation\\chrome\\chromedriver.exe");
         driver = new ChromeDriver();
      
2. .  Insert comments (//) at the begining of the following line:
  
        driver = new FirefoxDriver();
        
 3. If you want this test to run in Firefox browser then there no need to make any changes.      
