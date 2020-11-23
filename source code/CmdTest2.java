/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fire;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Satanu
 */
public class CmdTest2 {
     public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "dir && cd \"CRF++-0.58\\CRF++-0.58\" && md \"C:\\Output\" && crf_test -m 80Model CRF_Test.txt -o \"C:\\Output\\Output.txt\" && del CRF_Test.txt");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}  

