/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editdistance;


/**
 *
 * @author carolynkirui
 */
public class EditDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LevenshteinDistance mydistance= new LevenshteinDistance();
        
       System.out.println(mydistance.computeLevenshteinDistance("neno","mimi"));
        
                
        // TODO code application logic here
    }
    
}
