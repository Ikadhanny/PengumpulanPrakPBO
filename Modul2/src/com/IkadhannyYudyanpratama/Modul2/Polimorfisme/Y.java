package com.IkadhannyYudyanpratama.Modul2.Polimorfisme;

public class Y extends X {

    @Override
    public void getValue(String value) {
        super.getValue(value);
        System.out.println("Value kelas Y\t : " + value);
    }
}
