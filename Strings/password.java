class Password{
    public static void main(String[] args) {
        String pass ="12password34";
        if(valid(pass))
            System.out.println("string is valid");
        else
            System.out.println("invalid string");    
    }
    public static boolean valid(String password){
        if(password.length()<10)
            return false;
        int count=0;
        for(int i=0;i<password.length();i++){
                if((password.charAt(i) >= 48 && password.charAt(i)<=57)){
                    count++;
                }    
                else if((password.charAt(i) >= 65 && password.charAt(i) <=90)
                || (password.charAt(i) >= 97 && password.charAt(i) <= 122))
                {
                    continue;
                }
                else
                    return false;
        }
        if(count<2)
            return false;
        return true;
        }    

    }
