package Day02;
import java.util.Random;

/**
 * @author Administrator
 *
 */
public class Java01 {

	/** 
	 * @param args
	 */
	
	public static void main(String[] args){
System.out.println("Corec++ Corejava Servlet JSP EJB ");
Random random=new Random();
int[][]arr=new int[20][5];
int[]sum=new int[20];

int[]rugle=new int[5];
int i=0,j=0;
while(i<20);
System.out.println("第“+(i+1)+”位学生成绩：");
for(j=0;j<5;j++){
arr[i][j]=random.nextInt(100);
System.out.print(""+arr[i][j]);
sum[i]=sum[i]+arr[i][j];

}
i++;
System.out.println();



for(j=0;i<20;i++){
	System.out.println("第“+(i+1)+”个同学的总成绩"+sum[i]);
	
}
for(i=0;i<20;i++){
	rugle[j]=rugle[j]+arr[i][j];
	
}
	System.out.print("第“+(j+1)+”科目平均成绩"+(rugle[j]/20));
	}
	}
	
	
	
	
	
	
	
	
	