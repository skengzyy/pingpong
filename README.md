# PingPong Threads (Java)

Dieses Projekt demonstriert die Nutzung von **Java-Threads** auf zwei Arten:  

1. Mit dem Interface `Runnable` (`PingPongR`)  
2. Durch Vererbung von `Thread` (`PingPongT`)  

## Features

- Zwei Threads für jede Klasse:
  - Einer gibt `"Ping"` aus  
  - Einer gibt `"Pong"` aus
- Sauberes Beenden der Threads über ein `volatile boolean` Flag  
- Ausführung für eine feste Dauer (10 Sekunden)  
- Demonstriert parallele Thread-Ausgabe auf der Konsole  

## Dateien

| Datei             | Beschreibung                                    |
|------------------|------------------------------------------------|
| `PingPongR.java`  | Implementierung von `Runnable` für Ping/Pong  |
| `PingPongT.java`  | Erweiterung von `Thread` für Ping/Pong        |
| `Main.java`       | Startet Threads, wartet 10s und beendet sie  |
| `*.class`        | Kompilierte Java-Klassen                        |

## Nutzung

1. Kompiliere alle Java-Dateien:

```bash
javac *.java
