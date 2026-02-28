class butter{
    public static void main(String args[]){
        int i,j;
        int n=7;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((i==j &&j<=n/2)||(i+j==n-1 && i<=n/2)||(j==n/2 && i<=n/2)||i==n/2){
                    System.out.print("*");
                }
                    else{
                        System.out.print(" ");
                    
                    
                    }
                    
                }
                
                System.out.println("");
                
            }
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    if(j==0||i==0||j==n-1||i==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
