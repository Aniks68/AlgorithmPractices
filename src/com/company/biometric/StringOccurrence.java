package com.company.biometric;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringOccurrence {
    public static int getOccurrenceCount(String toSearch, InputStream stream) throws Exception {
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        while (reader.ready()) {
            String line = reader.readLine();
            if (line.contains(toSearch)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        String msg = "Hey! How are you?\nI am good, how about you?\nI am well too.\nWe will be fine.\nLike we always are.\n";
        String msg2 = "Violence is not good.\nBut can we say good fake good is good?\nI don't think so.\nI think we should be good.\nLike we always are.";

        msg += msg2;
        InputStream stream = new ByteArrayInputStream(msg.getBytes());
//        stream.
        try(stream) {
            System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
        }
    }
}
