## Project Setup

1. &nbsp;Created an IntelliJ Maven Project with the name RecepBorekciQaracter-assignment-3
2. Created an empty repository on GitHub with the name RecepBorekciQaracter-assignment-3. No .gitignore, no Readme.md, and no license is selected.
3. In git bash, I went into the project location and renamed the name of the main branch to main from master using this command: `git branch -M main`
4. Deleted the sample code from the Main.java file and saved my changes.
5. Added the below lines into the project's .gitignore file:
```
\### Maven ###

pom.xml.tag

pom.xml.releaseBackup

pom.xml.versionsBackup

pom.xml.next

release.properties
```

## Initial Commit

1. Executed `git add .` to stage all of the project files.
2. Executed `git commit -m "Initial commit - Removed sample code from Main.java"` to commit my changes to my local main branch
3. Added the remote repo by using the following command `git remote add origin https://github.com/RecepBorekciQaracter/RecepBorekciQaracter-assignment-3.git`
4. Executed `git push -u origin main` to synchronize my main branch to the local branch.


## Create Bank Account Class

1. Created a new branch with the name "feature/bank-account-class" using ` git branch -c feature/bank-account-class`
2. Switch to this branch using `git switch feature/bank-account-class`
3. Created a new Java class in the project named BankAccount.java.
4. Inside this BankAccount class, I defined the attributes and created different constructors with different signatures.
5. Executed `git add .` to stage my changes.
6. Committed my changes using `git commit -m "Created the BankAccount class with attributes and different constructors"`
7. Implewment the requested methods for Bank Account class such as deposit, withdraw and others. And left TODOs for adding the InsufficientFundsException
8. Executed `git add .` to stage my changes.
9. Commit my changes using `git commit -m "Implement the Bank Account methods in the Bank Account class"`
10. Executed `git push -u origin feature/bank-account-class` to push my changes to remote
11. Switched to main branch
13. And did a no fast forward merge using git merge --no-ff feature/bank-account-class
14. And I did git push main to complete the changes


## Exception Class

1. Created a new branch with the name "feature/exceptions" using `git branch -c feature/exceptions`
2. Switched to this branch using `git switch feature/exceptions`
3. Created the InsufficientFundsException class and make it a Custom Exception.
5. Executed `git add .` to stage my changes.
6. Committed my changes using `git commit -m "Created the InsufficientFundsException class"`
7. Implemeted this Exception in the BankAccount class where I left placeholder TODOs.
8.  Executed `git add .` to stage my changes.
9. Committed my changes using `git commit -m "Implemented the InsufficientFundsException in the BankAccount class"`
10. Executed `git push -u origin feature/exceptions` to push my changes to remote
11. Switched to main branch
12. And did a no fast forward merge using git merge --no-ff feature/exceptions
13. And I did git push main to complete the changes

## Savings Account
1. Created a new branch with the name "feature/savings-account" using `git branch -c feature/savings-account`
2. Switched to this branch using `git switch feature/savings-account`
3. Realized the balance must be protected so I change the visiblity of it.
4. added the Bank Account.Java file with `git add  src/main/java/org/example/BankAccount.java`
5. Commit this change `git commit -m "Change balance attribute's visibility to protected"`
6. Create and implement the whole savings account class.
7. Add the changes  `git add .`
8. Committed my changes `using git commit -m "Create and Implement the SavingsAccount class with an interest rate, and created the required constructors and methods"`
9. Executed `git push -u origin feature/savings-account` to push my changes to remote
11. Switched to main branch
12. And did a no fast forward merge using git merge --no-ff feature/savings-account
13. And I did git push main to complete the changes

## Global Account Registry
1. Created a new branch with the name "feature/savings-account" using `git branch -c feature/account-registry`
2. Switched to this branch using `git switch feature/account-registry`
3. Realized I need getters in the BankAccount. So I added getters for the BankAccount attributes.
4. dded the Bank Account.Java file with `git add  src/main/java/org/example/BankAccount.java`
5. Commit this change `git commit -m "Added getters for BankAccount attributes`
6. Implemented the Bank class
7. Add the changes  `git add .`
8. Committed my changes `git commit -m "Implemented the Bank class for registry purposes"`
9. Executed `git push -u origin feature/account-registry` to push my changes to remote
11. Switched to main branch
12. And did a no fast forward merge using git merge --no-ff feature/account-registry
13. And I did git push main to complete the changes

## Entry point
1. Created a new branch with the name "feature/savings-account" using `git branch -c feature/final-changes`
2. Switched to this branch using `git switch feature/final-changes`
3. Fixed a bug in the Bank class getBalance function
4. Created and implemented the menu in the Main.java.
5. Add the changes  `git add .`
6. Committed my changes `git commit -m "Created the main function entry point and fixed get balance function of Bank class`
7. Executed `git push -u origin feature/final-changes` to push my changes to remote
8. Switched to main branch
9. And did a no fast forward merge using git merge --no-ff feature/final-changes
10. And I did git push main to complete the changes

## Uploading the Workflow.md

1. Created a new branch with the name "docs/add_workflow_markdown" using `git branch -c docs/add\_workflow\_markdown`
2. Switched to this branch using `git switch docs/add\_workflow\_markdown`
3. Add this file into the root directory.
4. Add this file to git with "git add ."
5. Commit this file using "git commit -m "Added the workflow file"
6. Executed `git push -u origin docs/add\_workflow\_markdown` to push this file to the remote repository.
7. Switched to main branch
8. And did a no fast forward merge using `git merge --no-ff docs/add\_workflow\_markdown`
9. And I did git push main to complete the changes
