# Java File Reading Demo

This project demonstrates how to read a text file in Java using:

1. **Traditional IO** (`FileReader` and `BufferedReader`)
2. **Java 8 Stream API** (`Files.lines()` with filtering)

---

## Files

- `FileDemoIOStreams.java` — Java program to read and filter file content
- `demo.txt` — Sample text file to read

---

## Features

- Read all lines from a text file using traditional IO
- Filter and print lines that start with **H** or **h** using Java 8 Streams

---

## How to Run

1. Make sure `demo.txt` is in the same folder as the Java file.
2. Compile and run:

```bash
javac FileDemoIOStreams.java
java FileDemoIOStreams
