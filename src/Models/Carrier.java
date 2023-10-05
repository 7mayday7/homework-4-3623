package Models;

import java.awt.*;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private long cardNumber;
    private int[] zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setZones(int[] zones) {
        if (zones.length < 2) {
            throw new RuntimeException("Exception");
        }
        this.zones = zones;
    }
}
