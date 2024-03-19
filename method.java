public class method {
    
    public static void main(String a[] ){
        computer comp = new computer();
        comp.music ();
        String str  = comp.getpen( 10);
        System.out.println(str);
        
    }
}
 
class computer{
    public void music(){
        System.out.println("cool music plaiying");
    }

    public String getpen(int cost){
        if (cost<=10) {
            
            return" nothing";
        }
        else{
            return"available";
        }

        

    }
}