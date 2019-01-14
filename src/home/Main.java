package home;

public class Main {

    public static void main(String[] args) {

        int[] function = {0, 0, 0, 1, 0, 1, 1, 1};
        int one = 1;

        for (int i = 0; i < function.length; i++) {
            System.out.print(function[i]);
        }

        System.out.println(" ");

        for (int j = 0; j < 7; j++) {
            if (function[j] == one ^ function[j + 1] == one) {
                function[j] = 1;
            } else
                function[j] = 0;
            System.out.print(function[j]);
        }

        System.out.println(" ");

        for (int k = 0; k < 6; k++) {
            if (function[k] == one ^ function[k + 1] == one) {
                function[k] = 1;
            } else
                function[k] = 0;
            System.out.print(function[k]);
        }

        System.out.println(" ");

        for (int l = 0; l < 5; l++) {
            if (function[l] == one ^ function[l + 1] == one) {
                function[l] = 1;
            } else
                function[l] = 0;
            System.out.print(function[l]);
        }

        System.out.println(" ");

        for (int m = 0; m < 4; m++) {
            if (function[m] == one ^ function[m + 1] == one) {
                function[m] = 1;
            } else
                function[m] = 0;
            System.out.print(function[m]);
        }

        System.out.println(" ");

        for (int n = 0; n < 3; n++) {
            if (function[n] == one ^ function[n + 1] == one) {
                function[n] = 1;
            } else
                function[n] = 0;
            System.out.print(function[n]);
        }

        System.out.println(" ");

        for (int o = 0; o < 2; o++) {
            if (function[o] == one ^ function[o + 1] == one) {
                function[o] = 1;
            } else
                function[o] = 0;
            System.out.print(function[o]);
        }

        System.out.println(" ");

        for (int p = 0; p < 1; p++) {
            if (function[p] == one ^ function[p + 1] == one) {
                function[p] = 1;
            } else
                function[p] = 0;
            System.out.print(function[p]);
        }
    }
}