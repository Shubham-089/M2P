# 🔎 M2P Selenium Automation Suite

## ⚙️ Overview
A TestNG-powered automation suite using Selenium WebDriver to validate key flows across multiple web platforms. Random test data is generated dynamically using Java utilities.

---

## 🧪 Test Modules

### ✅ Demo Web Shop – User Registration
- Navigate to registration page
- Fill: Gender, First Name, Last Name, Email, Password
- Submit the form
- Validate:
  - Error messages on blank fields
  - Success message on valid registration

### 🛒 Product Search & Add to Cart
- Search for "Laptop"
- Confirm relevant items in results
- Add first result to cart
- Assert cart confirmation

---

### 🌐 Selenium.dev – Title & URL Check
- Load site
- Assert title contains "Selenium"
- Click "Downloads" via XPath
- Confirm URL contains "/downloads"

### ⚠️ DemoQA – Alert Handling
- Trigger and accept alert
- Verify alert text: `You clicked a button`

### 🧩 DemoQA – Frame Switch
- Switch to first iframe
- Check heading: `This is a sample page`

### 🪟 Herokuapp – Window Handling
- Open new tab
- Switch window
- Validate title: `New Window`

### ⬇️ Scroll Using JS
- Execute JS to scroll to bottom
- Confirm height change pre/post scroll

---

## 🛠 Tools & Tech
- Java + Selenium WebDriver
- TestNG Framework
- Maven + Faker (for test data)
- JSExecutor, Actions, Waits

---

