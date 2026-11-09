# 🏍️ Moto GP Racing Game
This project is a motorcycle racing game.<br>
You just need to enter the number of racers,<br>
the brand of motorcycle, the racer's name,<br>
and the registration number to race against<br>
each other and win the championship.<br>
This game is for all ages, anyone can play.

## 🌟 Main features
* **Register Racers:** Add any number of racers to the tournament.
* **Diverse Brands:** Supports creating various car models from popular brands: `Ducati`, `Yamaha`, `Honda`, `Aprilia`.
* **Race Simulation (Formation Lap):** Displays racer information along with a random starting speed (from 300 to under 350 km/h).
* **Opening Lap:** Arranges and displays the leaderboard of racers based on decreasing speed.
* **Champion Recognition:** Automatically finds and displays the fastest racer (Champion).
* **Console Effects:** Integrates a real-time countdown timer and a vibrant ASCII Art interface.

## 🛠️ Technology used
The project is written in Java programming language<br>
Using IntelliJ IDEA 2026.2.3 and Amazon Corretto JDK 21.0.12<br>
The project does not use any database management systems or connect to databases<br>

## 🚀 Install and run
1 -- Open CMD or Git Bash at the location where you want to save the project,<br>
     then enter the following command to download the project:<br>
     `git clone https://github.com/sohatec/moto_racing.git`<br>
     The download folder name should be "moto_racing".<br>
2 -- Open any Java-supported IDE such as IntelliJ IDEA, Eclipse, NetBeans, and use JDK 21.<br>
     Open the project named moto_racing, access src/Main.java, and then run it.<br>

## 💡 Usage Flow
When running the application, you can execute tasks by calling the task functions of the Cabinet class.<br>
Task 1: Display the Game Banner.<br>
Task 2: Display the greeting and current time.<br>
Task 3: Enter the number of racers and their details (Car Manufacturer, Name, Race Number).<br>
Task 4: View the Formation Lap results.<br>
Task 5: View the speed leaderboard after the Opening Lap.<br>
Task 6: Find the champion racer.<br>
Task 7: Run a countdown timer effect.<br>

## 📂 Directory structure
src/  
├── controller/<br>
│&nbsp;&nbsp;&nbsp;├── Cabinet.java<br>
│   └── RacingManager.java<br>
├── data/<br>
│   └── DataRacing.java<br>
├── entity/<br>
│   ├── Aprilia.java<br>
│   ├── Ducati.java<br>
│   ├── Honda.java<br>
│   ├── MotoGp.java<br>
│   ├── Racing.java<br>
│   └── Yamaha.java<br>
├── menu/<br>
│   └── Menu.java<br>
└── Main.java<br>

## 🧑‍💻 Members
(1) Vuong Tran Hieu Nghia - Manager<br>
(2) Henry Lecode - Coding<br>

## 📄 License
This project is copyrighted by **Vuong Tran Hieu Nghia** and distributed under the **MIT License**.<br>
You may use, learn from, and modify the source code freely, but please retain the original copyright notice.<br>
See details in the file [LICENSE](LICENSE)
