# Student Management System

A lightweight desktop GUI application built with **Java Swing** and **AWT** for adding, viewing, and managing basic student academic records in real time.

## Features

- **Add Student Records:** Input Student ID, Full Name, Department, and CGPA with empty-field validation.
- **Live Display Panel:** Instantly displays all added student records in a scrollable read-only view.
- **Form & List Controls:**
  - **Add Student** — Validates inputs and appends the record to the list.
  - **Clear** — Resets all input fields and status messages.
  - **Clear List** — Wipes all stored records from the display area.
- **Real-Time Status Feedback:** Color-coded status notifications for validation errors, successful additions, and list resets.

## Tech Stack

- **Language:** Java (JDK 8 or higher)
- **GUI Framework:** Java Swing (`javax.swing.*`) & AWT (`java.awt.*`)
- **Event Handling:** `ActionListener` (Anonymous Inner Classes)

## Project Structure

```text
StudentManagementApp-OOP-/
├── src/
│   └── StudentManagementApp.java   # Main JFrame UI and event logic
└── README.md
