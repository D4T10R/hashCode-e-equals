package principal;

import java.util.ArrayList;

import javax.naming.ldap.HasControls;

import entities.Cliente;

public class Program {

    public static void main(String[] args) {
        
        Cliente c1 =  new Cliente("Leonardo", "leonardoweder@gmail.com");
        Cliente c2 = new Cliente("Leonardo", "leonardoweder@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        String s3 = new String("Teste");
        String s4 = new String("Teste");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

    }

}