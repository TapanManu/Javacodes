class Output 
{
        public static void main(String args[]) 
        {    
            int b=45;
            String str=""; 
            while(b > 0) { str = str + b%2; b = b/2; } 
            StringBuilder sb = new StringBuilder(str); 
            sb.reverse(); 
            System.out.println(sb.toString()); 
        } 
}
//101101
