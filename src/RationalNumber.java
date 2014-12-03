// Write a class called RationalNumber that represents a fraction with an integer numerator and denominator
public class RationalNumber
{
  int num;
  int denom;
  public RationalNumber()
  {
    num=0;
    denom=1;
  }  
  public RationalNumber(int numerator, int denominator)
  {
    denom=denominator;
    num=numerator;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return num;
  }
    public int GreatestCommonDivisor(int first, int second)
  {
    int temp;
    while (second != 0) 
    {
        temp = second;
        second = first % second;
        first = temp;
    }        
    return first;
} 
  public String toString()
  {
    String s;
    if (denom==1)
    {
     s=" "+num;
    }
    else
    {
      s=(num/GreatestCommonDivisor(num,denom)) + "/" + (denom/GreatestCommonDivisor(num,denom));
    }
    return s;
  }
  public void add(RationalNumber frac)
  {
    int denom2=frac.getDenominator();
    int numer2=frac.getNumerator();
    num=(num*denom2)+(numer2*denom2);
    denom=denom*denom2;
  }
  public void subtract(RationalNumber frac)
  {
    int numer2=frac.getNumerator();
    int denom2=frac.getDenominator();
    num=(num*denom2)-(numer2*denom);
    denom=denom*denom2;
    
  }
  public void multiply(RationalNumber frac)
  {
    int numer2=frac.getNumerator();
    int denom2=frac.getDenominator();
    denom=denom*denom2;
    num=num*numer2;
  }
  public void divide(RationalNumber frac)
  {
    int numer2=frac.getNumerator();
    int denom2=frac.getDenominator();
    num=num*denom2;
    denom=denom*numer2;
  }
}
