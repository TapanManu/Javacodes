class Output 
{
        public static void main(String args[]) 
        {    
            byte num = (byte)0b000_1000; 
            if(num >> 1 > 6) { System.out.print(num); } 
            else 
            { System.out.println(num>>1); } 
        } 
}
