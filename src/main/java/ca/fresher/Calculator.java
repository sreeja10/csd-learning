package ca.fresher;

import java.util.Stack;

public class Calculator {
	 public boolean isNumber(String str)
	 {
		if(str.matches("-?[0-9]++"))
			return true;
		return false;
	 }
	 public boolean isOperator(String str)
	 {
		if(str.equals("+") || str.equals("-")  || str.equals("*")  || str.equals("/") ||  str.equals("%") || str.equals("^") || str.equals("!"))
			return true;
		return false;
	 }
	/* public boolean isValid(String str)
	 {
		 if(str.matches("^([0-9]|+|-|*|%|^|/|! )"))
			 return true;
		 return false;
		 
	 } */
       public String result(String expr)
       {
              Stack<Integer> stack = new Stack<Integer>();
              String res;
              String str[] = expr.split(" ");
              
              int length =  str.length,i = 0;
       
              while(length > 0){
                                  
              if (isOperator(str[i]))
              {             
                           int a = stack.pop();
                           int b = stack.pop();
                           int result = 0;
                           System.out.println(a+" "+b);
                           
                           switch(str[i]){
                                  case "+": result = b+a;break;
                                  case "-": result = b-a;break;
                                  case "*":result = b*a;break;
                                  case "/":result = b/a;
                           }
                           System.out.println("res "+result);
                           stack.push(result);
              }
              else if(isNumber(str[i]))   
              {            stack.push(Integer.valueOf(str[i]));
                           System.out.println("push: "+Integer.valueOf(str[i]));
              } 
              else {            
                      return "Invalid expression";
              }
                                         
                     i++;
                     length--;
              }
              
              res = stack.pop().toString();
              
              
              if(!stack.isEmpty()){
                     return "Invalid expression";
              }
              
              return res;
       }

}
