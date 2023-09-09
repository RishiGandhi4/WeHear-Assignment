# WeHear-Assignment

# Android Application - README
Project Overview
This Android application fetches data from the Public APIs API, displays it in a responsive user interface, and stores the data in a Room Database. It is written in Java and makes use of GitHub for version control with proper commits.

# Prerequisites
Before you begin, ensure you have the following software and tools installed:

# Android Studio: Download and install Android Studio.
Getting Started
Clone the GitHub repository for this project to your local machine:

# bash
Copy code
git clone <repository_url>
Open the project in Android Studio.

Build and run the application on an Android emulator or a physical device.

# Application Features
Fetching Data: The application fetches data from the Public APIs API using HTTP requests.

Responsive UI: The fetched data is displayed in a responsive user interface, providing an intuitive and user-friendly experience.

Room Database: The data retrieved from the API is stored in a Room Database in a valid format, ensuring data persistence.

# Folder Structure
app/src/main/java: Contains the Java source code for the application.

app/src/main/res: Contains resources such as layout XML files, strings, and drawables.

app/build.gradle: Defines the project's dependencies and configurations.

README.md: This file that provides instructions for setting up and using the application.

# Dependencies
Retrofit: Used for making API requests and handling responses.

gradle
Copy code
implementation 'com.squareup.retrofit2:retrofit:2.x.x'
Room Database: Used for local data storage.

# gradle
Copy code
implementation 'androidx.room:room-runtime:x.x.x'
How to Use
Launch the application on your Android device/emulator.

The application will fetch data from the Public APIs API and display it in the user interface.

Data will also be stored in the Room Database for offline access.

# Contributing
We welcome contributions to improve this project. Feel free to fork the repository, make changes, and create a pull request. Please follow the contribution guidelines provided in the repository.

# Issues and Support
If you encounter any issues or have questions, please open an issue on the GitHub repository.

# Acknowledgments
Public APIs for providing the API used in this application.
Replace <repository_url> with the actual URL of your GitHub repository.

This README template provides a starting point for your Android application project. Make sure to update it with specific details about your project as you progress. Additionally, include any installation or setup instructions specific to your project in the README.

# local database created database -> ActrorDatabase
![Screenshot (267)](https://github.com/RishiGandhi4/WeHear-Assignment/assets/122141117/3ae9f965-dfb0-43ad-baa3-be38944aab0a)
