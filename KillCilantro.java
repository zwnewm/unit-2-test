public class KillCilantro {
   public static void main(String[] args) {
   
   
      String result = killCilantro("This is cilantro and cilantro and cilantro woohoo  ");
   
      System.out.println(result);
   
   }
   
   public static String killCilantro(String str) {
      String newString = "";
      int index = str.indexOf("cilantro");
      System.out.println(index);
      
      for(int i = 0; i < str.length(); i++) {
      
         
         
         if(i == index) {
            String substring = str.substring(0, i);
            newString = substring + "parsley";
            
         
         }
         
         
      
      
      }
      return newString;
   
   
   }

}