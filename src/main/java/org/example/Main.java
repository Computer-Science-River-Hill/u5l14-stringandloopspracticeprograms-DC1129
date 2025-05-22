package org.example; 
import java.util.Scanner;
//David Carr
//Fuzzy Orbit
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int A;
            System.out.print("Which exercise would you like to complete, pick a number 1-7: ");
            A = input.nextInt();
            if (A ==1){
                int C, D;
                String B;
                System.out.println("Enter a string: ");
                B = input.nextLine();
                System.out.print("Enter beginning index: ");
                C = input.nextInt();
                System.out.print("Enter ending index: ");
                D = input.nextInt();
                System.out.println("Original string: " + B);
                System.out.println("Substring: " + B.substring(C,D));
            }
            if (A == 2){
                int B, C;
                System.out.print("Enter Start: ");
                B = input.nextInt();
                System.out.print("Enter End: ");
                C = input.nextInt();
                C+=1;
                for (;C > B; B++){
                    System.out.println(B);
                }
            }   
            if (A == 3){
                int F, G, D;
                System.out.println("Enter low: ");
                F = input.nextInt();
                System.out.println("Enter high: ");
                G = input.nextInt();
                D = 0;
                for (int E = F;E <= G; E++){
                    D=D+E;
                }
                System.out.print("Sum = " + D);
            }
            if (A == 4){
                String H;
                int I, J;    
                System.out.println("Enter a word: ");
                H = input.nextLine();
                I = H.length();
                J = 1;
                for (;J<=I; J++){
                    System.out.println(H);
                }
            }
            if (A == 5){
                String K, L; 
                int M, N, O;
                System.out.println("Enter first word: ");
                K = input.nextLine();
                M = K.length();
                System.out.println("Enter second word: ");
                L = input.nextLine();
                N = L.length();
                O = 30 - M - N;
                System.out.print(K);
                for (int P = 1; P<=O ; P++){
                    System.out.print(".");
                }
                System.out.print(L);
            }
            if (A == 6){
                int Q, R, S, T;
                System.out.println("How many integers will be added: ");
                Q = input.nextInt();
                R = 0;
                S = 0;
                for (; R<Q ; R++){
                    System.out.println("Enter an integer: ");
                    T = input.nextInt();
                    S = S + T;
                }
                System.out.print("The sum is " + S);
            }
            if (A == 7){
                int U, V;
                double W;
                U = 1;
                for (;U != 0;){
                    System.out.println("Weight of order: ");
                    U = input.nextInt();
                    if (U == 0){
                        break;
                    }
                    if (U <= 10){
                        System.out.println("Shipping cost: $3.00");
                    }
                    if (U > 10){
                        double X;
                        V = U - 10;
                        W = V * .25;
                        X = W + 3.00;
                        System.out.println("Shipping cost: $" + X);
                    }
                }
            }



           
    }

    }
