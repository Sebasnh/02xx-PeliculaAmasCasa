/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        final int AFORO_MIN = 0;
        final int AFORO_MAX = 500;

        int p1;
        int p2;
        int p3;
        int p4;
        int p5;
        int p6;
        int p7;

        p1 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        p2 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        p3 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        p4 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        p5 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        p6 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        p7 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;

        System.out.println("CINES DEL CENTRO COMERCIAL");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("CONTROL DE AFORO SEMANAL");
        System.out.println("------------------------");
        System.out.println("");
        System.out.printf("Aforo día 1 ...: %4d personas%n", p1);
        System.out.printf("Aforo día 2 ...: %4d personas%n", p2);
        System.out.printf("Aforo día 3 ...: %4d personas%n", p3);
        System.out.printf("Aforo día 4 ...: %4d personas%n", p4);
        System.out.printf("Aforo día 5 ...: %4d personas%n", p5);
        System.out.printf("Aforo día 6 ...: %4d personas%n", p6);
        System.out.printf("Aforo día 7 ...: %4d personas%n", p7);

        int pTotal = p1 + p2 + p3 + p4 + p5 + p6 + p7;
        double media = pTotal / 7;

        System.out.println("");
        System.out.printf("Aforo total ...: %d personas%n", pTotal);
        System.out.println("");
        System.out.printf("Aforo medio ...: %d  personas%n", (int) media < media ? (int) media + 1 : (int) media);

    }

}
