Process Secuence:


                        Main
                        │
                        ▼
                        ATMController
                        │
                        ▼
                        ConsoleUI

                        Read Choice

                        ↓

                        ATMService

                        ↓

                        Result

                        ↓

                        ConsoleUI

🏗 UML
Model :

+----------------------------------+
|          BankAccount             |
+----------------------------------+
| - accountHolderName : String     |
| - balance : double               |
+----------------------------------+
| + BankAccount()                  |
| + BankAccount(name, balance)     |
| + getAccountHolderName()         |
| + setAccountHolderName()         |
| + getBalance()                   |
| + setBalance()                   |
+----------------------------------+



🏗 UML
Service :

+------------------------------------+
|            ATMService              |
+------------------------------------+
| - bankAccount : BankAccount        |
+------------------------------------+
| + deposit(amount)                  |
| + withdraw(amount) : boolean       |
| + checkBalance() : double          |
| + getBankAccount()                 |
+------------------------------------+


🏗 UML
Service :

+------------------------------------------+
|          ValidationService               |
+------------------------------------------+
| + isValidAmount(amount) : boolean        |
| + hasSufficientBalance(...) : boolean    |
+------------------------------------------+



🏗 UML
UI :

+--------------------------------------+
|             ConsoleUI                |
+--------------------------------------+
| - scanner : Scanner                  |
+--------------------------------------+
| + showWelcomeMessage()               |
| + showMenu()                         |
| + readMenuChoice() : int             |
| + readAmount() : double              |
| + showBalance(double)                |
| + showSuccessMessage(String)         |
| + showErrorMessage(String)           |
| + showInvalidChoiceMessage()         |
| + showExitMessage()                  |
+--------------------------------------+


🏗 UML
InputHelper :

+---------------------------------------------+
|              InputHelper                    |
+---------------------------------------------+
| - SCANNER : Scanner                         |
+---------------------------------------------+
| + readInt(String) : int                     |
| + readDouble(String) : double               |
| + readString(String) : String               |
+---------------------------------------------+


🏗 UML
AppConstants :

+----------------------------------------+
|            AppConstants                |
+----------------------------------------+
| + DEFAULT_ACCOUNT_NAME                 |
| + INITIAL_BALANCE                      |
| + EXIT_OPTION                          |
| + DEPOSIT_OPTION                       |
| + WITHDRAW_OPTION                      |
| + BALANCE_OPTION                       |
| + MIN_TRANSACTION_AMOUNT               |
| + DEPOSIT_SUCCESS                      |
| + WITHDRAW_SUCCESS                     |
| + INVALID_AMOUNT                       |
| + INSUFFICIENT_BALANCE                 |
| + INVALID_MENU                         |
| + APP_TITLE                            |
| + EXIT_MESSAGE                         |
+----------------------------------------+





1️⃣ Overall System Flow : 


                                                START
                                                │
                                                ▼
                                        Initialize Bank Account
                                                │
                                                ▼
                                        Display ATM Menu
                                                │
                                                ▼
                                        Read User Choice
                                                │
                                ┌───────────────┼───────────────┐
                                │               │               │
                                ▼               ▼               ▼
                                Deposit         Withdraw      Check Balance
                                │               │               │
                                └───────────────┼───────────────┘
                                                │
                                                ▼
                                        Show Result
                                                │
                                                ▼
                                        Return to Menu?
                                                │
                                        Yes ─────┘
                                                │
                                        No (Exit)
                                                ▼
                                                END









2️⃣ Deposit Flow :


                                User

                                ↓

                                Select Deposit

                                ↓

                                Enter Amount

                                ↓

                                Validate Amount

                                ↓

                                Valid?
                                │
                                ├── No
                                │      ↓
                                │  Show Error
                                │      ↓
                                │  Back to Menu
                                │
                                └── Yes
                                ↓
                                Deposit Money
                                ↓
                                Update Balance
                                ↓
                                Success Message
                                ↓
                                Back to Menu







