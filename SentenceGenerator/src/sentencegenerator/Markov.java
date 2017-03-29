/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentencegenerator;

import java.io.IOException;

/**
 *
 * @author aychan
 */
public class Markov {

    static final int MAXGEN = 10000; // maximum words generated
    public static void main(String[] args) throws IOException
    {
        Chain chain = new Chain();
        int nwords = MAXGEN;
        chain.build("C:\\Users\\DeiNerd\\Dropbox\\GitHub\\MarkovSentenceGenerator-master\\SentenceGenerator\\src\\sentencegenerator\\alice.txt");
        chain.generate(nwords);
    }
}
