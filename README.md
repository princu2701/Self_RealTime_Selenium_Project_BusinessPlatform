# 💼 Skill Matrix – Selenium Automation Framework

> 🚧 **Note:** This project is under active development and daily updates.  
> 🧪 Automated by: **Sole QA (Me)** | 🧠 Ownership: End-to-End Testing

## 📌 Project Overview

**Skill Matrix** is an internal business platform used to manage role-based access, user creation, department mapping, and training flows. It allows Admins to define complex approval workflows involving four types of users — **Preparer**, **Checker**, **Approver**, and **Trainer** — to streamline organizational processes.

This project automates the entire testing lifecycle using **Selenium**, **TestNG**, and the **Page Object Model (POM)** framework, with **Maven** for build management.

---

## 🧠 Modules Automated

- 🔑 **Admin Login** with VPN
- 🏭 **Plant & Department Creation**
- 🔁 **Plant–Department Mapping**
- 👥 **User Matrix** – Create users with roles & permissions
- ✅ **Approval Matrix** – Configure process flows
- 👨‍🏫 **Preparer** – Creates training flow
- 👀 **Checker / Approver / Trainer** – Review or reject plans, raise queries

---

## 🧰 Tech Stack

| Tech          | Details                                     |
|---------------|---------------------------------------------|
| Language      | Java                                        |
| Framework     | Page Object Model (POM)                     |
| Testing Tool  | Selenium WebDriver + TestNG                 |
| Build Tool    | Maven                                       |
| Reporting     | [Coming Soon] HTML/Extent Report Integration |
| IDE           | IntelliJ IDEA                               |
| Version Ctrl  | Git & GitHub                                |
| Execution     | Local (via IntelliJ or `mvn test`)          |
| VPN Required  | ✅ Yes (for internal environment)            |

---

## 📁 Project Structure

The following is the organized POM-based folder structure:

```
src/
└── test/
    └── java/
        ├── Admin_Preparer_Trainer_Package/
        │   ├── ApprovalMatrixPage.java
        │   ├── CasePage.java
        │   ├── DepartmentPage.java
        │   ├── PlantDepartmentmappingPage.java
        │   ├── PlantPage.java
        │   └── UserMasterPage.java
        │
        ├── ApproverModule_Pages/
        │   ├── ApproverHomepage.java
        │   ├── ApproverTrainingPlanPage.java
        │   └── CasePage.java
        │
        ├── Checker/
        │   ├── CasePage.java
        │   ├── User3HomePage.java
        │   └── User3TrainingPlanPage.java
        │
        ├── CommonPage_Package/
        │   ├── CaseDetailsPage.java
        │   ├── CaseListPage.java
        │   ├── DashboardPage.java
        │   ├── Homepage.java
        │   ├── LoginPage.java
        │
        ├── ConclusionPackages/
        │   ├── Admin_AllPagesTest.java
        │   ├── FullFlow_Test.java
        │   └── TrainingPlan_Page_FlowTesting.java
        │
        ├── GlobalMethodstoUse/
        │   └── GlobalMethods.java
        │
        ├── FullFlow_Testing/
        │   └── FullFlowCreation.java
        │
        └── BaseTests/
            └── Basetest_1.java
```

---

## 🚀 How to Run the Project

### 📥 Clone the Repository
```bash
git clone https://github.com/princu2701/Self_RealTime_Selenium_Project_BusinessPlatform.git
```

### 🔗 Pre-requisites
- VPN must be connected ✅  
- Java (11 or above) installed  
- Maven installed  
- IntelliJ IDEA recommended  

### ▶️ Run Tests
Open project in IntelliJ and run TestNG suite (`Basetest_1`)  
Or use command line:
```bash
mvn clean test
```

---

## 📊 Testing Approach

| Type        | Covered | Notes                                      |
|-------------|---------|--------------------------------------------|
| Smoke       | ✅       | For each module                            |
| Regression  | ✅       | After changes or additions                 |
| Sanity      | ✅       | Before deployment                          |

🧪 As the **only QA**, I built and am maintaining the test scripts from scratch for **complete coverage** and **real-time execution**.

---

## 🔗 Project Access

- 🖥️ Internal URL: `http://172.16.30.59:8080/ords/f?p=...` *(VPN required)*
- 📁 Repo Link: [GitHub – BusinessPlatform](https://github.com/princu2701/Self_RealTime_Selenium_Project_BusinessPlatform.git)

---

## 📌 Notes

- Reporting functionality will be added once the test framework is fully stable.
- This repository serves as a **real-time automation showcase** for enterprise-level modules.

---

## 🙋‍♂️ About Me

I am the **sole QA engineer** working on this live company project — building everything from automation, framework setup, test case design to execution and reporting.

> Thank you for visiting!  
> 🔄 Project is being **actively updated daily** — stay tuned!

