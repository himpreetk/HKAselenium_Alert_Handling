Selenium_Alert_Handling

A. Project Description

     This project demonstrates how to handle different types of JavaScript alerts using Selenium WebDriver with Java. It automates interactions with alerts on a sample website and logs the alert messages in the console. The script runs on Google Chrome using ChromeDriver and includes explicit waits for better stability.

B. Features:

     B.1. Handles different types of alerts:
          B.1.1. Simple Alert (OK button only)
          B.1.2. Confirmation Alert (OK and Cancel buttons)
          B.1.3. Prompt Alert (Text input and OK/Cancel buttons)
     B.2. Uses Selenium WebDriver to interact with alerts
     B.3. Captures alert messages and logs them
     B.4. Implements exception handling for better script stability

C. Technologies Used

     C.1. Java (JDK 11 or later recommended)
     C.2. Selenium WebDriver
     C.3. ChromeDriver
     C.4. Maven (Optional, for dependency management)

D. Prerequisites

    Before running this project, ensure you have the following installed:
       - Java (JDK 11+ recommended)
       - Chrome Browser
       - ChromeDriver (compatible with your Chrome version)
       - Eclipse/IntelliJ IDEA (or any Java IDE)
       - Selenium WebDriver JAR files (or managed via Maven)

E. Setup Instructions

    E.1. Clone the Repository
           - git clone https://github.com/yourusername/selenium-alert-handling.git
           - cd selenium-alert-handling
    E.2. Configure WebDriver
           - Download ChromeDriver from ChromeDriver Downloads
           - Place it in the resources folder
           - Update the path in the AlertHandling.java file:
                    System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
    E.3. Install Dependencies (If using Maven)
          If you are using Maven, add the following dependencies to pom.xml:
               <dependencies>
                    <dependency>
                         <groupId>org.seleniumhq.selenium</groupId>
                         <artifactId>selenium-java</artifactId>
                         <version>4.0.0</version>
                    </dependency>
               </dependencies>
     E.4. Run the Script
            E.4.1. Open the project in your Java IDE
            E.4.2. Run AlertHandling.java as a Java Application

F. Project File Structure

            selenium-alert-handling/
            │-- src/
            │   ├── alertHandling/
            │   │   ├── AlertHandling.java
            │-- resources/
            │   ├── chromedriver.exe
            │-- pom.xml (if using Maven)
            │-- README.md

G. Code Explanation

     G.1. Launches Chrome browser using Selenium WebDriver.
     G.2. Navigates to DemoQA Alerts Page.
     G.3. Handles different alerts:
           G.3.1. Clicks a button to trigger an alert and prints the alert text.
           G.3.2. Accepts or dismisses the confirmation alert.
           G.3.2. Sends text input into a prompt alert.
     G.4. Closes the browser after execution.

H. Expected Output

     H.1. The script successfully handles JavaScript alerts.
     H.2. Alert messages are displayed in the console.
     H.3. The browser remains open for 3 seconds before closing.

I. Troubleshooting

     I.1. Ensure ChromeDriver matches your Chrome browser version.
     I.2. If encountering NoSuchElementException, increase the wait time:
              - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     I.3. If elements are not found, verify the XPaths using Chrome DevTools (F12 > Inspect).

J. Contribution

    Feel free to fork the repository and submit pull requests for improvements.
