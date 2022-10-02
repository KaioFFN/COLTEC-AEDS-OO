public class tabela {
    public static void main(String[] args) {      
        int linhas = 5; 
        System.out.print("-----------");
        for(int i = 0 ;  i <= linhas ; i++)
        {
            for(int j = 0 ;  i > j ; j++)
            {
                System.out.print((j+1) * i + "\t");
            }    
          System.out.println( );
        }
        
    } 
}