//assume there are 3 sub and find a person passed or fail (40% is required to pass and at least 33% in each sub ).
import java.util.*;
class markPercentageVVI_Concepts{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("how  maney subject you want to enter: ");
		int subCount=sc.nextInt();//array decleration
		byte[] Array=new byte[subCount];//a
		boolean subPer=true;//we dont need to calculate per of sub cause full mark is 100 for now;
		int sum=0;
		for(int i=0;i<subCount;i++){
			System.out.printf("enter the mark for sub %d :",i+1);
			Array[i]=sc.nextByte();
			sum+=(int)(Array[i]);
			if(Array[i]<33){
				subPer=false;//it will be false if it become false you will fail
			}

		}
		float percentage=(sum/(subCount*100f))*100f;//its for per of all sub we got;
		String result=(percentage>=40&&subPer==true)?"you passed folk with whopping ":"you failed folk with ";
		System.out.printf(result+"%.2f",percentage);
	}
}