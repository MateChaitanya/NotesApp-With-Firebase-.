# NotesApp - Your Digital Notebook

Welcome to the NotesApp repository! This Android app allows users to create, manage, and organize their notes using Firebase as the backend. Below, we provide an overview of key files, functionalities, and usage instructions:

## Features

- **User Authentication:** Secure user login and registration using Firebase Authentication.
- **Real-time Note Management:** Create, edit, and delete notes, with changes reflected in real-time.
- **Sorting Notes:** Display notes in descending order of their creation timestamp.
- **Logout:** Log out securely with a single click using the menu button.
- **Intuitive UI:** A clean and user-friendly interface for seamless note management.

## Files and Activities

- `CreateAccountActivity.java`: Handles user registration with Firebase Authentication.
- `LoginActivity.java`: Manages user login using Firebase Authentication.
- `MainActivity.java`: The app's main screen for viewing and managing notes.
- `Note.java`: Represents the structure of a note.
- `NoteAdapter.java`: RecyclerView adapter for displaying notes in the main activity.
- `NoteDetailsActivity.java`: Allows users to view and edit note details.
- `SplashActivity.java`: Displays a splash screen on app startup.
- `Utility.java`: Contains utility functions for interacting with Firebase.

## Getting Started

1. Clone or download the repository to your local machine.
2. Set up your Firebase project and add the `google-services.json` file.
3. Open the project in Android Studio.
4. Run the app on your Android device or emulator.
5. Register or log in to start managing your notes!

## Usage

- **Add a Note:** Click the "+" button to create a new note.
- **View/Edit a Note:** Tap on a note in the main screen to view or edit its content.
- **Delete a Note:** Swipe left on a note to reveal the delete button.
- **Logout:** Tap the menu button to access the logout option.

## Important Note

- This app utilizes Firebase for authentication and Firestore for real-time database functionality.
- Ensure your Firebase configuration is correctly set up for the app to work.
- Securely manage sensitive information like Firebase credentials and API keys.

## Resources

- [Firebase Documentation](https://firebase.google.com/docs)
- [Firestore Documentation](https://firebase.google.com/docs/firestore)
- [Firebase UI for Android](https://github.com/firebase/FirebaseUI-Android)

Feel free to explore, customize, and contribute to this project. Happy note-taking and coding!

---
 
SIGNUP Screen
![Screenshot_20231023_152938](https://github.com/MateChaitanya/NotesApp-With-Firebase-./assets/99747639/4e8a95f8-4774-419c-9dea-afa9cd37bdec)

LOGIN Screen
![Screenshot_20231023_152909](https://github.com/MateChaitanya/NotesApp-With-Firebase-./assets/99747639/6673a7b6-d317-427b-8a4b-90b6225b74eb)

FIREBASE Authentication
![Screenshot (44)](https://github.com/MateChaitanya/NotesApp-With-Firebase-./assets/99747639/60d5f1c2-c9d2-46f0-9249-a84093c784ff)

ADD NEW NOTE Screen
![WhatsApp Image 2023-10-23 at 3 42 55 PM](https://github.com/MateChaitanya/NotesApp-With-Firebase-./assets/99747639/3b8b960b-078e-4b7d-9a2e-7aff8f7d2881)

Cloud Firestore
![Screenshot (46)](https://github.com/MateChaitanya/NotesApp-With-Firebase-./assets/99747639/9fb18e78-1e03-478b-8cdf-14e9e4ac0638)

NOTES HOME Screen

