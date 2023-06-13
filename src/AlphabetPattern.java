
import java.util.Scanner;

public class AlphabetPattern {
		   
		    // create drawPatternA() method to print the pattern of 'A'  
		    public static void writePatternA(int n){  
		    	int m=(2*n)-1;
		        for(int i=0; i<n; i++){
		            for(int j=0; j<m; j++){
		                // if( i==j || j==m-i-1)
		                if( i+j==m/2 || j-i==m-n || i==n/2 && j>n/2 && j<m-(n/2))
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		 // create drawPatternB() method to print the pattern of 'B'  
		    public static void writePatternB(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(j==0 || i==0 && j<n/2 || j==n/2 && i>0 && i<n/2 || i==n/2 && j>0 && j<n/2 || j==n/2 && i>n/2 && i<n-1 || i==n-1 && j<n/2)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		  
		 // create drawPatternC() method to print the pattern of 'C'  
		    public static void writePatternC(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(i==0 && j>0 && j<=n/2 || j==0 && i>0 && i<n-1  || i==n-1 && j>0 && j<=n/2)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		 // create drawPatternD() method to print the pattern of 'D'  
		    public static void writePatternD(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(i==0  && j<n/2 || j==0 || i==n-1 && j>0 && j<n/2 || j==n/2 && i>0 && i<n-1)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		 // create drawPatternE() method to print the pattern of 'E'  
		    public static void writePatternE(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(i==0  && j<=n/2 || j==0 || i==n-1 && j<=n/2 ||i==n/2 && j<=n/2)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  

		    // create drawPatternF() method to print the pattern of 'F'  
		    public static void writePatternF(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(i==0  && j<=n/2 || j==0 || i==n/2 && j<=n/2 )
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		    // create drawPatternG() method to print the pattern of 'G'  
		    public static void writePatternG(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(i==0 && j>0 && j<=(n-1)/2 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<=(n-1)/2 || j==(n+1)/2 && i>=n/2 && i<n-1|| i==n/2 && j>2 && j<=n/2)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		    // create drawPatternH() method to print the pattern of 'H'  
		    public static void writePatternH(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(j==0 || j==n-1 || i==n/2 && j<n-1)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		    // create drawPatternI() method to print the pattern of 'I'  
		    public static void writePatternI(int n){  
		        for(int i=0; i<n; i++){
		            for(int j=0; j<n; j++){
		                if(j==n/2 || i==0 && j>1 && j<=(n+1)/2 || i==n-1 && j>1 && j<=(n+1)/2)
		                {              
		                  System.out.print("*");
		                }
		                else{
		                  System.out.print(" ");
		               }
		            }
		            System.out.println();
		        }
		    }  
		    
		    // create drawPatternJ() method to print the pattern of 'J'  
		    public static void writePatternJ(int h){  
		          
		        for(int i = 0; i < h; i++) {  
		            for(int j = 0; j < h; j++) {  
		                if((i == h - 1) && (j > 0 && j < h - 1)) {  
		                    System.out.printf("*");  
		                }else if((j == h - 1 && i != h - 1) || (i > (h / 2) - 1 && j == 0 && i != h - 1 )){  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternK() method to print the pattern of 'K'  
		    public static void writePatternK(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 || i+j==n/2 || i-j==n/2) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		 
		 // create drawPatternL() method to print the pattern of 'L'  
		    public static void writePatternL(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 || i==n-1 ) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternM() method to print the pattern of 'M'  
		    public static void writePatternM(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 || j==i && i<n/2 || i+j==n-1 && i<=n/2 || j==n-1) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }
		    
		 // create drawPatternN() method to print the pattern of 'N'  
		    public static void writePatternN(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 || i==j ||j==n-1) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternO() method to print the pattern of 'O'  
		    public static void writePatternO(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 && i>0 && i<n-2 || j==n-1 && i>0 && i<n-2 || i==0 && j>0 && j<=(n+1)/2 || i==n-2 && j>0 && j<=(n+1)/2) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternP() method to print the pattern of 'P'  
		    public static void writePatternP(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 || i==0 && j<n/2 || i==n/2 && j<n/2 || j==n/2 && i>0 && i<n/2) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternQ() method to print the pattern of 'Q'  
		    public static void writePatternQ(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 && i>0 && i<n-2 || j==n-1 && i>0 && i<n-2 || i==0 && j>0 && j<=(n+1)/2 ||
		                   i==n-2 && j>0 && j<=(n+1)/2 || i==j && i>2 && i<=n) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternR() method to print the pattern of 'R'  
		    public static void writePatternR(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 || i==0 && j<n/2 || i==n/2 && j<n/2 || j==n/2 && i>0 && i<n/2 || i-j==(n-2)/2) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		    // create drawPatternS() method to print the pattern of 'S'  
		    public static void writePatternS(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(i==0 && j>0 && j<=n/2 || j==0 && i>0 && i<n/2 || i==n/2 && j>0 && j<n/2 ||
		                 j==n/2 && i>n/2 && i<n-1 || i==n-1 && j<n/2) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }  
		    
		    // create drawPatternT() method to print the pattern of 'T'  
		    public static void writePatternT(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==n/2 || i==0 ) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }   
		   

		    // create drawPatternU() method to print the pattern of 'U'  
		    public static void writePatternU(int n){  
		          
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j < n; j++) {  
		                if(j==0 && i>0 && i<n-1 || j==n-1 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }  
		            System.out.printf("\n");  
		        }  
		    }   
		    
		    // create drawPatternV() method to print the pattern of 'V'  
		    public static void writePatternV(int h, int m){  
		        for(int i = 0; i < h; i++) {  
		            for(int j = 0; j <= m; j++) {  
		                if(j == i || j == (m - i - 1)) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }    
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternW() method to print the pattern of 'W'  
		    public static void writePatternW(int n){  
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j <= n; j++) {  
		                if(j==0 && j<n) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }    
		            System.out.printf("\n");  
		        }  
		    }  
           
		 // create drawPatternX() method to print the pattern of 'X'  
		    public static void writePatternX(int n){  
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j <= n; j++) {  
		                if(i+j==n-1 || i==j) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }    
		            System.out.printf("\n");  
		        }  
		    }  
		    
		 // create drawPatternY() method to print the pattern of 'Y'  
		    public static void writePatternY(int n){  
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j <= n; j++) {  
		                if(i==j && i<n/2 || i+j==n-1 && i<n/2 || j==n/2 && i>(n-2)/2) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }    
		            System.out.printf("\n");  
		        }  
		    }  
            
		 // create drawPatternZ() method to print the pattern of 'Z'  
		    public static void writePatternZ(int n){  
		        for(int i = 0; i < n; i++) {  
		            for(int j = 0; j <n; j++) {  
		                if(i==0 || i+j==n-1 || i==n-1) {  
		                    System.out.printf("*");  
		                }else {  
		                    System.out.printf(" ");  
		                }  
		            }    
		            System.out.printf("\n");  
		        }  
		    }  

		    
		    // main() method start  
		    public static void main(String args[]){   
		      
		        char c;   
		        int n=7;  
		          
		        // create an instance of Scanner class  
		        Scanner sc = new Scanner(System.in);  
		     
		        System.out.println("Enter character from A-Z to print:");  
		        c = sc.next().charAt(0);  
		      
		        // close Scanner class object  
//		        sc.close();  
		      
		        switch (c) {  
		            case 'A':  
		                writePatternA(n);   
		                break;
		            case 'B':
		            	writePatternB(n);
		            	break;
		            case 'C':
		            	writePatternC(n);
		            	break;
		            case 'D':
		            	writePatternD(n);
		            	break;
		            case 'E':
		            	writePatternE(n);
		            	break;
		            case 'F':
		            	writePatternF(n);
		            	break;
		            case 'G':
		            	writePatternG(n);
		            	break;
		            case 'H':
		            	writePatternH(n);
		            	break;
		            case 'I':
		            	writePatternI(n);
		            	break;
		            case 'J':
		            	writePatternJ(n);
		            	break;
		            case 'K':
		            	writePatternK(n);
		            	break;
		            case 'L':
		            	writePatternL(n);
		            	break;
		            case 'M':
		            	writePatternM(n);
		            	break;
		            case 'N':
		            	writePatternN(n);
		            	break;
		            case 'O':
		            	writePatternO(n);
		            	break;
		            case 'P':
		            	writePatternP(n);
		            	break;
		            case 'Q':
		            	writePatternQ(n);
		            	break;
		            case 'R':
		            	writePatternR(n);
		            	break;
		            case 'S':
		            	writePatternS(n);
		            	break;
		            case 'T':
		            	writePatternT(n);
		            	break;
		            case 'U':
		            	writePatternU(n);
		            	break;
		            case 'V':  
		                writePatternV(n, (2 * n) - 1);   
		                break;  
		            case 'W':  
		                writePatternW(n);   
		                break;  
		            case 'X':  
		                writePatternX(n);   
		                break;  
		            case 'Y':  
		                writePatternY(n);   
		                break;  
		            case 'Z':  
		                writePatternZ(n);   
		                break;  
		            default :
		            	System.out.println("Ubaroo hanse Alphabet likho ! Numeric Allow Nahi hai Yahan ");
		        }
		        
		   }
		    
}

