public class Main {
    public static void main(String[] args){
        for(int i=0; i<9 ; i++){
            for (int j=0; j<9; j++){

                if (j== i+5)
                    break;
                else if (j>3-i && i<4)
                    System.out.print(" * ");
                else if (i+j==13)
                    break;
                else if(j<=3-i)
                    System.out.print("   ");
                else if (j>i-5)
                    System.out.print(" * ");
                else if (j<=i-5)
                    System.out.print("   ");
                else
                    System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
