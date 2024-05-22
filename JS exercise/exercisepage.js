// Array to store customer objects
var customers = [];

// Function to validate the form fields and add customer
function validateForm() {
  var name = document.getElementById("name").value.trim(); // Remove leading and trailing whitespace
  var email = document.getElementById("email").value.trim(); // Remove leading and trailing whitespace
  var contact = document.getElementById("contact").value;
  var accountType = document.getElementById("accountType").value;
  var isValid = true;

  // Name validation
  if (!/^[a-zA-Z\s]+$/.test(name)) { // Allow alphabets and spaces
    document.getElementById("nameError").textContent = "Please enter only alphabets";
    isValid = false;
  } else {
    document.getElementById("nameError").textContent = "";
  }

  // Email validation
  if (!/^\s*\S+@\S+\.\S+\s*$/.test(email)) {
    document.getElementById("emailError").textContent = "Please enter a valid email address";
    isValid = false;
  } else {
    document.getElementById("emailError").textContent = "";
  }

  // Contact number validation
  if (!/^[7-9]{1}[0-9]{9}$/.test(contact)) {
    document.getElementById("contactError").textContent = "Please enter a 10-digit number starting with 7, 8, or 9";
    isValid = false;
  } else {
    document.getElementById("contactError").textContent = "";
  }

  // Account type validation
  if (accountType === '') {
    document.getElementById("accountTypeError").textContent = "Please select an account type";
    isValid = false;
  } else {
    document.getElementById("accountTypeError").textContent = "";
  }

  if (isValid) {
    var customer = {
      name: name,
      email: email,
      contact: contact,
      accountType: accountType
    };

    // Log customer object to the console
    console.log("New customer:", customer);

    // Add customer to array
    customers.push(customer);

    // Add the customer details to the table
    addCustomerToTable(customer);

    // Clear the form fields after adding the customer
    document.getElementById("customerForm").reset();
  }

  // Prevent form submission
  return false;
}

// Function to add a new customer to the table
function addCustomerToTable(customer) {
  var table = document.getElementById("customerList");
  var row = table.insertRow(-1);
  var cell1 = row.insertCell(0);
  var cell2 = row.insertCell(1);
  var cell3 = row.insertCell(2);
  var cell4 = row.insertCell(3);
  cell1.textContent = customer.name;
  cell2.textContent = customer.email;
  cell3.textContent = customer.contact;
  cell4.textContent = customer.accountType;
}
