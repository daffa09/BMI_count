<!-- portfolio -->
<!-- slug: bmi-count -->
<!-- title: BMI Count Calculator -->
<!-- description: A simple BMI (Body Mass Index) calculator application built with Java Swing -->
<!-- image: https://github.com/user-attachments/assets/placeholder-bmi-count -->
<!-- tags: java, swing, calculator, desktop-app -->

# BMI Count Calculator

A simple yet functional Body Mass Index (BMI) calculator built with Java and Swing GUI framework. This application helps users calculate their BMI based on height and weight inputs, providing instant health category feedback.

## 📋 Overview

This BMI calculator is a desktop application that provides a user-friendly interface for calculating Body Mass Index. The application accepts user inputs for height (in centimeters) and weight (in kilograms), then calculates and displays the BMI value along with the corresponding health category classification.

## ✨ Features

- **Simple GUI Interface**: Clean and intuitive Swing-based user interface
- **Real-time Calculation**: Instant BMI calculation upon button click
- **Health Category Classification**: Displays BMI category (Underweight, Normal, Overweight, Obese)
- **Input Validation**: Ensures valid numeric inputs for accurate calculations
- **Cross-platform**: Runs on any platform with Java installed (Windows, macOS, Linux)

## 🛠️ Technologies Used

- **Java**: Core programming language
- **Swing**: GUI framework for desktop interface
- **AWT**: Abstract Window Toolkit for UI components

## 📁 Project Structure

```
BMI_count/
├── src/
│   └── com/
│       └── bmi/
│           └── calculator/
│               └── Main.java
├── lib/
│   └── (dependencies if any)
└── README.md
```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Visual Studio Code with Java Extension Pack (recommended) or any Java IDE

### Installation & Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd BMI_count
   ```

2. **Open in VS Code**
   - Open the project folder in Visual Studio Code
   - Ensure the Java Extension Pack is installed

3. **Compile the project**
   ```bash
   javac -d bin src/com/bmi/calculator/*.java
   ```

4. **Run the application**
   ```bash
   java -cp bin com.bmi.calculator.Main
   ```

## 💻 Usage

1. Launch the application
2. Enter your height in centimeters (cm)
3. Enter your weight in kilograms (kg)
4. Click the "Calculate BMI" button
5. View your BMI value and health category

### BMI Categories

- **Underweight**: BMI < 18.5
- **Normal weight**: BMI 18.5 - 24.9
- **Overweight**: BMI 25 - 29.9
- **Obese**: BMI ≥ 30

## 📦 Dependency Management

The `JAVA DEPENDENCIES` view in VS Code allows you to manage your dependencies easily. More details can be found in the [Java Extension Pack documentation](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).

## 🤝 Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for improvements.

## 📄 License

This project is open source and available for educational purposes.
