package com.harblink.summarizer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Read the sample text
        String text = new String(Files.readAllBytes(Paths.get("data/sample.txt")));

        // Summarize using TextSummarizer
        List<String> summary = TextSummarizer.summarize(text, 3); // top 3 sentences

        System.out.println("🔹 Original Text (first 300 chars):");
        System.out.println(text.substring(0, Math.min(300, text.length())) + "...\n");

        System.out.println("✅ Summary:");
        for (String sentence : summary) {
            System.out.println("- " + sentence);
        }
    }
}
