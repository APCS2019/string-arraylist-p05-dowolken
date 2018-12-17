import java.util.List;
import java.util.ArrayList;
public class LogMessage{
    private String machineID;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message){
        /* to be implemented in part(a) */
        { machineID = message.getMachineId();
          description =message.getDescription();}
    /** Returns true if the description in this log message properlyn contains keyword;
     *          false otherwise.
     */
    public boolean containsWord(String keyword){
        /* to be implemented in part(b) */
        int index = description.indexOf(keyword);
        int len= keyword.length();
        while(index!=-1)
             {if(len == description.length())
                 ｛return true;｝
              if((description.substring(index+len,index+len+1).equals(" "))|| (index==0))
                  {return true;}
              if((description.substring(index-1,index).equals(" "))||(index+len==description.length()))
                  {return true;}
              if((description.substring(index+len,index+len+1).equals(" "))||(description.substring(index-1,index).equals(" ")))
                  {return true;}
             }
         return false;
        
    public String getMachineID(){
        return description;
    }
    
    //test
    public static void main(String[] args){
        
    }
}
