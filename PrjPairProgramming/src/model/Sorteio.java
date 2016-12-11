package model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jullia
 */
public class Sorteio {

    Random r = new Random();
    int num;
    String s = "Senior", p = "Pleno", j = "Junior", e = "Estagiario";

    public String gerarDriver() {
        String driver = "";
        num = r.nextInt(101) + 1;

        if (num < 11) {
            driver = s;
        } else if (num < 21) {
            driver = p;
        } else if (num < 61) {
            driver = j;
        } else if (num < 101) {
            driver = e;
        }

        return driver;
    }

    public String gerarParesSenior() {
        num = r.nextInt(101) + 1;
        String nav = "";

        if (num < 6) {
            nav = s;
        } else if (num < 21) {
            nav = p;
        } else if (num < 81) {
            nav = j;
        } else if (num < 101) {
            nav = e;
        }

        return nav;
    }

    public String gerarParesPleno() {
        num = r.nextInt(101) + 1;
        String nav = "";

        if (num < 21) {
            nav = s;
        } else if (num < 31) {
            nav = p;
        } else if (num < 61) {
            nav = j;
        } else if (num < 101) {
            nav = e;
        }
        return nav;
    }

    public String gerarParesJunior() {
        num = r.nextInt(101) + 1;
        String nav = "";

        if (num < 76) {
            nav = s;
        } else if (num < 91) {
            nav = p;
        } else if (num < 96) {
            nav = j;
        } else if (num < 101) {
            nav = e;
        }
        return nav;
    }

    public String gerarParesEstagiario() {
        num = r.nextInt(101) + 1;
        String nav = "";

        if (num < 41) {
            nav = s;
        } else if (num < 81) {
            nav = p;
        } else if (num < 101) {
            nav = j;
        }
        return nav;
    }
    
    public String sorteiaPessoa(ArrayList <Desenvolvedor> devs) {
        num = r.nextInt(devs.size()) + 1;
        return devs.get(num-1).getNome();
    }
}
