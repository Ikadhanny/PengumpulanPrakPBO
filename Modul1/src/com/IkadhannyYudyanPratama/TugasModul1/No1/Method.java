package com.IkadhannyYudyanPratama.TugasModul1.No1;

public class Method {
    int cel, far, kel, rea;

    public Method(int cel, int far, int kel, int rea) {
        this.cel = cel;
        this.far = far;
        this.kel = kel;
        this.rea = rea;
    }

    //Passed by value //type data primitif
    void calculate(int c, int f, int k, int r){
        f = (c * 9 / 5) + 32;
        k = (f * 5 / 9) - 32 + 273;
        r = (k * 4 / 5) - 273;
        c = r * 5 / 4;
    }

    //passed by reference //type data reference
    void calculate(Method sh){
        sh.cel = sh.cel * 9 / 5 + 32;
        sh.far = sh.far * 5 / 9 - 32 + 273;
        sh.kel = sh.kel * 4 / 5 - 273;
        sh.rea = sh.rea * 5 / 4;
    }
}
