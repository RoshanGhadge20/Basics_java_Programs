package Intermediate_questions;

import java.io.Serializable;

public class demo implements Serializable {
    public int value;
    public String name;

    public demo(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
