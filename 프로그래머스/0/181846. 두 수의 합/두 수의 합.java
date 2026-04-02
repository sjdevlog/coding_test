import java.math.BigInteger;

  class Solution {
      public String solution(String a, String b) {
          BigInteger valA = new BigInteger(a);
          BigInteger valB = new BigInteger(b);
          return valA.add(valB).toString();
      }
  }