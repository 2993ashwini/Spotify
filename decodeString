public static String decodeString(String s){

n = s.charAt(0);
newS = s.subString(s.indexOf('[')+1, s.lastIndexOf(']')-1)

while(n>0)
{
 decodeString += (newS.substring(0,newS.indexOf('[')-2)+ decodeString(newS.substring(newS.indexOf('[')-2, newS.lastIndexOf(']')-1));
 n--;

}

}
