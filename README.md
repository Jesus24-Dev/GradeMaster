# School Grade Management System

This is a system designed to manage and control school grades for a secondary school, providing specific interfaces for students, teachers, and the principal. It allows managing users, student lists, grades, and subjects.

---

## Main Features

### Student Window

- **Functionalities**:
  - View their school grades.
- **Restrictions**:
  - Students only have read-only access to their grades.

---

### Teacher Window

- **Functionalities**:
  - Access the student list by grade.
  - Add school grades for the subjects assigned to the teacher.

---

### Principal's Window

- **User CRUD**:
  - Create, read, update, and delete users (students and teachers).
  - Change user status between **Active** and **Inactive**.
  - Search users by **ID**.
- **Student List CRUD**:
  - Add new students.
  - Edit student information, including grade and section.
  - Remove students from the list.
- **School Grades CRUD**:
  - Manage grades for all registered subjects in the system.
- **Subjects CRUD**:
  - Add, edit, and delete school subjects.
  - Assign teachers to specific subjects.

---

## Predefined Users for Testing

1. **Principal**:
   - **ID**: `0`
   - **Password**: `admin_secure@2023`
2. **Teacher**:
   - **ID**: `105`
   - **Password**: `edward_#safe`
3. **Student**:
   - **ID**: `1`
   - **Password**: `password_1`

---

## System Requirements

- **Operating System**: Windows, macOS, or Linux.
- **Runtime Environment**: Java JDK 11 or higher.
- **Database**: PostgreSQL. You can edit database connection properties in `src/main/java/grademaster/utils/DatabaseProps.java`.
- **Additional Dependencies**:
  - Required libraries for connecting to PostgreSQL.

---

## **Installation Instructions**

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/Jesus24-Dev/GradeMaster.git
   ```

2. **Import the Project**:

   - Open your preferred IDE (NetBeans, IntelliJ, Eclipse, etc.).
   - Import the project as an existing Java project.

3. **Configure the Database**:

   - Restore the database using the provided `.sql` file in your PostgreSQL database manager.
   - Create a database named "grademaster" and run the `.sql` file from a query window.

4. **Run the Application**:

   - Compile and run the `GradeMaster.java` file from your IDE.

---

## **Project Structure**

- **src/main/java/grademaster**: Contains the core logic of the application.
- **src/main/java/grademaster/views**: Contains the graphical user interfaces for the different windows (Student, Teacher, Principal).
- **src/db**: Contains the SQL file for the database backup.
- **src/main/java/grademaster/models**: Contains model classes representing the data structure.
- **src/main/java/grademaster/repository**: Contains classes that handle database connections.
- **src/main/java/grademaster/service**: Contains classes that validate data and handle exceptions before sending data to the repository.
- **src/main/java/grademaster/controller**: Contains classes that connect the graphical interface with the backend.

---

## **Additional Notes**

- Users must log in with a valid ID and password to access the corresponding functionalities.
- The principal has full control over the system, including assigning teachers to subjects and editing grades for all registered subjects.
