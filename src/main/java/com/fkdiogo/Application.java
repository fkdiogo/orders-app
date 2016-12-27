package com.fkdiogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spark.Spark;

/**
 * Created by felipediogo on 09/12/16.
 */
@SpringBootApplication
public class Application {
    private static final int DEFAULT_SPARK_PORT = 4567;
    public static void main(String[] args) {
        Spark.port()
        SpringApplication.run(Application.class, args);
    }
}
