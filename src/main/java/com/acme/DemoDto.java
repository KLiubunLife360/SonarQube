package com.acme;

import java.util.Objects;

public class DemoDto {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