3️⃣ Withdraw Flow :


                                User

                                ↓

                                Select Withdraw

                                ↓

                                Enter Amount

                                ↓

                                Validate Amount

                                ↓

                                Valid?
                                │
                                ├── No
                                │      ↓
                                │  Invalid Amount
                                │      ↓
                                │  Back to Menu
                                │
                                └── Yes
                                ↓
                                Check Balance
                                │
                                ▼
                                Enough Balance?
                                │
                                ├── No
                                │      ↓
                                │ Insufficient Balance
                                │      ↓
                                │ Back to Menu
                                │
                                └── Yes
                                ↓
                                Withdraw Money
                                ↓
                                Update Balance
                                ↓
                                Success Message
                                ↓
                                Back to Menu






4️⃣ Balance Inquiry Flow :


                                User

                                ↓

                                Select Check Balance

                                ↓

                                Read Current Balance

                                ↓

                                Display Balance

                                ↓

                                Back to Menu







5️⃣ Exit Flow :


                                User

                                ↓

                                Select Exit

                                ↓

                                Display

                                Thank You

                                ↓

                                Close Application






6️⃣ Invalid Menu Flow(when user put wrong number) :


                                Display Menu

                                ↓

                                Read Choice

                                ↓

                                Choice Valid?

                                │

                                ├── Yes
                                │      ↓
                                │ Execute Operation
                                │
                                └── No
                                ↓
                                Show

                                Invalid Choice

                                ↓

                                Display Menu Again






7️⃣ Complete Activity Flow :

                                                START
                                                │
                                                ▼
                                        Create Bank Account
                                                │
                                                ▼
                                        Display Menu
                                                │
                                                ▼
                                        Read User Choice
                                                │
                                ┌──────────┬───────────┬───────────┬──────────┐
                                ▼          ▼           ▼           ▼
                                Deposit   Withdraw   Balance      Exit
                                │          │           │           │
                                ▼          ▼           ▼           ▼
                                Validation Validation Display   Thank You
                                │          │           │           │
                                ▼          ▼           ▼           ▼
                                Update    Update      Return      END
                                Balance   Balance
                                │          │
                                └──────┬───┘
                                        ▼
                                Return to Menu






🔄 Controller Flow(how to work in controller by project) :


                                Console UI

                                ↓

                                ATM Controller

                                ↓

                                Validation Service

                                ↓

                                ATM Service

                                ↓

                                Bank Account

                                ↓

                                Console UI







📋 Business Flow :

                                Input

                                ↓

                                Validation

                                ↓

                                Business Logic

                                ↓

                                Update Data

                                ↓

                                Output






⭐ Professional Improvement(Next steep) :

                                HTTP Request

                                ↓

                                REST Controller

                                ↓

                                Service

                                ↓

                                Repository

                                ↓

                                Database

                                ↓

                                Response








🎯 UML (Simplified) :


                                +--------------------+
                                |    BankAccount     |
                                +--------------------+
                                | accountHolderName  |
                                | balance            |
                                +--------------------+
                                | deposit()          |
                                | withdraw()         |
                                | getBalance()       |
                                +--------------------+

                                        ▲
                                        │
                                        │ uses
                                        │

                                +--------------------+
                                |    ATMService      |
                                +--------------------+
                                | deposit()          |
                                | withdraw()         |
                                | checkBalance()     |
                                +--------------------+

                                        ▲
                                        │

                                +--------------------+
                                | ATMController      |
                                +--------------------+
                                | start()            |
                                | processMenu()      |
                                | handleDeposit()    |
                                | handleWithdraw()   |
                                +--------------------+

                                        ▲
                                        │

                                +--------------------+
                                |     ConsoleUI      |
                                +--------------------+
                                | showMenu()         |
                                | readChoice()       |
                                | showMessage()      |
                                +--------------------+