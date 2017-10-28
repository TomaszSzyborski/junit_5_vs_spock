package io.github.aplotnikov.examples.entities;

import static java.math.BigDecimal.TEN;

import java.math.BigDecimal;
import java.util.Objects;

public class Client {

    private final String firstName;

    private final String secondName;

    public Client(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void takeLoan(BigDecimal amount) {
        if (amount.compareTo(TEN) > -1) {
            throw new IllegalStateException("Client does not have enough money");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(secondName, client.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}
