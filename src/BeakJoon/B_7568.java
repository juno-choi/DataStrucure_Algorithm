package BeakJoon;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 덩치
 *
 * 우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다.
 * 어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x,y)로 표시된다.
 * 두 사람 A 와 B의 덩치가 각각 (x,y), (p,q)라고 할 때
 * x>p 그리고 y>q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다.
 * 예를 들어 어떤 A, B 두 사람의 덩치가 각각 (56,177), (45,165) 라고 한다면
 * A의 덩치가 B보다 큰 셈이 된다. 그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다.
 * 예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181), (55,173)이라면 몸무게는 D가 C보다 더 무겁고,
 * 키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.
 */
public class B_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = 0;

        do{
            people = Integer.parseInt(br.readLine().trim());
        }while(people == 0);

        int[] kgs = new int[people];
        int[] cms = new int[people];

        for(int i=0; i<people; i++){
            String str = br.readLine();
            String[] strs = str.split(" ");

            kgs[i] = Integer.parseInt(strs[0]);
            cms[i] = Integer.parseInt(strs[1]);
        }

        String result = preparePeople(kgs, cms);
        bw.write(result);
        bw.flush();
        bw.close();

    }

    static String preparePeople(int[] kgs, int[] cms){
        String result = "";

        int kgs_length = kgs.length;
        int cms_length = cms.length;
        if(kgs_length != cms_length){
            return "잘못된 입력입니다.";
        }else{
            for(int i=0; i<kgs_length; i++){
                int rank = 1;
                int rank_seq = 1;

                for(int j=0; j<cms.length; j++){
                    int kg = kgs[i];
                    int cm = cms[i];

                    int _kg = kgs[j];
                    int _cm = cms[j];

                    if(i != j){
                        /**몸무게가 높을 경우
                         * 몸무게가 작은데 키가 큰경우
                         *
                         */

                        if(kg < _kg){
                            if(cm <= _cm){
                                rank++;
                            }
                        }else if(kg == _kg && cm < _cm){
                            rank++;
                        }
                    }

                }
                if((rank - rank_seq)>0){
                    rank_seq = rank;
                }

                if( i == kgs_length-1){
                    result += rank_seq + "";
                }else{
                    result += rank_seq + " ";
                }
            }
        }

        return result;
    }
}
