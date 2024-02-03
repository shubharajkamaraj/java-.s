
class MaxMin
{
	float val1,val2,val3,val4,val5,Max,Min;
	
	public static void main(String args[])
	{
	val1=args[0];
	val2=args[1];
	val3=args[2];
	val4=args[3];
	val5=args[4];

	Maximum(Max,val1);
	Maximum(Max,val2);
	Maximum(Max,val3);
	Maximum(Max,val4);
	Maximum(Max,val5);

	Minimum(Min,val1);
	Minimum(Min,val2);
	Minimum(Min,val3);
	Minimum(Min,val4);
	Minimum(Min,val5);
	System.out.println("Maximum is :"+ Max);
	System.out.println("Minimum is :"+ Min);
	}
		public static void Maximum(float Max,float val)
		{
		  if(Max < val)
		  {
		   Max = val;
		  }		
		}
		public static void Minimum(float Min,float val)
		{
		  if(Min < val)
		  {
		   Min = val;
		  }		
		}
}

	