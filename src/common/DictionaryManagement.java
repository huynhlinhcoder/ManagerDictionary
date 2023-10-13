/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.*;

/**
 *
 * @author huynh
 */
public class DictionaryManagement  extends HashMap<String, String> {

    Library library = new Library();

    public void add() {
        String ENword = library.getString("Enter English: ");
        String VNword = library.getString("Enter Vietnamease: ");

        this.put(ENword, VNword);
        System.out.println("Successful");
    }

    public void detele(String ENword) {
        ENword = ENword.trim();
        for (Map.Entry<String, String> set
                : this.entrySet()) {
            if (set.getKey().equalsIgnoreCase(ENword)) {
                this.remove(ENword);
                return;
            }
        }
        System.out.println("English word not found to remove!");
    }

    public void translate(String ENword) {
        for (int i = 0; i < this.size(); i++) {
            if (this.containsKey(ENword)) {
                System.out.println(this.get(ENword));
                return;
            }
        }
        System.out.println("English word not found in dictionary!");
    }

}