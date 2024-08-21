<!-- This is your README.md file -->

<h1 align="center">Real-Time Cucumber Framework</h1>

<p align="center">
  This framework is built using <strong>Cucumber</strong> for behavior-driven development (BDD) testing. It allows you to write tests in a natural language format using feature files while leveraging the power of Java for automation.
</p>

---

<h2>🚀 Features</h2>

<ul>
  <li><strong>Cucumber BDD Approach:</strong> Write tests in Gherkin syntax with feature files.</li>
  <li><strong>Modular Design:</strong> Separate modules for utilities, hooks, step definitions, and runners.</li>
  <li><strong>Configuration Management:</strong> Centralized configuration properties for test setup.</li>
  <li><strong>Data-Driven Testing:</strong> Supports JSON files for test data inputs.</li>
  <li><strong>Browser Utilities:</strong> Predefined methods to handle common browser tasks.</li>
</ul>

---

<h2>📂 Project Structure & Class Descriptions</h2>

<pre>
Real-Time-Cucumber-Framework
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   └── test
│       ├── java
│       │   ├── functionLibrary
│       │   │   └── FunctionLibrary.java
│       │   │       - Contains reusable methods for handling browser interactions, element manipulation, waits, and other core functionality.
│       │   ├── hooks
│       │   │   └── Hooks.java
│       │   │       - Implements @Before and @After Cucumber hooks for setting up and tearing down test scenarios (e.g., opening and closing the browser).
│       │   ├── runners
│       │   │   └── TestRunner.java
│       │   │       - The entry point for test execution, linking feature files to step definitions, and configuring execution options.
│       │   ├── stepDefinitions
│       │   │   └── LoginSteps.java
│       │   │       - Maps Gherkin steps from the Login.feature file to actual Java methods for executing login-related steps.
│       │   └── utilities
│       │       └── BrowserUtils.java
│       │           - Provides utility methods for browser actions like opening URLs, handling windows, and taking screenshots.
│       └── resources
│           ├── configs
│           │   └── config.properties
│           │       - Contains configurable properties like URLs, browser settings, and environment-specific variables.
│           ├── testData
│           │   └── loginData.json
│           │       - Stores login test data in JSON format for use in data-driven tests.
│
├── Features
│   └── Login.feature
│       - Contains scenarios for testing the login functionality in Gherkin syntax (Given, When, Then).
│
├── target
│   ├── cucumber-reports
│       - Stores test execution reports in HTML, JSON, or XML format for post-execution analysis.
│
├── pom.xml
└── README.md
</pre>

---

<h2>📦 Dependencies</h2>

Make sure you have the following installed:

<ul>
  <li><strong>Java</strong> (version 8 or above)</li>
  <li><strong>Maven</strong> (latest stable version)</li>
</ul>

<h3>📚 Libraries Used</h3>
<ul>
  <li><strong>Cucumber</strong> (for BDD testing)</li>
  <li><strong>Selenium WebDriver</strong> (for browser automation)</li>
  <li><strong>TestNG</strong> (for testing)</li>
  <li><strong>Maven Surefire Plugin</strong> (for running tests)</li>
  <li><strong>JSON Simple</strong> (for reading JSON test data)</li>
</ul>

---

<h2>🛠️ How to Run the Tests</h2>

<ol>
  <li><strong>Clone the repository:</strong>
    <pre>
    git clone https://github.com/yourusername/Real-Time-Cucumber-Framework.git
    cd Real-Time-Cucumber-Framework
    </pre>
  </li>
  <li><strong>Install the dependencies:</strong>
    <pre>
    mvn clean install
    </pre>
  </li>
  <li><strong>Run the tests:</strong>
    <pre>
    mvn test
    </pre>
  </li>
</ol>

---

<h2>📝 Test Data Structure</h2>

<p>
Test data is stored in the <code>src/test/resources/testData</code> directory. The data is stored in JSON format, which is used during test execution to feed the required inputs.
</p>

---

<h2>📊 Test Results</h2>

<p>
After execution, Cucumber reports are automatically generated and saved in the <code>target/cucumber-reports</code> directory. You can open these reports to review the results of your test executions.
</p>

---

<h2>🌐 Contribution Guidelines</h2>

<p>
Feel free to contribute to the project! Whether it's reporting a bug, proposing a new feature, or submitting a pull request, we appreciate all contributions.
</p>

<ol>
  <li>Fork the repo</li>
  <li>Create your feature branch (<code>git checkout -b feature/fooBar</code>)</li>
  <li>Commit your changes (<code>git commit -am 'Add some fooBar'</code>)</li>
  <li>Push to the branch (<code>git push origin feature/fooBar</code>)</li>
  <li>Create a new Pull Request</li>
</ol>

---

<h2>🎨 Technologies Used</h2>

<ul>
  <li><strong>Java</strong></li>
  <li><strong>Maven</strong></li>
  <li><strong>Cucumber</strong></li>
  <li><strong>Selenium WebDriver</strong></li>
  <li><strong>TestNG</strong></li>
</ul>

---

<h2>🌟 Show Your Support</h2>

<p>
If you like this framework, please give it a ⭐ on GitHub!
</p>
