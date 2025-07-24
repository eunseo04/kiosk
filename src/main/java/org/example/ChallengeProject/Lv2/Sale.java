package org.example.ChallengeProject.Lv2;

public enum Sale {
    국가유공자(1), 군인(2), 학생(3), 일반(4);

    private int value;

    Sale(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Sale valueOf(int value) {
        for (Sale s : Sale.values()) {
            if (s.getValue() == value) {
                return s;
            }
        }
        throw new ArithmeticException();
    }
}

