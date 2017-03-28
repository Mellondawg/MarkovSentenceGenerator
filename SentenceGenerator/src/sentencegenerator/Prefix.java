package sentencegenerator;

import java.util.Vector;

/**
 * @author aychan
 */
public class Prefix {
    public Vector pref;
    static final int MULTIPLIER = 31; 
    
    /**
     * Constructor
     * @param p 
     */
    Prefix(Prefix p){
        pref = (Vector)p.pref.clone();
    }
    
    /**
     * Constructor
     * @param n
     * @param str 
     */
    Prefix(int n, String str){
        pref = new Vector();
        for(int i = 0 ; i < n ; i++){
            pref.addElement(str);
        }
    }
    
    /**
     * Hash for prefix words
     * @return h 
     */
    public int hashCode(){
        int h = 0;
        for(int i = 0; i < pref.size(); i++){
            h = MULTIPLIER*h + pref.elementAt(i).hashCode();
        }
        return h;
    }
    
    /**
     * compare prefixes for equal words
     * @param o
     * @return True if equal 
     */
    public boolean equals(Object o){ //
        Prefix p = (Prefix)o;
        for(int i = 0; i < pref.size(); i++){
            if(!pref.elementAt(i).equals(p.pref.elementAt(i))){
                return false;
            }
        }
        return true;
    }
    
}