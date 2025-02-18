# 📌 Project Name: Mockito Demo – Bank Service

## 📖 Overview
This project demonstrates how to use Mockito for unit testing in a Java application. It covers key Mockito features such as:
- ✅ Mocking dependencies (@Mock)
- ✅ Stubbing method calls (when-thenReturn)
- ✅ Verifying method interactions (verify(...))
- ✅ Argument capturing (ArgumentCaptor)
- ✅ Using spies (@Spy)
- ✅ Handling exceptions (assertThrows)
- ✅ Mocking static methods (mockStatic)
- ✅ Mocking final classes & methods
- ✅ Custom answers (thenAnswer)
- ✅ Timeout verification (verify(...).timeout())
- ✅ Resetting mocks (Mockito.reset())

The example simulates a Bank Service, where:

BankService handles withdrawals.
AccountRepository (mocked) retrieves and saves accounts.
NotificationService (mocked) sends messages.
TransactionManager (spied) processes withdrawals.
## 📂 Project Structure
```
mockito-poc/
│── src/
│   ├── main/
│   │   ├── java/org/karane/bank/
│   │   │   ├── model/Account.java
│   │   │   ├── repository/AccountRepository.java
│   │   │   ├── service/BankService.java
│   │   │   ├── service/NotificationService.java
│   │   │   ├── service/TransactionManager.java
│   ├── test/
│   │   ├── java/org/karane/bank/
│   │   │   ├── service/BankServiceTest.java
│── pom.xml
│── README.md
```

## 🛠️ Setup & Installation
### 1️⃣ Prerequisites
Install Java 17+
Install Maven
### 2️⃣ Clone the Repository
```sh
git clone https://github.com/karane/core-java-pocs.git
cd mockito-poc
```
### 3️⃣ Run Tests
Execute the following command to run all tests:

```sh
mvn test
```