public class MYSCHOOL {
  public static void main(String[] args) {
    String mySchoolName = "Federal University Of Technology Akure";
    String result = " ";
    
    for (int i=mySchoolName.length()-1; i>=0; i--){
      result += mySchoolName.charAt(i);
    }
       
    System.out.println(result);

  }
  
}
