package com.javarush.task.task33.task3310.strategy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileBucket {
    Path path;

    public FileBucket() {
        try {
            path = Files.createTempFile("data",null);
            Path file=Files.createFile(path);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
