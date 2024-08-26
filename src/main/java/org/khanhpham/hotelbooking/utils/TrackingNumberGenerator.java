package org.khanhpham.hotelbooking.utils;

import lombok.experimental.UtilityClass;

import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class TrackingNumberGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SEQUENTIAL_NUMBER_LENGTH = 6;

    public String generateTrackingNumber(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be at least 1.");
        }

        // Generate random part
        StringBuilder trackingNumber = new StringBuilder("SPHB-");
        for (int i = 0; i < length; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            trackingNumber.append(randomChar);
        }

        // Generate sequential part
        long timestamp = System.currentTimeMillis();
        String sequentialNumber = String.format("%0" + SEQUENTIAL_NUMBER_LENGTH + "d", timestamp % (long) Math.pow(10, SEQUENTIAL_NUMBER_LENGTH));
        trackingNumber.append(sequentialNumber);

        return trackingNumber.toString();
    }
}
