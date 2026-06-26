#  Number Guessing Game (Java)

## Overview
A console-based Number Guessing Game built in Java with multiple difficulty levels, score system, input validation, and a colorful hint system (lights).
The player has to guess a randomly generated number between **0–1000** within limited attempts.

---

##  Features

- 🎯 3 Difficulty Levels (Easy, Medium, Hard)
- 🧠 Smart hint system (Too high / Too low)
- 🟢🟡🔴 Light-based feedback (Close / Medium / Far)
- ⚠ Warning system for invalid/repeated input
- 🎯 Score calculation based on performance
- 🔁 Replay option after each game
- 🎨 Colored console output using ANSI codes

---

##  Game Rules

1. Computer selects a random number (0–1000)
2. Player selects difficulty:
   - Easy → 10 guesses  
   - Medium → 7 guesses  
   - Hard → 5 guesses  
3. Player guesses the number within attempts
4. Each wrong guess reduces attempts
5. Warnings are given for invalid or repeated input
6. Game ends when:
   - ✔ Number is guessed (WIN)
   - ❌ Attempts finish (LOSS)

---

##  Light System (Hint Feature)

- 🟢 Very Close (small difference)
- 🟡 Getting closer (medium difference)
- 🔴 Far away (large difference)

This helps the player understand how close their guess is.

---

##  Technologies Used

- Java
- Scanner Class (Input handling)
- Random Class (Number generation)
- ArrayList (Tracking guesses)
- ANSI Color Codes (UI enhancement)

---

##  Score System

Score is calculated based on:
- Number of attempts used
- Difficulty level selected

Higher performance = higher score 🎯

---

##  How to Run

### Compile:
```bash
javac number_guessing_game.java

---

### About
Built as part of OOP coursework at UET Lahore.

### Author:
Abeeha Abbas BS Cyber Security — UET Lahore
[LinkedIn](https://www.linkedin.com/in/abeeha-abbas/)
