Got it 👍 — we’ll keep the README professional, **no emojis**, but still add subtle easter eggs like *BM² is cool* without breaking tone.
Here’s a cleaned-up, professional version of your README with Maven instructions + hidden fun bits:

---

```markdown
# Smart Text Summarizer (Java)

A simple Java-based Smart Text Summarizer that reads long text or PDFs and provides concise summaries using basic NLP techniques.  

> Note: Some say BM² is cool — the code might agree.  

---

## Features
- Extractive summarization (frequency-based)
- Works with plain text files
- Lightweight and easy to run
- Optional PDF support (via [Apache PDFBox](https://pdfbox.apache.org/))

---

## Project Structure
```

smart-text-summarizer-java/
├── src/main/java/com/harblink/summarizer/
│   ├── Main.java
│   └── TextSummarizer.java
├── data/
│   └── sample.txt
├── pom.xml   # for Maven build
└── README.md

````

---

## Getting Started

### Option 1: Run with `javac` and `java`

1. Clone the repository:
   ```bash
   git clone https://github.com/Harblink/smart-text-summarizer-java.git
   cd smart-text-summarizer-java
````

2. Compile the Java files:

   ```bash
   javac -d . src/main/java/com/harblink/summarizer/*.java
   ```

3. Run the program:

   ```bash
   java com.harblink.summarizer.Main
   ```

---

### Option 2: Run with Maven (Recommended)

1. Clone the repository:

   ```bash
   git clone https://github.com/Harblink/smart-text-summarizer-java.git
   cd smart-text-summarizer-java
   ```

2. Ensure [Maven](https://maven.apache.org/) is installed.

3. Add a `pom.xml` file in the project root:

   ```xml
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 
                                http://maven.apache.org/maven-v4_0_0.xsd">

       <modelVersion>4.0.0</modelVersion>
       <groupId>com.harblink</groupId>
       <artifactId>smart-text-summarizer</artifactId>
       <version>1.0-SNAPSHOT</version>

       <dependencies>
           <!-- PDF Support -->
           <dependency>
               <groupId>org.apache.pdfbox</groupId>
               <artifactId>pdfbox</artifactId>
               <version>2.0.29</version>
           </dependency>
       </dependencies>

       <build>
           <plugins>
               <plugin>
                   <groupId>org.apache.maven.plugins</groupId>
                   <artifactId>maven-compiler-plugin</artifactId>
                   <version>3.11.0</version>
                   <configuration>
                       <source>17</source>
                       <target>17</target>
                   </configuration>
               </plugin>
           </plugins>
       </build>
   </project>
   ```

4. Build the project:

   ```bash
   mvn clean package
   ```

5. Run the program:

   ```bash
   mvn exec:java -Dexec.mainClass="com.harblink.summarizer.Main"
   ```

---

## Sample Output

```
Original Text (first 300 chars):
Artificial Intelligence is a branch of computer science...

Summary:
- Artificial Intelligence is a branch of computer science that aims to create intelligent machines.
- AI is now used in various applications such as self-driving cars, virtual assistants, and robotics.
- The core problems of AI include programming computers for certain traits such as knowledge, reasoning...
```

---

## Notes

* Place your input text in the `data/sample.txt` file (or update the path in `Main.java`).
* To summarize PDFs, add a `.pdf` file in the `data/` folder and enable PDFBox usage in code.

---

## Hidden Details

This project may contain small easter eggs.
One of them: **BM² is cool.**

---

## License

This project is licensed under the MIT License – you are free to use and modify it.
