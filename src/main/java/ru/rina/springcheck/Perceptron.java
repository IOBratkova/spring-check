package ru.rina.springcheck;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class Perceptron implements Quotes {

    @InjectRandomInt(max = 5, min = 2)
    private int repeat;

    private String message = "Meow";

    @Override
    public void sayQuote() {
        IntStream.range(0, repeat).forEach(i -> System.out.println(message + i));
    }
}
