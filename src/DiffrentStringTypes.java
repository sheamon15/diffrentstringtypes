/**
 * Date: 9/20/17
 * @Author: Shea Salloum
 * Purpose: Display different string types
 *
 */
public class DiffrentStringTypes {
    public static void main (String []args){
    StringBuffer stringBuffer = new StringBuffer("Shea Salloum");// start of string buffer
    System.out.println("String Capacity : " + stringBuffer.capacity());
    System.out.println("String length  :" + stringBuffer.length());
    System.out.println("String replace : " + stringBuffer.replace(5,12,"is cool "));
    System.out.println("String append : " + stringBuffer.append("as ice")) ;
    System.out.println("STRING CLASS");
    String name = "Shea Is The Best Person In The Whole World ";//start of string classes 
    System.out.println("Main string is : " + name);
     System.out.println  ("Char AT is  :" + name.charAt(12));
       System.out.println("Concat  is  :" + name.concat("Hey everyone"));
       System.out.println("equals is : " + name.equals("Shea is the best person in the world  "));
       System.out.println("equals ignore case  is : " + name.equalsIgnoreCase(""));
       System.out.println("index of  is : " + name.indexOf(""));
       System.out.println(new StringBuilder().append("Last index is : ").append(name.lastIndexOf("SHEA ")).toString());
       System.out.println("Lower case is : " + name.toLowerCase());
       System.out.println("Upper Case is : " + name.toUpperCase());
       System.out.println("replace char is switching s with z :  " + name.replace('s','z'));
       System.out.println("substirng is : " + name.substring(7,15));
       System.out.println(" value of is : " + name.valueOf(13 ));
       System.out.println(" Trim is " + name.trim());






    }
}












