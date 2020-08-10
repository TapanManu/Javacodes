import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;

class Expression{

	static ArrayList<String> disp = new ArrayList<String>();
	static Stack<String> stack = new Stack<String>();
	static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    }
    static boolean isOperand(String op){
    	return((op.equals("+"))||(op.equals("/"))||(op.equals("-"))||(op.equals("*"))||(op.equals("("))||(op.equals(")"))
    		||(op.equals("^")));
    }
    static double evaluatePostfix(ArrayList<String> disp) {  
    	Stack<Double> s = new Stack<Double>();  
        // Scan all characters one by one
        
        for(String c:disp) {   
        	            
            if(c.equals(" ")) 
            	continue;            
            // If the scanned character is an operand  
            // (number here),extract the number 
            // Push it to the stack. 
            else if(!isOperand(c)) { 
                double n = 0; 
                if(!isOperand(c)) { 
                   n=Double.parseDouble(c);
                } 
                System.out.println(n); 
  
                //push the number in stack 
                s.push(n); 
            } 
              
            // If the scanned character is an operator, pop two 
            // elements from stack apply the operator 
            else if(isOperand(c))
            { 
                double val1 = s.pop(); 
                double val2 = s.pop(); 
                  
                switch(c.charAt(0)) 
                { 
                    case '+': 
                    s.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    s.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    s.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    s.push(val2*val1); 
                    break; 

                    case '^':
                    s.push(Math.pow(val1,val2));
                    break;
            } 
            } 
            
        } 
        return s.pop();  
    } 
	public static double evaluate(String exp) {
		String output="";
		//String exp  = "2^3^2";
		String[] result = exp.split("(?<=[-(+*/)^])|(?=[-(+*/)^])");
		System.out.println(Arrays.toString(result));
		
		for(String r:result){
			if(!isOperand(r))
				disp.add(r);
			else if(r.equals("("))
				stack.push(r);
			else if (r.equals(")")) 
            { 
                while (!stack.isEmpty() && !(stack.peek().equals("("))) 
                    disp.add(stack.pop()); 
                  
                if (!stack.isEmpty() && !(stack.peek().equals("("))) 
                    System.out.println("Invalid Expression"); // invalid expression                 
                else
                    stack.pop(); 
            } 
            else // an operator is encountered 
            { 
                while (!stack.isEmpty() && Prec(r.charAt(0)) <= Prec(stack.peek().charAt(0))){ 
                    if(stack.peek().equals("(")) 
                        System.out.println("Invalid Expression"); 
                    disp.add(stack.pop()); 
             } 
                stack.push(r); 
            } 
		}
		while (!stack.isEmpty()){ 
            if(stack.peek().equals("(")) 
                System.out.println("Invalid Expression"); 
            disp.add(stack.pop()); 
         }
        return evaluatePostfix(disp);
	}
}
class Functions {
   boolean func=true;
   static Stack<String> stack = new Stack<String>();
   private static double tri(double d,String in){
   	if(in.equals("sin"))
   		return Math.sin(d);
   	else if(in.equals("cos"))
   		return Math.cos(d);
   	else if(in.equals("tan"))
   		return Math.tan(d);
   	return -1000000.000;

   }
   private static boolean trigonos(String str){
   		return (str.equals("sin")||str.equals("cos")||str.equals("tan")||str.equals("sinh")
   			||str.equals("cosh")||str.equals("tanh"));
   }
   public static String evalExp(String exp){
   	int paracount=0;
   	if(stack.size()==0)
   		return exp;
   	   String inner = stack.peek();
       System.out.println("inner:"+inner); //inner trigonometric function
       //identifying inner arithmetic expression
       String arithmetic="";
       double arith=0.0;
       int innerparanthesis_pos = exp.indexOf(inner)+inner.length();
       int i=innerparanthesis_pos;
       char ch;
       System.out.println("length:"+exp.length());
       while(paracount>=0 && (i<=exp.length()-1)){
       		System.out.println(paracount + " "+ i);
       		ch = exp.charAt(i);
       		System.out.println("exp:"+ch);
       		if(ch=='(')
       			paracount++;
       		if(ch==')')
       			paracount--;
       		arithmetic=arithmetic+ch;
       		i++;
       		
       		if(paracount==0)
       			break;
       }
       if(paracount!=0)
       		System.out.println("invalid expression");
       else
       		arith = (Expression.evaluate(arithmetic));
       String value = String.valueOf(tri(arith,inner));
       exp = exp.substring(0,exp.indexOf(inner))+value+exp.substring(i,exp.length());
       //System.out.println(exp); 
       stack.pop();
       return evalExp(exp);//trigonometric evaluation
       
   }
   public static void main(String[] args){
   	    
       //String exp = "sin(cos(tan((25*5+(3*4)))+(5*3)))";  //test case failed
       //String exp = "sin(cos(tan(25*5+4)))";              //success
   	   //String exp = "sin(25*5+(3*4))"                     //success
       //String exp = "cos(20.0)";                            //success

       String br[] = exp.split("[(]");
       System.out.println(Arrays.toString(br));
       //use recursive approach for better results!!!
       for(String b:br){
       	if(trigonos(b)){
       		stack.push(b); //identifying functions from outer to inner
       	}
       }
       System.out.println(evalExp(exp));
   }
}
