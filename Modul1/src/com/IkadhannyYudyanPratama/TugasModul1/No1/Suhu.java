package com.IkadhannyYudyanPratama.TugasModul1.No1;

public class Suhu {
    public static void main(String[] args) {
        int cel, far, kel, rea;

        Method sh;
        sh = new Method(10, 20, 20, 10);
        cel = 5;
        far = 9;
        kel = 5;
        rea = 4;

        System.out.println("Suhu sebelum passed by value\t : ");
        System.out.println("Celsius to Farenheit\t : " + cel);
        System.out.println("Farenheit to Kelvin\t : " + far);
        System.out.println("Kelvin to Reamur\t : " + kel);
        System.out.println("Reamur to Celcius\t : " + rea);
        sh.calculate(cel, far, kel, rea);
        System.out.println("Suhu setelah passed by value\t : ");
        System.out.println("Celsius to Farenheit\t : " + cel);
        System.out.println("Farenheit to Kelvin\t : " + far);
        System.out.println("Kelvin to Reamur\t : " + kel);
        System.out.println("Reamur to Celcius\t : " + rea);

        System.out.println("Suhu sebelum passed by reference\t : ");
        System.out.println("Suhu.Celsius to Farenheit\t : " + sh.cel);
        System.out.println("Suhu.Farenheit to Kelvin\t : " + sh.far);
        System.out.println("Suhu.Kelvin to Reamur\t : " + sh.kel);
        System.out.println("Suhu.Reamur to Celcius\t : " + sh.rea);
        sh.calculate(sh);
        System.out.println("Suhu setelah passed by reference\t : ");
        System.out.println("Suhu.Celsius to Farenheit\t : " + sh.cel);
        System.out.println("Suhu.Farenheit to Kelvin\t : " + sh.far);
        System.out.println("Suhu.Kelvin to Reamur\t : " + sh.kel);
        System.out.println("Suhu.Reamur to Celcius\t : " + sh.rea);
    }
}
