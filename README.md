<h1 align="center">🏍️ Moto GP Racing Game 🏍️</h1>
## 🗒️ Introduction  
***
This project is a motorcycle racing game.<br>
You just need to enter the number of racers,<br>
the brand of motorcycle, the racer's name,<br>
and the registration number to race against<br>
each other and win the championship.<br>
This game is for all ages, anyone can play.

<h2>🌟 Main features</h2>

---

* **Register Racers:** Add any number of racers to the tournament.
* **Diverse Brands:** Supports creating various car models from popular brands: `Ducati`, `Yamaha`, `Honda`, `Aprilia`.
* **Race Simulation (Formation Lap):** Displays racer information along with a random starting speed (from 300 to under 350 km/h).
* **Opening Lap:** Arranges and displays the leaderboard of racers based on decreasing speed.
* **Champion Recognition:** Automatically finds and displays the fastest racer (Champion).
* **Console Effects:** Integrates a real-time countdown timer and a vibrant ASCII Art interface.

<h2>🛠️ Technology used</h2>

--

The project is written in Java programming language<br>
Using IntelliJ IDEA 2026.2.3 and Amazon Corretto JDK 21.0.12<br>
The project does not use any database management systems or connect to databases<br>

<h2>🚀 Install and run</h2>

---

1 -- Open CMD or Git Bash at the location where you want to save the project,<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;then enter the following command to download the project:<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`git clone https://github.com/sohatec/moto_racing.git`<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The download folder name should be "moto_racing".<br>
2 -- Open any Java-supported IDE such as IntelliJ IDEA, Eclipse, NetBeans, and use JDK 21.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Open the project named moto_racing, access src/Main.java, and then run it.<br>

<h2>💡 Usage Flow</h2>

---

When running the application, you can execute tasks by calling the task functions of the Cabinet class.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 1: Display the Game Banner.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 2: Display the greeting and current time.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 3: Enter the number of racers and their details (Car Manufacturer, Name, Race Number).<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 4: View the Formation Lap results.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 5: View the speed leaderboard after the Opening Lap.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 6: Find the champion racer.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Task 7: Run a countdown timer effect.<br>

<h2>📂 Directory structure</h2>

---

src/  
├── controller/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Cabinet.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── RacingManager.java<br>
├── data/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── DataRacing.java<br>
├── entity/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Aprilia.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Ducati.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Honda.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── MotoGp.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Racing.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Yamaha.java<br>
├── menu/<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Menu.java<br>
└── Main.java<br>

<h2>🧑‍💻 Members</h2>

---

(1) Vuong Tran Hieu Nghia - Analyze<br>
(2) Henry Lecode - Coding<br>

<h2>📄 License</h2>

---

This project is copyrighted by **Vuong Tran Hieu Nghia** and distributed under the **MIT License**.<br>
You may use, learn from, and modify the source code freely, but please retain the original copyright notice.<br>
See details in the file [LICENSE](LICENSE)
