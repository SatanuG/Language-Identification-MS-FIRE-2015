/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fire;

/**
 *
 * @author Satanu
 */
import java.io.*;

public class CmdTest {
    public static void main(String[] args) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "dir && cd \"CRF++-0.58\\CRF++-0.58\" && crf_learn temp.txt CRF_Training.txt Model && md \"C:\\Output\" && crf_test -m Model CRF_Test.txt -o \"C:\\Output\\Output.txt\" && del CRF_Training.txt && del CRF_Test.txt && del Model");
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