package ru.neoflex.decision.bpms.model.generator;

import java.util.Random;

public interface RandomValues {
    Random random = new Random();
    default String randomGender() {
        if (random.nextBoolean()) return "male";
        else return "female";
    }

    default String randomEducation() {
        int probability = random.nextInt(100);
        if (probability < 10) return "basic";
        if (probability < 30) return "secondary";
        if (probability < 50) return "initial vocational";
        if (probability < 70) return "incomplete higher";
        if (probability < 90) return "higher";
        return "science degree";
    }

    default String randomSourceChannel() {
        int probability = random.nextInt(100);
        if (probability < 30) return "street";
        if (probability < 70) return "promotional";
        return "recommendation";
    }

    default String randomMaritalStatus() {
        int probability = random.nextInt(100);
        if (probability < 20) return "married";
        if (probability >= 30 & probability < 50) return "secondary marriage";
        if (probability >= 50 & probability < 60) return "widowed";
        if (probability >= 60 & probability < 70) return "divorced";
        if (probability >= 70 & probability < 80) return "unmarried";
        if (probability >= 80) return "civil marriage";
        return "Not defined";
    }
}
