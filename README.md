# 🏧 ATM Interface

A professional **Core Java Console Application** that simulates basic ATM operations using **Object-Oriented Programming (OOP)** principles and a **Layered Architecture**. The project demonstrates clean code practices, exception handling, SOLID principles, and is designed to be easily migrated to **Spring Boot REST API**.

---

## 📌 Project Overview

The ATM Interface application allows users to perform common banking operations through a console-based menu. It focuses on clean architecture, separation of concerns, and maintainable code.

---

## ✨ Features

* 💰 Deposit Money
* 💸 Withdraw Money
* 💳 Check Account Balance
* ❌ Exit Application
* ⚠️ Custom Exception Handling
* 🧩 Layered Architecture
* 🏗️ SOLID Principles
* 📦 Reusable Constants
* 🛡️ Input Validation
* 🔄 Constructor Injection Ready
* 🚀 Spring Boot Migration Ready

---

## 🛠️ Technologies Used

* Java 21
* Eclipse IDE
* Object-Oriented Programming (OOP)
* Collections Framework
* Exception Handling
* Layered Architecture
* Clean Code Principles

---

## 📂 Project Structure

```text
src
└── main
    └── java
        └── com.decodelabs.atminterface
            ├── controller
            │     └── ATMController.java
            │
            ├── service
            │     └── ATMService.java
            │
            ├── model
            │     └── BankAccount.java
            │
            ├── ui
            │     └── ConsoleUI.java
            │
            ├── util
            │     └── InputHelper.java
            │
            ├── constant
            │     └── AppConstants.java
            │
            ├── exception
            │     ├── ATMException.java
            │     ├── InvalidAmountException.java
            │     └── InsufficientBalanceException.java
            │
            ├── validation
            │     └── ValidationService.java
            │
            └── Main.java
```

---

## 🏛️ Project Architecture

```text
User
 │
 ▼
ConsoleUI
 │
 ▼
ATMController
 │
 ▼
ATMService
 │
 ▼
BankAccount
```

---

## ⚙️ Functional Flow

```text
Start Application
        │
        ▼
 Display Welcome Screen
        │
        ▼
     Show Menu
        │
        ▼
User Selects Operation
        │
        ├──────── Deposit
        ├──────── Withdraw
        ├──────── Check Balance
        └──────── Exit
```

---

## 🧠 OOP Concepts Used

* Encapsulation
* Abstraction
* Constructor Injection
* Composition
* Single Responsibility Principle (SRP)
* DRY (Don't Repeat Yourself)
* Clean Architecture

---

## ⚠️ Exception Handling

Custom Exceptions are implemented for better error handling.

* ATMException
* InvalidAmountException
* InsufficientBalanceException

---

## 📈 Future Enhancements

* User Authentication (PIN Verification)
* Multiple Bank Accounts
* Money Transfer
* Transaction History
* Database Integration (MySQL)
* Spring Boot REST API
* Spring Security + JWT
* Angular / React Frontend
* Docker Deployment

---

## ▶️ How to Run

1. Clone the repository.

```bash
git clone <repository-url>
```

2. Open the project in Eclipse or IntelliJ IDEA.

3. Compile the project.

4. Run the `Main.java` file.

5. Use the console menu to perform ATM operations.

---

## 📸 Sample Console Output

```text
==================================
        ATM Interface
==================================

1. Deposit Money
2. Withdraw Money
3. Check Balance
0. Exit

Enter your choice:
```

---

## 🎯 Learning Outcomes

This project demonstrates understanding of:

* Core Java Programming
* Object-Oriented Design
* Layered Architecture
* SOLID Principles
* Exception Handling
* Clean Code Practices
* Professional Project Structure
* Spring Boot Migration Preparation

---

## 👨‍💻 Developed By

**Md. Amanullah Islam**

Software Developer | Java & Spring Boot Enthusiast

---

## 📄 License

This project is created for educational purposes as part of the **DecodeLabs Java Development Program**.
