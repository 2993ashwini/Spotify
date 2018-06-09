public static sortByStrings(String s, String t){

String newS = "";
int[] chars = new char[MAX_LENGTH];
  
  for(int i = 0; i < s.length; i++)
  {
    int n = (int)s.charAt(i);
    chars[n]++;
  }
  
  for(int j = 0; j <t.length; j++){
   int n = (int)t.charAt(i);
    while(chars[n] >=0){
    newS = t.charAt(i);
      chars[n]--;
    }
    
  }

}
