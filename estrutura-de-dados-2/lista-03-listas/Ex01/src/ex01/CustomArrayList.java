/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabriel
 */
public class CustomArrayList {
    private String list[] = new String[4];
    private int filledPositions = 0;
     
    public void insert(String value) {
        if (this.filledPositions > this.list.length / 2) {
            this.increaseArray();
        }
        
        this.list[this.filledPositions] = value;
        this.filledPositions++;
    }
    
    public int remove(int index) {
        if (this.list[index] == null) {
            return -1;
        }
        
        this.filledPositions--;
        
        if (this.filledPositions < this.list.length / 4) {
            if (this.filledPositions > 0) this.decreaseArray();
        }
         
        String temp[] = this.list;
        int itemIndex = 0;
        
        temp[index] = null;
        
        this.list = new String[this.list.length];
        
        for (String item : temp) {
            if (item != null) {
                this.list[itemIndex] = item;
            }
            
            itemIndex++;
        }
        
        return index;
    }
    
    public void increaseArray() {
        String temp[] = this.list;
        int index = 0;
        
        this.list = new String[this.list.length * 2];
        
        for (String item : temp) {
            this.list[index] = item;
            index++;
        }
    }
    
    public void decreaseArray() {
        String temp[] = this.list;
        int index = 0;
        
        this.list = new String[this.list.length / 2];
        
        for (String item : this.list) {
            this.list[index] = temp[index];
            index++;
        }
    }
    
    public String[] getList() {
        return this.list;
    }
    
    public String getItem(int index) {
        return this.list[index];
    }
    
    public int getListSize() {
        return this.list.length;
    }
    
    public int getNumberOfItems() {
        return this.filledPositions;
    }
}
