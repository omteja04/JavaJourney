<!-- 
    Author: omteja04 
    Created on: 01-04-2024 02:42:29
    Description: Line Listing Application
 -->

### Line Listing Application 📊

---

#### Introduction

The Line Listing Application is a Java-based application designed to manage and generate reports related to maternal and child health data. This application provides functionalities such as adding new entries, modifying existing data, and generating reports in CSV format.

---

#### Classes Overview

1. **Initiator**
   - **Responsibility:** Initiates the application by creating an instance of `DLLHome`.
   - **Methods:**
     - `main`: Entry point of the application. Creates a new instance of `DLLHome`.

2. **DLLHome**
   - **Responsibility:** Provides the main interface of the application.
   - **Methods:**
     - `actionPerformed`: Handles button click events and invokes corresponding functionalities.
     - `DLLHome`: Constructor. Initializes the GUI components and sets up the layout.

3. **DLLAddEntry**
   - **Responsibility:** Allows users to add new entries to the database.
   - **Methods:**
     - `setFontForTextFields`: Sets font for text fields.
     - `clearFields`: Clears all input fields.
     - `setDefaultFieldValues`: Sets default values for specific fields.
     - `DLLAddEntry`: Constructor. Initializes GUI components and sets up the layout.

4. **DLLGenerateData**
   - **Responsibility:** Generates data reports and provides functionality to export data to CSV format.
   - **Methods:**
     - `dbConnect`: Establishes connection to the database.
     - `generateCSV`: Generates CSV file from the displayed data.
     - `DLLGenerateData`: Constructor. Initializes GUI components and sets up the layout.

5. **DLLModifyData**
   - **Responsibility:** Currently empty class, intended for future implementation of data modification functionalities.

6. **InsertingIntoDb**
   - **Responsibility:** Handles insertion of data into the database.
   - **Methods:**
     - `dbConnect`: Establishes connection to the database.
     - `insertDB`: Inserts data into the database and prompts for CSV generation.
     - `csv`: Generates CSV file.
  
7. **CSVGenerator**
   - **Responsibility:** Provides methods for generating CSV files.
   - **Methods:**
     - `generateCSV`: Generates CSV file from headers and data.
     - `generateCSVTable`: Generates CSV file from headers and tabular data.

---

#### Usage

1. Compile all Java files.
2. Run `Initiator.java`.
3. Use the provided interface to add entries, generate reports, and modify data as necessary.

---

#### Note

- Ensure MySQL is properly configured and running.
- Update database connection details in relevant classes if necessary.

---

#### Contributors

- **omteja04**: Primary developer.

---

#### Version History

- **Version 1.0** (April 2024):
  - Initial release with basic functionalities.
