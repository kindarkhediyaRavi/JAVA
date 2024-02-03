
// Search the Duplicate Words in String

public class dublicateWord {
    public static void main(String[] args) {
        
        String str = "Our Socity is will turn turn be come in our bike and go ahead to will your Party... ";
        int count;

        str = str.toLowerCase();
        String words[] = str.split(" ");

        System.out.println("Duplicate word in String : ");
        for (int i = 0; i < words.length; i++) 
        {
            count = 1;
            for (int j = i+1; j < words.length; j++) 
            {
                if (words[i].equals(words[j])) 
                {
                    count++;
                    words[j] = "0";    
                }
            }
            if(count > 1 && words[i] != "0")
            {
                System.out.println(words[i]);
            }
        }
    }
}
