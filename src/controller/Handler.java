/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.DictionaryManagement;
import common.Library;
import view.Menu;

/**
 *
 * @author huynh
 */
public class Handler extends Menu<String> {

    static String[] mc = {"Add word", "Delete word", "Translate", "Exit"};

    private Library library;
    private DictionaryManagement dicManagement;

    public Handler() {
        super("===== DICTIONARY PROGRAM =====", mc);
        library = new Library();
        dicManagement = new DictionaryManagement();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("------------Add----------");
                dicManagement.add();
                break;
            case 2:
                System.out.println("------------Delete----------");
                String ENwordDelete = library.getString("Enter English: ");
                dicManagement.detele(ENwordDelete);
                break;
            case 3:
                System.out.println("------------Translate----------");
                String ENworkTranslate = library.getString("Enter English: ");
                dicManagement.translate(ENworkTranslate);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}