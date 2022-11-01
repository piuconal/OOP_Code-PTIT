package javaptit;

import java.util.Scanner;

class Fraction1
{
    long numerator;
    long denominator;
    static Scanner sc = new Scanner(System.in);

    void Input()
    {
        numerator = sc.nextLong();
        denominator = sc.nextLong();
    }

    void Output()
    {
        System.out.printf("%d/%d", numerator, denominator);
    }

    void Compact()
    {
        Long a = numerator;
        Long b = denominator;
        while (a != 0)
        {
            Long x = a;
            a = b % a;
            b = x;
        }
        numerator /= b;
        denominator /= b;
    }

    Fraction1 Add(Fraction1 b)
    {
        Fraction1 c = new Fraction1();
        c.denominator = denominator * b.denominator;
        c.numerator = numerator * b.denominator + denominator * b.numerator;
        c.Compact();
        return c;
    }
}

public class J04004_TongPhanSo
{
    public static void main(String[] args) 
    {
        Fraction1 a = new Fraction1();
        Fraction1 b = new Fraction1();
        a.Input();
        b.Input();
        Fraction1 c = a.Add(b);
        c.Output();
    }
}
