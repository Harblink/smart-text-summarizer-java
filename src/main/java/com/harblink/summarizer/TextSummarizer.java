package com.harblink.summarizer;

import java.util.*;
import java.util.stream.Collectors;

public class TextSummarizer {

    // Split text into sentences (basic)
    private static List<String> splitSentences(String text) {
        return Arrays.asList(text.split("(?<=[.!?])\\s+"));
    }

    // Calculate word frequency
    private static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> freqMap = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        for (String word : words) {
            if (word.length() > 2) { // ignore very short words
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        return freqMap;
    }

    // Score sentences based on word frequencies
    private static Map<String, Integer> scoreSentences(List<String> sentences, Map<String, Integer> wordFreq) {
        Map<String, Integer> sentenceScores = new HashMap<>();
        for (String sentence : sentences) {
            int score = 0;
            for (String word : sentence.toLowerCase().split("\\s+")) {
                score += wordFreq.getOrDefault(word.replaceAll("[^a-z]", ""), 0);
            }
            sentenceScores.put(sentence, score);
        }
        return sentenceScores;
    }

    // Summarize text
    public static List<String> summarize(String text, int numSentences) {
        List<String> sentences = splitSentences(text);
        Map<String, Integer> wordFreq = getWordFrequency(text);
        Map<String, Integer> sentenceScores = scoreSentences(sentences, wordFreq);

        return sentenceScores.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(numSentences)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
