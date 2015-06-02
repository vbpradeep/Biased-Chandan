import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Biased_Chandan {
    public static void main(String args[] ) throws Exception {
                 
             BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int no=Integer.parseInt(in.readLine()),val,ans=0; 
        List l = new ArrayList();
        for(int i=0;i<no;i++)
        { 
            val=Integer.parseInt(in.readLine());
            if(val==0)
                l.remove(l.size()-1);
            else
                l.add(val);
        }
       Iterator it = l.iterator();
        while(it.hasNext())
        {
            ans=ans+Integer.parseInt(it.next().toString());
        }
        System.out.println(ans);
    }
}
