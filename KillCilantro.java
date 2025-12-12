public class KillCilantro {
   public static void main(String[] args) {
   
   
      String result = killCilantro("This is cilantro and cilantro and cilantro");
   
      System.out.println(result);
   
   }
   
   public static String killCilantro(String str) {
      String newString = "";
      int index = str.indexOf("cilantro");
      
      for(int i = 0; i < str.length(); i++) {
      
         
         
         if(i == index) {
            String substring = str.substring(0, i);
            newString = substring + "parsley";
            String otherSub = str.substring(i + 8);
            System.out.println(otherSub);
            index = otherSub.indexOf("cilantro");
         
         }
         
         
      
      
      }
      return newString;
   
   
   }

}