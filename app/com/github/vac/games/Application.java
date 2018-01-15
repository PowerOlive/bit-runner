/*
 *
 *
 *
 *
 */
package com.github.vac.games;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vac
 *
 */
public class Application {

    private final int PASS_SCORE;
    private final int TYPO_LIMIT;

    private final String DICT_PATH = "dict";

    private ArrayList<String> dict = new ArrayList<>(1024);

    public Application() {
        this(64, 4);
    }

    public Application(int passScore, int typoLimit) {
        PASS_SCORE = passScore;
        TYPO_LIMIT = typoLimit;
    }

    /**
     *
     *
     */
    private void displayMOTD() {
        System.out.println("Thank you for trying our product! :-)\n");
    }

    /**
     *
     *
     */
    private void loadDict() {
        Scanner input = new Scanner(System.in);

        System.out.println("Loading dict files...");

        File path = new File(Application.class.getResource("/" + DICT_PATH).getPath());

        if (!path.isDirectory()) {
            System.err.println("Not a valid dict path. Aborting...");
            System.exit(0);
        }

        File[] fileList = path.listFiles((File dir, String name) ->
                name.endsWith(".dic"));

        if (fileList == null || fileList.length == 0) {
            System.err.println("No dict found in the path. Aborting...");
            System.exit(0);
        }

        Arrays.sort(fileList);

        for (int i = 0, length = fileList.length; i < length; i++) {
            System.out.printf("\t%d  %s\n", i, fileList[i].getName());
        }

        System.out.print("\nPlease select a dictionary: ");

        int index = input.nextInt();

        File target = fileList[index];

        if (!target.isFile()) {
            System.err.println("Not a valid dict. Aborting...");
            System.exit(0);
        }

        try (Scanner file = new Scanner(target)) {
            String word;
            while (file.hasNext()) {
                word = file.nextLine();
                dict.add(word);
            }
        } catch (IOException e) {
            System.err.println("Fail to read dict. Aborting...");
            System.exit(0);
        }
    }

    /**
     *
     *
     */
    private boolean interact() {
        Scanner input = new Scanner(System.in);

        System.out.println();

        int score = 0, typo = 0;

        while (score < PASS_SCORE) {
            String word = dict.get((int) (Math.random() * dict.size()));

            System.out.println("\t\t" + word);

            System.out.print("\t\t");

            String line = input.nextLine();

            if (line.equals(word)) {
                score += 1;
                System.out.println("\t✓\t\t\t☆ " + score + "  ♡ " + (TYPO_LIMIT - typo));
            } else {
                typo += 1;
                System.out.println("\t✗\t\t\t☆ " + score + "  ♡ " + (TYPO_LIMIT - typo));
                if (typo == TYPO_LIMIT) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     *
     *
     */
    private boolean prompt() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Why not give it another shot? (y/n) ");

            String action = input.nextLine();

            if (action.equals("n") || action.equals("N")) {
                return false;
            } else if (action.equals("y") || action.equals("Y")) {
                return true;
            }
        }
    }

    /**
     *
     *
     */
    private void offerPraise() {
        System.out.println("\nCongratulations! You did a good job! ;-)");
    }

    /**
     *
     *
     */
    private void exitGracefully() {
        System.out.println("\nPractice always makes perfect! See you! :-P");
    }

    /**
     *
     *
     */
    public static void main(String[] args) {
        Application app = new Application();

        app.displayMOTD();

        app.loadDict();

        boolean repeat = true;

        while (repeat) {
            if (app.interact()) {
                app.offerPraise();
                break;
            }
            repeat = app.prompt();
        }

        app.exitGracefully();
    }
}
