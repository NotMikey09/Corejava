# Education Institute Course Enrollment System

This project simulates a simple course enrollment system for an education institute.

## Features

* **Course Management:**
    * Define courses with unique IDs, names, and fees.
* **Offer Management:**
    * Define and manage special offers for students.
* **Student Enrollment:**
    * Allow students to view available courses and their fees.
    * Allow students to view ongoing offers.
    * Enable students to enroll in their preferred courses.
* **Concurrent Student Interactions:**
    * Simulate concurrent enrollment requests from multiple students using threads.

## Classes

* **Course:**
    * Attributes: `courseId`, `courseName`, `courseFee`
    * Methods: `getCourseId()`, `getCourseName()`, `getCourseFee()`, `toString()`
* **Offer:**
    * Attributes: `offerText`
    * Methods: `getOfferText()`
* **EducationInstitute:**
    * Attributes: `courses`, `offers`
    * Methods: `getCourses()`, `getOffers()`, `enrollStudentInCourse()`
* **Student:**
    * Attributes: `name`, `institute`
    * Methods: `viewCoursesAndFees()`, `viewOffers()`, `enrollInCourse()`, `run()` (for thread execution)
* **EducationInstituteApp:**
    * Main class to initiate the system, create students, and start their threads.

## Usage

1. **Compile:** Compile the Java source code files.
2. **Run:** Execute the `EducationInstituteApp` class.

**Sample Output:**

Available Courses:

Mathematics - Fee: Rs.1000.0
Science - Fee: Rs.1200.0
English - Fee: Rs.900.0
Ongoing Offers:
Special discount: Get 20% off on all courses!
Limited time offer: Enroll in any two courses and get one course free!

Virat has enrolled in the course: Mathematics

Available Courses:

Mathematics - Fee: Rs.1000.0
Science - Fee: Rs.1200.0
English - Fee: Rs.900.0
Ongoing Offers:
Special discount: Get 20% off on all courses!
Limited time offer: Enroll in any two courses and get one course free!

Dhoni has enrolled in the course: Science


## Notes

* This is a simplified implementation for demonstration purposes.
* You can enhance this system by:
    * Adding more realistic data.
    * Implementing more complex offers and discounts.
    * Adding features like student registration, payment processing, etc.
    * Improving error handling and user input validation.
* Refer to the Java source code for detailed implementation.

This README file provides a basic overview of the Education Institute Course Enrollment