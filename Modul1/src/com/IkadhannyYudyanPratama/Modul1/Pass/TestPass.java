package com.IkadhannyYudyanPratama.Modul1.Pass;

public class TestPass {
    int nomer1, nomer2;

    //Constructor
    public TestPass(int nomer1, int nomer2) {
        this.nomer1 = nomer1;
        this.nomer2 = nomer2;
    }

    //Passed by value //type data primitif
    void calculate(int m, int n){
        m = m * 10;
        n = n / 2;
    }

    //passed by reference //type data reference
    void calculate (TestPass passed){
        passed.nomer1 = passed.nomer1 * 10;
        passed.nomer2 = passed.nomer2 / 2;
    }
}