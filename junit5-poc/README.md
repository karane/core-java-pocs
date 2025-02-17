# 🏦 Bank JUnit 5 Testing Project
A Maven-based Java project demonstrating JUnit 5 features using a Bank Account system.

## 📌 Features Covered
✔️ Basic assertions (assertEquals, assertThrows)
✔️ Parameterized Tests (@ValueSource, @CsvSource, @MethodSource)
✔️ Lifecycle Methods (@BeforeEach, @AfterEach, @BeforeAll, @AfterAll)
✔️ Nested Tests (@Nested)
✔️ Conditional Execution (@EnabledOnOs, @EnabledOnJre)
✔️ Timeout Tests (assertTimeout)
✔️ Tagging Tests (@Tag)

## 📂 Project Structure
```
junit5-poc/
├── src/
│   ├── main/java/com/example/bank/
│   │   ├── BankAccount.java
│   │   ├── BankService.java
│   ├── test/java/com/example/bank/
│   │   ├── BankAccountTest.java
│   │   ├── LifecycleTest.java
│   │   ├── ConditionalTest.java
│   │   ├── TimeoutTest.java
│   │   ├── NestedTestExample.java
│   │   ├── TaggingTest.java
│   │   ├── ParameterizedTests.java
│   │   ├── ExceptionTest.java
├── pom.xml
├── README.md
```
## 📥 Setup
### 1️⃣ Clone the repository:

```sh
git clone https://github.com/karane/core-java-pocs.git
cd junit5-poc
```
### 2️⃣ Build the project with Maven:

```sh
mvn clean compile
```
### ▶️ Running the Tests
Run all tests
```sh
mvn test
```
Run only fast tests (Tagged as @Tag("fast"))
```sh
mvn test -Dgroups=fast
```
Run only slow tests
```sh
mvn test -Dgroups=slow
```
Run only integration tests
```sh
mvn test -Dgroups=integration
```
## 📜 Test Cases Overview
### ✅ 1. Basic Tests (BankAccountTest.java)
Deposits, withdrawals, and balance checks
Exception handling (e.g., insufficient funds)
### 🔄 2. Lifecycle Tests (LifecycleTest.java)
`@BxeforeEach` and `@AfterEach` for setup/teardown
`@BeforeAll` and `@AfterAll` for global setup
### ⏳ 3. Timeout Tests (TimeoutTest.java)
Tests that must complete within a time limit
### 🎯 4. Parameterized Tests (ParameterizedTests.java)
Using `@ValueSource`, `@CsvSource`, and `@MethodSource`

