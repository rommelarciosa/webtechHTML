package arciosaact12;


import java.net.InetAddress;
import static java.net.InetAddress.getAllByName;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author s326lab
 */
public class Arciosaact12 {
    
    public static void main(String[] args) {
   
  
     
    Scanner kbd = new Scanner(System.in);
    String server_name = kbd.nextLine();
        
    try {
    InetAddress me = InetAddress.getByName(server_name );
      InetAddress[] re = getAllByName(server_name);
      
      String output1 = me.getHostName();
      String output2 = me.getHostAddress();
     
  // for(int i = 0 ; i > re.length ; i++ ){
   System.out.println(Arrays.toString(re));
     
     System.out.println("Number of Hosts/IPs: " + re.length);
     System.out.println("Host name: " + output1);
     System.out.println("IP Adress: " + output2);
    //}
      
    } catch (UnknownHostException e) {
      System.out.println("error connecting to" + server_name+": "+e );
    }
        
      //  System.out.print("Search another? [y/n]:");
       // String answer = kbd.nextLine();
        
  
  }

}