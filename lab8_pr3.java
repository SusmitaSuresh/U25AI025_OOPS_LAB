public class lab8_pr3
{
    public static void main(String[] args) {
        String sb[] =  {"ankita", "suzzanne", "hasini", "sneha", "nandini", "shivani", "homework", "thebdjkfjv", "usgfbjsvdj", "sjhfsbg"};
        for(int i = 0; i<10; i++)
        {
            sb[i] = sb[i].substring(3);
        }
        for(int i=0; i<10; i++)
        {
            for(int j=i; j<10; j++)
            {
                if(sb[i].compareTo(sb[j])>0)
                {
                    String temp = sb[i];
                    sb[i] = sb[j]; 
                    sb[j] = temp;
                }
            }
        }

        System.out.println("names are: ");
        for(int i=0; i<10; i++)
        {
            System.out.println(sb[i]);
        }
      
    }
}