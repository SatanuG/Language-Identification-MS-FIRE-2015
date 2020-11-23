/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fire;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Satanu
 */
public class Exe {
    
    
    /*public static void main(String args[]) throws Exception{
        Exe ob = new Exe();
        ob.func("C:\\Users\\DIPANAKR\\Desktop\\Satanu\\MS-FIRE\\TrainingData\\Utterance_1-10.txt", "C:\\Users\\DIPANAKR\\Desktop\\Satanu\\MS-FIRE\\TrainingData\\Annotation_1-10.txt", null);
    }*/
    
    public void func(String f1, String f2, String f3) throws IOException, Exception{
        
        String args[]={f1,f2};
        String args1[]={f3};
        String args2[]={};
        
        trainingWords ob1 = new trainingWords();
        ob1.main(args);
        //ob1.close();
        
        trainingFile ob2 = new trainingFile();
        ob2.main(args);
        
        testFile ob3 = new testFile();
        ob3.main(args1);
        
        CmdTest ob4 = new CmdTest();
        ob4.main(args2);
        
    }
    
    public void func(String f1) throws Exception{
        
        String args[]={f1};
        String args2[]={};
        
        testFile ob3 = new testFile();
        ob3.main(args);
        
        CmdTest2 ob4 = new CmdTest2();
        ob4.main(args2);
        
    }
    
}
