package java84;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyActionListener implements ActionListener {

    private MyFrame f;
		String exp="", oprd1="",oprd="",opr="",trig="",arg="",fnname="",track="";
		public MyActionListener (MyFrame f1) {
			f=f1;
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
String s= e.getActionCommand();
System.out.println(s);
		
		switch (s) {
	    
	    case ("1"):
	    	exp=exp+"1";
	    	oprd=oprd+"1";
	    	arg=arg+"1";
	    	f.l1.setText(exp);
	    	break;
	    case "2":
	    	exp=exp+"2";
	    	oprd=oprd+"2";
	    	arg=arg+"2";
	    	f.l1.setText(exp);
	    	break; 
	    case "3":	    	
	    	exp=exp+"3";
	    	oprd=oprd+"3";
	    	arg=arg+"3";
	    	f.l1.setText(exp);
	    	break;
	    case "4":
	    	exp=exp+"4";
	    	oprd=oprd+"4";
	    	arg=arg+"4";
	    	f.l1.setText(exp);
	    	break;
	    case "5":
	    	exp=exp+"5";
	    	oprd=oprd+"5";
	    	arg=arg+"5";
	    	f.l1.setText(exp);
	    	break;
	    case "6":
	    	exp=exp+"6";
	    	oprd=oprd+"6";
	    	arg=arg+"6";
	    	f.l1.setText(exp);
	    	break;
	    case "7":
	    	exp=exp+"7";
	    	oprd=oprd+"7";
	    	arg=arg+"7";
	    	f.l1.setText(exp);
	    	break;
	    case "8":
	    	exp=exp+"8";
	    	oprd=oprd+"8";
	    	arg=arg+"8";
	    	f.l1.setText(exp);
	    	break;
	    case "9":
	    	exp=exp+"9";
	    	oprd=oprd+"9";
	    	arg=arg+"9";
	    	f.l1.setText(exp);
	    	break;
	    case "0":
	    	exp=exp+"0";
	    	oprd=oprd+"0";
	    	arg=arg+"0";
	    	f.l1.setText(exp);
	    	break;
		    
		    
	    case "+":
	    	oprd1=oprd;
	    	opr="+";
	    	oprd="";
	    	exp=exp+"+";            
	    	f.l1.setText(opr);
	    	break;
	    case "-":
	    	oprd1=oprd;
	    	opr="-";
	    	oprd="";
	    	exp=exp+"-";
	    	f.l1.setText(opr);
	    	break;
	    case "*":
	    	oprd1=oprd;
	    	opr="*";
	    	oprd="";
	    	exp=exp+"*";
	    	f.l1.setText(opr);
	    	break;
	    case "/":
	    	oprd1=oprd;
	    	opr="/";
	    	oprd="";
	    	exp=exp+"/";
	    	f.l1.setText(opr);
	    	break;
	    case ".":
	    	oprd1=oprd;
	    	opr=".";
	    	oprd="";
	    	exp=exp+".";
	    	f.l1.setText(opr);
	    	break;
	    case"%":
	    	oprd1=oprd;
	    	opr="%";
	    	oprd="";
	    	exp=exp+"%";
	    	f.l1.setText(opr);
	    	break;
	    	
	    case "sin":
	    	exp=exp+"sin(";
	    	arg="";
	    	fnname="sin";
	    	f.l1.setText(exp);
	    	track="sin";
	    	break;
	    
	    case "cos":
	    	exp=exp+"cos(";
	    	arg="";
	    	fnname="cos";
	    	f.l1.setText(exp);
	    	track="cos";
	    	break;

	    case "tan":
	    	exp=exp+"tan(";
	    	arg="";
	    	fnname="tan";
	    	f.l1.setText(exp);
	    	track="tan";
	    	break;

	    case "sin^-1":
	    	exp=exp+"sin^-1(";
	    	arg="";
	    	fnname="asin";
	    	f.l1.setText(exp);
	    	track="asin";
	    	break;

	    case "cos^-1":
	    	exp=exp+"acos(";
	    	arg="";
	    	fnname="acos";
	    	f.l1.setText(exp);
	    	track="acos";
	    	break;

	    case "tan^-1":
	    	exp=exp+"atan(";
	    	arg="";
	    	fnname="atan";
	    	f.l1.setText(exp);
	    	track="atan";
	    	break;
	    
	    case "x^2":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="x^2";
	    	f.l1.setText(exp);
	    	track="x^2";
	    	break;
	    case "x^3":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="x^3";
	    	f.l1.setText(exp);
	    	track="x^3";
	    	break;
	    case "x^y":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="x^y";
	    	f.l1.setText(exp);
	    	track="x^y";
	    	break;
	    case"2√x":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="2√x";
	    	f.l1.setText(exp);
	    	track="2√x";
	    	break;
	    case"3√x":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="3√x";
	    	f.l1.setText(exp);
	    	track="3√x";
	    	break;
	    case"y√x":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="y√x";
	    	f.l1.setText(exp);
	    	track="y√x";
	    	break;
	    case"log":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="log";
	    	f.l1.setText(exp);
	    	track="log";
	    	break;
	    case"ln":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="ln";
	    	f.l1.setText(exp);
	    	track="ln";
	    	break;
	    case"n!":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="n!";
	    	f.l1.setText(exp);
	    	track="n!";
	    	break;
	    case"e":
	    	exp=exp+"(";
	    	arg="";
	    	fnname="e";
	    	f.l1.setText(exp);
	    	track="e";
	    	break;
	    case"π":
	    	exp=exp+"3.141592653589793";
	    	oprd=oprd+"3.141592653589793";
	    	arg=arg+"3.141592653589793";
	    	f.l1.setText(exp);
	    	break;
	    	
	    case ")":
	    	float x;
    	double y;
    	float z;
    	exp=exp+")";
    	if(track=="cos") {
    		x=Float.parseFloat(arg);
        	y=Math.cos(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);           	
    	}
    	else if(track=="sin") {
    		x=Float.parseFloat(arg);
        	y=Math.sin(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);           	
    	}
    	else if(track=="tan") {
    		x=Float.parseFloat(arg);
        	y=Math.tan(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);           	
    	}
    	else if(track=="asin") {
    		x=Float.parseFloat(arg);
        	y=Math.asin(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);           	
    	}
    	else if(track=="acos") {
    		x=Float.parseFloat(arg);
        	y=Math.acos(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);           	
    	}
    	else if(track=="atan") {
    		x=Float.parseFloat(arg);
        	y=Math.atan(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);           	
    	}  
    	else if(track=="x^2") {
    		x=Float.parseFloat(arg);
    		y=x*x;
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);  	
    	}
    	else if(track=="x^3") {
    		x=Float.parseFloat(arg);
    		y=x*x*x;
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);  	
    	}
    	else if(track=="x^y") {
    		x=Float.parseFloat(arg);
    		z=Float.parseFloat(arg);
    		y=Math.pow(x,z);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp);  	
    	}
    	else if(track=="2√x") {
    		x=Float.parseFloat(arg);
    		y=Math.sqrt(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="3√x") {
    		x=Float.parseFloat(arg);
    		y=Math.cbrt(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="y√x") {
    		x=Float.parseFloat(arg);
    		z=Float.parseFloat(arg);
    		y=Math.pow(x,z);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="log") {
    		x=Float.parseFloat(arg);
    		y=Math.log(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="ln") {
    		x=Float.parseFloat(arg);
    		y=Math.log10(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="ln") {
    		x=Float.parseFloat(arg);
    		y=Math.log10(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="n!") {
    		int fact=1;
    		x=Float.parseFloat(arg);
            for (int i = 1; i <= x; i++) {
                fact *= i;
            }
        	exp=Double.toString(fact);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	else if(track=="e") {
    		x=Float.parseFloat(arg);
    		y=Math.exp(x);
        	exp=Double.toString(y);
        	f.l1.setText(exp);
        	System.out.println(track);
        	System.out.println(exp); 
    	}
    	
    	
    	
        break;

	    	
	    	
	    case "=":
	    	exp=exp+"=";	    		    	
			float a,b,c=0;
			String res=null;
			a=Float.parseFloat(oprd1);
			b=Float.parseFloat(oprd);    	
	    	switch (opr) {
	    	case "+":
				c=a+b;
				break;
			case "-":
				c=a-b;
				break;
			case "*":
				c=a*b;
				break;
			case "/":
				c=a/b;
				break;
			case "%":
				c=(a/b)*100;
				break;
				
	    	}						
			res=Float.toString(c);
			exp=exp+res;
			f.l1.setText(exp);
			
			
			 System.out.println(oprd1);
			 System.out.println(opr);
			 System.out.println(oprd);
			// System.out.println(exp);
			 System.out.println(res);
	    	break;
	    	

	    case "AC":
	    	f.l1.setText("");
	    	exp=" ";
	    	oprd1="";
	    	oprd="";
	    	opr="";
	    	trig="";
	    	arg="";
	    	fnname="";
	    	track="";
	    	break;
		}

		
	}
	

}
