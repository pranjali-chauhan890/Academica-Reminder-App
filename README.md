Academica App is an all-in-one productivity tool designed specifically for students. It helps you stay organized, focused, and on track with your academic journey.

---

# 📚 Student Dashboard App

An Android application designed for students to manage their academic life efficiently. The app includes four functional and beautifully designed fragments:
- 📝 Notes
- ⏰ Reminder
- 📅 Timetable
- 🎓 CGPA Calculator

Each fragment is accessible via a *Bottom Navigation Bar* and includes a clean and modern Material UI for a seamless user experience.

---

## 🚀 Features

✅ Fully working *Bottom Navigation*  
✅ Functional *Notes* fragment (add, delete, display notes)  
✅ Functional *Reminder* fragment with time/date pickers  
✅ Functional *Timetable* fragment with subject scheduling  
✅ Functional *CGPA Calculator* with multiple semesters input  
✅ Includes reusable include layouts across all fragments  
✅ Consistent and beautiful *Material UI* across all screens  
✅ Custom icons and colors for visual clarity  
✅ Fragment-based navigation with *FragmentManager*

---

## 📱 UI Preview

> Each fragment maintains a consistent UI style with:
- Rounded corners
- TextInputLayouts
- CardViews for listing items
- Adaptive color scheme

All screens contain the *bottom navigation bar* persistently, with respective fragment content displayed above it.

---

## 🧩 App Structure

```plaintext
MainActivity.java
├── BottomNavigationView (4 items)
├── Fragment Container
│   ├── NotesFragment.java
│   ├── ReminderFragment.java
│   ├── TimetableFragment.java
│   └── CgpaFragment.java
└── Common Include Layouts
