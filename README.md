# 🏍️ Moto GP Racing Game
This project is a motorcycle racing game.  
You just need to enter the number of racers, the brand of motorcycle, the racer's name, and the registration number to race against each other and win the championship. 
This game is for all ages; anyone can play.

## 🌟 Main features
* **Register Racers:** Add any number of racers to the tournament.
* **Diverse Brands:** Supports creating various car models from popular brands: `Ducati`, `Yamaha`, `Honda`, `Aprilia`.
* **Race Simulation (Formation Lap):** Displays racer information along with a random starting speed (from 300 to under 350 km/h).
* **Opening Lap:** Arranges and displays the leaderboard of racers based on decreasing speed.
* **Champion Recognition:** Automatically finds and displays the fastest racer (Champion).
* **Console Effects:** Integrates a real-time countdown timer and a vibrant ASCII Art interface.

## 🛠️ Technology used
The project is written in Java programming language  
Using IntelliJ IDEA 2026.2.3 and Amazon Corretto JDK 21.0.12  
The project does not use any database management systems or connect to databases  

## 🚀 Install and run
1 -- Open CMD or Git Bash at the location where you want to save the project, 
     then enter the following command to download the project: 
     `git clone https://github.com/sohatec/moto_racing.git`. 
     The download folder name should be "moto_racing".
2 -- Open any Java-supported IDE such as IntelliJ IDEA, Eclipse, NetBeans, and use JDK 21. 
     Open the project named moto_racing, access src/Main.java, and then run it.

## 💡 Usage Flow
When running the application, you can execute tasks by calling the task functions of the Cabinet class.
Task 1: Display the Game Banner.
Task 2: Display the greeting and current time.
Task 3: Enter the number of racers and their details (Car Manufacturer, Name, Race Number).
Task 4: View the Formation Lap results.
Task 5: View the speed leaderboard after the Opening Lap.
Task 6: Find the champion racer.
Task 7: Run a countdown timer effect.

## 📂 Directory structure
src/
├── controller/
│   ├── Cabinet.java
│   └── RacingManager.java
├── data/
│   └── DataRacing.java
├── entity/
│   ├── Aprilia.java
│   ├── Ducati.java
│   ├── Honda.java
│   ├── MotoGp.java
│   ├── Racing.java
│   └── Yamaha.java
├── menu/
│   └── Menu.java
└── Main.java

## 🧑‍💻 Members
(1) Vuong Tran Hieu Nghia | Manager
(2) Henry Lecode          | Coding

