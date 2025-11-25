# Beginning of the course 

== Self note ==
* It is important to create project locally first with the java 
and maven already selected, if you do other way around for new repo; 
It is very time-consuming.


== Day 01 ==

-- Chapter 01 -- 

### Selenium WebDriver Simplified Architecture

This diagram illustrates the core flow of how your Selenium script interacts with a web browser.

```
+---------------------+     HTTP Request / JSON Wire Protocol      +---------------------+
| 1. Your Test Script | -----------------------------------------> | 2. Selenium Client  |
|  (Java, Python, C#) |                                            |    Libraries        |
|                     |     (e.g., `driver.get("url")`)            |   (API Bindings)    |
+---------------------+                                            +---------------------+
           |                                                                 |
           |                                                                 | HTTP Commands
           |                                                                 |
           V                                                                 V
+---------------------+     HTTP Commands / WebDriver Protocol     +---------------------+
| 3. Driver Executable| -----------------------------------------> | 4. Web Browser      |
| (e.g., ChromeDriver,|                                            |   (Chrome, Firefox, |
|     Geckodriver)    |     (Executes browser actions)             |   Edge, Safari)     |
+---------------------+                                            +---------------------+
           ^                                                                 |
           | HTTP Response                                                   | Render HTML/DOM
           | (Result of action)                                              |
           +-----------------------------------------------------------------+
```

### Explanation:

1. Your Test Script:** This is the code you write in your chosen programming language (Java, Python, C#, etc.) 
using the Selenium API.
2. Selenium Client Libraries:** These are the language-specific bindings (e.g., `selenium-java.jar`) 
that translate your API calls (like `driver.get()`) into HTTP requests following the JSON Wire Protocol or 
W3C WebDriver Protocol.
3. Driver Executable:** This is a browser-specific executable (e.g., `chromedriver.exe`, `geckodriver.exe`). 
It acts as a proxy, receiving HTTP requests from the Selenium Client Libraries and translating them into native
commands that the browser understands.
4. Web Browser:** The actual browser (Chrome, Firefox, etc.) receives commands from its respective driver 
executable and performs the actions (navigating, clicking, typing). It then sends a response back through 
the driver.

-----------------------------------------------------------------------------------------------------------------------

-- Chapter 02 -- 



