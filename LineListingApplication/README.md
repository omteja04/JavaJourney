<!-- 
    Author: omteja04 
    Created on: 01-04-2024 02:49:01
    Description: Line Listing Application
 -->


# Line Listing Application 📊

---

Welcome to the Line Listing Application! This project is a practice endeavor aimed at enhancing your Java skills through hands-on development. Dive into the code, experiment, and have fun crafting your very own data management tool!

## Project Overview 🚀

The Line Listing Application is a Java-based solution designed to streamline data entry, management, and visualization tasks. With its intuitive user interface and robust features, you can effortlessly handle various data operations, from adding new entries to generating insightful reports.

---

## Features ✨

- **Effortless Data Entry:** Seamlessly add, modify, and manage entries with user-friendly forms and interactive controls.
- **Dynamic Data Visualization:** Visualize data trends and patterns with comprehensive reports and interactive charts.
- **Flexible Export Options:** Export your data to CSV format for further analysis or sharing with stakeholders.
- **Easy Customization:** Tailor the application to your specific needs with configurable settings and extensible functionality.

## Getting Started 🚀

1. **Clone the Repository:** Start by cloning this repository to your local machine.
2. **Set Up Dependencies:** Ensure you have the necessary dependencies installed:
   - **MySQL Connector/J JAR:** Required for database connectivity. Download it from the official MySQL website or Maven Central repository.
   - **JCalendar JAR:** Required for calendar functionality. Ensure you have the JCalendar library included in your project's classpath.
3. **Explore the Code:** Dive into the codebase and explore each class to understand its purpose and functionality.
4. **Experiment and Learn:** Experiment with the code, make modifications, and observe how they affect the application's behavior.
5. **Share Your Insights:** Have insights or questions? Feel free to share them with the community or reach out for assistance!

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

4. **InsertingIntoDb**
   - **Responsibility:** Handles insertion of data into the database.
   - **Methods:**
     - `dbConnect`: Establishes connection to the database.
     - `insertDB`: Inserts data into the database and prompts for CSV generation.
     - `csv`: Generates CSV file.

5. **DLLGenerateData**
   - **Responsibility:** Generates data reports and provides functionality to export data to CSV format.
   - **Methods:**
     - `dbConnect`: Establishes connection to the database.
     - `generateCSV`: Generates CSV file from the displayed data.
     - `DLLGenerateData`: Constructor. Initializes GUI components and sets up the layout.

6. **DLLModifyData**
   - **Responsibility:** Currently empty class, intended for future implementation of data modification functionalities.

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

[![GitHub](https://img.shields.io/badge/GitHub-omteja04-black?logo=github)](https://github.com/omteja04) [![LinkedIn](https://img.shields.io/badge/LinkedIn-omteja-blue?logo=linkedin)](https://www.linkedin.com/in/omteja)

- Primary developer: Omteja


---

#### Version History

- **Version 1.0** (April 2024):
  - Initial release with basic functionalities.
