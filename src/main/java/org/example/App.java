package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("What is the quote?");
            String quote = scanner.nextLine();

            System.out.println("Who said it?");
            String name = scanner.nextLine();
            System.out.println(name.substring(0,1).toUpperCase() + name.substring(1,name.length()).toLowerCase() + " says, \"" + quote.substring(0,1).toUpperCase() + quote.substring(1,quote.length()).toLowerCase() + "\".\n");

            }
        }
