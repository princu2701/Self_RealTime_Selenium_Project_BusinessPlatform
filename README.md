# Skill Matrix

**Skill Matrix** is a company-internal web application designed to manage the training and approval process for different types of users across departments and plants. This automation testing framework is developed using Selenium WebDriver, TestNG, Maven, and follows the Page Object Model (POM) architecture.

---

## 🧰 Tech Stack

- **Automation Tool:** Selenium WebDriver  
- **Framework:** TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **Language:** Java  
- **IDE Used:** IntelliJ IDEA  
- **Reporting:** (To be integrated post-testing completion)

---

## 📁 Project Structure

The framework includes various modules and flows:
```
Admin_Preparer_Trainer_Package/
  ├── ApprovalMatrixPage
  ├── CasePage
  ├── DepartmentPage
  ├── PlantDepartmentmappingPage
  ├── PlantPage
  ├── UserMasterPage

ApproverModule_Pages/
  ├── ApproverHomepage
  ├── ApproverTrainingPlanPage
  ├── CasePage

Checker/
  ├── CasePage
  ├── User3HomePage
  ├── User3TrainingPlanPage

CommonPage_Package/
  ├── CaseDetailsPage
  ├── CaseListPage
  ├── DashboardPage
  ├── Homepage
  ├── LoginPage

ConclusionPackages/
  ├── Admin_AllPagesTest
  ├── FullFlow_Test
  ├── TrainingPlan_Page_FlowTesting

GlobalMethodstoUse/
  ├── GlobalMethods

FullFlow_Testing/
  ├── FullFlowCreation

BaseTests/
  ├── Basetest_1
```

---

## 🧪 Testing Overview

As the sole tester for the project, I’ve implemented a structure to cover:

- 🔸 **Smoke Testing**
- 🔹 **Regression Testing**
- 🔸 **Sanity Testing**

The automation scripts are modular and follow reusable methods for flexibility and scalability.

---

## 🔐 User Flow

1. **Admin Login**
   - Create Users
   - Create Plants
   - Create Departments
   - Map Plants & Departments
   - Setup User Matrix & Approval Matrix

2. **Role-Based Actions**
   - **Preparer:** Creates training/process flows
   - **Checker, Approver, Trainer:** Review submitted flows; can Accept, Reject, or Raise Queries

---

## 🚀 How to Run

1. Clone the repository  
   ```bash
   git clone https://github.com/princu2701/Self_RealTime_Selenium_Project_BusinessPlatform.git
   ```
2. Ensure **VPN connection** is active (mandatory for accessing the internal app).
3. Open the project in **IntelliJ IDEA**.
4. Run the TestNG suite (e.g., `Basetest_1`) to start browser-based tests.
5. Tests will automatically launch a Firefox browser and hit the defined internal URL:
   ```
   http://172.16.30.59:8080/ords/f?p=172:LOGIN:4323551477942::::::
   ```

---

## 👤 Author & Contribution

- 👨‍💻 **Tester:** @princu2701  
- I am the **only QA** on this project, responsible for:
  - Designing the test framework from scratch
  - Writing and maintaining scripts daily
  - Planning & executing all types of testing phases

---

## 📌 Notes

- Reporting (Extent Reports / Allure) will be configured once the testing phase is complete.
- Screenshots and logs will be added in the final phase of the project.
